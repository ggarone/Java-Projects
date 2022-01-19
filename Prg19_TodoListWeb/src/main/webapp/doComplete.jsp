<%@page import="controller.TodoCtrl"%>
<% 

if(request.getParameter("idTodo") != null){
	TodoCtrl controller;
	// get controller from pre-existing session
	if(session.getAttribute("controller") != null){
		controller = (TodoCtrl) session.getAttribute("controller");
	// or create new one
	} else {
		controller = new TodoCtrl();
	}
	
	int id = Integer.parseInt(request.getParameter("idTodo"));
	controller.completeTodoById(id);
	// save changes into session
	session.setAttribute("controller", controller);
	
	response.sendRedirect("index.jsp");
}


%>