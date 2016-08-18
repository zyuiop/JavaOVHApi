package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server raid volume information
 */

public class RtmRaidVolume { 

	private java.lang.String volume;
	private java.lang.String status;
	private java.lang.String stripe;
	private java.lang.String letter;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity;
	private java.lang.String syncprogress;
	private java.lang.String chunks;
	private java.lang.String label;
	private java.lang.String type;
	private java.lang.String phys;

	public RtmRaidVolume() {
	}

	public java.lang.String getVolume() { 
		return this.volume;
	} 

	public void setVolume(java.lang.String volume) { 
		this.volume = volume;
	} 

	public RtmRaidVolume volume(java.lang.String volume) { 
		this.volume = volume;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public RtmRaidVolume status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getStripe() { 
		return this.stripe;
	} 

	public void setStripe(java.lang.String stripe) { 
		this.stripe = stripe;
	} 

	public RtmRaidVolume stripe(java.lang.String stripe) { 
		this.stripe = stripe;
		return this;
	} 

	public java.lang.String getLetter() { 
		return this.letter;
	} 

	public void setLetter(java.lang.String letter) { 
		this.letter = letter;
	} 

	public RtmRaidVolume letter(java.lang.String letter) { 
		this.letter = letter;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
	} 

	public RtmRaidVolume capacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
		return this;
	} 

	public java.lang.String getSyncprogress() { 
		return this.syncprogress;
	} 

	public void setSyncprogress(java.lang.String syncprogress) { 
		this.syncprogress = syncprogress;
	} 

	public RtmRaidVolume syncprogress(java.lang.String syncprogress) { 
		this.syncprogress = syncprogress;
		return this;
	} 

	public java.lang.String getChunks() { 
		return this.chunks;
	} 

	public void setChunks(java.lang.String chunks) { 
		this.chunks = chunks;
	} 

	public RtmRaidVolume chunks(java.lang.String chunks) { 
		this.chunks = chunks;
		return this;
	} 

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public RtmRaidVolume label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public RtmRaidVolume type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getPhys() { 
		return this.phys;
	} 

	public void setPhys(java.lang.String phys) { 
		this.phys = phys;
	} 

	public RtmRaidVolume phys(java.lang.String phys) { 
		this.phys = phys;
		return this;
	} 

}
