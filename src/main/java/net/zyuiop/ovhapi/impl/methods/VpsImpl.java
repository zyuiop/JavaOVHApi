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
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ipCountryAvailable";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameVeeamRestorePointsIdRestore(boolean full, java.lang.String serviceName, long id, boolean changePassword, java.lang.String export) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/veeam/restorePoints/" + id + "/restore";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("full", full);
		dataMap.put("changePassword", changePassword);
		dataMap.put("export", export);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameVeeamRestorePointsIdRestore(boolean full, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/veeam/restorePoints/" + id + "/restore";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("full", full);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public long[] getServiceNameDistributionSoftware(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/distribution/software";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameBackupftpAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupftp/access/" + ipBlock + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public long[] getServiceNameTemplates(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/templates";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsNameServerAvailable
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String type, java.lang.String state) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl getServiceNameBackupftpAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupftp/access/" + ipBlock + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameSetPassword(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/setPassword";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/use
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNameGetConsoleUrl(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/getConsoleUrl";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Vnc postServiceNameOpenConsoleAccess(java.lang.String serviceName, java.lang.String protocol) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/openConsoleAccess";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("protocol", protocol);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Vnc.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Vnc postServiceNameOpenConsoleAccess(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/openConsoleAccess";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Vnc.class);
	}

	public java.lang.String getServiceNameBackupftpAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupftp/authorizableBlocks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getServiceNameDisks(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/disks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getServiceNameOption(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/option";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
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

	public net.zyuiop.ovhapi.api.objects.vps.Template getServiceNameDistribution(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/distribution";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Template.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsDomains/$domain/dnsServer
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName, boolean ftp) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupftp/access";
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

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupftp/access";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ipBlock", ipBlock);
		dataMap.put("nfs", nfs);
		dataMap.put("cifs", cifs);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.VPS getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.VPS.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName/secondaryDnsDomains/$domain
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vps.Model getServiceNameModels(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/models";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Model.class);
	}

	public java.lang.String getServiceNameBackupftpAccess(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupftp/access";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteServiceNameIpsIpAddress(java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips/" + ipAddress + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/option/" + option + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNameActiveOptions(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/activeOptions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task deleteServiceNameVeeamRestoredBackup(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/veeam/restoredBackup";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public void putServiceNameBackupftpAccessIpBlock(net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl param0, java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupftp/access/" + ipBlock + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/changeContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("contactAdmin", contactAdmin);
		dataMap.put("contactTech", contactTech);
		dataMap.put("contactBilling", contactBilling);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/changeContact";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.vps.VPS param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatus getServiceNameStatus(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/status";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatus.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Option getServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/option/" + option + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Option.class);
	}

	public long[] getServiceNameTemplatesIdSoftware(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/templates/" + id + "/software";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Ip getServiceNameIpsIpAddress(java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips/" + ipAddress + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Ip.class);
	}

	public void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/secondaryDnsDomains";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/secondaryDnsDomains";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task deleteServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/snapshot";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.veeam.RestoredBackup getServiceNameVeeamRestoredBackup(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/veeam/restoredBackup";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.veeam.RestoredBackup.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/disks/$id/use
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vps.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/tasks/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Veeam getServiceNameVeeam(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/veeam";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Veeam.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Model getServiceNameAvailableUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/availableUpgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Model.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameStop(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/stop";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Datacenter getServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/datacenter";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Datacenter.class);
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
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/automatedBackup/restore";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("type", type);
		dataMap.put("restorePoint", restorePoint);
		dataMap.put("changePassword", changePassword);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameAutomatedBackupRestore(java.lang.String type, java.util.Date restorePoint, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/automatedBackup/restore";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("type", type);
		dataMap.put("restorePoint", restorePoint);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public java.util.Date getServiceNameAutomatedBackupRestorePoints(java.lang.String state, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/automatedBackup/restorePoints";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.util.Date.class);
	}

	public java.lang.String getServiceNameSecondaryDnsDomains(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/secondaryDnsDomains";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getVps() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//vps";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Snapshot getServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/snapshot";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Snapshot.class);
	}

	public void putServiceNameSnapshot(net.zyuiop.ovhapi.api.objects.vps.Snapshot param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/snapshot";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameStart(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/start";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpPassword(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupftp/password";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public long[] getServiceNameVeeamRestorePoints(java.lang.String serviceName, java.util.Date creationTime) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/veeam/restorePoints";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameVeeamRestorePoints(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/veeam/restorePoints";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putServiceNameDisksId(net.zyuiop.ovhapi.api.objects.vps.Disk param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/disks/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsDomains/$domain
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vps.Software getServiceNameDistributionSoftwareSoftwareId(java.lang.String serviceName, long softwareId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/distribution/software/" + softwareId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Software.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Template getServiceNameTemplatesId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/templates/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Template.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.veeam.RestorePoint getServiceNameVeeamRestorePointsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/veeam/restorePoints/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.veeam.RestorePoint.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameAutomatedBackupDetachBackup(java.util.Date restorePoint, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/automatedBackup/detachBackup";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("restorePoint", restorePoint);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameCreateSnapshot(java.lang.String serviceName, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/createSnapshot";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameCreateSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/createSnapshot";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameSnapshotRevert(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/snapshot/revert";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/monitoring
	* Message : Missing identifier.
	*/


	public void putServiceNameIpsIpAddress(net.zyuiop.ovhapi.api.objects.vps.Ip param0, java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips/" + ipAddress + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReinstall(long templateId, java.lang.String serviceName, java.lang.String sshKey, java.lang.String language, boolean doNotSendPassword, long[] softwareId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/reinstall";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("templateId", templateId);
		dataMap.put("sshKey", sshKey);
		dataMap.put("language", language);
		dataMap.put("doNotSendPassword", doNotSendPassword);
		dataMap.put("softwareId", softwareId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReinstall(long templateId, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/reinstall";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("templateId", templateId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
	}

	public void deleteServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/secondaryDnsDomains/" + domain + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReboot(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/reboot";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Task.class);
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
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/templates/" + id + "/software/" + softwareId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Software.class);
	}

	public net.zyuiop.ovhapi.api.objects.vps.Disk getServiceNameDisksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/disks/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vps.Disk.class);
	}

}
