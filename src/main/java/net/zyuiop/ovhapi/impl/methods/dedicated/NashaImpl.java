package net.zyuiop.ovhapi.impl.methods.dedicated;

import net.zyuiop.ovhapi.api.methods.dedicated.Nasha;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class NashaImpl implements Nasha { 

	private final OVHRawCalls client;

	public NashaImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/partition/$partitionName/quota/$uid
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedNasha() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/dedicated/nasha";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status, java.lang.String operation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		__data += "operation=" + operation;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/partition/$partitionName/snapshot/$snapshotType
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePartitionPartitionNameAccess(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/" + serviceName + "/partition/" + partitionName + "/access";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNamePartitionPartitionNameAuthorizableIps(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/" + serviceName + "/partition/" + partitionName + "/authorizableIps";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nasha/$serviceName/partition/$partitionName/access
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/partition/$partitionName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePartition(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/" + serviceName + "/partition";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /dedicated/nasha/$serviceName/partition/$partitionName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /dedicated/nasha/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nasha/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePartitionPartitionNameSnapshot(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/" + serviceName + "/partition/" + partitionName + "/snapshot";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nasha/$serviceName/partition/$partitionName/quota/$uid
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nasha/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nasha/$serviceName/partition/$partitionName/access/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nasha/$serviceName/partition/$partitionName/snapshot/$snapshotType
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nasha/$serviceName/partition/$partitionName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/vrack
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /dedicated/nasha/$serviceName
	* Message : Missing identifier.
	*/


	public long[] getServiceNamePartitionPartitionNameQuota(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/" + serviceName + "/partition/" + partitionName + "/quota";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/partition/$partitionName/access/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nasha/$serviceName/partition/$partitionName/snapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nasha/$serviceName/partition/$partitionName/quota
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nasha/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nasha/$serviceName/partition
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePartitionPartitionNameAuthorizableBlocks(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nasha/" + serviceName + "/partition/" + partitionName + "/authorizableBlocks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
