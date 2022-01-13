<!DOCTYPE html>
<%@page import="controller.Libri"%>
<%@page import="model.Libro"%>
<html>
<head>
<meta charset="utf-8">
<title>Libreria</title>
</head>
<style type="text/css">
h2 {
	color: red;
}
</style>
<body>
	<h1>Libreria</h1>
	<%
	Libri controller = new Libri();
	%>
	<form action="">
		<input type="text" name="titolo" placeholder="titolo"> <input
			type="text" name="prezzo" placeholder="prezzo"> <input
			type="submit" value="aggiungi libro">
	</form>

	<%
	if (request.getParameter("titolo") != null && request.getParameter("prezzo") != null) {
		String titolo = request.getParameter("titolo");
		double prezzo = Double.valueOf(request.getParameter("prezzo"));
		controller.addLibro(titolo, prezzo);
	}

	for (Libro l : controller.getLibri()) {
	%>
	<h2>
		<%=l.getTitle() + " " + l.getPrice()%></h2>
	<%
	}
	%>
</body>
</html>