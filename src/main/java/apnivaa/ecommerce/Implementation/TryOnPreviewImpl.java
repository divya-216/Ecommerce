package apnivaa.ecommerce.Implementation;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apnivaa.ecommerce.Entity.Product;
import apnivaa.ecommerce.Entity.TryOnPreview;
import apnivaa.ecommerce.Entity.User;
import apnivaa.ecommerce.Repository.ProductRepository;
import apnivaa.ecommerce.Repository.TryOnRepo;
import apnivaa.ecommerce.Repository.UserRepository;
import apnivaa.ecommerce.Service.TryOnService;
@Service("TryOnService")
public class TryOnPreviewImpl implements TryOnService {

	@Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;
    
    @Autowired TryOnRepo tryOnRepo;
    
	@Override
	public String tryOnPreview(int userId, int productId)  throws IOException{
		
		User userObj = userRepository.findById(userId).orElse(null);
		Product productObject = productRepository.findById(productId).orElse(null);
		
		BufferedImage productImage = ImageIO.read( new ByteArrayInputStream(productObject.getImage()));

		BufferedImage userImage = ImageIO.read(new ByteArrayInputStream(userObj.getImage())); 
		
		
        Graphics2D graphic = userImage.createGraphics();

        graphic.drawImage(productImage,
                250,
                150,
                450,
                700,
                null);

        graphic.dispose();

        ByteArrayOutputStream outputImage = new ByteArrayOutputStream();

        ImageIO.write(userImage, "png", outputImage);
        
        String folderPath = "C:\\Users\\sowmya\\Desktop\\uploads\\previews";

        String fileName = "preview_" + System.currentTimeMillis() + ".png";

        String filePath = folderPath + File.separator + fileName;

        File outputFile = new File(filePath);

        ImageIO.write(userImage, "png", outputFile);
        
        TryOnPreview preview = new TryOnPreview();

        preview.setUserId(userId);
        preview.setProductId(productId);
        preview.setPreviewPath(filePath);
        preview.setPreviewImage(outputImage.toByteArray());
        tryOnRepo.save(preview);
        System.out.println(outputFile.exists());
        System.out.println(outputFile.getAbsolutePath());
        return filePath;
		
	}

}
