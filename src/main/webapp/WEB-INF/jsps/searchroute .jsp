<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SEARCH SOURCE</title>
</head>
<body>
	<h2>FIND SOURCE</h2>
	<form action = "findRoute" method = "post">
		<pre>
			FROM:	   <input type ="text" name = "from"/>
			TO:	       <input type ="text" name = "to"/>
			DATE:      <input type = "text" name = "date"/>
			<input type = "Submit" value = "Search"/>
		</pre>
	</form>
</body>
</html>