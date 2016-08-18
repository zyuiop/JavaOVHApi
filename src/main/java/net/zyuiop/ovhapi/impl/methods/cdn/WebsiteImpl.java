package net.zyuiop.ovhapi.impl.methods.cdn;

import net.zyuiop.ovhapi.api.methods.cdn.Website;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class WebsiteImpl implements Website { 

	private final OVHRawCalls client;

	public WebsiteImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/website/$serviceName/zone/domains
	* Message : Missing identifier.
	*/


	public long[] getServiceNameZoneDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains/" + domain + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName/zone/backends/$ipv4
	* Message : Missing identifier.
	*/


	public long[] getServiceNameZoneTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cdn/website/$serviceName/zone
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName/zone/domains/$domain/tasks/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName/zone/backends/$ipv4/tasks/$taskId
	* Message : Missing identifier.
	*/


	public long[] getServiceNameZoneBackendsIpv4Tasks(java.lang.String serviceName, java.lang.String ipv4) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/backends/" + ipv4 + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ipv4=" + ipv4;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName/zone/tasks/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/website/$serviceName/zone/backends
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName/zone
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameZoneDomains(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /cdn/website/$serviceName/zone/domains/$domain
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameZoneBackends(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/backends";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /cdn/website/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName/zone/domains/$domain/statistics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/website/$serviceName/zone/domains/$domain/flush
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /cdn/website/$serviceName/zone/backends/$ipv4
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /cdn/website/$serviceName/zone
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/website/$serviceName/zone/domains/$domain
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnWebsite() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/cdn/website";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
