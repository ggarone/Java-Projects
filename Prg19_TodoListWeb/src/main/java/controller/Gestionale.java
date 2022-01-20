package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Gestionale
 */
@WebServlet("/todos")
public class Gestionale extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("<h1>ciao</h1>!!Served at: ").append(request.getContextPath());
//		response.sendRedirect("index.jsp");
		 if (request.getSession().getAttribute("controller") != null) {
			 TodoCtrl controller = (TodoCtrl) request.getSession().getAttribute("controller");
			 System.out.println(controller.getTodos().get(0)); 
		 }
			 
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
