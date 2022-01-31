<%@page import="model.Movimento"%>
<%@page import="model.ContoCorrente"%>
<%@page import="model.Cliente"%>
<%@ include file="header.jsp"%>
<%

if (session.getAttribute("logged")== null){
	response.sendRedirect("login");
}
	Cliente c = (Cliente)session.getAttribute("logged");
	ContoCorrente cc = (ContoCorrente)session.getAttribute("conto");

%>
<h1>Benvenuto nell'area riservata</h1>

<h2><%=c.getNome()%> <%=c.getCognome()%></h2>
<h3><%=cc.getSaldo()%> </h3>


<form method="post" action="conti">
	<input type="number" name="amount" placeholder="euro">
	versamento <input type="radio" name="operazione" value="versamento">
	prelievo <input type="radio" name="operazione" value="prelievo">
	<input type="submit" value="invia">

</form>

<table>
<% for(Movimento m: cc.getMovimenti()){ %>
	<tr>
		<td><%=m.getDescrizione()%></td>
		<td><%=m.getEntrate()%></td>
		<td><%=m.getUscite()%></td>
	</tr>
<%} %>
</table>



<%@ include file="footer.jsp"%>



