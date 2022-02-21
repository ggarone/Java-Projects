package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.Todo;

public class TodoDAOImpl implements TodoDAO {
	
	private Connessione miaConn;
	private Connection conn;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public TodoDAOImpl() {
		//create object miaConn
		this.miaConn = new Connessione();
		//call method getConn from Connessione which 
		//returns a Connection object
		this.conn = miaConn.getConn();
	}

	@Override
	public void addTodo(Todo t) throws SQLException {
		this.ps = this.conn.prepareStatement(INSERT);
		this.ps.setInt(1, t.getUserId());
		this.ps.setString(2, t.getTitle());
		
		java.util.Date utilDate;
		String dateFormat = "yyyy-MM-dd'T'HH:mm:ss";
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(dateFormat);
		SimpleDateFormat sdf1 = new SimpleDateFormat(dateFormat);
		try {
		    utilDate = sdf1.parse(t.getDueOn().format(dtf1));
		} catch (ParseException e) {
		    utilDate = null; // handle the exception
		}
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		java.sql.Timestamp sqlTime = Timestamp.valueOf(t.getDueOn());
		this.ps.setTimestamp(3, sqlTime);
		this.ps.setString(4, t.getStatus());
		
		if(this.ps.execute()) {
			System.out.println("record inserito: " + t);
		}
	}

	@Override
	public List<Todo> getTodos() throws SQLException {
		List<Todo> todo = new ArrayList<>();
		
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ALL);
		
		while(this.rs.next()) {
			Todo t = new Todo();
			t.setId(rs.getInt("id"));
			t.setUserId(rs.getInt("user_id"));
			t.setTitle(rs.getString("title"));
			t.setDueOn(rs.getTimestamp("due_on").toLocalDateTime());
			t.setStatus(rs.getString("status"));
			todo.add(t);
		}
		return todo;
	}
}
