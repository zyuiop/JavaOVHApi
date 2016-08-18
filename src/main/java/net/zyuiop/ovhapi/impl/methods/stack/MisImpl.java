package net.zyuiop.ovhapi.impl.methods.stack;

import net.zyuiop.ovhapi.api.methods.stack.Mis;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class MisImpl implements Mis { 

	private final OVHRawCalls client;

	public MisImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /stack/mis/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /stack/mis/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/


	public java.lang.String[] getStackMis() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/stack/mis/stack/mis";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /stack/mis/$serviceName
	* Message : Missing identifier.
	*/


}
