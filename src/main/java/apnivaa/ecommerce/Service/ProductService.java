package apnivaa.ecommerce.Service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface ProductService {

	public String uploadUserImage(MultipartFile userImage, String filePath,  String productName) throws IOException;

	
}
