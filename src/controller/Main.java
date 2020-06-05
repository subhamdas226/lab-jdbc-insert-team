package controller;

/*
 * Progression 6:
1.Create a main-class called Main inside the controller package.
2.Create appropriate objects for the TeamDAO and CityDAO class.
3.Create appropriate objects for the model classes.
4.Get the values from main class and pass to the createTeam method to store in the database.
5.Call the getCityByName method and display the details of the players.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.*;
import model.*;

public class Main{
	
	public static void main(String args[]) throws SQLException, Exception {
		TeamDAO teamdao = new TeamDAO();
		CityDAO citydao = new CityDAO();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" 1. : Create Team");
		System.out.println(" 2. : Show Team Details");
		int x = Integer.parseInt(br.readLine());
		
		switch(x) {
		case 1:{
			System.out.println(" Enter City ID");
			long cityid = Long.parseLong(br.readLine());
			System.out.println(" Enter City Name");
			String ctname = br.readLine();							
			City city = new City(cityid,ctname);
			
			city.setCityId(cityid);
			
			
			
			city.setCityName(ctname);
			citydao.createCity(city);
				
			System.out.println(" Enter Team name");
			String tname = br.readLine();
			System.out.println(" Enter Coach name");
			String coach = br.readLine();
			System.out.println(" Enter Captain name");
			String capname = br.readLine();
			Team team = new Team(tname,coach,capname,city);
			teamdao.createTeam(team);
			
		}
		case 2:{
			System.out.println(" Team Details");
			String name = br.readLine();
			citydao.getCityByName(name);
		}
		}
	}
}
