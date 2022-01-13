<%@ page import="model.Studente" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello, world</h1>
	<%
		String s = "Hello world";
		Studente st = new Studente("Winny");
		for(int i=1; i<=6; i++){
			out.print("<h"+i+">" + s + "</h"+i+">");
			out.print(st);
		}
	%>

</body>
</html>