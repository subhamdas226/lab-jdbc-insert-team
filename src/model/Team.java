package model;

/*Progression 2:
1.Create a class called as Team inside the model package with below attributes,- name - String- coach - String- city - City 
2.Include getter and setter method for all the attributes
3.Include a constructor with below arguments,- public Team(String name, String coach, String captain, City city)

*/
public class Team{
	public String name;
	public String coach;
	public String captain;
	public City city;
	
	public Team(String name, String coach, String captain , City city) {
		super();
		this.name = name;
		this.coach = coach;
		this.captain = captain;
		this.city = city;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
	
	
}
