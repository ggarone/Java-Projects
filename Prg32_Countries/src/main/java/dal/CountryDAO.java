package dal;

import java.sql.SQLException;
import java.util.List;

import entities.Country;

public interface CountryDAO {
	String TAB = "countries";
	String FIND_ALL = "select * from " + TAB + " ";
	String FIND_ONE = "select * from " + TAB + " WHERE id= ";
	String INSERT = "insert into " + TAB + " (stato,capitale,bandiera,popolazione) values(?,?,?,?)";
	
	void addCountry(Country c) throws SQLException;
	Country getCountryById(int id) throws SQLException;
	List<Country> getCountry() throws SQLException;
//	List<Canzone> getCanzoniByCantante(Cantante c) throws SQLException;
	
	
	
	
	
}
