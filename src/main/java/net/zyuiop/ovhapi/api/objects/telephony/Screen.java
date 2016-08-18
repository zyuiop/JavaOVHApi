package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * ScreenList capable services
 */

public class Screen { 

	private java.lang.String outgoingScreenList;
	private java.lang.String serviceName;
	private java.lang.String incomingScreenList;

	public Screen() {
	}

	public java.lang.String getOutgoingScreenList() { 
		return this.outgoingScreenList;
	} 

	public void setOutgoingScreenList(java.lang.String outgoingScreenList) { 
		this.outgoingScreenList = outgoingScreenList;
	} 

	public Screen outgoingScreenList(java.lang.String outgoingScreenList) { 
		this.outgoingScreenList = outgoingScreenList;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Screen serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getIncomingScreenList() { 
		return this.incomingScreenList;
	} 

	public void setIncomingScreenList(java.lang.String incomingScreenList) { 
		this.incomingScreenList = incomingScreenList;
	} 

	public Screen incomingScreenList(java.lang.String incomingScreenList) { 
		this.incomingScreenList = incomingScreenList;
		return this;
	} 

}
