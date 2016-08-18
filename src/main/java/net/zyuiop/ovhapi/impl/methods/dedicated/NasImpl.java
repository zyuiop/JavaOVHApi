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

	public void putServiceNamePartitionPartitionName(net.zyuiop.ovhapi.api.objects.dedicated.nas.Partition param0, java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNamePartition(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nas.Quota getServiceNamePartitionPartitionNameQuotaUid(java.lang.String serviceName, java.lang.String partitionName, long uid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/quota/" + uid + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		__data += "uid=" + uid;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nas.Quota.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task deleteServiceNamePartitionPartitionName(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task.class);
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
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nas.Access.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task deleteServiceNamePartitionPartitionNameAccessIp(java.lang.String serviceName, java.lang.String partitionName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/access/" + ip + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nas.Partition getServiceNamePartitionPartitionName(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nas.Partition.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task postServiceNamePartitionPartitionNameAccess(java.lang.String ip, java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/access";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task.class);
	}

	public java.lang.String[] getDedicatedNas() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/dedicated/nas";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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

	public java.lang.String[] getServiceNamePartitionPartitionNameAuthorizableIps(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/authorizableIps";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "partitionName=" + partitionName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task postServiceNamePartitionPartitionNameQuota(long uid, long size, java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/quota";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("uid", uid);
		__dataMap.put("size", size);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.dedicated.nas.Nas getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nas.Nas.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task postServiceNamePartition(java.lang.String protocol, java.lang.String partitionName, long size, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("protocol", protocol);
		__dataMap.put("partitionName", partitionName);
		__dataMap.put("size", size);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.dedicated.nas.Nas param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task deleteServiceNamePartitionPartitionNameQuotaUid(java.lang.String serviceName, java.lang.String partitionName, long uid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/nas/" + serviceName + "/partition/" + partitionName + "/quota/" + uid + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task.class);
	}

}
