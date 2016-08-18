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


	/*
	* Method creation failed.
	* Involved method : PUT > /domain/zone/$zoneName/redirection/$id
	* Message : Missing identifier.
	*/


	public void deleteZoneZoneNameRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/record/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postZoneZoneNameTaskIdAccelerate(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task/" + id + "/accelerate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/dnssec
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/zone/$zoneName/record
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/zone/$zoneName/record
	* Message : Missing identifier.
	*/


	public java.lang.String[] postServiceNameOwo(java.lang.String fields, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/owo";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("fields", fields);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postZoneZoneNameRefresh(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/refresh";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /domain/data/smd
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/dynHost/record/$id
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameAuthInfo(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/authInfo";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /domain/zone/$zoneName/import
	* Message : Missing identifier.
	*/


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

	public void deleteZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dnssec";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /domain/$serviceName/owo/$field
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/$serviceName/nameServer/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/data/afnicAssociationInformation/$associationInformationId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /domain/data/smd/$smdId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/zone/$zoneName/redirection
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/zone/$zoneName/redirection
	* Message : Missing identifier.
	*/


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

	public void postZoneZoneNameTaskIdCancel(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task/" + id + "/cancel";
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


	/*
	* Method creation failed.
	* Involved method : POST > /domain/data/proContact
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/data/proContact
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/task/$id
	* Message : Missing identifier.
	*/


	public void postZoneZoneNameTaskIdRelaunch(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/task/" + id + "/relaunch";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteDataSmdSmdId(long smdId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/smd/" + smdId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
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

	public void deleteZoneZoneNameRedirectionId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/redirection/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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


	/*
	* Method creation failed.
	* Involved method : GET > /domain/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/zone/$zoneName/dynHost/login
	* Message : Missing identifier.
	*/


	public long[] getDataAfnicCorporationTrademarkInformation() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/afnicCorporationTrademarkInformation";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /domain/$serviceName/ukOutgoingTransfer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /domain/$serviceName/glueRecord/$host
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /domain/$serviceName
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /domain/$serviceName/nameServers/update
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/$serviceName/dsRecord
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/data/afnicCorporationTrademarkInformation
	* Message : Missing identifier.
	*/


	public void deleteZoneZoneNameDynHostLoginLogin(java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login/" + login + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
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


	/*
	* Method creation failed.
	* Involved method : PUT > /domain/zone/$zoneName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /domain/zone/$zoneName/soa
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/$serviceName/glueRecord/$host
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/data/afnicAssociationInformation
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/zone/$zoneName/dynHost/record
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/zone/$zoneName/dynHost/record
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /domain/zone/$zoneName/dynHost/record/$id
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /domain/$serviceName/glueRecord/$host/update
	* Message : Missing identifier.
	*/


	public void deleteServiceNameOwoField(java.lang.String serviceName, java.lang.String field) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/owo/" + field + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String postZoneZoneNameTerminate(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/record/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getZone() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /domain/$serviceName/task/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDataExtension(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/extension";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public long[] getDataAfnicAssociationInformation() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/afnicAssociationInformation";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /domain/$serviceName/dsRecord/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /domain/$serviceName/glueRecord
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/dynHost/login/$login
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/status
	* Message : Missing identifier.
	*/


	public long[] getDataProContact() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/data/proContact";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postServiceNameTaskIdRelaunch(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/task/" + id + "/relaunch";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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

	public void postZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dnssec";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /domain/data/afnicCorporationTrademarkInformation/$afnicCorporationTrademarkId
	* Message : Missing identifier.
	*/


	public long[] getServiceNameNameServer(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/nameServer";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
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


	/*
	* Method creation failed.
	* Involved method : DELETE > /domain/$serviceName/nameServer/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/soa
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/data/smd/$smdId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /domain/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /domain/zone/$zoneName/record/$id
	* Message : Missing identifier.
	*/


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

	public java.lang.String getZoneZoneNameExport(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/export";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
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

	public void deleteZoneZoneNameDynHostRecordId(java.lang.String zoneName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/record/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /domain/zone/$zoneName/redirection/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/data/proContact/$proContactId
	* Message : Missing identifier.
	*/


	public void postServiceNameTaskIdAccelerate(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/" + serviceName + "/task/" + id + "/accelerate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /domain/$serviceName/nameServer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /domain/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /domain/zone/$zoneName/dynHost/login/$login
	* Message : Missing identifier.
	*/


	public void postZoneZoneNameDynHostLoginLoginChangePassword(java.lang.String password, java.lang.String zoneName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dynHost/login/" + login + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

}
