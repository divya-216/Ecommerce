package apnivaa.ecommerce.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import apnivaa.ecommerce.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/uploadProductImage")
	public String uploadProductImage(@RequestPart("file") MultipartFile file, 
			@RequestPart("productName") String productName,
			@RequestPart("filePath")String path) throws IOException {
		return productService.uploadUserImage(file, path, productName);
	}
	 
}
