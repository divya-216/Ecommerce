package apnivaa.ecommerce.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import apnivaa.ecommerce.Service.TryOnService;

@RestController
public class TryOnController {

	@Autowired 
	private TryOnService service;
	
	@GetMapping("/tryOn")
	public String tryOnFeature(@RequestParam (required = true, name = "userId") int userId,
			@RequestParam (required = true, name = "productId") int productId) throws IOException {
		return service.tryOnPreview(userId, productId);
	}
	
}
