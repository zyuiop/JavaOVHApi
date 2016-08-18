package net.zyuiop.ovhapi.impl.methods.cdn;

import net.zyuiop.ovhapi.api.methods.cdn.Webstorage;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class WebstorageImpl implements Webstorage { 

	private final OVHRawCalls client;

	public WebstorageImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cdn/webstorage/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/webstorage/$serviceName/credentials
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/webstorage/$serviceName/statistics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cdn/webstorage/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnWebstorage() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/webstorage/cdn/webstorage";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cdn/webstorage/$serviceName
	* Message : Missing identifier.
	*/


}
