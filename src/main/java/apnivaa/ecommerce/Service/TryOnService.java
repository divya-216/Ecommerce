package apnivaa.ecommerce.Service;

import java.io.IOException;

public interface TryOnService {

	public String tryOnPreview(int userId, int productId) throws IOException;
	
	
}
