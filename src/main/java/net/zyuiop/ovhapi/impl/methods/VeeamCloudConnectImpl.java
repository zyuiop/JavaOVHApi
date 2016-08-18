package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.VeeamCloudConnect;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class VeeamCloudConnectImpl implements VeeamCloudConnect { 

	private final OVHRawCalls client;

	public VeeamCloudConnectImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String[] getServiceNameOrderableUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/orderableUpgrade";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task[] postServiceNameBackupRepository(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/backupRepository";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task[].class);
	}

	public net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getVeeamCloudConnect() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/veeamCloudConnect";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task[] deleteServiceNameBackupRepositoryInventoryName(java.lang.String serviceName, java.lang.String inventoryName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/backupRepository/" + inventoryName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task[].class);
	}

	public net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task[] postServiceNameBackupRepositoryInventoryNameUpgradeQuota(long newQuota, java.lang.String serviceName, java.lang.String inventoryName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/backupRepository/" + inventoryName + "/upgradeQuota";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("newQuota", newQuota);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String name, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public java.lang.String[] getServiceNameBackupRepository(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/backupRepository";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Account getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Account.class);
	}

	public net.zyuiop.ovhapi.api.objects.veeamcloudconnect.BackupRepository getServiceNameBackupRepositoryInventoryName(java.lang.String serviceName, java.lang.String inventoryName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/backupRepository/" + inventoryName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "inventoryName=" + inventoryName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.veeamcloudconnect.BackupRepository.class);
	}

}
