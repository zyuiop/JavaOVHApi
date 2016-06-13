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

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail postServiceNameResiliate(net.zyuiop.ovhapi.api.objects.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String serviceName, java.util.Date resiliationDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/resiliate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("resiliationSurvey", resiliationSurvey);
		dataMap.put("resiliationDate", resiliationDate);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail postServiceNameResiliate(net.zyuiop.ovhapi.api.objects.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/resiliate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("resiliationSurvey", resiliationSurvey);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail.class);
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

	public java.lang.String getServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms getServiceNameResiliationTerms(java.lang.String serviceName, java.util.Date resiliationDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/resiliationTerms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms getServiceNameResiliationTerms(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/resiliationTerms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms.class);
	}

	public java.lang.String getServiceNameModemLan(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemRefreshConnectedDevices(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/refreshConnectedDevices";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail getServiceNameResiliationFollowup(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/resiliationFollowup";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail.class);
	}

	public void putServiceNameMonitoringNotificationsId(net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/monitoringNotifications/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.PendingAction getServiceNamePendingAction(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/pendingAction";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.PendingAction.class);
	}

	public java.lang.String getSpare() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putSpareSpareServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Modem getServiceNameModem(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Modem.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnostic getServiceNameDiagnostic(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/diagnostic";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnostic.class);
	}

	public void putServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress param0, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses/" + MACAddress + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.WLAN getServiceNameModemWifiWifiName(java.lang.String serviceName, java.lang.String wifiName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/wifi/" + wifiName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.WLAN.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress postServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String MACAddress, java.lang.String IPAddress, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("MACAddress", MACAddress);
		dataMap.put("IPAddress", IPAddress);
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress postServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String MACAddress, java.lang.String IPAddress, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("MACAddress", MACAddress);
		dataMap.put("IPAddress", IPAddress);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DslamPort getServiceNameLinesNumberDslamPort(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/lines/" + number + "/dslamPort";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.DslamPort.class);
	}

	public void postSpareSpareReplace(java.lang.String domain, java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/replace";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Rma getServiceNameRmaId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/rma/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Rma.class);
	}

	public java.lang.String getXdsl() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//xdsl";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getServiceNameMonitoringNotifications(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/monitoringNotifications";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getSpareBrands() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/brands";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/addressMove/extraIpRange
	* Message : Missing identifier.
	*/


	public void deleteSpareSpare(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile getServiceNameLinesNumberDslamPortAvailableProfiles(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/lines/" + number + "/dslamPort/availableProfiles";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile.class);
	}

	public void putServiceNameModemPortMappingsName(net.zyuiop.ovhapi.api.objects.xdsl.PortMapping param0, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/portMappings/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.IP getServiceNameIpsIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips/" + ip + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.IP.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Lns getServiceNameAvailableLns(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/availableLns";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Lns.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameAddressMoveExtraIpRangeMove(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/addressMove/extraIpRangeMove";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public boolean getServiceNameCanCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/canCancelResiliation";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), boolean.class);
	}

	public java.lang.String getServiceNameModemPortMappings(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/portMappings";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Incident getIncidentsId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/incidents/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.xdsl.Incident.class);
	}

	public java.lang.String getServiceNameLines(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/lines";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/lines/$number/statistics
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameLinesNumberDslamPortChangeProfile(long dslamProfileId, java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/lines/" + number + "/dslamPort/changeProfile";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("dslamProfileId", dslamProfileId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemReset(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/reset";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameChangeLns(java.lang.String lnsName, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/changeLns";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("lnsName", lnsName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Access getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Access.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameIpv6(boolean enabled, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ipv6";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("enabled", enabled);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public java.lang.String getServiceNameModemWifi(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/wifi";
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

	public long[] getIncidents(java.util.Date creationDate, java.util.Date endDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/incidents";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), long[].class);
	}

	public long[] getIncidents() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/incidents";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), long[].class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.xdsl.Access param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putServiceNameModemLanLanName(net.zyuiop.ovhapi.api.objects.xdsl.LAN param0, java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameLinesNumberDslamPortReset(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/lines/" + number + "/dslamPort/reset";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameRequestTotalDeconsolidation(java.lang.String serviceName, java.lang.String rio) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/requestTotalDeconsolidation";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("rio", rio);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameRequestTotalDeconsolidation(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/requestTotalDeconsolidation";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public void putServiceNameModemLanLanNameDhcpDhcpName(net.zyuiop.ovhapi.api.objects.xdsl.DHCP param0, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DslamPortLog getServiceNameLinesNumberDslamPortLogs(long limit, java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/lines/" + number + "/dslamPort/logs";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.DslamPortLog.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameDiagnostic(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/diagnostic";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public java.lang.String getServiceNameRma(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/rma";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameModemLanLanNameDhcp(java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification getServiceNameMonitoringNotificationsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/monitoringNotifications/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification postServiceNameMonitoringNotifications(java.lang.String frequency, java.lang.String type, java.lang.String serviceName, java.lang.String smsAccount, java.lang.String email, long downThreshold, boolean allowIncident, java.lang.String phone) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/monitoringNotifications";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("frequency", frequency);
		dataMap.put("type", type);
		dataMap.put("smsAccount", smsAccount);
		dataMap.put("email", email);
		dataMap.put("downThreshold", downThreshold);
		dataMap.put("allowIncident", allowIncident);
		dataMap.put("phone", phone);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification postServiceNameMonitoringNotifications(java.lang.String frequency, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/monitoringNotifications";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("frequency", frequency);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DeconsolidationTerms getServiceNameTotalDeconsolidationTerms(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/totalDeconsolidationTerms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.DeconsolidationTerms.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City getEligibilityCities(java.lang.String zipCode) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/eligibility/cities";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress getServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses/" + MACAddress + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress.class);
	}

	public void postServiceNameTasksIdArchive(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/tasks/" + id + "/archive";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putServiceNameRmaId(net.zyuiop.ovhapi.api.objects.telephony.Rma param0, java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/rma/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/compatibleReplacement";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DHCP getServiceNameModemLanLanNameDhcpDhcpName(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.DHCP.class);
	}

	public net.zyuiop.ovhapi.api.objects.spare.xdsl.XdslSpare getSpareSpare(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.spare.xdsl.XdslSpare.class);
	}

	public void postServiceNameRequestPPPLoginMail(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/requestPPPLoginMail";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
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

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemReboot(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/reboot";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.PortMapping getServiceNameModemPortMappingsName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/portMappings/" + name + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.PortMapping.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/orderFollowup
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/tasks/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Incident getServiceNameIncident(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/incident";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Incident.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getSpareSpareServiceInfos(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/statistics
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.xdsl.ConnectedDevice getServiceNameModemConnectedDevicesMacAddress(java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/connectedDevices/" + macAddress + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.ConnectedDevice.class);
	}

	public void deleteServiceNameIpsIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips/" + ip + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Line getServiceNameLinesNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/lines/" + number + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Line.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task deleteServiceNameModemPortMappingsName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/portMappings/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public void postSpareSpareReturnMerchandise(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/returnMerchandise";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
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

	public net.zyuiop.ovhapi.api.objects.xdsl.RadiusConnectionLog getServiceNameRadiusConnectionLogs(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/radiusConnectionLogs";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.RadiusConnectionLog.class);
	}

	public void putServiceNameModemWifiWifiName(net.zyuiop.ovhapi.api.objects.xdsl.WLAN param0, java.lang.String serviceName, java.lang.String wifiName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/wifi/" + wifiName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public java.lang.String getServiceNameModemConnectedDevices(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/connectedDevices";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cancelResiliation";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street getEligibilityStreets(java.lang.String partialName, java.lang.String inseeCode) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/eligibility/streets";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task deleteServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses/" + MACAddress + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public void deleteServiceNameMonitoringNotificationsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/monitoringNotifications/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putServiceNameModem(net.zyuiop.ovhapi.api.objects.xdsl.Modem param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.PortMapping postServiceNameModemPortMappings(java.lang.String protocol, java.lang.String name, long externalPortStart, java.lang.String internalClient, long internalPort, java.lang.String serviceName, java.lang.String description, long externalPortEnd, java.lang.String allowedRemoteIp) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/portMappings";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("protocol", protocol);
		dataMap.put("name", name);
		dataMap.put("externalPortStart", externalPortStart);
		dataMap.put("internalClient", internalClient);
		dataMap.put("internalPort", internalPort);
		dataMap.put("description", description);
		dataMap.put("externalPortEnd", externalPortEnd);
		dataMap.put("allowedRemoteIp", allowedRemoteIp);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.PortMapping.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.PortMapping postServiceNameModemPortMappings(java.lang.String protocol, java.lang.String name, long externalPortStart, java.lang.String internalClient, long internalPort, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/portMappings";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("protocol", protocol);
		dataMap.put("name", name);
		dataMap.put("externalPortStart", externalPortStart);
		dataMap.put("internalClient", internalClient);
		dataMap.put("internalPort", internalPort);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.PortMapping.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.LAN getServiceNameModemLanLanName(java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/modem/lan/" + lanName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.xdsl.LAN.class);
	}

}
