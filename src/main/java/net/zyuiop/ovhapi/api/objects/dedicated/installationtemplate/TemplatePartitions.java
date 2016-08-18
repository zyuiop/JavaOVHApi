package net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate;

/**
 *  Partitions defined in this partitioning scheme
 */

public class TemplatePartitions { 

	private java.lang.String raid;
	private java.lang.String volumeName;
	private long order;
	private java.lang.String filesystem;
	private java.lang.String type;
	private java.lang.String mountpoint;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size;

	public TemplatePartitions() {
	}

	public java.lang.String getRaid() { 
		return this.raid;
	} 

	public void setRaid(java.lang.String raid) { 
		this.raid = raid;
	} 

	public TemplatePartitions raid(java.lang.String raid) { 
		this.raid = raid;
		return this;
	} 

	public java.lang.String getVolumeName() { 
		return this.volumeName;
	} 

	public void setVolumeName(java.lang.String volumeName) { 
		this.volumeName = volumeName;
	} 

	public TemplatePartitions volumeName(java.lang.String volumeName) { 
		this.volumeName = volumeName;
		return this;
	} 

	public long getOrder() { 
		return this.order;
	} 

	public void setOrder(long order) { 
		this.order = order;
	} 

	public TemplatePartitions order(long order) { 
		this.order = order;
		return this;
	} 

	public java.lang.String getFilesystem() { 
		return this.filesystem;
	} 

	public void setFilesystem(java.lang.String filesystem) { 
		this.filesystem = filesystem;
	} 

	public TemplatePartitions filesystem(java.lang.String filesystem) { 
		this.filesystem = filesystem;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public TemplatePartitions type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getMountpoint() { 
		return this.mountpoint;
	} 

	public void setMountpoint(java.lang.String mountpoint) { 
		this.mountpoint = mountpoint;
	} 

	public TemplatePartitions mountpoint(java.lang.String mountpoint) { 
		this.mountpoint = mountpoint;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getSize() { 
		return this.size;
	} 

	public void setSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size) { 
		this.size = size;
	} 

	public TemplatePartitions size(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size) { 
		this.size = size;
		return this;
	} 

}
