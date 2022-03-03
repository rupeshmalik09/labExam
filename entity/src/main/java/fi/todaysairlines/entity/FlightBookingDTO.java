package fi.todaysairlines.entity;
import javax.validation.constraints.NotNull;

public class FlightBookingDTO {
	@NotNull(message = "User name cannot be null")
	String userName;
	
	@NotNull(message = "cityFrom cannot be null")
	//@Size(min=3,max=8)
	String cityFrom;
	
	@NotNull(message = "Name cannot be null")
	String cityTo;
	
	@NotNull(message = "travle cannot be null")
	String travle;
	
	
	public FlightBookingDTO(String userName, String cityFrom, String cityTo, String travle) {
		super();
		this.userName = userName;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
		this.travle = travle;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCityFrom() {
		return cityFrom;
	}


	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}


	public String getCityTo() {
		return cityTo;
	}


	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}


	public String getTravle() {
		return travle;
	}

	public void setTravle(String travle) {
		this.travle = travle;
	}		

}
