package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import dal.CountryDAO;
import dal.CountryDAOImpl;
import entities.Country;

public class CountryServiceImpl implements CountryService {
	
	private CountryDAO repo = new CountryDAOImpl();
	private List<Country> paesiList;
	private Map<Integer,Country> paesiMap;
	
	
	
	@Override
	public void addCountry(Country c) throws SQLException {
		this.repo.addCountry(c);
	}

	@Override
	public Country getCountryById(int id) throws SQLException {
		return this.repo.getCountryById(id);
	}

	@Override
	public List<Country> getCountries() throws SQLException {
		// TODO Auto-generated method stub
		return this.repo.getCountry();
	}

}
