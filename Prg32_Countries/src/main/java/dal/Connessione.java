package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	private final String DB_NAME = "tss_2022";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/"+DB_NAME;
	private final String USER = "root";
	private final String PASS = "V3cch10n3_!";
	
	private Connection conn;
	
	public Connection getConn() {
		connetti();
		return conn;
	}
	
	private void connetti() {
		if(this.conn == null) {
			try {
				// serve a tomcat per trovare il driver mysql
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
			try {
				this.conn = DriverManager.getConnection(URL,USER,PASS);
				System.out.println("Connessione ok!");
			} catch (SQLException e) {
				System.err.println("Errore di connessione: " + e.getMessage());
			}
			
		} else {
			System.out.println("sei gia' connesso");
		}
	}
	
	
	
	
	
	
	
}
