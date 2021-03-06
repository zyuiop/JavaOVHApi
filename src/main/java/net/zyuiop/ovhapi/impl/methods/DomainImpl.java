package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Domain;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class DomainImpl implements Domain { 

	private final OVHRawCalls client;

	public DomainImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String[] getServiceNameGlueRecord(java.lang.String serviceName, java.lang.String host) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/glueRecord";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "host=" + host;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameGlueRecord(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/glueRecord";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] postServiceNameOwo(java.lang.String fields, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/owo";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("fields", fields);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public long[] getDataAfnicAssociationInformation() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/afnicAssociationInformation";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Domain getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Domain.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Dnssec getZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dnssec";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Dnssec.class);
	}

	public void postZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dnssec";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postZoneZoneNameRefresh(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/refresh";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getDomain(java.lang.String whoisOwner) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/domain";
		String __data = "?";
		__data += "whoisOwner=" + whoisOwner;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomain() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/domain";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String postZoneZoneNameTerminate(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] postZoneZoneNameChangeContact(java.lang.String zoneName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("contactAdmin", contactAdmin);
		__dataMap.put("contactTech", contactTech);
		__dataMap.put("contactBilling", contactBilling);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postZoneZoneNameChangeContact(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getZoneZoneNameTask(java.lang.String zoneName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getZoneZoneNameTask(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postZoneZoneNameTaskIdAccelerate(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task/" + id + "/accelerate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Owo getServiceNameOwoField(java.lang.String serviceName, java.lang.String field) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/owo/" + field + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "field=" + field;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Owo.class);
	}

	public void postZoneZoneNameTaskIdRelaunch(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task/" + id + "/relaunch";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameNameServer(net.zyuiop.ovhapi.api.objects.domain.DomainNs nameServer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/nameServer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("nameServer", nameServer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public java.lang.String getServiceNameAuthInfo(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/authInfo";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DnssecKey getServiceNameDsRecordId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/dsRecord/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.DnssecKey.class);
	}

	public void deleteZoneZoneNameRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/record/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord postZoneZoneNameDynHostRecord(java.lang.String ip, java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/record";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		__dataMap.put("subDomain", subDomain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord postZoneZoneNameDynHostRecord(java.lang.String ip, java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/record";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord.class);
	}

	public long[] getZoneZoneNameDynHostRecord(java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/record";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "subDomain=" + subDomain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getZoneZoneNameDynHostRecord(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/record";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/changeContact";
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
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteZoneZoneNameDynHostLoginLogin(java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login/" + login + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin postZoneZoneNameDynHostLogin(java.lang.String password, java.lang.String loginSuffix, java.lang.String subDomain, java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("loginSuffix", loginSuffix);
		__dataMap.put("subDomain", subDomain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.Smd postDataSmd(java.lang.String data) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/smd";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("data", data);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.Smd.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Soa getZoneZoneNameSoa(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/soa";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Soa.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task deleteServiceNameNameServerId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/nameServer/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Task getZoneZoneNameTaskId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task/" + id + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Task.class);
	}

	public void putZoneZoneNameSoa(net.zyuiop.ovhapi.api.objects.domain.zone.Soa param0, java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/soa";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postServiceNameTaskIdAccelerate(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/task/" + id + "/accelerate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getZoneZoneNameServiceInfos(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/serviceInfos";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Redirection postZoneZoneNameRedirection(java.lang.String target, java.lang.String type, java.lang.String zoneName, java.lang.String keywords, java.lang.String title, java.lang.String subDomain, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/redirection";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("target", target);
		__dataMap.put("type", type);
		__dataMap.put("keywords", keywords);
		__dataMap.put("title", title);
		__dataMap.put("subDomain", subDomain);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Redirection.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Redirection postZoneZoneNameRedirection(java.lang.String target, java.lang.String type, java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/redirection";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("target", target);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Redirection.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin getZoneZoneNameDynHostLoginLogin(java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login/" + login + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin.class);
	}

	public net.zyuiop.ovhapi.api.objects.zone.Status getZoneZoneNameStatus(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/status";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.zone.Status.class);
	}

	public void deleteDataSmdSmdId(long smdId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/smd/" + smdId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getZone() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Record postZoneZoneNameRecord(java.lang.String target, java.lang.String fieldType, java.lang.String zoneName, long ttl, java.lang.String subDomain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/record";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("target", target);
		__dataMap.put("fieldType", fieldType);
		__dataMap.put("ttl", ttl);
		__dataMap.put("subDomain", subDomain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Record.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Record postZoneZoneNameRecord(java.lang.String target, java.lang.String fieldType, java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/record";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("target", target);
		__dataMap.put("fieldType", fieldType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Record.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameGlueRecord(java.lang.String ips, java.lang.String host, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/glueRecord";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ips", ips);
		__dataMap.put("host", host);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.ProContact postDataProContact(java.lang.String jobDescription, java.lang.String authority, java.lang.String authorityWebsite, java.lang.String licenseNumber, long contactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/proContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("jobDescription", jobDescription);
		__dataMap.put("authority", authority);
		__dataMap.put("authorityWebsite", authorityWebsite);
		__dataMap.put("licenseNumber", licenseNumber);
		__dataMap.put("contactId", contactId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.ProContact.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.ProContact postDataProContact(java.lang.String jobDescription, java.lang.String authority, java.lang.String authorityWebsite, java.lang.String licenseNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/proContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("jobDescription", jobDescription);
		__dataMap.put("authority", authority);
		__dataMap.put("authorityWebsite", authorityWebsite);
		__dataMap.put("licenseNumber", licenseNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.ProContact.class);
	}

	public long[] getServiceNameNameServer(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/nameServer";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getZoneZoneNameExport(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/export";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postServiceNameActivateZone(java.lang.String serviceName, boolean minimized) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/activateZone";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("minimized", minimized);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postServiceNameActivateZone(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/activateZone";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getZoneZoneNameRecord(java.lang.String zoneName, java.lang.String fieldType, java.lang.String subDomain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/record";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "fieldType=" + fieldType;
		__data += "subDomain=" + subDomain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getZoneZoneNameRecord(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/record";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameDsRecord(net.zyuiop.ovhapi.api.objects.dnssec.Key keys, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/dsRecord";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("keys", keys);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.GlueRecord getServiceNameGlueRecordHost(java.lang.String serviceName, java.lang.String host) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/glueRecord/" + host + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "host=" + host;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.GlueRecord.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact getDataAfnicCorporationTrademarkInformationAfnicCorporationTrademarkId(long afnicCorporationTrademarkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/afnicCorporationTrademarkInformation/" + afnicCorporationTrademarkId + "";
		String __data = "?";
		__data += "afnicCorporationTrademarkId=" + afnicCorporationTrademarkId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameUkOutgoingTransfer(java.lang.String tag, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/ukOutgoingTransfer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("tag", tag);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public void putZoneZoneNameDynHostLoginLogin(net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin param0, java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login/" + login + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getZoneZoneNameRedirection(java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/redirection";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "subDomain=" + subDomain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getZoneZoneNameRedirection(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/redirection";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.ProContact getDataProContactProContactId(long proContactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/proContact/" + proContactId + "";
		String __data = "?";
		__data += "proContactId=" + proContactId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.ProContact.class);
	}

	public void deleteServiceNameOwoField(java.lang.String serviceName, java.lang.String field) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/owo/" + field + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postZoneZoneNameReset(java.lang.String zoneName, boolean minimized) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/reset";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("minimized", minimized);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postZoneZoneNameReset(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/reset";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameOwo(java.lang.String serviceName, java.lang.String field) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/owo";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "field=" + field;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameOwo(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/owo";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putZoneZoneNameDynHostRecordId(net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord param0, java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/record/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.Smd putDataSmdSmdId(long smdId, java.lang.String data) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/smd/" + smdId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("data", data);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.Smd.class);
	}

	public void putZoneZoneNameRedirectionId(net.zyuiop.ovhapi.api.objects.domain.zone.Redirection param0, java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/redirection/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact getDataAfnicAssociationInformationAssociationInformationId(long associationInformationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/afnicAssociationInformation/" + associationInformationId + "";
		String __data = "?";
		__data += "associationInformationId=" + associationInformationId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact.class);
	}

	public java.lang.String[] getZoneZoneNameDynHostLogin(java.lang.String zoneName, java.lang.String subDomain, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "subDomain=" + subDomain;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getZoneZoneNameDynHostLogin(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Zone getZoneZoneName(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Zone.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Task postZoneZoneNameImport(java.lang.String zoneFile, java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/import";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zoneFile", zoneFile);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Task.class);
	}

	public void deleteZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dnssec";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task deleteServiceNameGlueRecordHost(java.lang.String serviceName, java.lang.String host) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/glueRecord/" + host + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.CurrentNameServer getServiceNameNameServerId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/nameServer/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.CurrentNameServer.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Redirection getZoneZoneNameRedirectionId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/redirection/" + id + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Redirection.class);
	}

	public void postServiceNameTaskIdRelaunch(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/task/" + id + "/relaunch";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameGlueRecordHostUpdate(java.lang.String ips, java.lang.String serviceName, java.lang.String host) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/glueRecord/" + host + "/update";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ips", ips);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public long[] getDataProContact() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/proContact";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDataSmd(java.lang.String protectedLabelsLabel) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/smd";
		String __data = "?";
		__data += "protectedLabels.label=" + protectedLabelsLabel;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDataSmd() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/smd";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.Smd getDataSmdSmdId(long smdId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/smd/" + smdId + "";
		String __data = "?";
		__data += "smdId=" + smdId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.Smd.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.domain.Domain param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putZoneZoneNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putZoneZoneNameRecordId(net.zyuiop.ovhapi.api.objects.domain.zone.Record param0, java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/record/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord getZoneZoneNameDynHostRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/record/" + id + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord.class);
	}

	public java.lang.String[] getDataExtension(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/extension";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public long[] getDataAfnicCorporationTrademarkInformation() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/afnicCorporationTrademarkInformation";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDsRecord(java.lang.String serviceName, long flags, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/dsRecord";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "flags=" + flags;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDsRecord(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/dsRecord";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postZoneZoneNameDynHostLoginLoginChangePassword(java.lang.String password, java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login/" + login + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Record getZoneZoneNameRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/record/" + id + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Record.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameNameServersUpdate(net.zyuiop.ovhapi.api.objects.domain.DomainNs nameServers, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/nameServers/update";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("nameServers", nameServers);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact postDataAfnicAssociationInformation(java.util.Date declarationDate, java.util.Date publicationDate, java.lang.String publicationNumber, java.lang.String publicationPageNumber, long contactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/afnicAssociationInformation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("declarationDate", declarationDate);
		__dataMap.put("publicationDate", publicationDate);
		__dataMap.put("publicationNumber", publicationNumber);
		__dataMap.put("publicationPageNumber", publicationPageNumber);
		__dataMap.put("contactId", contactId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact.class);
	}

	public void deleteZoneZoneNameDynHostRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/record/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteZoneZoneNameRedirectionId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/redirection/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact postDataAfnicCorporationTrademarkInformation(java.lang.String inpiNumber, java.lang.String inpiTrademarkOwner, long contactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/afnicCorporationTrademarkInformation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("inpiNumber", inpiNumber);
		__dataMap.put("inpiTrademarkOwner", inpiTrademarkOwner);
		__dataMap.put("contactId", contactId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact.class);
	}

	public void postZoneZoneNameTaskIdCancel(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task/" + id + "/cancel";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task getServiceNameTaskId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/task/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postServiceNameTaskIdCancel(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/task/" + id + "/cancel";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

}
