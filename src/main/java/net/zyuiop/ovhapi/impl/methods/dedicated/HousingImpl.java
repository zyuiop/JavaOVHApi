package net.zyuiop.ovhapi.impl.methods.dedicated;

import net.zyuiop.ovhapi.api.methods.dedicated.Housing;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class HousingImpl implements Housing { 

	private final OVHRawCalls client;

	public HousingImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.Housing getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.housing.Housing.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPPassword(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/password";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public java.lang.String getDedicatedHousing() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//dedicated/housing";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameFeaturesBackupFTPAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/authorizableBlocks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postServiceNameTaskTaskIdCancel(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + taskId + "/cancel";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/housing/$serviceName/features/backupFTP
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameFeaturesBackupFTPAccess(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl getServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName, boolean ftp) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ipBlock", ipBlock);
		dataMap.put("nfs", nfs);
		dataMap.put("cifs", cifs);
		dataMap.put("ftp", ftp);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ipBlock", ipBlock);
		dataMap.put("nfs", nfs);
		dataMap.put("cifs", cifs);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
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

	public void putServiceNameFeaturesBackupFTPAccessIpBlock(net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl param0, java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
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

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + taskId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.housing.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.ApcOrderable getServiceNameOrderableAPC(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/APC";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.housing.ApcOrderable.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

}
