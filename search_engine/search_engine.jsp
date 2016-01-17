<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ui_search.*" %>

<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#D8D8D8">
<%
String result= request.getParameter("searched_query");

out.print("Search Query: \"" + result + "\" <p></p>"); 

textOutput c = new textOutput();
int topk = 10;
String ar = c.search(result,topk);
/* out.print(ar);
 */
 if(ar != null)
 {
	StringTokenizer st=new StringTokenizer(ar,"/");
 	while(st.hasMoreTokens())
 	{
 		String token=st.nextToken();//Here you will get A, sg, fall as separated tokens
 		out.println(token);
 	    out.println("<p></p>");
 	}
 } else {
	    out.println("Nothing Found... Please Try Again.");
 }
%>
<div id="map_canvas" style="width:500px; height:500px"></div>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=TRUEORFALSE">
</body>
</html>