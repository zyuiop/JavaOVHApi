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

	public java.lang.String getServiceNameConfigurations(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/configurations";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameAvailableVersions(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/availableVersions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/user/$userName/grant/$databaseName/update
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/changeRootPassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/configuration/whitelist/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/privateDatabase/$serviceName
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName, java.util.Date creationDate, java.util.Date deletionDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + databaseName + "/dump";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + databaseName + "/dump";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/database/$databaseName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/cron/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/user/$userName/grant/$databaseName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/user/$userName/grant
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/changeVersion
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
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

	public java.lang.String getServiceNameDatabase(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/configuration/whitelist/$ip/update
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/database/$databaseName/dump/$id
	* Message : Missing identifier.
	*/



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


	public long[] getServiceNameDatabaseDatabaseNameDumps(java.lang.String serviceName, java.lang.String databaseName, java.util.Date creationDate, java.util.Date deletionDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + databaseName + "/dumps";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameDatabaseDatabaseNameDumps(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + databaseName + "/dumps";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/configuration/whitelist/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/database/$databaseName/dumps/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/databaseWizard
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database/$databaseName/dumps/$id/restore
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/configuration/mysql
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
	* Involved method : POST > /hosting/privateDatabase/$serviceName/database/$databaseName/dump/$id/restore
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameUserUserNameGrant(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + userName + "/grant";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
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

	public java.lang.String getHostingPrivateDatabase() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//hosting/privateDatabase";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/changeFtpPassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/database/$databaseName/dumps/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/database/$databaseName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/refresh
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/start
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/restart
	* Message : Missing identifier.
	*/



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
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/database/$databaseName/dump/$id
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
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

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /hosting/privateDatabase/$serviceName/user/$userName/grant/$databaseName
	* Message : Missing identifier.
	*/


	public long[] getServiceNameCron(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /hosting/privateDatabase/$serviceName/user/$userName/changePassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/privateDatabase/$serviceName/cron/$id
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameConfigurationWhitelist(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/configuration/whitelist";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/user/$userName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /hosting/privateDatabase/$serviceName/tasks/$id
	* Message : Missing identifier.
	*/


	public java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String command, java.lang.String serviceName, java.lang.String email, java.lang.String databaseName, java.lang.String status, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("frequency", frequency);
		dataMap.put("command", command);
		dataMap.put("email", email);
		dataMap.put("databaseName", databaseName);
		dataMap.put("status", status);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String command, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("frequency", frequency);
		dataMap.put("command", command);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/terminate";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /hosting/privateDatabase/$serviceName/configuration/mysql
	* Message : Missing identifier.
	*/


}
