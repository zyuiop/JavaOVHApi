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


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/availableUpgrade
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/veeam/restorePoints/$id
	* Message : Missing identifier.
	*/


	public java.util.Date[] getServiceNameAutomatedBackupRestorePoints(java.lang.String state, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/automatedBackup/restorePoints";
		String __data = "?";
		__data += "state=" + state;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}

	public java.lang.String[] getServiceNameSecondaryDnsDomains(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/secondaryDnsDomains";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/distribution
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVps() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/vps";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/automatedBackup/detachBackup
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ips";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsDomains/$domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/disks/$id/monitoring
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/backupftp/access/$ipBlock
	* Message : Missing identifier.
	*/


	public long[] getServiceNameVeeamRestorePoints(java.lang.String serviceName, java.util.Date creationTime) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restorePoints";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "creationTime=" + creationTime;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameVeeamRestorePoints(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/restorePoints";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/use
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/templates/$id
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName/secondaryDnsDomains/$domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName/backupftp/access/$ipBlock
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName/disks/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameActiveOptions(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/activeOptions";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameBackupftpAccess(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/access";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/automatedBackup
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/stop
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/automatedBackup/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/automatedBackup/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /vps/$serviceName/snapshot
	* Message : Missing identifier.
	*/


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

	public java.lang.String[] getServiceNameOption(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/option";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/reboot
	* Message : Missing identifier.
	*/


	public void deleteServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/secondaryDnsDomains/" + domain + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/automatedBackup/attachedBackup
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName/snapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/option/$option
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /vps/$serviceName/veeam/restoredBackup
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTemplatesIdSoftware(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/templates/" + id + "/software";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/disks/$id/use
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


	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/veeam/restorePoints/$id/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/veeam/restorePoints/$id/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/status
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/openConsoleAccess
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/openConsoleAccess
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/reinstall
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/reinstall
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameIpCountryAvailable(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ipCountryAvailable";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteServiceNameIpsIpAddress(java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ips/" + ipAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/templates/$id/software/$softwareId
	* Message : Missing identifier.
	*/


	public void deleteServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/option/" + option + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/veeam/restoredBackup
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/monitoring
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/distribution/software/$softwareId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/backupftp/access
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/backupftp/access
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTemplates(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/templates";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/snapshot/revert
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/models
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/tasks/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/snapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /vps/$serviceName/backupftp/access/$ipBlock
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsDomains/$domain/dnsServer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/disks/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/setPassword
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameBackupftpAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/backupftp/authorizableBlocks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/secondaryDnsNameServerAvailable
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/datacenter
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/backupftp/password
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/backupftp
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDisks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/disks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/start
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/createSnapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /vps/$serviceName/createSnapshot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName/ips/$ipAddress
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDistributionSoftware(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/distribution/software";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String type, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "type=" + type;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/veeam
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /vps/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /vps/$serviceName/ips/$ipAddress
	* Message : Missing identifier.
	*/


}
