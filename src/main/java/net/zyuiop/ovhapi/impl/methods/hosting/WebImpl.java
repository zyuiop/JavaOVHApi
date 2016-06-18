package net.zyuiop.ovhapi.impl.methods.hosting;

import net.zyuiop.ovhapi.api.methods.hosting.Web;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class WebImpl implements Web { 

	private final OVHRawCalls client;

	public WebImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/statistics
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.UserLogs getServiceNameUserLogsLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs/" + login + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.UserLogsImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRestoreSnapshot(java.lang.String backup, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/restoreSnapshot";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("backup", backup);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/offerCapabilities
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUserLoginChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/user/" + login + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cron/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String deleteServiceNameUserLogsLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs/" + login + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Freedom getServiceNameFreedomDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/freedom/" + domain + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.FreedomImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdChangeConfiguration(java.lang.String serviceName, long id, java.lang.String environment, java.lang.String httpFirewall, java.lang.String engineName, java.lang.String container, java.lang.String engineVersion) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ovhConfig/" + id + "/changeConfiguration";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("environment", environment);
		__dataMap.put("httpFirewall", httpFirewall);
		__dataMap.put("engineName", engineName);
		__dataMap.put("container", container);
		__dataMap.put("engineVersion", engineVersion);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdChangeConfiguration(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ovhConfig/" + id + "/changeConfiguration";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public java.lang.String postServiceNameEmailRequest(java.lang.String action, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/email/request";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNameUserLogin(net.zyuiop.ovhapi.api.objects.hosting.web.User param0, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/user/" + login + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameModule(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/module";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/database/$name
	* Message : Missing identifier.
	*/


	public java.lang.String[] getAvailableOffer(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/availableOffer";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseNameDumpId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dump/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/privateDatabaseCreationCapabilities
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/web/$serviceName
	* Message : Missing identifier.
	*/


	public long[] getModuleList(boolean latest, boolean active, java.lang.String branch) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/moduleList";
		String __data = "?";
		__data += "latest=" + latest;
		__data += "active=" + active;
		__data += "branch=" + branch;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), long[].class);
	}

	public long[] getModuleList() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/moduleList";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameUserLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/user/" + login + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.util.Date[] getServiceNameBoostHistory(java.lang.String serviceName, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/boostHistory";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}

	public java.util.Date[] getServiceNameBoostHistory(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/boostHistory";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDumpIdRestore(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dump/" + id + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDumpsIdRestore(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dumps/" + id + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameActivatePrivateDatabase(java.lang.String version, java.lang.String ram, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/activatePrivateDatabase";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ram", ram);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.AttachedDomain getServiceNameAttachedDomainDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/attachedDomain/" + domain + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.AttachedDomainImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.OvhConfig getServiceNameOvhConfigId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ovhConfig/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.OvhConfigImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequestBoost(java.lang.String serviceName, java.lang.String offer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/requestBoost";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("offer", offer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequestBoost(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/requestBoost";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/database/$name/statistics
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDatabaseNameDump(java.lang.String serviceName, java.lang.String name, java.util.Date creationDate, java.lang.String type, java.util.Date deletionDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dump";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		__data += "creationDate=" + creationDate;
		__data += "type=" + type;
		__data += "deletionDate=" + deletionDate;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDatabaseNameDump(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dump";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.mail.Bounce[] getServiceNameEmailBounces(long limit, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/email/bounces";
		String __data = "?";
		__data += "limit=" + limit;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.mail.BounceImpl[].class);
	}

	public java.lang.String[] getServiceNameDatabase(java.lang.String serviceName, java.lang.String mode, java.lang.String user, java.lang.String name, java.lang.String type, java.lang.String server) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "mode=" + mode;
		__data += "user=" + user;
		__data += "name=" + name;
		__data += "type=" + type;
		__data += "server=" + server;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameDatabase(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getServiceNameOvhConfig(java.lang.String serviceName, boolean historical, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ovhConfig";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "historical=" + historical;
		__data += "path=" + path;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameOvhConfig(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ovhConfig";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Dump getServiceNameDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dumps/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.DumpImpl.class);
	}

	public java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String language, java.lang.String command, java.lang.String serviceName, java.lang.String email, java.lang.String status, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cron";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("frequency", frequency);
		__dataMap.put("language", language);
		__dataMap.put("command", command);
		__dataMap.put("email", email);
		__dataMap.put("status", status);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String language, java.lang.String command, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cron";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("frequency", frequency);
		__dataMap.put("language", language);
		__dataMap.put("command", command);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String[] getServiceNameAttachedDomain(java.lang.String serviceName, java.lang.String domain, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/attachedDomain";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		__data += "path=" + path;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameAttachedDomain(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/attachedDomain";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putServiceNameAttachedDomainDomain(net.zyuiop.ovhapi.api.objects.hosting.web.AttachedDomain param0, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/attachedDomain/" + domain + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameAttachedDomainDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/attachedDomain/" + domain + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomain(java.lang.String domain, java.lang.String path, java.lang.String serviceName, java.lang.String cdn, java.lang.String ownLog, boolean ssl, java.lang.String firewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/attachedDomain";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("path", path);
		__dataMap.put("cdn", cdn);
		__dataMap.put("ownLog", ownLog);
		__dataMap.put("ssl", ssl);
		__dataMap.put("firewall", firewall);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomain(java.lang.String domain, java.lang.String path, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/attachedDomain";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("path", path);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabase(java.lang.String capabilitie, java.lang.String user, java.lang.String type, java.lang.String serviceName, long quota, java.lang.String password, java.lang.String version) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("capabilitie", capabilitie);
		__dataMap.put("user", user);
		__dataMap.put("type", type);
		__dataMap.put("quota", quota);
		__dataMap.put("password", password);
		__dataMap.put("version", version);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabase(java.lang.String capabilitie, java.lang.String user, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("capabilitie", capabilitie);
		__dataMap.put("user", user);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUser(java.lang.String password, java.lang.String home, java.lang.String login, java.lang.String serviceName, java.lang.String sshState, java.lang.String iisRemoteRights, java.lang.String webDavRights) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("home", home);
		__dataMap.put("login", login);
		__dataMap.put("sshState", sshState);
		__dataMap.put("iisRemoteRights", iisRemoteRights);
		__dataMap.put("webDavRights", webDavRights);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUser(java.lang.String password, java.lang.String home, java.lang.String login, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("home", home);
		__dataMap.put("login", login);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Module getServiceNameModuleId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/module/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.ModuleImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Dump getServiceNameDatabaseNameDumpId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dump/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.DumpImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequest(java.lang.String action, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/request";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDump(java.lang.String date, java.lang.String serviceName, java.lang.String name, boolean sendEmail) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dump";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("date", date);
		__dataMap.put("sendEmail", sendEmail);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDump(java.lang.String date, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dump";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("date", date);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String name, boolean sendEmail, boolean flushDatabase) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/import";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("documentId", documentId);
		__dataMap.put("sendEmail", sendEmail);
		__dataMap.put("flushDatabase", flushDatabase);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/import";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("documentId", documentId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public long[] getServiceNameDatabaseNameDumps(java.lang.String serviceName, java.lang.String name, java.util.Date creationDate, java.lang.String type, java.util.Date deletionDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dumps";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		__data += "creationDate=" + creationDate;
		__data += "type=" + type;
		__data += "deletionDate=" + deletionDate;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDatabaseNameDumps(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dumps";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRestore(java.lang.String date, java.lang.String serviceName, java.lang.String name, boolean sendEmail) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("date", date);
		__dataMap.put("sendEmail", sendEmail);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRestore(java.lang.String date, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/restore";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("date", date);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigRefresh(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ovhConfigRefresh";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Email getServiceNameEmail(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/email";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.EmailImpl.class);
	}

	public long[] getServiceNameCron(java.lang.String serviceName, java.lang.String email, java.lang.String language, java.lang.String description, java.lang.String command) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cron";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "email=" + email;
		__data += "language=" + language;
		__data += "description=" + description;
		__data += "command=" + command;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameCron(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cron";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomainDomainPurgeCache(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/attachedDomain/" + domain + "/purgeCache";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public java.lang.String[] getServiceNameUserLogs(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameUserLogs(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Indy getServiceNameIndyLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/indy/" + login + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.IndyImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdRollback(long rollbackId, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ovhConfig/" + id + "/rollback";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("rollbackId", rollbackId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameModuleId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/module/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModuleIdChangePassword(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/module/" + id + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/moduleList/$id
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.database.AvailableVersionStruct getServiceNameDatabaseAvailableVersion(java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/databaseAvailableVersion";
		String __data = "?";
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.database.AvailableVersionStructImpl.class);
	}

	public java.lang.String[] getServiceNameFreedom(java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/freedom";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameFreedom(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/freedom";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameIndy(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/indy";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameIndy(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/indy";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Cron getServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cron/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.CronImpl.class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/changeContact";
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
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getServiceNameToken(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/token";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRequest(java.lang.String action, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/request";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public java.lang.String[] getAttachedDomain(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/attachedDomain";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNameUserLogsLogin(net.zyuiop.ovhapi.api.objects.hosting.web.UserLogs param0, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs/" + login + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameCronId(net.zyuiop.ovhapi.api.objects.hosting.web.Cron param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cron/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModule(long moduleId, java.lang.String serviceName, java.lang.String domain, java.lang.String language, java.lang.String adminName, java.lang.String adminPassword, net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType dependencies, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/module";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("moduleId", moduleId);
		__dataMap.put("domain", domain);
		__dataMap.put("language", language);
		__dataMap.put("adminName", adminName);
		__dataMap.put("adminPassword", adminPassword);
		__dataMap.put("dependencies", dependencies);
		__dataMap.put("path", path);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModule(long moduleId, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/module";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("moduleId", moduleId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/tasks/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public java.lang.String[] getHostingWeb() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/hosting/web";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String postServiceNameUserLogs(java.lang.String password, java.lang.String description, java.lang.String login, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("description", description);
		__dataMap.put("login", login);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.mail.VolumeHistory[] getServiceNameEmailVolumes(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/email/volumes";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.mail.VolumeHistoryImpl[].class);
	}

	public java.lang.String postServiceNameUserLogsLoginChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs/" + login + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUserLogsToken(java.lang.String serviceName, boolean remoteCheck, java.lang.String attachedDomain, long ttl) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogsToken";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "remoteCheck=" + remoteCheck;
		__data += "attachedDomain=" + attachedDomain;
		__data += "ttl=" + ttl;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUserLogsToken(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogsToken";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNameEmail(net.zyuiop.ovhapi.api.objects.hosting.web.Email param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/email";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameCronAvailableLanguage(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cronAvailableLanguage";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/databaseCreationCapabilities
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.BoostHistory getServiceNameBoostHistoryDate(java.lang.String serviceName, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/boostHistory/" + date + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.BoostHistoryImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/database/" + name + "/dumps/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.TaskImpl.class);
	}

	public java.lang.String[] getServiceNameUser(java.lang.String serviceName, java.lang.String home, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "home=" + home;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.User getServiceNameUserLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/user/" + login + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hosting.web.UserImpl.class);
	}

}
