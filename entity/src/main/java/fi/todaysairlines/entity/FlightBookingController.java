package fi.todaysairlines.entity;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/user")
public class FlightBookingController {
	ArrayList<FlightBookingDTO> users =new ArrayList<>();
	public FlightBookingController()
	{
		users.add(new FlightBookingDTO("Ram","Delhi","Pune","13/02/2022"));
		users.add(new FlightBookingDTO("Shayam","Mumbai","Pune","14/02/2022"));
	}

	//localhost/user/auth
	@GetMapping("/auth")
		public Boolean authenticate(@RequestParam("uname") String userName, @RequestParam("pwd") String password)
		{
			if(userName.equals("java_user")&& password.equals("Rm@7030179590"))
				return true;
			else 
				return false;
		}
	
	
	//localhost/user/fi
	//Jackson DataFormat XML Dependancy 
	@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE}, path = "/{uname}")
	public ResponseEntity<FlightBookingDTO> getInfo(@PathVariable(name = "uname")String userName)
	{
		for(FlightBookingDTO objUser : users)
		{
			if(objUser.getUserName().equals(userName))
				return new ResponseEntity<>(objUser, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	// In Postman := 
	// Method = POST
	// Body = row type, Text = JSON
	// {
	//   "userName":"RestApi",
	//	 "password":"Rest@123"
	//   "email" :"rest@rest.com"
	//   "name"  :"RESTApi"
	// }
	@PostMapping("/newuser")
		public String newUser(@Valid @RequestBody FlightBookingDTO objUser)
		{
		
			System.out.println(objUser.getUserName());
			System.out.println(objUser.getCityFrom());
			System.out.println(objUser.getCityTo());
			System.out.println(objUser.getTravle());
			
			return objUser.getTravle();
		}
	
	

	@GetMapping("/all")
	public List<FlightBookingDTO> getAll()
	{
		return users;
	}
	

}
