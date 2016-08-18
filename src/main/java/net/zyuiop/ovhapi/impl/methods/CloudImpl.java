package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Cloud;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class CloudImpl implements Cloud { 

	private final OVHRawCalls client;

	public CloudImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public void postProjectServiceNameCancel(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/cancel";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance/$instanceId/reinstall
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance/$instanceId/vnc
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /cloud/$serviceName/pca/$pcaServiceName/sessions/$sessionId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/ip/failover/$id/attach
	* Message : Missing identifier.
	*/


	public void deleteProjectServiceNameSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/snapshot/" + snapshotId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/sshkey
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/sshkey
	* Message : Missing identifier.
	*/


	public void deleteProjectServiceNameAlertingId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/alerting/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pca/$pcaServiceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pcs/$pcsServiceName/billing/$billingId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePca(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/price
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/price
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/storage/access
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/$serviceName/pca/$pcaServiceName/tasks
	* Message : Missing identifier.
	*/


	public void deleteProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/volume/" + volumeId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postProjectServiceNameInstanceInstanceIdSnapshot(java.lang.String serviceName, java.lang.String instanceId, java.lang.String snapshotName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/instance/" + instanceId + "/snapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("snapshotName", snapshotName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pca/$pcaServiceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/network/private
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/network/private
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/snapshot/$snapshotId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/alerting/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/project/$serviceName/volume/$volumeId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/project/$serviceName/volume/$volumeId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/image
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/image
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pcs/$pcsServiceName/credentials
	* Message : Missing identifier.
	*/


	public long[] getServiceNamePcsPcsServiceNameTasks(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pcs/" + pcsServiceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcsServiceName=" + pcsServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getProjectServiceNameAlerting(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/alerting";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/volume/$volumeId/detach
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/project/$serviceName/alerting/$id
	* Message : Missing identifier.
	*/


	public java.lang.String getProjectServiceNameAcl(java.lang.String serviceName, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/acl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "type=" + type;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getProjectServiceNameAcl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/acl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/acl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/storage
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/user
	* Message : Missing identifier.
	*/


	public java.lang.String[] getProject() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/instance/$instanceId/monitoring
	* Message : Missing identifier.
	*/


	public void postProjectServiceNameStorageContainerIdStatic(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/storage/" + containerId + "/static";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pca/$pcaServiceName/billing/$billingId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/region/$regionName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/storage
	* Message : Missing identifier.
	*/


	public void deleteProjectServiceNameSshkeyKeyId(java.lang.String serviceName, java.lang.String keyId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/sshkey/" + keyId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pca/$pcaServiceName/tasks/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/instance/$instanceId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/sshkey
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/sshkey
	* Message : Missing identifier.
	*/


	public long getServiceNamePcaPcaServiceNameUsage(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/usage";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}

	public void postProjectServiceNameUnleash(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/unleash";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pcs/$pcsServiceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/$serviceName/pca/$pcaServiceName/sessions/$sessionId/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/$serviceName/pcs/$pcsServiceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/quota
	* Message : Missing identifier.
	*/


	public void deleteProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/instance/" + instanceId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteProjectServiceNameStorageContainerId(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/storage/" + containerId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/volume/$volumeId/upsize
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance/$instanceId/rescueMode
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance/$instanceId/rescueMode
	* Message : Missing identifier.
	*/


	public void postProjectServiceNameCredit(java.lang.String code, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/credit";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getCloud() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/cloud";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/flavor
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/flavor
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/user/$userId/token
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/credit/$id
	* Message : Missing identifier.
	*/


	public long[] getProjectServiceNameAlertingIdAlert(java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/alerting/" + id + "/alert";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/volume
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/volume
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/volume/$volumeId/attach
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/volume/snapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/volume/snapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pca/$pcaServiceName/sessions/$sessionId/files/$fileId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getProjectServiceNameRegion(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/region";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance/$instanceId/activeMonthlyBilling
	* Message : Missing identifier.
	*/


	public void postProjectServiceNameInstanceInstanceIdReboot(java.lang.String serviceName, java.lang.String instanceId, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/instance/" + instanceId + "/reboot";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/image/$imageId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/ip/failover/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/flavor/$flavorId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePcaPcaServiceNameTasks(java.lang.String serviceName, java.lang.String pcaServiceName, java.util.Date todoDateTo, java.lang.String function, java.lang.String status, java.util.Date todoDateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		__data += "todoDate.to=" + todoDateTo;
		__data += "function=" + function;
		__data += "status=" + status;
		__data += "todoDate.from=" + todoDateFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNamePcaPcaServiceNameTasks(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/vrack
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/ip/failover
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/volume/$volumeId
	* Message : Missing identifier.
	*/


	public long[] getProjectServiceNameCredit(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/credit";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteProjectServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/user/" + userId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/alerting
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/user/$userId/regeneratePassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/createProject
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/createProject
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance/$instanceId/resize
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/volume/$volumeId/snapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/volume/$volumeId/snapshot
	* Message : Missing identifier.
	*/


	public void putProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId, java.lang.String instanceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/instance/" + instanceId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("instanceName", instanceName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteProjectServiceNameVolumeSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/volume/snapshot/" + snapshotId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/sshkey/$keyId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/project/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pca/$pcaServiceName/sessions/$sessionId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePcaPcaServiceNameSessionsSessionIdFiles(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "/files";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		__data += "sessionId=" + sessionId;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNamePcaPcaServiceNameSessionsSessionIdFiles(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "/files";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		__data += "sessionId=" + sessionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pcs/$pcsServiceName/globalUsage
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance
	* Message : Missing identifier.
	*/


	public long[] getServiceNamePcaPcaServiceNameBilling(java.lang.String serviceName, java.lang.String pcaServiceName, java.util.Date dateTo, java.util.Date dateFrom, boolean billed) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/billing";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		__data += "date.to=" + dateTo;
		__data += "date.from=" + dateFrom;
		__data += "billed=" + billed;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNamePcaPcaServiceNameBilling(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/billing";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/user
	* Message : Missing identifier.
	*/


	public void deleteProjectServiceNameAclAccountId(java.lang.String serviceName, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/acl/" + accountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/network/private/$networkId/subnet
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pcs/$pcsServiceName/tasks/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/user/$userId/openrc
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePcs(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pcs";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/volume/snapshot/$snapshotId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNamePcaPcaServiceNameSessions(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/sessions";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNamePcaPcaServiceNameSessions(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pca/" + pcaServiceName + "/sessions";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcaServiceName=" + pcaServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/network/private
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/acl/$accountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/$serviceName/pca/$pcaServiceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/$serviceName/pca/$pcaServiceName/sessions/$sessionId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/user/$userId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/volume
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/volume
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/storage/$containerId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/$serviceName/pcs/$pcsServiceName/resetCredentials
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance/bulk
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cloud/project/$serviceName/instance/bulk
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pcs/$pcsServiceName/serviceInfos
	* Message : Missing identifier.
	*/


	public long[] postProjectServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("contactAdmin", contactAdmin);
		__dataMap.put("contactTech", contactTech);
		__dataMap.put("contactBilling", contactBilling);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postProjectServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/alerting/$id/alert/$alertId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/network/private/$networkId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/snapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/snapshot
	* Message : Missing identifier.
	*/


	public void postProjectServiceNameStorageContainerIdCors(java.lang.String serviceName, java.lang.String containerId, java.lang.String origin) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/storage/" + containerId + "/cors";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("origin", origin);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/instance
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/instance
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/consumption
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/bill
	* Message : Missing identifier.
	*/


	public java.lang.String postProjectServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/forecast
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/project/$serviceName
	* Message : Missing identifier.
	*/


	public long[] getServiceNamePcsPcsServiceNameBilling(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cloud/" + serviceName + "/pcs/" + pcsServiceName + "/billing";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "pcsServiceName=" + pcsServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /cloud/$serviceName/pca/$pcaServiceName
	* Message : Missing identifier.
	*/


}
