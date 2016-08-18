package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Router;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class RouterImpl implements Router { 

	private final OVHRawCalls client;

	public RouterImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /router/$serviceName/vpn/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /router/$serviceName/privateLink/$peerServiceName/route/$network
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /router/$serviceName/privateLink/$peerServiceName
	* Message : Missing identifier.
	*/


	public long[] getServiceNameVpn(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/vpn";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /router/$serviceName/task/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /router/$serviceName/privateLink/$peerServiceName/request
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /router/$serviceName/privateLink/$peerServiceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /router/$serviceName/vpn/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /router/$serviceName/network/$ipNet
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePrivateLinkPeerServiceNameRoute(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "/route";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "peerServiceName=" + peerServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /router/$serviceName/privateLink/$peerServiceName/route/$network
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /router/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /router/$serviceName/privateLink/$peerServiceName/route
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePrivateLink(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /router/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNamePrivateLinkPeerServiceNameRequestManage(java.lang.String action, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "/request/manage";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /router/$serviceName/privateLink/$peerServiceName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getRouter() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/router";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /router/$serviceName/network/$ipNet
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /router/$serviceName/vpn/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /router/$serviceName/vpn/$id/setPsk
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /router/$serviceName/network
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /router/$serviceName/network
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /router/$serviceName/network/$ipNet
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameNetwork(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/network";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /router/$serviceName/vpn
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /router/$serviceName/vpn
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNamePrivateLink(java.lang.String peerServiceName, java.lang.String name, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("peerServiceName", peerServiceName);
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /router/$serviceName
	* Message : Missing identifier.
	*/


}
