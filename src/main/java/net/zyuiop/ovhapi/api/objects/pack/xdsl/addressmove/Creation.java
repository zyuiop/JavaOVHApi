package net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove;

/**
 * The parameters needed to create a new landline
 */

public class Creation { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot meeting;
	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address;

	public Creation() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot getMeeting() { 
		return this.meeting;
	} 

	public void setMeeting(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot meeting) { 
		this.meeting = meeting;
	} 

	public Creation meeting(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot meeting) { 
		this.meeting = meeting;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address getAddress() { 
		return this.address;
	} 

	public void setAddress(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address) { 
		this.address = address;
	} 

	public Creation address(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address) { 
		this.address = address;
		return this;
	} 

}
