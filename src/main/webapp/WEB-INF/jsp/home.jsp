<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.lang.Math" %>
<!DOCTYPE html>
<html>
<head>
<style>
		body {
  		background-color: PaleTurquoise;
		}

		h1 {  		
  		color: SteelBlue;
  		text-align: center;
  		font-size: 65px;
  		text-shadow: 2px 2px red;
		}
		
		p {
		color: white;
		font-family: Arial, Helvetica, sans-serif; 
		font-size: 35px;
		}
		
		a:hover {
		color: orange;
		font-size: 45px;
		}
</style>
<title>home page</title>
</head>
<body>

<h1>This is my info page</h1>
<p>Some info about me</p>
<p>Some more info about me</p>
	<% String s = "this is generated with Java code";
	out.println(s);
	out.println(Math.PI);
	%>

<img src="https://ucarecdn.com/66e0ee19-fbf6-4b57-b9d2-33c1d7ea04e5/-/format/auto/-/preview/3000x3000/-/quality/lighter/"><img>

<a href="/travel"> Go to my travel page</a>

</body>
</html>