package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.json.JSONArray;

import com.google.gson.Gson;

@WebServlet("/api/cantanti")
public class CantantiREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Jukebox jukebox;
    
    public CantantiREST() {
       this.jukebox = new Jukebox(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONArray collezione;
		
		if(request.getParameter("cantante") != null) {
			collezione = new JSONArray(this.jukebox.tutteLeCanzoni().stream()
							.filter(c -> c.getCantante().getNome().contains(request.getParameter("cantante")))
							.collect(Collectors.toList())
							);
		} else {
			List<String> cantanti = this.jukebox.tutteLeCanzoni().stream()
							.map(c -> c.getCantante().getNome())
							.sorted()
							.distinct()
							.collect(Collectors.toList()
							);
			
			collezione = new JSONArray(cantanti);
		}
		
		
		response.setContentType("application/json");
		response.getWriter().append(collezione.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 mi faccio ritornare un buffer con la string
		BufferedReader reader = request.getReader();
		//2 creo un GSON
		Gson gson = new Gson();
		//3 riverso il buffer nel gson
		Canzone c = gson.fromJson(reader, Canzone.class);
		//4 aggiungo la canzone al mio db attraverso il ctrl
		this.jukebox.addCanzone(c);
		// 5 chiama il metodo doGet per mostrare l'elenco di canzoni
		doGet(request, response);
	}

}
