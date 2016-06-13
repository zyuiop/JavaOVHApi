package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate;
/**
 * SiteBuilder template infos
 */

public class SiteBuilderTemplateImpl implements SiteBuilderTemplate { 

	private long bkId;
	private java.lang.String reference;
	private java.lang.String previewImg;
	private java.lang.String name;
	private long id;
	private java.lang.String thumbImage;

	public SiteBuilderTemplateImpl() {
	}

	public long getBkId() { 
		return this.bkId;
	} 

	public void setBkId(long bkId) { 
		this.bkId = bkId;
	} 

	public SiteBuilderTemplateImpl bkId(long bkId) { 
		this.bkId = bkId;
		return this;
	} 

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public SiteBuilderTemplateImpl reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

	public java.lang.String getPreviewImg() { 
		return this.previewImg;
	} 

	public void setPreviewImg(java.lang.String previewImg) { 
		this.previewImg = previewImg;
	} 

	public SiteBuilderTemplateImpl previewImg(java.lang.String previewImg) { 
		this.previewImg = previewImg;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SiteBuilderTemplateImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SiteBuilderTemplateImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getThumbImage() { 
		return this.thumbImage;
	} 

	public void setThumbImage(java.lang.String thumbImage) { 
		this.thumbImage = thumbImage;
	} 

	public SiteBuilderTemplateImpl thumbImage(java.lang.String thumbImage) { 
		this.thumbImage = thumbImage;
		return this;
	} 

}
