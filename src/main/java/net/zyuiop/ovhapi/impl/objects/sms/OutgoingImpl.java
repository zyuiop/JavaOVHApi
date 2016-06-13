package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Outgoing;
/**
 * Sms history of sms outgoing sent
 */

public class OutgoingImpl implements Outgoing { 

	private java.lang.String receiver;
	private java.lang.String tariffCode;
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
	private java.lang.String tag;

	public OutgoingImpl() {
	}

	public java.lang.String getReceiver() { 
		return this.receiver;
	} 

	public void setReceiver(java.lang.String receiver) { 
		this.receiver = receiver;
	} 

	public OutgoingImpl receiver(java.lang.String receiver) { 
		this.receiver = receiver;
		return this;
	} 

	public java.lang.String getTariffCode() { 
		return this.tariffCode;
	} 

	public void setTariffCode(java.lang.String tariffCode) { 
		this.tariffCode = tariffCode;
	} 

	public OutgoingImpl tariffCode(java.lang.String tariffCode) { 
		this.tariffCode = tariffCode;
		return this;
	} 

	public long getDeliveryReceipt() { 
		return this.deliveryReceipt;
	} 

	public void setDeliveryReceipt(long deliveryReceipt) { 
		this.deliveryReceipt = deliveryReceipt;
	} 

	public OutgoingImpl deliveryReceipt(long deliveryReceipt) { 
		this.deliveryReceipt = deliveryReceipt;
		return this;
	} 

	public long getMessageLength() { 
		return this.messageLength;
	} 

	public void setMessageLength(long messageLength) { 
		this.messageLength = messageLength;
	} 

	public OutgoingImpl messageLength(long messageLength) { 
		this.messageLength = messageLength;
		return this;
	} 

	public long getDifferedDelivery() { 
		return this.differedDelivery;
	} 

	public void setDifferedDelivery(long differedDelivery) { 
		this.differedDelivery = differedDelivery;
	} 

	public OutgoingImpl differedDelivery(long differedDelivery) { 
		this.differedDelivery = differedDelivery;
		return this;
	} 

	public double getCredits() { 
		return this.credits;
	} 

	public void setCredits(double credits) { 
		this.credits = credits;
	} 

	public OutgoingImpl credits(double credits) { 
		this.credits = credits;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public OutgoingImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

	public long getPtt() { 
		return this.ptt;
	} 

	public void setPtt(long ptt) { 
		this.ptt = ptt;
	} 

	public OutgoingImpl ptt(long ptt) { 
		this.ptt = ptt;
		return this;
	} 

	public java.lang.String getSender() { 
		return this.sender;
	} 

	public void setSender(java.lang.String sender) { 
		this.sender = sender;
	} 

	public OutgoingImpl sender(java.lang.String sender) { 
		this.sender = sender;
		return this;
	} 

	public long getNumberOfSms() { 
		return this.numberOfSms;
	} 

	public void setNumberOfSms(long numberOfSms) { 
		this.numberOfSms = numberOfSms;
	} 

	public OutgoingImpl numberOfSms(long numberOfSms) { 
		this.numberOfSms = numberOfSms;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public OutgoingImpl creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public OutgoingImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getTag() { 
		return this.tag;
	} 

	public void setTag(java.lang.String tag) { 
		this.tag = tag;
	} 

	public OutgoingImpl tag(java.lang.String tag) { 
		this.tag = tag;
		return this;
	} 

}
