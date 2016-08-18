package net.zyuiop.ovhapi.impl.methods.cluster;

import net.zyuiop.ovhapi.api.methods.cluster.Hadoop;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class HadoopImpl implements Hadoop { 

	private final OVHRawCalls client;

	public HadoopImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/stop
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameNodeHostnameRole(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/role";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "hostname=" + hostname;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/service/start
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/orderInformations
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/restart
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/nodeConsumptions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/node/$hostname/decommission
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/node/$hostname/role/$type/start
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cluster/hadoop/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/start
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameNetworkAcl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/networkAcl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameOrderableNodeProfiles(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/orderableNodeProfiles";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/user/$username/resetPassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cluster/hadoop/$serviceName/networkAcl/$block
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /cluster/hadoop/$serviceName/networkAcl/$block
	* Message : Missing identifier.
	*/


	public java.lang.String[] getClusterHadoop() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/cluster/hadoop";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameNode(java.lang.String serviceName, java.lang.String softwareProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "softwareProfile=" + softwareProfile;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameNode(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/node/$hostname/role
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/service/stop
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/node/$hostname/role/$type/restart
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/orderableNodeProfiles
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/node/$hostname/role/$type
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cluster/hadoop/$serviceName/user/$username
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /cluster/hadoop/$serviceName/node/$hostname/role/$type
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /cluster/hadoop/$serviceName/user/$username
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/user/$username
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/service/restart
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /cluster/hadoop/$serviceName/node/$hostname
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/node/$hostname/role/$type/stop
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/networkAcl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/networkAcl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/orderNewNodeHourly
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/node/$hostname
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/networkAcl/$block
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/node/$hostname/recommission
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/consumptions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/nodeBillingProfiles
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cluster/hadoop/$serviceName/terminate
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/


}
