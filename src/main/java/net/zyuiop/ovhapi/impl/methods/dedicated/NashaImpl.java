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

	public long[] getServiceNamePartitionPartitionNameQuota(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "/quota";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nasha/$serviceName/partition/$partitionName/quota
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNamePartitionPartitionNameAccess(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "/access";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/partition/$partitionName/access/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/partition/$partitionName
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNamePartitionPartitionNameAuthorizableIps(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "/authorizableIps";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status, java.lang.String operation) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nasha.Storage getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.nasha.Storage.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nasha.Access getServiceNamePartitionPartitionNameAccessIp(java.lang.String serviceName, java.lang.String partitionName, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "/access/" + ip + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.nasha.Access.class);
	}

	public java.lang.String getServiceNamePartition(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedNasha() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//dedicated/nasha";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/vrack
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nasha/$serviceName/partition
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/partition/$partitionName/quota/$uid
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.nasha.Snapshot getServiceNamePartitionPartitionNameSnapshotSnapshotType(java.lang.String serviceName, java.lang.String partitionName, java.lang.String snapshotType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "/snapshot/" + snapshotType + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.nasha.Snapshot.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNamePartitionPartitionNameAuthorizableBlocks(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "/authorizableBlocks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nasha.Partition getServiceNamePartitionPartitionName(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.nasha.Partition.class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicated/nasha/$serviceName/partition/$partitionName/snapshot/$snapshotType
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.nasha.Quota getServiceNamePartitionPartitionNameQuotaUid(java.lang.String serviceName, java.lang.String partitionName, long uid) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "/quota/" + uid + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.nasha.Quota.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nasha/$serviceName/partition/$partitionName/snapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/nasha/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/


	public void putServiceName(net.zyuiop.ovhapi.api.objects.dedicated.nasha.Storage param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNamePartitionPartitionNameSnapshot(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "/snapshot";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putServiceNamePartitionPartitionName(net.zyuiop.ovhapi.api.objects.dedicated.nasha.Partition param0, java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/partition/" + partitionName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicated/nasha/$serviceName/partition/$partitionName/access
	* Message : Missing identifier.
	*/


}
