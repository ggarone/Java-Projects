package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CountryService;
import service.CountryServiceImpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import entities.Country;

@WebServlet("/countries")
public class CountryMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CountryService service;

    public CountryMVC() {
        super();
        this.service = new CountryServiceImpl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<Country> countries = this.service.getCountries();
			request.setAttribute("paesi", countries);
			request.getRequestDispatcher("elenco.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("stato") != null) {
			String stato = request.getParameter("stato");
			String capitale = request.getParameter("capitale");
			String bandiera = request.getParameter("bandiera");
			int popolazione = Integer.parseInt(request.getParameter("popolazione"));
			
			Country c = new Country(popolazione, stato, capitale, bandiera, popolazione);
			try {
				this.service.addCountry(c);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		doGet(request, response);
	}

}
