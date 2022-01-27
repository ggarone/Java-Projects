<%@page import="model.Articolo"%>
<%@page import="DB.ArticoliDB"%>
<%@page import="java.util.List"%>
<%@page import="model.Movimento"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Movimenti</h1>
	
	<form method="post" action="movimenti">
		<input type="text" name="descrizione" placeholder="descrizione">
		<input type="number" name="quantita" placeholder="quantita">
		<select name="articolo">
		<option>Scegli articolo</option>
		<%for(Articolo a: ArticoliDB.getAll().values()){%>
			<option value="<%=a.getId()%>"><%=a.getDescrizione()%></option>
		<%}%>
		</select>
		<input type="submit" value="aggiungi">
	</form>
	
	<table>
		<tr>
			<th>Descrizione</th>
			<th>Quantita'</th>
			<th>dataMovimento</th>
			<th>Nome Articolo</th>
		</tr>
	
	<%
		List<Movimento> movimenti = (List<Movimento>) request.getAttribute("movimenti");
	
		for(Movimento m : movimenti){%>
			<tr>
				<td><%=m.getDescrizione()%></td>
				<td><%=m.getQuantita()%></td>
				<td><%=m.getDataMovimento()%></td>
				<td><%=m.getArticolo().getDescrizione()%></td>
			</tr>
	<%} %>
	
	</table>
</body>
</html>