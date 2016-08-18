package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * SiteBuilder template infos
 */

public class SiteBuilderTemplate { 

	private long bkId;
	private java.lang.String reference;
	private java.lang.String previewImg;
	private java.lang.String name;
	private long id;
	private java.lang.String thumbImage;

	public SiteBuilderTemplate() {
	}

	public long getBkId() { 
		return this.bkId;
	} 

	public void setBkId(long bkId) { 
		this.bkId = bkId;
	} 

	public SiteBuilderTemplate bkId(long bkId) { 
		this.bkId = bkId;
		return this;
	} 

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public SiteBuilderTemplate reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

	public java.lang.String getPreviewImg() { 
		return this.previewImg;
	} 

	public void setPreviewImg(java.lang.String previewImg) { 
		this.previewImg = previewImg;
	} 

	public SiteBuilderTemplate previewImg(java.lang.String previewImg) { 
		this.previewImg = previewImg;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SiteBuilderTemplate name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SiteBuilderTemplate id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getThumbImage() { 
		return this.thumbImage;
	} 

	public void setThumbImage(java.lang.String thumbImage) { 
		this.thumbImage = thumbImage;
	} 

	public SiteBuilderTemplate thumbImage(java.lang.String thumbImage) { 
		this.thumbImage = thumbImage;
		return this;
	} 

}
