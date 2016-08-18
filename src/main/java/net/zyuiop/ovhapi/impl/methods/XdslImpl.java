package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Xdsl;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class XdslImpl implements Xdsl { 

	private final OVHRawCalls client;

	public XdslImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/ips";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/modem/lan/$lanName/dhcp/$dhcpName/DHCPStaticAddresses
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/modem/lan/$lanName/dhcp/$dhcpName/DHCPStaticAddresses
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/modem/lan/$lanName/dhcp/$dhcpName/DHCPStaticAddresses/$MACAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/modem/lan/$lanName/dhcp/$dhcpName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getXdsl() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/xdsl";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/


	public void postServiceNameRequestPPPLoginMail(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/requestPPPLoginMail";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/modem
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameLines(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/lines";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/monitoringNotifications/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/lines/$number/dslamPort
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/lines/$number/statistics
	* Message : Missing identifier.
	*/


	public java.lang.String[] getSpareBrands() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/brands";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameModemLanLanNameDhcp(java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "lanName=" + lanName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameModemPortMappings(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/portMappings";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postSpareSpareReplace(java.lang.String domain, java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "/replace";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/modem/reboot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/spare/$spare
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameModemWifi(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/wifi";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getIncidents(java.util.Date creationDate, java.util.Date endDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/incidents";
		String __data = "?";
		__data += "creationDate=" + creationDate;
		__data += "endDate=" + endDate;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), long[].class);
	}

	public long[] getIncidents() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/incidents";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), long[].class);
	}

	public java.lang.String[] getServiceNameModemConnectedDevices(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/connectedDevices";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/tasks/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /xdsl/$serviceName/modem/lan/$lanName/dhcp/$dhcpName/DHCPStaticAddresses/$MACAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/monitoringNotifications/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/monitoringNotifications
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/monitoringNotifications
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/lines/$number
	* Message : Missing identifier.
	*/


	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/changeContact";
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
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/lines/$number/dslamPort/changeProfile
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/modem/connectedDevices/$macAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/statistics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/diagnostic
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/ipv6
	* Message : Missing identifier.
	*/


	public void deleteSpareSpare(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameModemLan(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/eligibility/streets
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/totalDeconsolidationTerms
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "lanName=" + lanName;
		__data += "dhcpName=" + dhcpName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/modem/refreshConnectedDevices
	* Message : Missing identifier.
	*/


	public long[] getServiceNameMonitoringNotifications(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/monitoringNotifications";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/orderFollowup
	* Message : Missing identifier.
	*/


	public void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/cancelResiliation";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/addressMove/extraIpRangeMove
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/modem/reset
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/diagnostic
	* Message : Missing identifier.
	*/


	public void deleteServiceNameMonitoringNotificationsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/monitoringNotifications/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/lines/$number/dslamPort/reset
	* Message : Missing identifier.
	*/


	public boolean getServiceNameCanCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/canCancelResiliation";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/modem/lan/$lanName/dhcp/$dhcpName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/modem/portMappings/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/resiliationFollowup
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/resiliationTerms
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/resiliationTerms
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/pendingAction
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/requestTotalDeconsolidation
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/requestTotalDeconsolidation
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/ips/$ip
	* Message : Missing identifier.
	*/


	public java.lang.String[] getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "/compatibleReplacement";
		String __data = "?";
		__data += "spare=" + spare;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /xdsl/$serviceName/modem/portMappings/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/incident
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/modem/wifi/$wifiName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/modem/lan/$lanName/dhcp/$dhcpName/DHCPStaticAddresses/$MACAddress
	* Message : Missing identifier.
	*/


	public void postSpareSpareReturnMerchandise(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "/returnMerchandise";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/lines/$number/dslamPort/logs
	* Message : Missing identifier.
	*/


	public void postServiceNameTasksIdArchive(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/tasks/" + id + "/archive";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteServiceNameIpsIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/ips/" + ip + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/radiusConnectionLogs
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/modem/lan/$lanName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/modem/portMappings
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/modem/portMappings
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/availableLns
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/resiliate
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/resiliate
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/changeLns
	* Message : Missing identifier.
	*/


	public java.lang.String[] getSpare() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/modem/wifi/$wifiName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/modem/lan/$lanName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/spare/$spare/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /xdsl/$serviceName/ips
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/spare/$spare/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/rma/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/rma/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /xdsl/$serviceName/modem/portMappings/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/modem
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/addressMove/extraIpRange
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameRma(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/rma";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/lines/$number/dslamPort/availableProfiles
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/incidents/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/eligibility/cities
	* Message : Missing identifier.
	*/


}
