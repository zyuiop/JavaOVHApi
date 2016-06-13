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
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogs/" + login + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.UserLogs.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRestoreSnapshot(java.lang.String backup, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/restoreSnapshot";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("backup", backup);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/offerCapabilities
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUserLoginChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + login + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String deleteServiceNameUserLogsLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogs/" + login + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Freedom getServiceNameFreedomDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/freedom/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Freedom.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdChangeConfiguration(java.lang.String serviceName, long id, java.lang.String environment, java.lang.String httpFirewall, java.lang.String engineName, java.lang.String container, java.lang.String engineVersion) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ovhConfig/" + id + "/changeConfiguration";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("environment", environment);
		dataMap.put("httpFirewall", httpFirewall);
		dataMap.put("engineName", engineName);
		dataMap.put("container", container);
		dataMap.put("engineVersion", engineVersion);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdChangeConfiguration(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ovhConfig/" + id + "/changeConfiguration";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public java.lang.String postServiceNameEmailRequest(java.lang.String action, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/email/request";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("action", action);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putServiceNameUserLogin(net.zyuiop.ovhapi.api.objects.hosting.web.User param0, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + login + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getServiceNameModule(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/module";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/database/$name
	* Message : Missing identifier.
	*/


	public java.lang.String getAvailableOffer(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/availableOffer";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseNameDumpId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dump/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
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
		String callUrl = "https://api.ovh.com/1.0/moduleList";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), long[].class);
	}

	public long[] getModuleList() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/moduleList";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameUserLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + login + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
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

	public java.util.Date getServiceNameBoostHistory(java.lang.String serviceName, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/boostHistory";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.util.Date.class);
	}

	public java.util.Date getServiceNameBoostHistory(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/boostHistory";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.util.Date.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDumpIdRestore(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dump/" + id + "/restore";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDumpsIdRestore(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dumps/" + id + "/restore";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameActivatePrivateDatabase(java.lang.String version, java.lang.String ram, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/activatePrivateDatabase";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ram", ram);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.AttachedDomain getServiceNameAttachedDomainDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/attachedDomain/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.AttachedDomain.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.OvhConfig getServiceNameOvhConfigId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ovhConfig/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.OvhConfig.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequestBoost(java.lang.String serviceName, java.lang.String offer) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/requestBoost";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("offer", offer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequestBoost(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/requestBoost";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/database/$name/statistics
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDatabaseNameDump(java.lang.String serviceName, java.lang.String name, java.util.Date creationDate, java.lang.String type, java.util.Date deletionDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dump";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameDatabaseNameDump(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dump";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.mail.Bounce getServiceNameEmailBounces(long limit, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/email/bounces";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.mail.Bounce.class);
	}

	public java.lang.String getServiceNameDatabase(java.lang.String serviceName, java.lang.String mode, java.lang.String user, java.lang.String name, java.lang.String type, java.lang.String server) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDatabase(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getServiceNameOvhConfig(java.lang.String serviceName, boolean historical, java.lang.String path) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ovhConfig";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameOvhConfig(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ovhConfig";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Dump getServiceNameDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dumps/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Dump.class);
	}

	public java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String language, java.lang.String command, java.lang.String serviceName, java.lang.String email, java.lang.String status, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("frequency", frequency);
		dataMap.put("language", language);
		dataMap.put("command", command);
		dataMap.put("email", email);
		dataMap.put("status", status);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String language, java.lang.String command, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("frequency", frequency);
		dataMap.put("language", language);
		dataMap.put("command", command);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameAttachedDomain(java.lang.String serviceName, java.lang.String domain, java.lang.String path) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/attachedDomain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameAttachedDomain(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/attachedDomain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putServiceNameAttachedDomainDomain(net.zyuiop.ovhapi.api.objects.hosting.web.AttachedDomain param0, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/attachedDomain/" + domain + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameAttachedDomainDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/attachedDomain/" + domain + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomain(java.lang.String domain, java.lang.String path, java.lang.String serviceName, java.lang.String cdn, java.lang.String ownLog, boolean ssl, java.lang.String firewall) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/attachedDomain";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("path", path);
		dataMap.put("cdn", cdn);
		dataMap.put("ownLog", ownLog);
		dataMap.put("ssl", ssl);
		dataMap.put("firewall", firewall);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomain(java.lang.String domain, java.lang.String path, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/attachedDomain";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("path", path);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabase(java.lang.String capabilitie, java.lang.String user, java.lang.String type, java.lang.String serviceName, long quota, java.lang.String password, java.lang.String version) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("capabilitie", capabilitie);
		dataMap.put("user", user);
		dataMap.put("type", type);
		dataMap.put("quota", quota);
		dataMap.put("password", password);
		dataMap.put("version", version);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabase(java.lang.String capabilitie, java.lang.String user, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("capabilitie", capabilitie);
		dataMap.put("user", user);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUser(java.lang.String password, java.lang.String home, java.lang.String login, java.lang.String serviceName, java.lang.String sshState, java.lang.String iisRemoteRights, java.lang.String webDavRights) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		dataMap.put("home", home);
		dataMap.put("login", login);
		dataMap.put("sshState", sshState);
		dataMap.put("iisRemoteRights", iisRemoteRights);
		dataMap.put("webDavRights", webDavRights);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUser(java.lang.String password, java.lang.String home, java.lang.String login, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		dataMap.put("home", home);
		dataMap.put("login", login);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Module getServiceNameModuleId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/module/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Module.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Dump getServiceNameDatabaseNameDumpId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dump/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Dump.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequest(java.lang.String action, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/request";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("action", action);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDump(java.lang.String date, java.lang.String serviceName, java.lang.String name, boolean sendEmail) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dump";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("date", date);
		dataMap.put("sendEmail", sendEmail);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDump(java.lang.String date, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dump";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("date", date);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String name, boolean sendEmail, boolean flushDatabase) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/import";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("documentId", documentId);
		dataMap.put("sendEmail", sendEmail);
		dataMap.put("flushDatabase", flushDatabase);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/import";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("documentId", documentId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public long[] getServiceNameDatabaseNameDumps(java.lang.String serviceName, java.lang.String name, java.util.Date creationDate, java.lang.String type, java.util.Date deletionDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dumps";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameDatabaseNameDumps(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dumps";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRestore(java.lang.String date, java.lang.String serviceName, java.lang.String name, boolean sendEmail) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/restore";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("date", date);
		dataMap.put("sendEmail", sendEmail);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRestore(java.lang.String date, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/restore";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("date", date);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigRefresh(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ovhConfigRefresh";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Email getServiceNameEmail(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/email";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Email.class);
	}

	public long[] getServiceNameCron(java.lang.String serviceName, java.lang.String email, java.lang.String language, java.lang.String description, java.lang.String command) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameCron(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomainDomainPurgeCache(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/attachedDomain/" + domain + "/purgeCache";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public java.lang.String getServiceNameUserLogs(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogs";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUserLogs(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogs";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Indy getServiceNameIndyLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/indy/" + login + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Indy.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdRollback(long rollbackId, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ovhConfig/" + id + "/rollback";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("rollbackId", rollbackId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameModuleId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/module/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModuleIdChangePassword(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/module/" + id + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/moduleList/$id
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.database.AvailableVersionStruct getServiceNameDatabaseAvailableVersion(java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/databaseAvailableVersion";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.database.AvailableVersionStruct.class);
	}

	public java.lang.String getServiceNameFreedom(java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/freedom";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameFreedom(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/freedom";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameIndy(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/indy";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameIndy(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/indy";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Cron getServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Cron.class);
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

	public java.lang.String getServiceNameToken(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/token";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRequest(java.lang.String action, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/request";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("action", action);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public java.lang.String getAttachedDomain(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/attachedDomain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
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

	public void putServiceNameUserLogsLogin(net.zyuiop.ovhapi.api.objects.hosting.web.UserLogs param0, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogs/" + login + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putServiceNameCronId(net.zyuiop.ovhapi.api.objects.hosting.web.Cron param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cron/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModule(long moduleId, java.lang.String serviceName, java.lang.String domain, java.lang.String language, java.lang.String adminName, java.lang.String adminPassword, net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType dependencies, java.lang.String path) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/module";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("moduleId", moduleId);
		dataMap.put("domain", domain);
		dataMap.put("language", language);
		dataMap.put("adminName", adminName);
		dataMap.put("adminPassword", adminPassword);
		dataMap.put("dependencies", dependencies);
		dataMap.put("path", path);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModule(long moduleId, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/module";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("moduleId", moduleId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/tasks/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public java.lang.String getHostingWeb() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//hosting/web";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameUserLogs(java.lang.String password, java.lang.String description, java.lang.String login, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogs";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		dataMap.put("description", description);
		dataMap.put("login", login);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.mail.VolumeHistory getServiceNameEmailVolumes(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/email/volumes";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.mail.VolumeHistory.class);
	}

	public java.lang.String postServiceNameUserLogsLoginChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogs/" + login + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUserLogsToken(java.lang.String serviceName, boolean remoteCheck, java.lang.String attachedDomain, long ttl) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogsToken";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUserLogsToken(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/userLogsToken";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putServiceNameEmail(net.zyuiop.ovhapi.api.objects.hosting.web.Email param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/email";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNameCronAvailableLanguage(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cronAvailableLanguage";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hosting/web/$serviceName/databaseCreationCapabilities
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.hosting.web.BoostHistory getServiceNameBoostHistoryDate(java.lang.String serviceName, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/boostHistory/" + date + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.BoostHistory.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/database/" + name + "/dumps/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.Task.class);
	}

	public java.lang.String getServiceNameUser(java.lang.String serviceName, java.lang.String home, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.User getServiceNameUserLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + login + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.hosting.web.User.class);
	}

}
