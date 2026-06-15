package apnivaa.ecommerce.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import apnivaa.ecommerce.Service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService service;
	
	@PostMapping("/uploadUserImage")
	public String uploadImage(@RequestPart("file") MultipartFile file, @RequestPart("filePath") String path) throws IOException {
		return service.uploadUserImage(file, path);
	}
}
