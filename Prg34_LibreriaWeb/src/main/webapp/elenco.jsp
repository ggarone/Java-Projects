<%@page import="entities.Libro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Libri</h1>
<table>
  <tr>
    <th>Titolo</th>
    <th>Prezzo</th>
  </tr>
  
 	<% List<Libro> libri = (List<Libro>) request.getAttribute("libri"); %>
 	<% for(Libro l: libri){ %>
 		  <tr>
 		  <td><%=l.getTitolo()%></td>
 		  <td><%=l.getPrezzo()%></td>
 		  </tr>
 	<%} %>

</table>


</body>
</html>