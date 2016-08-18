package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Vrack;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class VrackImpl implements Vrack { 

	private final OVHRawCalls client;

	public VrackImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /vrack/$serviceName/cloudProject/$project
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/legacyVrack/$legacyVrack
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /vrack/$serviceName/dedicatedConnect/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vrack/$serviceName/ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /vrack/$serviceName/ip/$ip
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameDedicatedCloud(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedCloud";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vrack/$serviceName/dedicatedCloud
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vrack/$serviceName/dedicatedServer
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVrack() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/vrack";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/dedicatedServer/$dedicatedServer/mrtg
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/dedicatedCloud/$dedicatedCloud
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameIpIpAvailableZone(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/ip/" + ip + "/availableZone";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameDedicatedServer(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedServer";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/dedicatedServer/$dedicatedServer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /vrack/$serviceName/dedicatedCloud/$dedicatedCloud
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/dedicatedConnect/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /vrack/$serviceName/legacyVrack/$legacyVrack
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/ip/$ip
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getServiceNameDedicatedConnect(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedConnect";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameCloudProject(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/cloudProject";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /vrack/$serviceName/ip/$ip/announceInZone
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vrack/$serviceName/legacyVrack
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameLegacyVrack(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/legacyVrack";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/allowedServices
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/cloudProject/$project
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/ip";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /vrack/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /vrack/$serviceName/dedicatedServer/$dedicatedServer
	* Message : Missing identifier.
	*/


}
