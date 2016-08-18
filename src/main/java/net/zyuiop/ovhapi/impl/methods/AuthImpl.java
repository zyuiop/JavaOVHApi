package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Auth;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class AuthImpl implements Auth { 

	private final OVHRawCalls client;

	public AuthImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : POST > /auth/credential
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /auth/credential
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /auth/currentCredential
	* Message : Missing identifier.
	*/


	public long getTime() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/auth/time";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), long.class);
	}

	public void postLogout() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/auth/logout";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

}
