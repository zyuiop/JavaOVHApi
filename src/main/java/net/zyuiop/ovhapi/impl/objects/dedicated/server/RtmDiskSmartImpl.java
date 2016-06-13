package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.RtmDiskSmart;
/**
 * A structure describing SMART health disk status
 */

public class RtmDiskSmartImpl implements RtmDiskSmart { 

	private long current_pending_sector;
	private long multizone_error_rate;
	private long offline_seek_performance;
	private long temperature_celsius;
	private long uncorrected_read_errors;
	private long realocated_event_count;
	private long uncorrected_write_errors;
	private long offline_uncorrectable;
	private long udma_crc_error;
	private long other_errors;

	public RtmDiskSmartImpl() {
	}

	public long getCurrent_pending_sector() { 
		return this.current_pending_sector;
	} 

	public void setCurrent_pending_sector(long current_pending_sector) { 
		this.current_pending_sector = current_pending_sector;
	} 

	public RtmDiskSmartImpl current_pending_sector(long current_pending_sector) { 
		this.current_pending_sector = current_pending_sector;
		return this;
	} 

	public long getMultizone_error_rate() { 
		return this.multizone_error_rate;
	} 

	public void setMultizone_error_rate(long multizone_error_rate) { 
		this.multizone_error_rate = multizone_error_rate;
	} 

	public RtmDiskSmartImpl multizone_error_rate(long multizone_error_rate) { 
		this.multizone_error_rate = multizone_error_rate;
		return this;
	} 

	public long getOffline_seek_performance() { 
		return this.offline_seek_performance;
	} 

	public void setOffline_seek_performance(long offline_seek_performance) { 
		this.offline_seek_performance = offline_seek_performance;
	} 

	public RtmDiskSmartImpl offline_seek_performance(long offline_seek_performance) { 
		this.offline_seek_performance = offline_seek_performance;
		return this;
	} 

	public long getTemperature_celsius() { 
		return this.temperature_celsius;
	} 

	public void setTemperature_celsius(long temperature_celsius) { 
		this.temperature_celsius = temperature_celsius;
	} 

	public RtmDiskSmartImpl temperature_celsius(long temperature_celsius) { 
		this.temperature_celsius = temperature_celsius;
		return this;
	} 

	public long getUncorrected_read_errors() { 
		return this.uncorrected_read_errors;
	} 

	public void setUncorrected_read_errors(long uncorrected_read_errors) { 
		this.uncorrected_read_errors = uncorrected_read_errors;
	} 

	public RtmDiskSmartImpl uncorrected_read_errors(long uncorrected_read_errors) { 
		this.uncorrected_read_errors = uncorrected_read_errors;
		return this;
	} 

	public long getRealocated_event_count() { 
		return this.realocated_event_count;
	} 

	public void setRealocated_event_count(long realocated_event_count) { 
		this.realocated_event_count = realocated_event_count;
	} 

	public RtmDiskSmartImpl realocated_event_count(long realocated_event_count) { 
		this.realocated_event_count = realocated_event_count;
		return this;
	} 

	public long getUncorrected_write_errors() { 
		return this.uncorrected_write_errors;
	} 

	public void setUncorrected_write_errors(long uncorrected_write_errors) { 
		this.uncorrected_write_errors = uncorrected_write_errors;
	} 

	public RtmDiskSmartImpl uncorrected_write_errors(long uncorrected_write_errors) { 
		this.uncorrected_write_errors = uncorrected_write_errors;
		return this;
	} 

	public long getOffline_uncorrectable() { 
		return this.offline_uncorrectable;
	} 

	public void setOffline_uncorrectable(long offline_uncorrectable) { 
		this.offline_uncorrectable = offline_uncorrectable;
	} 

	public RtmDiskSmartImpl offline_uncorrectable(long offline_uncorrectable) { 
		this.offline_uncorrectable = offline_uncorrectable;
		return this;
	} 

	public long getUdma_crc_error() { 
		return this.udma_crc_error;
	} 

	public void setUdma_crc_error(long udma_crc_error) { 
		this.udma_crc_error = udma_crc_error;
	} 

	public RtmDiskSmartImpl udma_crc_error(long udma_crc_error) { 
		this.udma_crc_error = udma_crc_error;
		return this;
	} 

	public long getOther_errors() { 
		return this.other_errors;
	} 

	public void setOther_errors(long other_errors) { 
		this.other_errors = other_errors;
	} 

	public RtmDiskSmartImpl other_errors(long other_errors) { 
		this.other_errors = other_errors;
		return this;
	} 

}
