<%@page import="controller.TodoCtrl"%>
<% 

if(request.getParameter("cosa") != null){
	TodoCtrl controller;
	// get controller from pre-existing session
	if(session.getAttribute("controller") != null){
		controller = (TodoCtrl) session.getAttribute("controller");
	// or create new one
	} else {
		controller = new TodoCtrl();
	}
	
	controller.addTodo(request.getParameter("cosa"));
	// save changes into session
	session.setAttribute("controller", controller);
	
	response.sendRedirect("index.jsp");
}


%>