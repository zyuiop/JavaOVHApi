package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing SMART health disk status
 */

public interface RtmDiskSmart { 

	/**
	 * @return Current pending sectors
	 */
	long getCurrent_pending_sector(); 

	/**
	 * @return Multizone error rate
	 */
	long getMultizone_error_rate(); 

	/**
	 * @return Offline seek rate
	 */
	long getOffline_seek_performance(); 

	/**
	 * @return temperature
	 */
	long getTemperature_celsius(); 

	/**
	 * @return Uncorrected read errors
	 */
	long getUncorrected_read_errors(); 

	/**
	 * @return Realocated event count
	 */
	long getRealocated_event_count(); 

	/**
	 * @return Uncorrected write errors
	 */
	long getUncorrected_write_errors(); 

	/**
	 * @return Offline uncorrectable
	 */
	long getOffline_uncorrectable(); 

	/**
	 * @return UDMA crc error
	 */
	long getUdma_crc_error(); 

	/**
	 * @return Other errors
	 */
	long getOther_errors(); 

}
