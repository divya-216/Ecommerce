package apnivaa.ecommerce.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userUploadedImageId;
		

	private String uploadedImageName;
	
	private String uploadedImagefilePath;
	
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;

    
    
    // getters & setters

	
	public int getUserUploadedImageId() {
		return userUploadedImageId;
	}

	public void setUserUploadedImageId(int userUploadedImageId) {
		this.userUploadedImageId = userUploadedImageId;
	}

	public String getUploadedImageName() {
		return uploadedImageName;
	}

	public void setUploadedImageName(String uploadedImageName) {
		this.uploadedImageName = uploadedImageName;
	}

	public String getUploadedImagefilePath() {
		return uploadedImagefilePath;
	}

	public void setUploadedImagefilePath(String uploadedImagefilePath) {
		this.uploadedImagefilePath = uploadedImagefilePath;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
