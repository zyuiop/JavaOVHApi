package net.zyuiop.ovhapi.impl.methods.dedicated;

import net.zyuiop.ovhapi.api.methods.dedicated.Nas;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class NasImpl implements Nas { 

	private final OVHRawCalls client;

	public NasImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String[] getServiceNamePartition(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nas/$serviceName/partition/$partitionName/quota
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePartitionPartitionNameAuthorizableIps(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/authorizableIps";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nas/$serviceName/partition
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status, java.lang.String operation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		__data += "operation=" + operation;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nas.Quota getServiceNamePartitionPartitionNameQuotaUid(java.lang.String serviceName, java.lang.String partitionName, long uid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/quota/" + uid + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		__data += "uid=" + uid;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.nas.QuotaImpl.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNamePartitionPartitionNameQuota(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/quota";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nas.Access getServiceNamePartitionPartitionNameAccessIp(java.lang.String serviceName, java.lang.String partitionName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/access/" + ip + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.nas.AccessImpl.class);
	}

	public java.lang.String[] getDedicatedNas() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/dedicated/nas";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nas/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nas/$serviceName/partition/$partitionName/access
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.nas.Nas getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.nas.NasImpl.class);
	}

	public void putServiceNamePartitionPartitionName(net.zyuiop.ovhapi.api.objects.dedicated.nas.Partition param0, java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nas/$serviceName/partition/$partitionName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nas/$serviceName/partition/$partitionName/access/$ip
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.nas.Partition getServiceNamePartitionPartitionName(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.nas.PartitionImpl.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.dedicated.nas.Nas param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNamePartitionPartitionNameAccess(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/access";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nas/$serviceName/partition/$partitionName/quota/$uid
	* Message : Missing identifier.
	*/


}
