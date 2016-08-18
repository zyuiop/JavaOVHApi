package net.zyuiop.ovhapi.api.methods.cdn;

/**
 * A class to interact with OVH's /cdn/webstorage APIs
 */

public interface Webstorage { 





	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCdnWebstorage() throws java.io.IOException;


}
