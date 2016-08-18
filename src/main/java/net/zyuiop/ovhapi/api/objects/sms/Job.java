package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms job
 */

public class Job { 

	private java.lang.String receiver;
	private long deliveryReceipt;
	private long messageLength;
	private long differedDelivery;
	private double credits;
	private java.lang.String message;
	private long ptt;
	private java.lang.String sender;
	private long numberOfSms;
	private java.util.Date creationDatetime;
	private long id;

	public Job() {
	}

	public java.lang.String getReceiver() { 
		return this.receiver;
	} 

	public void setReceiver(java.lang.String receiver) { 
		this.receiver = receiver;
	} 

	public Job receiver(java.lang.String receiver) { 
		this.receiver = receiver;
		return this;
	} 

	public long getDeliveryReceipt() { 
		return this.deliveryReceipt;
	} 

	public void setDeliveryReceipt(long deliveryReceipt) { 
		this.deliveryReceipt = deliveryReceipt;
	} 

	public Job deliveryReceipt(long deliveryReceipt) { 
		this.deliveryReceipt = deliveryReceipt;
		return this;
	} 

	public long getMessageLength() { 
		return this.messageLength;
	} 

	public void setMessageLength(long messageLength) { 
		this.messageLength = messageLength;
	} 

	public Job messageLength(long messageLength) { 
		this.messageLength = messageLength;
		return this;
	} 

	public long getDifferedDelivery() { 
		return this.differedDelivery;
	} 

	public void setDifferedDelivery(long differedDelivery) { 
		this.differedDelivery = differedDelivery;
	} 

	public Job differedDelivery(long differedDelivery) { 
		this.differedDelivery = differedDelivery;
		return this;
	} 

	public double getCredits() { 
		return this.credits;
	} 

	public void setCredits(double credits) { 
		this.credits = credits;
	} 

	public Job credits(double credits) { 
		this.credits = credits;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public Job message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

	public long getPtt() { 
		return this.ptt;
	} 

	public void setPtt(long ptt) { 
		this.ptt = ptt;
	} 

	public Job ptt(long ptt) { 
		this.ptt = ptt;
		return this;
	} 

	public java.lang.String getSender() { 
		return this.sender;
	} 

	public void setSender(java.lang.String sender) { 
		this.sender = sender;
	} 

	public Job sender(java.lang.String sender) { 
		this.sender = sender;
		return this;
	} 

	public long getNumberOfSms() { 
		return this.numberOfSms;
	} 

	public void setNumberOfSms(long numberOfSms) { 
		this.numberOfSms = numberOfSms;
	} 

	public Job numberOfSms(long numberOfSms) { 
		this.numberOfSms = numberOfSms;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public Job creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Job id(long id) { 
		this.id = id;
		return this;
	} 

}
