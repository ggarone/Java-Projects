package service;

import java.sql.SQLException;
import java.util.List;

import entities.Country;

public interface CountryService {
	void addCountry(Country c) throws SQLException;
	Country getCountryById(int id) throws SQLException;
	List<Country> getCountries() throws SQLException;
}
