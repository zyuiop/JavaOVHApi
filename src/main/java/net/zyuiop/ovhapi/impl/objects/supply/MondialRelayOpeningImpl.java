package net.zyuiop.ovhapi.impl.objects.supply;

import net.zyuiop.ovhapi.api.objects.supply.MondialRelayOpening;
/**
 * Day with schedule for mondial relay point opening
 */

public class MondialRelayOpeningImpl implements MondialRelayOpening { 

	private net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl sunday;
	private net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl wednesday;
	private net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl friday;
	private net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl saturday;
	private net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl thursday;
	private net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl monday;
	private net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl tuesday;

	public MondialRelayOpeningImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl getSunday() { 
		return this.sunday;
	} 

	public void setSunday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl sunday) { 
		this.sunday = sunday;
	} 

	public MondialRelayOpeningImpl sunday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl sunday) { 
		this.sunday = sunday;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl getWednesday() { 
		return this.wednesday;
	} 

	public void setWednesday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl wednesday) { 
		this.wednesday = wednesday;
	} 

	public MondialRelayOpeningImpl wednesday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl wednesday) { 
		this.wednesday = wednesday;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl getFriday() { 
		return this.friday;
	} 

	public void setFriday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl friday) { 
		this.friday = friday;
	} 

	public MondialRelayOpeningImpl friday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl friday) { 
		this.friday = friday;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl getSaturday() { 
		return this.saturday;
	} 

	public void setSaturday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl saturday) { 
		this.saturday = saturday;
	} 

	public MondialRelayOpeningImpl saturday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl saturday) { 
		this.saturday = saturday;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl getThursday() { 
		return this.thursday;
	} 

	public void setThursday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl thursday) { 
		this.thursday = thursday;
	} 

	public MondialRelayOpeningImpl thursday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl thursday) { 
		this.thursday = thursday;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl getMonday() { 
		return this.monday;
	} 

	public void setMonday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl monday) { 
		this.monday = monday;
	} 

	public MondialRelayOpeningImpl monday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl monday) { 
		this.monday = monday;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl getTuesday() { 
		return this.tuesday;
	} 

	public void setTuesday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl tuesday) { 
		this.tuesday = tuesday;
	} 

	public MondialRelayOpeningImpl tuesday(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayDayPeriodImpl tuesday) { 
		this.tuesday = tuesday;
		return this;
	} 

}
