package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Libro;

public class LibroDAOImpl implements LibroDAO {
	private Connessione miaConn;
	private Connection conn;
	
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public LibroDAOImpl() {
		this.miaConn = new Connessione();
		this.conn = this.miaConn.getConn();
	}
	
	@Override
	public List<Libro> getAll() {
		List<Libro> libri = new ArrayList<Libro>();
		try {
			this.st = this.conn.createStatement();
			this.rs = this.st.executeQuery(ALL);
			while(rs.next()) {
				int id = rs.getInt("id");
				String titolo = rs.getString("titolo");
				double prezzo = rs.getDouble("prezzo");
				int pagine = rs.getInt("pagine");
				int editoreId = rs.getInt("editore_id");
				Libro l = new Libro(id, titolo, prezzo, pagine, editoreId);
				libri.add(l);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libri;
	}

	@Override
	public Libro getLibroById(int id) {
		try {
			this.st = this.conn.createStatement();
			this.rs = this.st.executeQuery(ONE+id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public void addLibro(Libro l) {
		try {
			this.ps = this.conn.prepareStatement(INSERT);
			this.ps.setString(1, l.getTitolo());
			this.ps.setDouble(2, l.getPrezzo());
			this.ps.setInt(3, l.getPagine());
			this.ps.setInt(4, l.getEditoreId());
			if(this.ps.execute()) {
				System.out.println("aggiunto " + l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
