<%@page import="model.Todo"%>
<%@page import="controller.TodoCtrl"%>

<table>
<% 

if(session.getAttribute("controller") != null){
	TodoCtrl controller = (TodoCtrl) session.getAttribute("controller");
	
	for(Todo t : controller.getTodos()){
		out.print("<tr>");
		
		out.print("<td>");
		out.print("<a href='doComplete.jsp?idTodo=" + t.getId()+ "'>");
		out.print(t.isDone());
		out.print("</a>");
		out.print("</td>");
		
		out.print("<td>");
		out.print(t.getDescription());
		out.print("</td>");
		
		out.print("<td>");
		out.print(t.getId());
		out.print("</td>");
		
		out.print("</tr>");
	}
}

%>

</table>