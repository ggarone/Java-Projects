<%@page import="model.Libro"%>
<%@page import="controller.LibreriaCtrl"%>
<h2>Elenco Libri</h2>


<table>
<tr>
	<th>titolo</th>
	<th>prezzo</th>
</tr>
<% 	for(Libro l : LibreriaCtrl.getLibri()){ %>
<tr>
	<th><%=l.getTitolo()%></th>
	<th><%=l.getPrezzo()%></th>
</tr>


<% }%>
</table>