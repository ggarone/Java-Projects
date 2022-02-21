package dal;

import java.sql.SQLException;
import java.util.List;

import entities.Todo;

public interface TodoDAO {
	String TAB = "todos";
	String ALL = "select * from " + TAB + " ";
	String ONE = "select * from " + TAB + " WHERE id= ";
	String INSERT = "insert into " + TAB + " (user_id,title,due_on,status) values(?,?,?,?)";
	
	void addTodo(Todo t) throws SQLException;
	List<Todo> getTodos() throws SQLException;

}
