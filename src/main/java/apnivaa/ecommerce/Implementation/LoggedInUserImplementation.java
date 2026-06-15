package apnivaa.ecommerce.Implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apnivaa.ecommerce.Entity.LoggedInUsers;
import apnivaa.ecommerce.Repository.LoggedInRepo;
import apnivaa.ecommerce.Service.LoggedInUserService;
@Service("LoggedInUserService")
public class LoggedInUserImplementation implements LoggedInUserService {

	@Autowired LoggedInRepo loggedUsersRepo;
	@Override
	public String createUser(LoggedInUsers userData) {
		
		loggedUsersRepo.save(userData);
		return "saved";
	}

}
