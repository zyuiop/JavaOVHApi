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

	public net.zyuiop.ovhapi.api.objects.cloud.pcs.AccountCredentials getServiceNamePcsPcsServiceNameCredentials(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "/credentials";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.pcs.AccountCredentials.class);
	}

	public void postProjectServiceNameInstanceInstanceIdSnapshot(java.lang.String serviceName, java.lang.String instanceId, java.lang.String snapshotName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/snapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("snapshotName", snapshotName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.pca.Session getServiceNamePcaPcaServiceNameSessionsSessionId(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pca.Session.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail getProjectServiceNameSshkeyKeyId(java.lang.String serviceName, java.lang.String keyId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/sshkey/" + keyId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.quota.Quotas getProjectServiceNameQuota(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/quota";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.quota.Quotas.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Vrack getProjectServiceNameVrack(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/vrack";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Vrack.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.image.Image getProjectServiceNameImageImageId(java.lang.String serviceName, java.lang.String imageId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/image/" + imageId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.image.Image.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.network.Network postProjectServiceNameNetworkPrivate(java.lang.String serviceName, java.lang.String name, long vlanId, boolean dhcp, net.zyuiop.ovhapi.api.objects.cloud.network.IPPool subnets) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/network/private";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("vlanId", vlanId);
		__dataMap.put("dhcp", dhcp);
		__dataMap.put("subnets", subnets);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.network.Network.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot getProjectServiceNameVolumeSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/snapshot/" + snapshotId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.Project getProjectServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.Project.class);
	}

	public long[] getServiceNamePcsPcsServiceNameBilling(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "/billing";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.image.Image getProjectServiceNameSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/snapshot/" + snapshotId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.image.Image.class);
	}

	public void postProjectServiceNameInstanceInstanceIdReboot(java.lang.String serviceName, java.lang.String instanceId, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/reboot";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.image.Image getProjectServiceNameImage(java.lang.String serviceName, java.lang.String flavorType, java.lang.String region, java.lang.String osType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/image";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.image.Image.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.image.Image getProjectServiceNameImage(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/image";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.image.Image.class);
	}

	public void postProjectServiceNameCredit(java.lang.String code, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/credit";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceVnc postProjectServiceNameInstanceInstanceIdVnc(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/vnc";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceVnc.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.Credit getProjectServiceNameCreditId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/credit/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.Credit.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.forecast.ProjectForecast getProjectServiceNameForecast(java.lang.String serviceName, java.util.Date toDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/forecast";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.forecast.ProjectForecast.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.user.User getProjectServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/user/" + userId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.user.User.class);
	}

	public net.zyuiop.ovhapi.api.objects.pca.Billing getServiceNamePcaPcaServiceNameBillingBillingId(java.lang.String serviceName, java.lang.String pcaServiceName, long billingId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/billing/" + billingId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pca.Billing.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolumeVolumeIdAttach(java.lang.String serviceName, java.lang.String volumeId, java.lang.String instanceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "/attach";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("instanceId", instanceId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerAccess getProjectServiceNameStorageAccess(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/storage/access";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerAccess.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.AlertingAlert getProjectServiceNameAlertingIdAlertAlertId(java.lang.String serviceName, java.lang.String id, long alertId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/alerting/" + id + "/alert/" + alertId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.AlertingAlert.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor getProjectServiceNameFlavor(java.lang.String serviceName, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/flavor";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor getProjectServiceNameFlavor(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/flavor";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor.class);
	}

	public void deleteProjectServiceNameSshkeyKeyId(java.lang.String serviceName, java.lang.String keyId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/sshkey/" + keyId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postProjectServiceNameStorageContainerIdCors(java.lang.String serviceName, java.lang.String containerId, java.lang.String origin) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/storage/" + containerId + "/cors";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("origin", origin);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getCloud() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0//cloud";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteProjectServiceNameAlertingId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/alerting/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKey getProjectServiceNameSshkey(java.lang.String serviceName, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/sshkey";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKey.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKey getProjectServiceNameSshkey(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/sshkey";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKey.class);
	}

	public net.zyuiop.ovhapi.api.objects.pca.Account getServiceNamePcaPcaServiceName(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pca.Account.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/project/$serviceName/consumption
	* Message : Missing identifier.
	*/


	public java.lang.String getProjectServiceNameAcl(java.lang.String serviceName, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/acl";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getProjectServiceNameAcl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/acl";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postProjectServiceNameStorageContainerIdStatic(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/storage/" + containerId + "/static";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.Alerting postProjectServiceNameAlerting(java.lang.String email, long monthlyThreshold, long delay, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/alerting";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		__dataMap.put("monthlyThreshold", monthlyThreshold);
		__dataMap.put("delay", delay);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.Alerting.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.Bill getProjectServiceNameBill(java.util.Date to, java.util.Date from, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/bill";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.project.Bill.class);
	}

	public java.lang.String getServiceNamePca(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pcs.Account getServiceNamePcsPcsServiceName(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pcs.Account.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.network.Network getProjectServiceNameNetworkPrivateNetworkId(java.lang.String serviceName, java.lang.String networkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/network/private/" + networkId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.network.Network.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstanceInstanceIdReinstall(java.lang.String serviceName, java.lang.String instanceId, java.lang.String imageId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/reinstall";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("imageId", imageId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.pca.Task postServiceNamePcaPcaServiceNameTasks(java.lang.String sessionId, java.lang.String taskFunction, java.lang.String fileIds, java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/tasks";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("sessionId", sessionId);
		__dataMap.put("taskFunction", taskFunction);
		__dataMap.put("fileIds", fileIds);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pca.Task.class);
	}

	public java.lang.String postProjectServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postProjectServiceNameCancel(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/cancel";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId, java.lang.String instanceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("instanceName", instanceName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteProjectServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/user/" + userId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstance(java.lang.String serviceName, java.lang.String flavorId, java.lang.String imageId, java.lang.String name, java.lang.String region, java.lang.String sshKeyId, boolean monthlyBilling, java.lang.String userData, java.lang.String privateNetworkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("flavorId", flavorId);
		__dataMap.put("imageId", imageId);
		__dataMap.put("name", name);
		__dataMap.put("region", region);
		__dataMap.put("sshKeyId", sshKeyId);
		__dataMap.put("monthlyBilling", monthlyBilling);
		__dataMap.put("userData", userData);
		__dataMap.put("privateNetworkId", privateNetworkId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstance(java.lang.String serviceName, java.lang.String flavorId, java.lang.String imageId, java.lang.String name, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("flavorId", flavorId);
		__dataMap.put("imageId", imageId);
		__dataMap.put("name", name);
		__dataMap.put("region", region);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail.class);
	}

	public void putServiceNamePcaPcaServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.subnet.Subnet getProjectServiceNameNetworkPrivateNetworkIdSubnet(java.lang.String serviceName, java.lang.String networkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/network/private/" + networkId + "/subnet";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.subnet.Subnet.class);
	}

	public java.lang.String getServiceNamePcs(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getProject() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail postProjectServiceNameUser(java.lang.String serviceName, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail postProjectServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp getProjectServiceNameIpFailoverId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/ip/failover/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.storage.Container postProjectServiceNameStorage(java.lang.String serviceName, java.lang.String containerName, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/storage";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("containerName", containerName);
		__dataMap.put("region", region);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.storage.Container.class);
	}

	public long getServiceNamePcaPcaServiceNameUsage(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/usage";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp postProjectServiceNameIpFailoverIdAttach(java.lang.String serviceName, java.lang.String id, java.lang.String instanceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/ip/failover/" + id + "/attach";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("instanceId", instanceId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail postProjectServiceNameUserUserIdRegeneratePassword(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/user/" + userId + "/regeneratePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolume(java.lang.String serviceName, long size, java.lang.String region, java.lang.String type, java.lang.String name, java.lang.String description, boolean bootable, java.lang.String snapshotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("size", size);
		__dataMap.put("region", region);
		__dataMap.put("type", type);
		__dataMap.put("name", name);
		__dataMap.put("description", description);
		__dataMap.put("bootable", bootable);
		__dataMap.put("snapshotId", snapshotId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolume(java.lang.String serviceName, long size, java.lang.String region, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("size", size);
		__dataMap.put("region", region);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cloud/$serviceName/pcs/$pcsServiceName/globalUsage
	* Message : Missing identifier.
	*/


	public long[] postProjectServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/changeContact";
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
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume getProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.image.Image getProjectServiceNameSnapshot(java.lang.String serviceName, java.lang.String flavorType, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/snapshot";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.image.Image.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.image.Image getProjectServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/snapshot";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.image.Image.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.region.RegionDetail getProjectServiceNameRegionRegionName(java.lang.String serviceName, java.lang.String regionName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/region/" + regionName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.region.RegionDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.pcs.Task getServiceNamePcsPcsServiceNameTasksId(java.lang.String serviceName, java.lang.String pcsServiceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "/tasks/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pcs.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.storage.Container getProjectServiceNameStorage(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/storage";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.storage.Container.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor getProjectServiceNameFlavorFlavorId(java.lang.String serviceName, java.lang.String flavorId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/flavor/" + flavorId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor.class);
	}

	public void deleteProjectServiceNameStorageContainerId(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/storage/" + containerId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.pca.Task getServiceNamePcaPcaServiceNameTasksTaskId(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/tasks/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pca.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.NewProject postCreateProject(java.lang.String voucher, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/createProject";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("voucher", voucher);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.project.NewProject.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.NewProject postCreateProject() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/createProject";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.project.NewProject.class);
	}

	public void deleteProjectServiceNameSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/snapshot/" + snapshotId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getProjectServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.pcs.Task postServiceNamePcsPcsServiceNameResetCredentials(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "/resetCredentials";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pcs.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume getProjectServiceNameVolume(java.lang.String serviceName, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume getProjectServiceNameVolume(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public void deleteProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNamePcsPcsServiceNameTasks(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.network.Network getProjectServiceNameNetworkPrivate(java.lang.String serviceName, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/network/private";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.network.Network.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.network.Network getProjectServiceNameNetworkPrivate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/network/private";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.network.Network.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp getProjectServiceNameIpFailover(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/ip/failover";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp.class);
	}

	public java.lang.String getProjectServiceNameRegion(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/region";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.user.User getProjectServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/user";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.user.User.class);
	}

	public java.lang.String getServiceNamePcaPcaServiceNameSessions(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNamePcaPcaServiceNameSessions(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNamePcaPcaServiceNameSessionsSessionId(net.zyuiop.ovhapi.api.objects.pca.Session param0, java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.Instance postProjectServiceNameInstanceBulk(java.lang.String serviceName, java.lang.String flavorId, java.lang.String imageId, java.lang.String name, java.lang.String region, long number, java.lang.String sshKeyId, boolean monthlyBilling, java.lang.String userData, java.lang.String privateNetworkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/bulk";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("flavorId", flavorId);
		__dataMap.put("imageId", imageId);
		__dataMap.put("name", name);
		__dataMap.put("region", region);
		__dataMap.put("number", number);
		__dataMap.put("sshKeyId", sshKeyId);
		__dataMap.put("monthlyBilling", monthlyBilling);
		__dataMap.put("userData", userData);
		__dataMap.put("privateNetworkId", privateNetworkId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.Instance.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.Instance postProjectServiceNameInstanceBulk(java.lang.String serviceName, java.lang.String flavorId, java.lang.String imageId, java.lang.String name, java.lang.String region, long number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/bulk";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("flavorId", flavorId);
		__dataMap.put("imageId", imageId);
		__dataMap.put("name", name);
		__dataMap.put("region", region);
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.Instance.class);
	}

	public net.zyuiop.ovhapi.api.objects.pca.File getServiceNamePcaPcaServiceNameSessionsSessionIdFilesFileId(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId, java.lang.String fileId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "/files/" + fileId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pca.File.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNamePcaPcaServiceNameServiceInfos(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public void putProjectServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.RescueAdminPassword postProjectServiceNameInstanceInstanceIdRescueMode(java.lang.String serviceName, java.lang.String instanceId, boolean rescue, java.lang.String imageId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/rescueMode";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("rescue", rescue);
		__dataMap.put("imageId", imageId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.RescueAdminPassword.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.RescueAdminPassword postProjectServiceNameInstanceInstanceIdRescueMode(java.lang.String serviceName, java.lang.String instanceId, boolean rescue) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/rescueMode";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("rescue", rescue);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.RescueAdminPassword.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.user.Openrc getProjectServiceNameUserUserIdOpenrc(java.lang.String serviceName, long userId, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/user/" + userId + "/openrc";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.user.Openrc.class);
	}

	public java.lang.String getProjectServiceNameAlerting(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/alerting";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetrics getProjectServiceNameInstanceInstanceIdMonitoring(java.lang.String serviceName, java.lang.String instanceId, java.lang.String period, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/monitoring";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetrics.class);
	}

	public java.lang.String getServiceNamePcaPcaServiceNameTasks(java.lang.String serviceName, java.lang.String pcaServiceName, java.util.Date todoDateTo, java.lang.String function, java.lang.String status, java.util.Date todoDateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNamePcaPcaServiceNameTasks(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume putProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId, boolean bootable, java.lang.String name, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("bootable", bootable);
		__dataMap.put("name", name);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume putProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId, boolean bootable) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("bootable", bootable);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public void postProjectServiceNameUnleash(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/unleash";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNamePcaPcaServiceName(net.zyuiop.ovhapi.api.objects.pca.Account param0, java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstanceInstanceIdResize(java.lang.String serviceName, java.lang.String instanceId, java.lang.String flavorId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/resize";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("flavorId", flavorId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail.class);
	}

	public void putProjectServiceNameAlertingId(net.zyuiop.ovhapi.api.objects.cloud.Alerting param0, java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/alerting/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getServiceNamePcaPcaServiceNameSessionsSessionIdFiles(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "/files";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNamePcaPcaServiceNameSessionsSessionIdFiles(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "/files";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot postProjectServiceNameVolumeVolumeIdSnapshot(java.lang.String serviceName, java.lang.String volumeId, java.lang.String name, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "/snapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot postProjectServiceNameVolumeVolumeIdSnapshot(java.lang.String serviceName, java.lang.String volumeId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "/snapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail getProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolumeVolumeIdDetach(java.lang.String serviceName, java.lang.String volumeId, java.lang.String instanceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "/detach";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("instanceId", instanceId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public long[] getServiceNamePcaPcaServiceNameBilling(java.lang.String serviceName, java.lang.String pcaServiceName, java.util.Date dateTo, java.util.Date dateFrom, boolean billed) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/billing";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNamePcaPcaServiceNameBilling(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/billing";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putProjectServiceName(net.zyuiop.ovhapi.api.objects.cloud.Project param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getProjectServiceNameCredit(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/credit";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot getProjectServiceNameVolumeSnapshot(java.lang.String serviceName, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/snapshot";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot getProjectServiceNameVolumeSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/snapshot";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.identity.Token postProjectServiceNameUserUserIdToken(java.lang.String serviceName, long userId, java.lang.String password) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/user/" + userId + "/token";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.identity.Token.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.Price getPrice(java.lang.String flavorId, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/price";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.Price getPrice() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/price";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.Alerting getProjectServiceNameAlertingId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/alerting/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.Alerting.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.ip.CloudIp getProjectServiceNameIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/ip";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.ip.CloudIp.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.Acl postProjectServiceNameAcl(java.lang.String accountId, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/acl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("accountId", accountId);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.Acl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerDetail getProjectServiceNameStorageContainerId(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/storage/" + containerId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.Instance getProjectServiceNameInstance(java.lang.String serviceName, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.Instance.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.Instance getProjectServiceNameInstance(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.Instance.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolumeVolumeIdUpsize(java.lang.String serviceName, java.lang.String volumeId, long size) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/" + volumeId + "/upsize";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("size", size);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.volume.Volume.class);
	}

	public void deleteProjectServiceNameVolumeSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/volume/snapshot/" + snapshotId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.pcs.Billing getServiceNamePcsPcsServiceNameBillingBillingId(java.lang.String serviceName, java.lang.String pcsServiceName, long billingId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "/billing/" + billingId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pcs.Billing.class);
	}

	public void putServiceNamePcsPcsServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.pca.Task postServiceNamePcaPcaServiceNameSessionsSessionIdRestore(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pca.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstanceInstanceIdActiveMonthlyBilling(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/instance/" + instanceId + "/activeMonthlyBilling";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.pca.Task deleteServiceNamePcaPcaServiceNameSessionsSessionId(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pca/" + pcaServiceName + "/sessions/" + sessionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.pca.Task.class);
	}

	public void deleteProjectServiceNameAclAccountId(java.lang.String serviceName, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/acl/" + accountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNamePcsPcsServiceNameServiceInfos(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pcs/" + pcsServiceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail postProjectServiceNameSshkey(java.lang.String serviceName, java.lang.String name, java.lang.String publicKey, java.lang.String region) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/sshkey";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("publicKey", publicKey);
		__dataMap.put("region", region);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail postProjectServiceNameSshkey(java.lang.String serviceName, java.lang.String name, java.lang.String publicKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/sshkey";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("publicKey", publicKey);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail.class);
	}

	public long[] getProjectServiceNameAlertingIdAlert(java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/alerting/" + id + "/alert";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cloud.Acl getProjectServiceNameAclAccountId(java.lang.String serviceName, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/project/" + serviceName + "/acl/" + accountId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cloud.Acl.class);
	}

}
