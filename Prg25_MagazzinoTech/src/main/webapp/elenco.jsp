<%@page import="java.util.List"%>
<%@page import="model.Articolo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<h1>Articoli</h1>
	<table>
		<tr>
			<th>Articolo</th>
			<th>Quantita'</th>
		</tr>
	
	<%
		List<Articolo> articoli = (List<Articolo>) request.getAttribute("articoli");
	
		for(Articolo a : articoli){%>
			<tr>
				<td><%=a.getDescrizione()%></td>
				<td><%=a.getQuantita()%></td>
			</tr>
	<%} %>

	
	</table>
</body>
</html>