package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Advanced diagnostic of the voice call
 */

public interface CallDiagnostics { 

	/**
	 * @return The relevant informations in anormal behaviors
	 */
	net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting getReporting(); 

	/**
	 * @return The MOS call quality report
	 */
	net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality getCallQuality(); 

	/**
	 * @return Todo if datas are being to be loaded in cache. done when datas are available
	 */
	java.lang.String getStatus(); 

	/**
	 * @return The Call details records information
	 */
	net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs getCdrs(); 

	/**
	 * @return Sip signal packets during the call and last registers
	 */
	net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip getSip(); 

}
