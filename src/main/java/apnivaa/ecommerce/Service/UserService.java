package apnivaa.ecommerce.Service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import apnivaa.ecommerce.Entity.User;

public interface UserService {

	public String uploadUserImage(MultipartFile userImage, String filePath) throws IOException;
	
	
}
