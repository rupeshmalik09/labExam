package fi.todaysairlines.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class BookingPRN {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ticketid")
	int ticketId;
	
	@Column(name="username")
	String userName;
	
	@Column(name="cityfrom")
	String cityFrom;
	
	@Column(name="cityto")
	String cityTo;
	
	@Column(name="travle")
	String travle;
	public BookingPRN() {
		super();
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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


