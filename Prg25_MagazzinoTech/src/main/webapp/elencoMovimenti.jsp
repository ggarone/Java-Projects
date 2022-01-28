<%@page import="model.Articolo"%>
<%@page import="DB.ArticoliDB"%>
<%@page import="java.util.List"%>
<%@page import="model.Movimento"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
.numero {
	text-align: right;
}
</style>
</head>
<body>
<%@ include file="menu.jsp" %>
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
			<th>dataMovimento</th>
			<th>Articolo</th>
			<th>Descrizione</th>
			<th class="numero">Quantita'</th>
		</tr>
	
	<%
		List<Movimento> movimenti = (List<Movimento>) request.getAttribute("movimenti");
	
		for(Movimento m : movimenti){%>
			<tr>
				<td><%=m.getDataMovimento()%></td>
				<td><%=m.getArticolo().getDescrizione()%></td>
				<td><%=m.getDescrizione()%></td>
				<td class="numero"><%=m.getQuantita()%></td>
			</tr>
	<%} %>
	
	</table>
</body>
</html>