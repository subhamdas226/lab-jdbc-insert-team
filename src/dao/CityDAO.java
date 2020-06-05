package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Progression 4:
1.Create a dao-class called as CityDA0 with below methods- public City getCityByName(String name) -
 Method to fetch the city information from database based on the city name.
 - public createCity()- which takes the city class as argument. 
*/

import model.*;
//import java.sql.*;
import utility.ConnectionManager;

public class CityDAO{
	public void getCityByName(String name) throws SQLException, Exception {
		String cityDetails = "select * from city";
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(cityDetails);
		ResultSet rs = ps.executeQuery("SELECT * from city");
		while(rs.next()) {
			if(name.equals(rs.getString("name"))) {
				System.out.println("ID is : " + rs.getInt(1) + "\t City nmae is : "+ rs.getString(2) );
			}
		}
		
	}
	
	public void createCity(City city) throws SQLException, Exception {
		long cityId = city.getCityId();
		String cityName = city.getCityName();
		
		//ConnectionManager con = new ConnectionManager();
		
		//inserts details into database
		String sql = "insert into (ID,NAME)values(?,?)";
		//create Statement
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
	    st.setLong(1,cityId);
	    st.setString(2,cityName);
	    
	    st.executeUpdate();
	    ConnectionManager.getConnection().close();
	    
		
	}
}
