package ui_search;

//public class textOutput {
//	public String getInfo(){
//		return "Also Brendan is a bitch niggaah";
//	}
//}


import java.io.File;
import java.lang.StringBuilder;
import java.io.IOException;
import java.util.StringTokenizer;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.apache.jasper.tagplugins.jstl.core.Out;
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




public class textOutput {
	//public static final String INDEX_DIR = "testIndex";
	public String INDEX_DIR = "/Users/RashidGoshtasbi/documents/ec/luceneexample/indextest";
	
	public String search (String queryString, int topk) throws CorruptIndexException, IOException {
		
		IndexReader indexReader = IndexReader.open(FSDirectory.open(new File(INDEX_DIR)), true);
		IndexSearcher indexSearcher = new IndexSearcher(indexReader);
		QueryParser queryparser = new QueryParser(Version.LUCENE_34, "text", new StandardAnalyzer(Version.LUCENE_34));

		try {
			StringTokenizer strtok = new StringTokenizer(queryString, " ~`!@#$%^&*()_-+={[}]|:;'<>,./?\"\'\\/\n\t\b\f\r");
			String querytoparse = "";
			while(strtok.hasMoreElements()) {
				String token = strtok.nextToken();
				querytoparse += "text:" + token + "^1" + "id:" + token+ "^1.5" + "screen_name" + token + "^2";
				//querytoparse += "text:" + token;
			}		
			Query query = queryparser.parse(querytoparse);
			//System.out.println(query.toString());
			TopDocs results = indexSearcher.search(query, topk);
			System.out.println(results.scoreDocs.length);
			
//			ArrayList<String> ar = new ArrayList<String>();
//			String[] ar = null;
			String whole = null;
			for(int h = 0; h < topk; ++h)
			{
				if(h==0) {
					whole = indexSearcher.doc(results.scoreDocs[h].doc).getFieldable("screen_name").stringValue() + 
							" :: " + indexSearcher.doc(results.scoreDocs[h].doc).getFieldable("created_at").stringValue() +
							" :: " + indexSearcher.doc(results.scoreDocs[h].doc).getFieldable("text").stringValue()
							+ "\r\n";
				}
				else {
					whole = whole + "/" + indexSearcher.doc(results.scoreDocs[h].doc).getFieldable("screen_name").stringValue() + 
							" :: " + indexSearcher.doc(results.scoreDocs[h].doc).getFieldable("created_at").stringValue() +
							" :: " + indexSearcher.doc(results.scoreDocs[h].doc).getFieldable("text").stringValue()
							+ "\r\n";
				}
				//System.out.println("Iteration:" + h);
			}

			return whole;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			indexSearcher.close();
		}
		return null;
	}
	
}