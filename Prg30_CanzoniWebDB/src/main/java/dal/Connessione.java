package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	private final String DB_URL = "jdbc:mysql://localhost:3306/tss_2022";
	private final String USER = "root";
	private final String PASS = "V3cch10n3_!";
	
	private Connection conn = null;
	
	public Connection connetti() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			this.conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connessione ok!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Errore di connessione.");
			System.err.println(e.getMessage());
		}
		return this.conn;
	}
	
	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.connetti();
	}
}
