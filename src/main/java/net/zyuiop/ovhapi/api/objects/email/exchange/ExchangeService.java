package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange service
 */

public class ExchangeService { 

	private java.util.Date lastUpdateDate;
	private java.lang.String offer;
	private java.lang.String hostname;
	private java.lang.String state;
	private long maxReceiveSize;
	private java.lang.String domain;
	private long minPasswordLength;
	private boolean complexityEnabled;
	private long lockoutDuration;
	private java.lang.String displayName;
	private long maxSendSize;
	private long lockoutObservationWindow;
	private long lockoutThreshold;
	private long minPasswordAge;
	private long maxPasswordAge;
	private long taskPendingId;
	private java.util.Date sslExpirationDate;

	public ExchangeService() {
	}

	public java.util.Date getLastUpdateDate() { 
		return this.lastUpdateDate;
	} 

	public void setLastUpdateDate(java.util.Date lastUpdateDate) { 
		this.lastUpdateDate = lastUpdateDate;
	} 

	public ExchangeService lastUpdateDate(java.util.Date lastUpdateDate) { 
		this.lastUpdateDate = lastUpdateDate;
		return this;
	} 

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public ExchangeService offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getHostname() { 
		return this.hostname;
	} 

	public void setHostname(java.lang.String hostname) { 
		this.hostname = hostname;
	} 

	public ExchangeService hostname(java.lang.String hostname) { 
		this.hostname = hostname;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ExchangeService state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public long getMaxReceiveSize() { 
		return this.maxReceiveSize;
	} 

	public void setMaxReceiveSize(long maxReceiveSize) { 
		this.maxReceiveSize = maxReceiveSize;
	} 

	public ExchangeService maxReceiveSize(long maxReceiveSize) { 
		this.maxReceiveSize = maxReceiveSize;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public ExchangeService domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public long getMinPasswordLength() { 
		return this.minPasswordLength;
	} 

	public void setMinPasswordLength(long minPasswordLength) { 
		this.minPasswordLength = minPasswordLength;
	} 

	public ExchangeService minPasswordLength(long minPasswordLength) { 
		this.minPasswordLength = minPasswordLength;
		return this;
	} 

	public boolean getComplexityEnabled() { 
		return this.complexityEnabled;
	} 

	public void setComplexityEnabled(boolean complexityEnabled) { 
		this.complexityEnabled = complexityEnabled;
	} 

	public ExchangeService complexityEnabled(boolean complexityEnabled) { 
		this.complexityEnabled = complexityEnabled;
		return this;
	} 

	public long getLockoutDuration() { 
		return this.lockoutDuration;
	} 

	public void setLockoutDuration(long lockoutDuration) { 
		this.lockoutDuration = lockoutDuration;
	} 

	public ExchangeService lockoutDuration(long lockoutDuration) { 
		this.lockoutDuration = lockoutDuration;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public ExchangeService displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

	public long getMaxSendSize() { 
		return this.maxSendSize;
	} 

	public void setMaxSendSize(long maxSendSize) { 
		this.maxSendSize = maxSendSize;
	} 

	public ExchangeService maxSendSize(long maxSendSize) { 
		this.maxSendSize = maxSendSize;
		return this;
	} 

	public long getLockoutObservationWindow() { 
		return this.lockoutObservationWindow;
	} 

	public void setLockoutObservationWindow(long lockoutObservationWindow) { 
		this.lockoutObservationWindow = lockoutObservationWindow;
	} 

	public ExchangeService lockoutObservationWindow(long lockoutObservationWindow) { 
		this.lockoutObservationWindow = lockoutObservationWindow;
		return this;
	} 

	public long getLockoutThreshold() { 
		return this.lockoutThreshold;
	} 

	public void setLockoutThreshold(long lockoutThreshold) { 
		this.lockoutThreshold = lockoutThreshold;
	} 

	public ExchangeService lockoutThreshold(long lockoutThreshold) { 
		this.lockoutThreshold = lockoutThreshold;
		return this;
	} 

	public long getMinPasswordAge() { 
		return this.minPasswordAge;
	} 

	public void setMinPasswordAge(long minPasswordAge) { 
		this.minPasswordAge = minPasswordAge;
	} 

	public ExchangeService minPasswordAge(long minPasswordAge) { 
		this.minPasswordAge = minPasswordAge;
		return this;
	} 

	public long getMaxPasswordAge() { 
		return this.maxPasswordAge;
	} 

	public void setMaxPasswordAge(long maxPasswordAge) { 
		this.maxPasswordAge = maxPasswordAge;
	} 

	public ExchangeService maxPasswordAge(long maxPasswordAge) { 
		this.maxPasswordAge = maxPasswordAge;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeService taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public java.util.Date getSslExpirationDate() { 
		return this.sslExpirationDate;
	} 

	public void setSslExpirationDate(java.util.Date sslExpirationDate) { 
		this.sslExpirationDate = sslExpirationDate;
	} 

	public ExchangeService sslExpirationDate(java.util.Date sslExpirationDate) { 
		this.sslExpirationDate = sslExpirationDate;
		return this;
	} 

}
