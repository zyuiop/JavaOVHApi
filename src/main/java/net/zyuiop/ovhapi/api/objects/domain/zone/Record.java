package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Zone resource records
 */

public class Record { 

	private java.lang.String target;
	private long ttl;
	private java.lang.String zone;
	private java.lang.String fieldType;
	private long id;
	private java.lang.String subDomain;

	public Record() {
	}

	public java.lang.String getTarget() { 
		return this.target;
	} 

	public void setTarget(java.lang.String target) { 
		this.target = target;
	} 

	public Record target(java.lang.String target) { 
		this.target = target;
		return this;
	} 

	public long getTtl() { 
		return this.ttl;
	} 

	public void setTtl(long ttl) { 
		this.ttl = ttl;
	} 

	public Record ttl(long ttl) { 
		this.ttl = ttl;
		return this;
	} 

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public Record zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getFieldType() { 
		return this.fieldType;
	} 

	public void setFieldType(java.lang.String fieldType) { 
		this.fieldType = fieldType;
	} 

	public Record fieldType(java.lang.String fieldType) { 
		this.fieldType = fieldType;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Record id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getSubDomain() { 
		return this.subDomain;
	} 

	public void setSubDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
	} 

	public Record subDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
		return this;
	} 

}
