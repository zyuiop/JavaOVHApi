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


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/configuration/whitelist/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/refresh
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/configuration/whitelist/$ip/update
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/database/$databaseName/dump/$id
	* Message : Missing identifier.
	*/


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

	public java.lang.String[] getServiceNameAvailableVersions(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/availableVersions";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/restart
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/user/$userName/grant
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameDatabase(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/database";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/database/$databaseName/dumps/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingPrivateDatabase() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/hosting/privateDatabase";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/configuration/whitelist/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database/$databaseName/dump
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database/$databaseName/dump
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameConfigurationWhitelist(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configuration/whitelist";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database/$databaseName/import
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database/$databaseName/import
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/privateDatabase/$serviceName/cron/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/start
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/privateDatabase/$serviceName/configuration/mysql
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/privateDatabase/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/tasks/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/changeVersion
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/database/$databaseName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/stop
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/user/$userName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/changeRootPassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/databaseWizard
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/configuration/mysql
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/cron/$id
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database/$databaseName/dumps/$id/restore
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/database/$databaseName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameUserUserNameGrant(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/user/" + userName + "/grant";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userName=" + userName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/user/$userName/grant/$databaseName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/user/$userName/grant/$databaseName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameConfigurations(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/configurations";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/user/$userName/changePassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/user/$userName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/user/$userName/grant/$databaseName/update
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/changeFtpPassword
	* Message : Missing identifier.
	*/


	public long[] getServiceNameCron(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/cron";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database/$databaseName/dump/$id/restore
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/database/$databaseName/dumps/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/privateDatabase/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/database/$databaseName/dump/$id
	* Message : Missing identifier.
	*/


	public java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/cron/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/configuration/whitelist
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/configuration/whitelist
	* Message : Missing identifier.
	*/


}
