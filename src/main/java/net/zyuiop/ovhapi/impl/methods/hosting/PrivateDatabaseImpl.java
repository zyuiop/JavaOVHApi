package net.zyuiop.ovhapi.impl.methods.hosting;

import net.zyuiop.ovhapi.api.methods.hosting.PrivateDatabase;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class PrivateDatabaseImpl implements PrivateDatabase { 

	private final OVHRawCalls client;

	public PrivateDatabaseImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameUser(java.lang.String password, java.lang.String userName, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("userName", userName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/tasks/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabase(java.lang.String databaseName, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("databaseName", databaseName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameUserUserNameGrant(java.lang.String databaseName, java.lang.String grant, java.lang.String serviceName, java.lang.String userName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "/grant";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("databaseName", databaseName);
		__dataMap.put("grant", grant);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseWizard(java.lang.String password, java.lang.String databaseName, java.lang.String userName, java.lang.String grant, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/databaseWizard";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("databaseName", databaseName);
		__dataMap.put("userName", userName);
		__dataMap.put("grant", grant);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameChangeVersion(java.lang.String version, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/changeVersion";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameRestart(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/restart";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public long[] getServiceNameCron(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/cron";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String databaseName, boolean sendEmail, boolean flushDatabase) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/import";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("documentId", documentId);
		__dataMap.put("sendEmail", sendEmail);
		__dataMap.put("flushDatabase", flushDatabase);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/import";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("documentId", documentId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName, boolean sendEmail) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dump";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("sendEmail", sendEmail);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dump";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/changeContact";
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
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameConfigurationWhitelistIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/whitelist/" + ip + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public void putServiceNameCronId(net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Cron param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/cron/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName, java.util.Date creationDate, java.util.Date deletionDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dump";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "databaseName=" + databaseName;
		__data += "creationDate=" + creationDate;
		__data += "deletionDate=" + deletionDate;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dump";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "databaseName=" + databaseName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameDumpIdRestore(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dump/" + id + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public java.lang.String[] getServiceNameUserUserNameGrant(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "/grant";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userName=" + userName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameUserUserNameGrantDatabaseName(java.lang.String serviceName, java.lang.String userName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "/grant/" + databaseName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public java.lang.String[] getServiceNameConfigurationWhitelist(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/whitelist";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameStart(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameConfigurationWhitelistIpUpdate(java.lang.String comment, boolean service, boolean sftp, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/whitelist/" + ip + "/update";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("comment", comment);
		__dataMap.put("service", service);
		__dataMap.put("sftp", sftp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Dump getServiceNameDatabaseDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dumps/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "databaseName=" + databaseName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Dump.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameDatabaseDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dumps/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Grant getServiceNameUserUserNameGrantDatabaseName(java.lang.String serviceName, java.lang.String userName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "/grant/" + databaseName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userName=" + userName;
		__data += "databaseName=" + databaseName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Grant.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameChangeRootPassword(java.lang.String password, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/changeRootPassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameUserUserNameChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String userName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String command, java.lang.String serviceName, java.lang.String email, java.lang.String databaseName, java.lang.String status, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/cron";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("frequency", frequency);
		__dataMap.put("command", command);
		__dataMap.put("email", email);
		__dataMap.put("databaseName", databaseName);
		__dataMap.put("status", status);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String command, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/cron";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("frequency", frequency);
		__dataMap.put("command", command);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Database getServiceNameDatabaseDatabaseName(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "databaseName=" + databaseName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Database.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameDumpsIdRestore(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dumps/" + id + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/cron/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameChangeFtpPassword(java.lang.String password, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/changeFtpPassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingPrivateDatabase() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/hosting/privateDatabase";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameDatabase(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameDatabaseDatabaseName(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameDatabaseDatabaseNameDumpId(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dump/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public java.lang.String[] getServiceNameConfigurations(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configurations";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameRefresh(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/refresh";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameConfigurationWhitelist(java.lang.String ip, java.lang.String serviceName, java.lang.String comment, boolean service, boolean sftp) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/whitelist";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		__dataMap.put("comment", comment);
		__dataMap.put("service", service);
		__dataMap.put("sftp", sftp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameConfigurationWhitelist(java.lang.String ip, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/whitelist";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameStop(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/stop";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Dump getServiceNameDatabaseDatabaseNameDumpId(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dump/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "databaseName=" + databaseName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Dump.class);
	}

	public long[] getServiceNameDatabaseDatabaseNameDumps(java.lang.String serviceName, java.lang.String databaseName, java.util.Date creationDate, java.util.Date deletionDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dumps";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "databaseName=" + databaseName;
		__data += "creationDate=" + creationDate;
		__data += "deletionDate=" + deletionDate;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDatabaseDatabaseNameDumps(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database/" + databaseName + "/dumps";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "databaseName=" + databaseName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceNameConfigurationMysql(net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationMysql param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/mysql";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Service getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.User getServiceNameUserUserName(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userName=" + userName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.User.class);
	}

	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationMysql getServiceNameConfigurationMysql(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/mysql";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationMysql.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameUserUserName(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationWhitelists getServiceNameConfigurationWhitelistIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/whitelist/" + ip + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationWhitelists.class);
	}

	public java.lang.String[] getServiceNameAvailableVersions(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/availableVersions";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameUserUserNameGrantDatabaseNameUpdate(java.lang.String grant, java.lang.String serviceName, java.lang.String userName, java.lang.String databaseName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "/grant/" + databaseName + "/update";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("grant", grant);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Cron getServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/cron/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Cron.class);
	}

}
