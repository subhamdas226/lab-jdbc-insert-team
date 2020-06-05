package model;

/*
 * Progression 3:
1.Create a class called as City inside the model package with below attributes,- cityld - Long- cityName - String 
2.Include getter and setter method for all the attributes,
3.Include a constructor with below arguments,- public City(cityld,cityName)
*/
public class City{
	public long cityId;
	public String cityName;
	
	public City(long cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
