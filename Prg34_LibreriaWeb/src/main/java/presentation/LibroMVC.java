package presentation;

import java.io.IOException;
import java.util.List;

import entities.Libro;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.LibroSerivceImpl;
import service.LibroService;

@WebServlet("/libri")
public class LibroMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LibroService service;



    public LibroMVC() {
        this.service = new LibroSerivceImpl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Libro> libri = this.service.getAll();
		request.setAttribute("libri", libri);
		
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("titolo")!=null) {
			String titolo = request.getParameter("titolo");
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			int pagine = Integer.parseInt(request.getParameter("pagine"));
			int editoreId = Integer.parseInt(request.getParameter("editore_id"));
			
			Libro l = new Libro(0, titolo, prezzo, pagine, editoreId);
			service.addLibro(l);
		}
		
		doGet(request, response);
	}

}
