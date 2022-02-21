package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

import dal.TodoDAO;
import dal.TodoDAOImpl;
import entities.Todo;

@WebServlet("/todos")
public class TodoMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TodoDAO repo;
    
    public TodoMVC() {
       this.repo = new TodoDAOImpl(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		try {
			for (Todo t : repo.getTodos()) {
				sb.append(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("title") != null) {
			int userId = Integer.parseInt(request.getParameter("user_id"));
			String title = request.getParameter("title");
			LocalDateTime dueOn = LocalDateTime.now();
			String status = request.getParameter("status");
			Todo t = new Todo(0, userId, title, dueOn, status);
			try {
				repo.addTodo(t);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		doGet(request, response);
	}

}
