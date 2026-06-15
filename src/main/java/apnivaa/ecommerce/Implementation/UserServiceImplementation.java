package apnivaa.ecommerce.Implementation;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import apnivaa.ecommerce.Entity.User;
import apnivaa.ecommerce.Repository.UserRepository;
import apnivaa.ecommerce.Service.UserService;

@Service("UserService")
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public String uploadUserImage(MultipartFile userImage, String filePath) throws IOException {
		
	User userObj = new User();
	userObj.setUploadedImagefilePath(filePath);
	userObj.setUploadedImageName(userImage.getOriginalFilename());
	
	userObj.setImage(userImage.getBytes());
	repository.save(userObj);
		
		return "user Image Uploaded";
	}

}
