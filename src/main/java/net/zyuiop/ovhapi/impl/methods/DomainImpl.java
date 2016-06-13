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

	public long[] getServiceNameNameServer(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/nameServer";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void postZoneZoneNameTaskIdRelaunch(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/task/" + id + "/relaunch";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postZoneZoneNameDynHostLoginLoginChangePassword(java.lang.String password, java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/login/" + login + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Record postZoneZoneNameRecord(java.lang.String target, java.lang.String fieldType, java.lang.String zoneName, long ttl, java.lang.String subDomain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/record";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("target", target);
		dataMap.put("fieldType", fieldType);
		dataMap.put("ttl", ttl);
		dataMap.put("subDomain", subDomain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Record.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Record postZoneZoneNameRecord(java.lang.String target, java.lang.String fieldType, java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/record";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("target", target);
		dataMap.put("fieldType", fieldType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Record.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Redirection getZoneZoneNameRedirectionId(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/redirection/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Redirection.class);
	}

	public long[] getDataAfnicAssociationInformation() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/afnicAssociationInformation";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getServiceNameAuthInfo(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/authInfo";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getZone() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getDataAfnicCorporationTrademarkInformation() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/afnicCorporationTrademarkInformation";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putZoneZoneNameDynHostLoginLogin(net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin param0, java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/login/" + login + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact postDataAfnicAssociationInformation(java.util.Date declarationDate, java.util.Date publicationDate, java.lang.String publicationNumber, java.lang.String publicationPageNumber, long contactId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/afnicAssociationInformation";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("declarationDate", declarationDate);
		dataMap.put("publicationDate", publicationDate);
		dataMap.put("publicationNumber", publicationNumber);
		dataMap.put("publicationPageNumber", publicationPageNumber);
		dataMap.put("contactId", contactId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact.class);
	}

	public java.lang.String getDataExtension(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/extension";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

	public void postServiceNameTaskIdCancel(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + id + "/cancel";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postZoneZoneNameReset(java.lang.String zoneName, boolean minimized) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/reset";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("minimized", minimized);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postZoneZoneNameReset(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/reset";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Zone getZoneZoneName(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Zone.class);
	}

	public java.lang.String getZoneZoneNameDynHostLogin(java.lang.String zoneName, java.lang.String subDomain, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/login";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getZoneZoneNameDynHostLogin(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/login";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameDsRecord(net.zyuiop.ovhapi.api.objects.dnssec.Key keys, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dsRecord";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("keys", keys);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.Smd putDataSmdSmdId(long smdId, java.lang.String data) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/smd/" + smdId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("data", data);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.Smd.class);
	}

	public void deleteZoneZoneNameRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/record/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public void postServiceNameActivateZone(java.lang.String serviceName, boolean minimized) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/activateZone";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("minimized", minimized);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postServiceNameActivateZone(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/activateZone";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Dnssec getZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dnssec";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Dnssec.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Redirection postZoneZoneNameRedirection(java.lang.String target, java.lang.String type, java.lang.String zoneName, java.lang.String keywords, java.lang.String title, java.lang.String subDomain, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/redirection";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("target", target);
		dataMap.put("type", type);
		dataMap.put("keywords", keywords);
		dataMap.put("title", title);
		dataMap.put("subDomain", subDomain);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Redirection.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Redirection postZoneZoneNameRedirection(java.lang.String target, java.lang.String type, java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/redirection";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("target", target);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Redirection.class);
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

	public void postServiceNameTaskIdRelaunch(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + id + "/relaunch";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteZoneZoneNameRedirectionId(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/redirection/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord getZoneZoneNameDynHostRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/record/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord.class);
	}

	public long[] getDataSmd(java.lang.String protectedLabelsLabel) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/smd";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getDataSmd() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/smd";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin postZoneZoneNameDynHostLogin(java.lang.String password, java.lang.String loginSuffix, java.lang.String subDomain, java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/login";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		dataMap.put("loginSuffix", loginSuffix);
		dataMap.put("subDomain", subDomain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin.class);
	}

	public void deleteZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dnssec";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String postServiceNameOwo(java.lang.String fields, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/owo";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("fields", fields);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameGlueRecordHostUpdate(java.lang.String ips, java.lang.String serviceName, java.lang.String host) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/glueRecord/" + host + "/update";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ips", ips);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.ProContact postDataProContact(java.lang.String jobDescription, java.lang.String authority, java.lang.String authorityWebsite, java.lang.String licenseNumber, long contactId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/proContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("jobDescription", jobDescription);
		dataMap.put("authority", authority);
		dataMap.put("authorityWebsite", authorityWebsite);
		dataMap.put("licenseNumber", licenseNumber);
		dataMap.put("contactId", contactId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.ProContact.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.ProContact postDataProContact(java.lang.String jobDescription, java.lang.String authority, java.lang.String authorityWebsite, java.lang.String licenseNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/proContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("jobDescription", jobDescription);
		dataMap.put("authority", authority);
		dataMap.put("authorityWebsite", authorityWebsite);
		dataMap.put("licenseNumber", licenseNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.ProContact.class);
	}

	public long[] getServiceNameDsRecord(java.lang.String serviceName, long flags, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dsRecord";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameDsRecord(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dsRecord";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Soa getZoneZoneNameSoa(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/soa";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Soa.class);
	}

	public void deleteZoneZoneNameDynHostLoginLogin(java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/login/" + login + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putZoneZoneNameRedirectionId(net.zyuiop.ovhapi.api.objects.domain.zone.Redirection param0, java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/redirection/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNameOwo(java.lang.String serviceName, java.lang.String field) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/owo";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameOwo(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/owo";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getZoneZoneNameServiceInfos(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public long[] getZoneZoneNameRedirection(java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/redirection";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getZoneZoneNameRedirection(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/redirection";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact getDataAfnicAssociationInformationAssociationInformationId(long associationInformationId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/afnicAssociationInformation/" + associationInformationId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Record getZoneZoneNameRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/record/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Record.class);
	}

	public void putZoneZoneNameSoa(net.zyuiop.ovhapi.api.objects.domain.zone.Soa param0, java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/soa";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteDataSmdSmdId(long smdId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/smd/" + smdId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Owo getServiceNameOwoField(java.lang.String serviceName, java.lang.String field) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/owo/" + field + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Owo.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameNameServersUpdate(net.zyuiop.ovhapi.api.objects.domain.DomainNs nameServers, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/nameServers/update";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("nameServers", nameServers);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.CurrentNameServer getServiceNameNameServerId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/nameServer/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.CurrentNameServer.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact postDataAfnicCorporationTrademarkInformation(java.lang.String inpiNumber, java.lang.String inpiTrademarkOwner, long contactId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/afnicCorporationTrademarkInformation";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("inpiNumber", inpiNumber);
		dataMap.put("inpiTrademarkOwner", inpiTrademarkOwner);
		dataMap.put("contactId", contactId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin getZoneZoneNameDynHostLoginLogin(java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/login/" + login + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameNameServer(net.zyuiop.ovhapi.api.objects.domain.DomainNs nameServer, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/nameServer";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("nameServer", nameServer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Task getZoneZoneNameTaskId(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/task/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.GlueRecord getServiceNameGlueRecordHost(java.lang.String serviceName, java.lang.String host) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/glueRecord/" + host + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.GlueRecord.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.domain.Domain param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.Smd postDataSmd(java.lang.String data) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/smd";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("data", data);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.Smd.class);
	}

	public long[] getZoneZoneNameRecord(java.lang.String zoneName, java.lang.String fieldType, java.lang.String subDomain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/record";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getZoneZoneNameRecord(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/record";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task deleteServiceNameGlueRecordHost(java.lang.String serviceName, java.lang.String host) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/glueRecord/" + host + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameGlueRecord(java.lang.String ips, java.lang.String host, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/glueRecord";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ips", ips);
		dataMap.put("host", host);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.ProContact getDataProContactProContactId(long proContactId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/proContact/" + proContactId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.ProContact.class);
	}

	public java.lang.String getServiceNameGlueRecord(java.lang.String serviceName, java.lang.String host) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/glueRecord";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameGlueRecord(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/glueRecord";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putZoneZoneNameRecordId(net.zyuiop.ovhapi.api.objects.domain.zone.Record param0, java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/record/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DnssecKey getServiceNameDsRecordId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dsRecord/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.DnssecKey.class);
	}

	public java.lang.String getZoneZoneNameExport(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/export";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.zone.Status getZoneZoneNameStatus(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/status";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.zone.Status.class);
	}

	public java.lang.String getDomain(java.lang.String whoisOwner) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//domain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomain() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//domain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postZoneZoneNameTerminate(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/terminate";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task getServiceNameTaskId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public void putZoneZoneNameDynHostRecordId(net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord param0, java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/record/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.Task postZoneZoneNameImport(java.lang.String zoneFile, java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/import";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("zoneFile", zoneFile);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.Task.class);
	}

	public void postZoneZoneNameRefresh(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/refresh";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dnssec";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord postZoneZoneNameDynHostRecord(java.lang.String ip, java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/record";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ip", ip);
		dataMap.put("subDomain", subDomain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord postZoneZoneNameDynHostRecord(java.lang.String ip, java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/record";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameUkOutgoingTransfer(java.lang.String tag, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ukOutgoingTransfer";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("tag", tag);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public void deleteServiceNameOwoField(java.lang.String serviceName, java.lang.String field) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/owo/" + field + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Task deleteServiceNameNameServerId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/nameServer/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Task.class);
	}

	public void postZoneZoneNameTaskIdAccelerate(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/task/" + id + "/accelerate";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.Domain getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.Domain.class);
	}

	public void postServiceNameTaskIdAccelerate(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + id + "/accelerate";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putZoneZoneNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
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

	public long[] getZoneZoneNameDynHostRecord(java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/record";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getZoneZoneNameDynHostRecord(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/record";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getDataProContact() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/proContact";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void postZoneZoneNameTaskIdCancel(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/task/" + id + "/cancel";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteZoneZoneNameDynHostRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/dynHost/record/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact getDataAfnicCorporationTrademarkInformationAfnicCorporationTrademarkId(long afnicCorporationTrademarkId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/afnicCorporationTrademarkInformation/" + afnicCorporationTrademarkId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact.class);
	}

	public long[] getZoneZoneNameTask(java.lang.String zoneName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getZoneZoneNameTask(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] postZoneZoneNameChangeContact(java.lang.String zoneName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/changeContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("contactAdmin", contactAdmin);
		dataMap.put("contactTech", contactTech);
		dataMap.put("contactBilling", contactBilling);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] postZoneZoneNameChangeContact(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/zone/" + zoneName + "/changeContact";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.data.Smd getDataSmdSmdId(long smdId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/data/smd/" + smdId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.data.Smd.class);
	}

}
