package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing traffic informations about this dedicated server
 */

public class TrafficDetails { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inputQuotaSize;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue outputQuotaSize;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inputQuotaUsed;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue outputQuotaUsed;

	public TrafficDetails() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getInputQuotaSize() { 
		return this.inputQuotaSize;
	} 

	public void setInputQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inputQuotaSize) { 
		this.inputQuotaSize = inputQuotaSize;
	} 

	public TrafficDetails inputQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inputQuotaSize) { 
		this.inputQuotaSize = inputQuotaSize;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getOutputQuotaSize() { 
		return this.outputQuotaSize;
	} 

	public void setOutputQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue outputQuotaSize) { 
		this.outputQuotaSize = outputQuotaSize;
	} 

	public TrafficDetails outputQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue outputQuotaSize) { 
		this.outputQuotaSize = outputQuotaSize;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getInputQuotaUsed() { 
		return this.inputQuotaUsed;
	} 

	public void setInputQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inputQuotaUsed) { 
		this.inputQuotaUsed = inputQuotaUsed;
	} 

	public TrafficDetails inputQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inputQuotaUsed) { 
		this.inputQuotaUsed = inputQuotaUsed;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getOutputQuotaUsed() { 
		return this.outputQuotaUsed;
	} 

	public void setOutputQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue outputQuotaUsed) { 
		this.outputQuotaUsed = outputQuotaUsed;
	} 

	public TrafficDetails outputQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue outputQuotaUsed) { 
		this.outputQuotaUsed = outputQuotaUsed;
		return this;
	} 

}
