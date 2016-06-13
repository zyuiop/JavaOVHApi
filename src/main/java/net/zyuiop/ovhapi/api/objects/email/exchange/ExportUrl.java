package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Export PST file url
 */

public interface ExportUrl { 

	/**
	 * @return Export url
	 */
	java.lang.String getUrl(); 

	/**
	 * @return Url expiration date
	 */
	java.util.Date getExpiration(); 

}
