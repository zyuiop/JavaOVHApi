package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Vps;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class VpsImpl implements Vps { 

	private final OVHRawCalls client;

	public VpsImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String getServiceNameIpCountryAvailable(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ipCountryAvailable";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameVeeamRestorePointsIdRestore(boolean full, java.lang.String serviceName, long id, boolean changePassword, java.lang.String export) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restorePoints/" + id + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("full", full);
		__dataMap.put("changePassword", changePassword);
		__dataMap.put("export", export);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameVeeamRestorePointsIdRestore(boolean full, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restorePoints/" + id + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("full", full);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public long[] getServiceNameDistributionSoftware(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/distribution/software";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameBackupftpAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/access/" + ipBlock + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}

	public long[] getServiceNameTemplates(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/templates";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsNameServerAvailable
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String type, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl getServiceNameBackupftpAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/access/" + ipBlock + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.BackupFtpAclImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameSetPassword(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/setPassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/use
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNameGetConsoleUrl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/getConsoleUrl";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ips";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Vnc postServiceNameOpenConsoleAccess(java.lang.String serviceName, java.lang.String protocol) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/openConsoleAccess";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("protocol", protocol);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.VncImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Vnc postServiceNameOpenConsoleAccess(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/openConsoleAccess";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.VncImpl.class);
	}

	public java.lang.String getServiceNameBackupftpAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/authorizableBlocks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getServiceNameDisks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/disks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getServiceNameOption(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/option";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Template getServiceNameDistribution(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/distribution";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TemplateImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsDomains/$domain/dnsServer
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName, boolean ftp) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/access";
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

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/access";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBlock", ipBlock);
		__dataMap.put("nfs", nfs);
		__dataMap.put("cifs", cifs);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.VPS getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.VPSImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName/secondaryDnsDomains/$domain
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vps.Model getServiceNameModels(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/models";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.ModelImpl.class);
	}

	public java.lang.String getServiceNameBackupftpAccess(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/access";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteServiceNameIpsIpAddress(java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ips/" + ipAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/option/" + option + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getServiceNameActiveOptions(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/activeOptions";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task deleteServiceNameVeeamRestoredBackup(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restoredBackup";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public void putServiceNameBackupftpAccessIpBlock(net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl param0, java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/access/" + ipBlock + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("contactAdmin", contactAdmin);
		__dataMap.put("contactTech", contactTech);
		__dataMap.put("contactBilling", contactBilling);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.vps.VPS param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatus getServiceNameStatus(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/status";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Option getServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/option/" + option + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.OptionImpl.class);
	}

	public long[] getServiceNameTemplatesIdSoftware(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/templates/" + id + "/software";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Ip getServiceNameIpsIpAddress(java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ips/" + ipAddress + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.IpImpl.class);
	}

	public void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/secondaryDnsDomains";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/secondaryDnsDomains";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task deleteServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/snapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.veeam.RestoredBackup getServiceNameVeeamRestoredBackup(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restoredBackup";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.veeam.RestoredBackupImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/disks/$id/use
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vps.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/tasks/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Veeam getServiceNameVeeam(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.VeeamImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Model getServiceNameAvailableUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/availableUpgrade";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.ModelImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameStop(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/stop";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Datacenter getServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/datacenter";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.DatacenterImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/automatedBackup/attachedBackup
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/disks/$id/monitoring
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameAutomatedBackupRestore(java.lang.String type, java.util.Date restorePoint, java.lang.String serviceName, boolean changePassword) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/automatedBackup/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("type", type);
		__dataMap.put("restorePoint", restorePoint);
		__dataMap.put("changePassword", changePassword);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameAutomatedBackupRestore(java.lang.String type, java.util.Date restorePoint, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/automatedBackup/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("type", type);
		__dataMap.put("restorePoint", restorePoint);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public java.util.Date getServiceNameAutomatedBackupRestorePoints(java.lang.String state, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/automatedBackup/restorePoints";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date.class);
	}

	public java.lang.String getServiceNameSecondaryDnsDomains(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/secondaryDnsDomains";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getVps() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/vps";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Snapshot getServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/snapshot";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.SnapshotImpl.class);
	}

	public void putServiceNameSnapshot(net.zyuiop.ovhapi.api.objects.vps.Snapshot param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/snapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameStart(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpPassword(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/password";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.dedicated.server.TaskImpl.class);
	}

	public long[] getServiceNameVeeamRestorePoints(java.lang.String serviceName, java.util.Date creationTime) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restorePoints";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameVeeamRestorePoints(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restorePoints";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceNameDisksId(net.zyuiop.ovhapi.api.objects.vps.Disk param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/disks/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsDomains/$domain
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vps.Software getServiceNameDistributionSoftwareSoftwareId(java.lang.String serviceName, long softwareId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/distribution/software/" + softwareId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.SoftwareImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Template getServiceNameTemplatesId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/templates/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TemplateImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.veeam.RestorePoint getServiceNameVeeamRestorePointsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restorePoints/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.veeam.RestorePointImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameAutomatedBackupDetachBackup(java.util.Date restorePoint, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/automatedBackup/detachBackup";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("restorePoint", restorePoint);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameCreateSnapshot(java.lang.String serviceName, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/createSnapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameCreateSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/createSnapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameSnapshotRevert(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/snapshot/revert";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/monitoring
	* Message : Missing identifier.
	*/


	public void putServiceNameIpsIpAddress(net.zyuiop.ovhapi.api.objects.vps.Ip param0, java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ips/" + ipAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReinstall(long templateId, java.lang.String serviceName, java.lang.String sshKey, java.lang.String language, boolean doNotSendPassword, long[] softwareId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/reinstall";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("templateId", templateId);
		__dataMap.put("sshKey", sshKey);
		__dataMap.put("language", language);
		__dataMap.put("doNotSendPassword", doNotSendPassword);
		__dataMap.put("softwareId", softwareId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReinstall(long templateId, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/reinstall";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("templateId", templateId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}

	public void deleteServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/secondaryDnsDomains/" + domain + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReboot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/reboot";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/automatedBackup
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/backupftp
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vps.Software getServiceNameTemplatesIdSoftwareSoftwareId(java.lang.String serviceName, long id, long softwareId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/templates/" + id + "/software/" + softwareId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.SoftwareImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Disk getServiceNameDisksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/disks/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vps.DiskImpl.class);
	}

}
