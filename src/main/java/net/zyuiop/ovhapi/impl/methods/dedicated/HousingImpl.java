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
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.Housing getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.housing.HousingImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPPassword(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP/password";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}

	public java.lang.String getDedicatedHousing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/dedicated/housing";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameFeaturesBackupFTPAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP/authorizableBlocks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postServiceNameTaskTaskIdCancel(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/task/" + taskId + "/cancel";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/housing/$serviceName/features/backupFTP
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameFeaturesBackupFTPAccess(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP/access";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl getServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.BackupFtpAclImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName, boolean ftp) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP/access";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBlock", ipBlock);
		__dataMap.put("nfs", nfs);
		__dataMap.put("cifs", cifs);
		__dataMap.put("ftp", ftp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP/access";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBlock", ipBlock);
		__dataMap.put("nfs", nfs);
		__dataMap.put("cifs", cifs);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceNameFeaturesBackupFTPAccessIpBlock(net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl param0, java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.housing.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.ApcOrderable getServiceNameOrderableAPC(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/orderable/APC";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.housing.ApcOrderableImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

}
