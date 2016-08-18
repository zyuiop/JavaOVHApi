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

	public java.lang.String deleteServiceNameUserLogsLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs/" + login + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String[] getAttachedDomain(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/attachedDomain";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/dumps/$id/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/email/bounces
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/tasks/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/dump/$id/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/database/$name/dump/$id
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/offerCapabilities
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/web/$serviceName/cron/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/module/$id/changePassword
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/web/$serviceName/database/$name/dump/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/web/$serviceName/attachedDomain/$domain
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/module
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/module
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/restoreSnapshot
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


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/user/$login/changePassword
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/web/$serviceName/module/$id
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


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/boostHistory/$date
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/web/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/web/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/statistics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/web/$serviceName/attachedDomain/$domain
	* Message : Missing identifier.
	*/


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
	* Involved method : GET > /hosting/web/$serviceName/freedom/$domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/ovhConfig/$id/rollback
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/database/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/ovhConfigRefresh
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameToken(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/token";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/web/$serviceName/database/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/email
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/databaseAvailableVersion
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/userLogs/$login
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingWeb() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/hosting/web";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/moduleList/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/web/$serviceName/user/$login
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/module/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/attachedDomain/$domain/purgeCache
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/web/$serviceName/user/$login
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/ovhConfig/$id/changeConfiguration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/ovhConfig/$id/changeConfiguration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/attachedDomain/$domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/user/$login
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/cron/$id
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNameEmailRequest(java.lang.String action, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/email/request";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/databaseCreationCapabilities
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/web/$serviceName/database/$name/dumps/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/request
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/activatePrivateDatabase
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNameUserLogsLoginChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/userLogs/" + login + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cron/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/request
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/privateDatabaseCreationCapabilities
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


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/indy/$login
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/attachedDomain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/attachedDomain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/web/$serviceName/email
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/dump
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/dump
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/ovhConfig/$id
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/import
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/import
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/requestBoost
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/requestBoost
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/web/$serviceName/database/$name/changePassword
	* Message : Missing identifier.
	*/


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
	* Involved method : GET > /hosting/web/$serviceName/email/volumes
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/web/$serviceName/userLogs/$login
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/database/$name/dumps/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/database/$name/statistics
	* Message : Missing identifier.
	*/


}
