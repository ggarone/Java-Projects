package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Router
 */
@WebServlet("/")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//include header
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		String msg = "Benvenuti nel sito delle Serie TV";
		if(request.getParameter("q") != null) {
			msg += "Ciao" + request.getParameter("q");
		}
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		response.getWriter().append("<h1>" + msg + "</h1>" );
		
		//include footer
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}
