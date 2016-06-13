package net.zyuiop.ovhapi.impl.objects.pack.xdsl.addressmove;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove.Creation;
/**
 * The parameters needed to create a new landline
 */

public class CreationImpl implements Creation { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot meeting;
	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address;

	public CreationImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot getMeeting() { 
		return this.meeting;
	} 

	public void setMeeting(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot meeting) { 
		this.meeting = meeting;
	} 

	public CreationImpl meeting(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot meeting) { 
		this.meeting = meeting;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address getAddress() { 
		return this.address;
	} 

	public void setAddress(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address) { 
		this.address = address;
	} 

	public CreationImpl address(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address) { 
		this.address = address;
		return this;
	} 

}
