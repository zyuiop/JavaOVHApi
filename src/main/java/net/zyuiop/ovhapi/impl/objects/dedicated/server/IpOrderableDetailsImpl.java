package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails;
/**
 * A structure describing informations about orderable IP address
 */

public class IpOrderableDetailsImpl implements IpOrderableDetails { 

	private long[] blockSizes;
	private java.lang.String optionRequired;
	private long number;
	private long ipNumber;
	private boolean included;
	private java.lang.String type;

	public IpOrderableDetailsImpl() {
	}

	public long[] getBlockSizes() { 
		return this.blockSizes;
	} 

	public void setBlockSizes(long[] blockSizes) { 
		this.blockSizes = blockSizes;
	} 

	public IpOrderableDetailsImpl blockSizes(long[] blockSizes) { 
		this.blockSizes = blockSizes;
		return this;
	} 

	public java.lang.String getOptionRequired() { 
		return this.optionRequired;
	} 

	public void setOptionRequired(java.lang.String optionRequired) { 
		this.optionRequired = optionRequired;
	} 

	public IpOrderableDetailsImpl optionRequired(java.lang.String optionRequired) { 
		this.optionRequired = optionRequired;
		return this;
	} 

	public long getNumber() { 
		return this.number;
	} 

	public void setNumber(long number) { 
		this.number = number;
	} 

	public IpOrderableDetailsImpl number(long number) { 
		this.number = number;
		return this;
	} 

	public long getIpNumber() { 
		return this.ipNumber;
	} 

	public void setIpNumber(long ipNumber) { 
		this.ipNumber = ipNumber;
	} 

	public IpOrderableDetailsImpl ipNumber(long ipNumber) { 
		this.ipNumber = ipNumber;
		return this;
	} 

	public boolean getIncluded() { 
		return this.included;
	} 

	public void setIncluded(boolean included) { 
		this.included = included;
	} 

	public IpOrderableDetailsImpl included(boolean included) { 
		this.included = included;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public IpOrderableDetailsImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
