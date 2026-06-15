package apnivaa.ecommerce.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="TryOnPreview")
public class TryOnPreview {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tryOnPreviewId;
	
    private Integer userId;

    private Integer productId;
    
    private String previewPath;
   
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] previewImage;

	public int getTryOnPreviewId() {
		return tryOnPreviewId;
	}

	public void setTryOnPreviewId(int tryOnPreviewId) {
		this.tryOnPreviewId = tryOnPreviewId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public byte[] getPreviewImage() {
		return previewImage;
	}

	public void setPreviewImage(byte[] previewImage) {
		this.previewImage = previewImage;
	}

	public String getPreviewPath() {
		return previewPath;
	}

	public void setPreviewPath(String previewPath) {
		this.previewPath = previewPath;
	}

    
    
}
