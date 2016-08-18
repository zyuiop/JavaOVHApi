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

	public net.zyuiop.ovhapi.api.objects.api.Credential getCurrentCredential() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/auth/currentCredential";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.api.Credential.class);
	}

	public long getTime() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/auth/time";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), long.class);
	}

	public net.zyuiop.ovhapi.api.objects.auth.Credential postCredential(net.zyuiop.ovhapi.api.objects.auth.AccessRule accessRules, java.lang.String redirection) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/auth/credential";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("accessRules", accessRules);
		__dataMap.put("redirection", redirection);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.auth.Credential.class);
	}

	public net.zyuiop.ovhapi.api.objects.auth.Credential postCredential(net.zyuiop.ovhapi.api.objects.auth.AccessRule accessRules) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/auth/credential";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("accessRules", accessRules);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.auth.Credential.class);
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
