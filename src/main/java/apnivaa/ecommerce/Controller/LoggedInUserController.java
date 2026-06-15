package apnivaa.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import apnivaa.ecommerce.Entity.LoggedInUsers;
import apnivaa.ecommerce.Service.LoggedInUserService;

@RestController
public class LoggedInUserController {
	
	@Autowired 
	private LoggedInUserService loggedInUserService;
	
	
	@PostMapping("/createUser")
	public String accountCreation(@RequestBody LoggedInUsers userData) {
		return loggedInUserService.createUser(userData);
	}

}
