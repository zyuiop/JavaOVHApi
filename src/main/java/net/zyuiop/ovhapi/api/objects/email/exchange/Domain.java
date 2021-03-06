package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange domain
 */

public class Domain { 

	private java.lang.String name;
	private java.lang.String organization2010;
	private boolean mxIsValid;
	private boolean srvIsValid;
	private java.lang.String state;
	private boolean main;
	private java.lang.String cnameToCheck;
	private java.lang.String mxRelay;
	private java.lang.String type;
	private boolean domainValidated;
	private long taskPendingId;

	public Domain() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Domain name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getOrganization2010() { 
		return this.organization2010;
	} 

	public void setOrganization2010(java.lang.String organization2010) { 
		this.organization2010 = organization2010;
	} 

	public Domain organization2010(java.lang.String organization2010) { 
		this.organization2010 = organization2010;
		return this;
	} 

	public boolean getMxIsValid() { 
		return this.mxIsValid;
	} 

	public void setMxIsValid(boolean mxIsValid) { 
		this.mxIsValid = mxIsValid;
	} 

	public Domain mxIsValid(boolean mxIsValid) { 
		this.mxIsValid = mxIsValid;
		return this;
	} 

	public boolean getSrvIsValid() { 
		return this.srvIsValid;
	} 

	public void setSrvIsValid(boolean srvIsValid) { 
		this.srvIsValid = srvIsValid;
	} 

	public Domain srvIsValid(boolean srvIsValid) { 
		this.srvIsValid = srvIsValid;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Domain state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public boolean getMain() { 
		return this.main;
	} 

	public void setMain(boolean main) { 
		this.main = main;
	} 

	public Domain main(boolean main) { 
		this.main = main;
		return this;
	} 

	public java.lang.String getCnameToCheck() { 
		return this.cnameToCheck;
	} 

	public void setCnameToCheck(java.lang.String cnameToCheck) { 
		this.cnameToCheck = cnameToCheck;
	} 

	public Domain cnameToCheck(java.lang.String cnameToCheck) { 
		this.cnameToCheck = cnameToCheck;
		return this;
	} 

	public java.lang.String getMxRelay() { 
		return this.mxRelay;
	} 

	public void setMxRelay(java.lang.String mxRelay) { 
		this.mxRelay = mxRelay;
	} 

	public Domain mxRelay(java.lang.String mxRelay) { 
		this.mxRelay = mxRelay;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Domain type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public boolean getDomainValidated() { 
		return this.domainValidated;
	} 

	public void setDomainValidated(boolean domainValidated) { 
		this.domainValidated = domainValidated;
	} 

	public Domain domainValidated(boolean domainValidated) { 
		this.domainValidated = domainValidated;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public Domain taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
