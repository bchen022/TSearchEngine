package ui_search;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;



import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import org.apache.lucene.search.ScoreDoc;



class WebDocument {
	public String id;
	public String text;
	public String created_at;	
	public String screen_name;	
	public WebDocument(String t, String b, String u, String v) {
		this.id = t;
		this.text = b;
		this.created_at = u;
		this.screen_name = v;
	}
}


public class LuceneExample {
	//public static final String INDEX_DIR = "testIndex";
	public static String INDEX_DIR = "/Users/RashidGoshtasbi/documents/ec/luceneexample/indextest";

	
	public static void main(String[] args) throws CorruptIndexException, IOException {
		
		for (int i = 1; i <= 500; i++)
		{	
			String FileName = "/Users/RashidGoshtasbi/tweets/tweets" + i + ".txt";
			System.out.println("Indexing File: tweets" + i);
			try {
				ArrayList<JSONObject> jsons = ReadJSON(new File(FileName), "UTF-8");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}				
	}
	
	public static synchronized ArrayList<JSONObject> ReadJSON(File MyFile, String Encoding)
			throws FileNotFoundException, ParseException
	{
		Scanner scn = new Scanner(MyFile, Encoding);
		ArrayList<JSONObject> json = new ArrayList<JSONObject>();
		ArrayList<JSONObject> json1 = new ArrayList<JSONObject>();

		// Reading and Parsing Strings to Json
		while (scn.hasNext())
		{
			JSONObject obj = (JSONObject) new JSONParser().parse(scn.nextLine());
			JSONObject obj1 = (JSONObject) obj.get("user");
			json.add(obj);
			json1.add(obj1);
			
			String t_sn = obj1.get("screen_name").toString();
			if(t_sn == null)
			{
				
			}
			else
			{
				String t_id = obj.get("id").toString();
				String t_text = (String) obj.get("text");		
				String ca_text = (String) obj.get("created_at");
//				System.out.print(t_sn + ": ");
//				System.out.print(ca_text + ": ");
//				System.out.println(t_text);
				
				WebDocument page = new WebDocument(t_id, t_text, ca_text, t_sn);
				index(page);
			}
		}
		// Here Printing Json Objects
//		for (JSONObject obj : json) {
//			//System.out.println((long) obj.get("id") + " : " + (String) obj.get("text"));
//			
//			String t_id = obj.get("id").toString();
//			String t_text = (String) obj.get("text");		
//			String ca_text = (String) obj.get("created_at");
//			
//			
//			String t_sn = "";
//			for (JSONObject obj1 : json1) {
//			
//				t_sn = obj1.get("screen_name").toString();
//				
//			}
//			
//			System.out.println(t_sn);
////			WebDocument page = new WebDocument(t_id, t_text, ca_text, t_sn);
////			index(page);
//		}
		return json;
	}

	
	
	
	
	public static void index (WebDocument page) {
		File index = new File(INDEX_DIR);	

		IndexWriter writer = null;
		try {	
			IndexWriterConfig indexConfig = new IndexWriterConfig(Version.LUCENE_34, new StandardAnalyzer(Version.LUCENE_34));
			writer = new IndexWriter(FSDirectory.open(index), indexConfig);
			//System.out.println("Indexing to directory '" + index + "'...");	
			Document luceneDoc = new Document();	
			Field field_t = new Field("text", page.text, Field.Store.YES, Field.Index.ANALYZED);
			field_t.setBoost(5);
			luceneDoc.add(field_t);
			
			Field field_id = new Field("screen_name", page.screen_name, Field.Store.YES, Field.Index.ANALYZED);
			field_id.setBoost(3);
			luceneDoc.add(field_id);
			
			Field field_created = new Field("id", page.id, Field.Store.YES, Field.Index.ANALYZED);
			luceneDoc.add(field_id);
			
			luceneDoc.add(new Field("created_at", page.created_at, Field.Store.YES, Field.Index.ANALYZED));
			writer.addDocument(luceneDoc);			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (writer !=null)
				try {
					writer.close();
				} catch (CorruptIndexException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}	
}