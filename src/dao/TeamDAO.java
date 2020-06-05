package dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
//import java.sql.*;
import java.sql.SQLException;

/*Progression 5:
1.Create a dao-class called as TeamDAO to insert user into the database,
- public void createTeam(Team team) - Method used to insert new team into the database.
*/
import model.*;
import utility.ConnectionManager;

public class TeamDAO{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	@SuppressWarnings("static-access")
	public void createTeam(Team team) throws SQLException, Exception {
		System.out.println("Enter team id :");
		int id = Integer.parseInt(br.readLine());
		String teamName = team.getName(); 
		String coach = team.getCoach();
		String captain = team.getCaptain();
		City city =team.getCity();
		long cityid = city.getCityId();
		
		ConnectionManager con = new ConnectionManager();
		
		//inserts details into database
		String sql = "insert into team values(?,?,?,?,?)";
		//create Statement
		PreparedStatement st = con.getConnection().prepareStatement(sql);
	    st.setInt(1,id);
	    st.setString(2,teamName);
	    st.setString(3,coach);
	    st.setLong(4,cityid);
	    st.setString(5,captain);
	    
	    st.executeUpdate();
	    con.getConnection().close();
	}
}
