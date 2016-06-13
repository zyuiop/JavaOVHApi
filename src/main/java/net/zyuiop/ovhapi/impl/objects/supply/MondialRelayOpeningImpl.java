package net.zyuiop.ovhapi.impl.objects.supply;

import net.zyuiop.ovhapi.api.objects.supply.MondialRelayOpening;
/**
 * Day with schedule for mondial relay point opening
 */

public class MondialRelayOpeningImpl implements MondialRelayOpening { 

	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod sunday;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod wednesday;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod friday;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod saturday;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod thursday;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod monday;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod tuesday;

	public MondialRelayOpeningImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod getSunday() { 
		return this.sunday;
	} 

	public void setSunday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod sunday) { 
		this.sunday = sunday;
	} 

	public MondialRelayOpeningImpl sunday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod sunday) { 
		this.sunday = sunday;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod getWednesday() { 
		return this.wednesday;
	} 

	public void setWednesday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod wednesday) { 
		this.wednesday = wednesday;
	} 

	public MondialRelayOpeningImpl wednesday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod wednesday) { 
		this.wednesday = wednesday;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod getFriday() { 
		return this.friday;
	} 

	public void setFriday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod friday) { 
		this.friday = friday;
	} 

	public MondialRelayOpeningImpl friday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod friday) { 
		this.friday = friday;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod getSaturday() { 
		return this.saturday;
	} 

	public void setSaturday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod saturday) { 
		this.saturday = saturday;
	} 

	public MondialRelayOpeningImpl saturday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod saturday) { 
		this.saturday = saturday;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod getThursday() { 
		return this.thursday;
	} 

	public void setThursday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod thursday) { 
		this.thursday = thursday;
	} 

	public MondialRelayOpeningImpl thursday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod thursday) { 
		this.thursday = thursday;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod getMonday() { 
		return this.monday;
	} 

	public void setMonday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod monday) { 
		this.monday = monday;
	} 

	public MondialRelayOpeningImpl monday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod monday) { 
		this.monday = monday;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod getTuesday() { 
		return this.tuesday;
	} 

	public void setTuesday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod tuesday) { 
		this.tuesday = tuesday;
	} 

	public MondialRelayOpeningImpl tuesday(net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod tuesday) { 
		this.tuesday = tuesday;
		return this;
	} 

}
