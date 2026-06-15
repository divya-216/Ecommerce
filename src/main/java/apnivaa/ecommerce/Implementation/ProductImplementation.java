package apnivaa.ecommerce.Implementation;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import apnivaa.ecommerce.Entity.Product;
import apnivaa.ecommerce.Repository.ProductRepository;
import apnivaa.ecommerce.Service.ProductService;

@Service("ProductService")
public class ProductImplementation implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public String uploadUserImage(MultipartFile userImage, String filePath, String productName) throws IOException {
		
		Product obj = new Product();
		
		obj.setImage(userImage.getBytes());
		obj.setProductName(productName);
		obj.setImagePath(filePath);
		productRepository.save(obj);
		
		
		return "Product Image Uploaded";
	}

}
