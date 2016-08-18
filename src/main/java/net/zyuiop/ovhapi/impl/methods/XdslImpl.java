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

	public net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification postServiceNameMonitoringNotifications(java.lang.String frequency, java.lang.String type, java.lang.String serviceName, java.lang.String smsAccount, java.lang.String email, long downThreshold, boolean allowIncident, java.lang.String phone) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/monitoringNotifications";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("frequency", frequency);
		__dataMap.put("type", type);
		__dataMap.put("smsAccount", smsAccount);
		__dataMap.put("email", email);
		__dataMap.put("downThreshold", downThreshold);
		__dataMap.put("allowIncident", allowIncident);
		__dataMap.put("phone", phone);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification postServiceNameMonitoringNotifications(java.lang.String frequency, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/monitoringNotifications";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("frequency", frequency);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress postServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String MACAddress, java.lang.String IPAddress, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("MACAddress", MACAddress);
		__dataMap.put("IPAddress", IPAddress);
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress postServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String MACAddress, java.lang.String IPAddress, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("MACAddress", MACAddress);
		__dataMap.put("IPAddress", IPAddress);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress.class);
	}

	public void putServiceNameModemLanLanName(net.zyuiop.ovhapi.api.objects.xdsl.LAN param0, java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameDiagnostic(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/diagnostic";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public java.lang.String[] getServiceNameModemWifi(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/wifi";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemReset(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/reset";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/ips";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/cancelResiliation";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameChangeLns(java.lang.String lnsName, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/changeLns";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("lnsName", lnsName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street[] getEligibilityStreets(java.lang.String partialName, java.lang.String inseeCode) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/eligibility/streets";
		String __data = "?";
		__data += "partialName=" + partialName;
		__data += "inseeCode=" + inseeCode;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street[].class);
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

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameLinesNumberDslamPortReset(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/lines/" + number + "/dslamPort/reset";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification getServiceNameMonitoringNotificationsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/monitoringNotifications/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification.class);
	}

	public void putServiceNameModemLanLanNameDhcpDhcpName(net.zyuiop.ovhapi.api.objects.xdsl.DHCP param0, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameModemConnectedDevices(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/connectedDevices";
		String __data = "?";
		__data += "serviceName=" + serviceName;
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

	public void postServiceNameRequestPPPLoginMail(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/requestPPPLoginMail";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getSpareSpareServiceInfos(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "/serviceInfos";
		String __data = "?";
		__data += "spare=" + spare;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail postServiceNameResiliate(net.zyuiop.ovhapi.api.objects.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String serviceName, java.util.Date resiliationDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/resiliate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("resiliationSurvey", resiliationSurvey);
		__dataMap.put("resiliationDate", resiliationDate);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail postServiceNameResiliate(net.zyuiop.ovhapi.api.objects.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/resiliate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("resiliationSurvey", resiliationSurvey);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail.class);
	}

	public java.lang.String[] getServiceNameRma(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/rma";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameAddressMoveExtraIpRangeMove(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/addressMove/extraIpRangeMove";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public void deleteSpareSpare(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postServiceNameTasksIdArchive(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/tasks/" + id + "/archive";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getSpare() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameLines(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/lines";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemReboot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/reboot";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress getServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses/" + MACAddress + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "lanName=" + lanName;
		__data += "dhcpName=" + dhcpName;
		__data += "MACAddress=" + MACAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DeconsolidationTerms getServiceNameTotalDeconsolidationTerms(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/totalDeconsolidationTerms";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.DeconsolidationTerms.class);
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

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameRequestTotalDeconsolidation(java.lang.String serviceName, java.lang.String rio) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/requestTotalDeconsolidation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("rio", rio);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameRequestTotalDeconsolidation(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/requestTotalDeconsolidation";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public java.lang.String[] getXdsl() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/xdsl";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postSpareSpareReturnMerchandise(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "/returnMerchandise";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.RadiusConnectionLog[] getServiceNameRadiusConnectionLogs(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/radiusConnectionLogs";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.RadiusConnectionLog[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/statistics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/lines/$number/statistics
	* Message : Missing identifier.
	*/


	public void putServiceNameModemPortMappingsName(net.zyuiop.ovhapi.api.objects.xdsl.PortMapping param0, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/portMappings/" + name + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/tasks/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/ips";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task deleteServiceNameModemPortMappingsName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/portMappings/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.IP getServiceNameIpsIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/ips/" + ip + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.IP.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms getServiceNameResiliationTerms(java.lang.String serviceName, java.util.Date resiliationDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/resiliationTerms";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "resiliationDate=" + resiliationDate;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms getServiceNameResiliationTerms(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/resiliationTerms";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms.class);
	}

	public void putServiceNameModemWifiWifiName(net.zyuiop.ovhapi.api.objects.xdsl.WLAN param0, java.lang.String serviceName, java.lang.String wifiName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/wifi/" + wifiName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Line getServiceNameLinesNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/lines/" + number + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "number=" + number;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Line.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile[] getServiceNameLinesNumberDslamPortAvailableProfiles(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/lines/" + number + "/dslamPort/availableProfiles";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "number=" + number;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile[].class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.LAN getServiceNameModemLanLanName(java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "lanName=" + lanName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.LAN.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DslamPort getServiceNameLinesNumberDslamPort(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/lines/" + number + "/dslamPort";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "number=" + number;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.DslamPort.class);
	}

	public void putServiceNameMonitoringNotificationsId(net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/monitoringNotifications/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameMonitoringNotificationsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/monitoringNotifications/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemRefreshConnectedDevices(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/refreshConnectedDevices";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.PendingAction getServiceNamePendingAction(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/pendingAction";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.PendingAction.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/orderFollowup
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameIpv6(boolean enabled, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/ipv6";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("enabled", enabled);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public void putServiceNameRmaId(net.zyuiop.ovhapi.api.objects.telephony.Rma param0, java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/rma/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DHCP getServiceNameModemLanLanNameDhcpDhcpName(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "lanName=" + lanName;
		__data += "dhcpName=" + dhcpName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.DHCP.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail getServiceNameResiliationFollowup(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/resiliationFollowup";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnostic getServiceNameDiagnostic(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/diagnostic";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnostic.class);
	}

	public void putSpareSpareServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameModemLan(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Incident getIncidentsId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/incidents/" + id + "";
		String __data = "?";
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.xdsl.Incident.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.xdsl.Access param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DslamPortLog[] getServiceNameLinesNumberDslamPortLogs(long limit, java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/lines/" + number + "/dslamPort/logs";
		String __data = "?";
		__data += "limit=" + limit;
		__data += "serviceName=" + serviceName;
		__data += "number=" + number;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.DslamPortLog[].class);
	}

	public void putServiceNameModem(net.zyuiop.ovhapi.api.objects.xdsl.Modem param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public boolean getServiceNameCanCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/canCancelResiliation";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}

	public void putServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress param0, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses/" + MACAddress + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameIpsIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/ips/" + ip + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City[] getEligibilityCities(java.lang.String zipCode) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/eligibility/cities";
		String __data = "?";
		__data += "zipCode=" + zipCode;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City[].class);
	}

	public java.lang.String[] getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "/compatibleReplacement";
		String __data = "?";
		__data += "spare=" + spare;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getSpareBrands() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/brands";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Access getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Access.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.PortMapping getServiceNameModemPortMappingsName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/portMappings/" + name + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.PortMapping.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Lns[] getServiceNameAvailableLns(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/availableLns";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Lns[].class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Incident getServiceNameIncident(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/incident";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Incident.class);
	}

	public java.lang.String[] getServiceNameModemPortMappings(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/portMappings";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.spare.xdsl.XdslSpare getSpareSpare(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/spare/" + spare + "";
		String __data = "?";
		__data += "spare=" + spare;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.spare.xdsl.XdslSpare.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.ConnectedDevice getServiceNameModemConnectedDevicesMacAddress(java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/connectedDevices/" + macAddress + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "macAddress=" + macAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.ConnectedDevice.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task deleteServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/lan/" + lanName + "/dhcp/" + dhcpName + "/DHCPStaticAddresses/" + MACAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.PortMapping postServiceNameModemPortMappings(java.lang.String protocol, java.lang.String name, long externalPortStart, java.lang.String internalClient, long internalPort, java.lang.String serviceName, java.lang.String description, long externalPortEnd, java.lang.String allowedRemoteIp) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/portMappings";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("protocol", protocol);
		__dataMap.put("name", name);
		__dataMap.put("externalPortStart", externalPortStart);
		__dataMap.put("internalClient", internalClient);
		__dataMap.put("internalPort", internalPort);
		__dataMap.put("description", description);
		__dataMap.put("externalPortEnd", externalPortEnd);
		__dataMap.put("allowedRemoteIp", allowedRemoteIp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.PortMapping.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.PortMapping postServiceNameModemPortMappings(java.lang.String protocol, java.lang.String name, long externalPortStart, java.lang.String internalClient, long internalPort, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/portMappings";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("protocol", protocol);
		__dataMap.put("name", name);
		__dataMap.put("externalPortStart", externalPortStart);
		__dataMap.put("internalClient", internalClient);
		__dataMap.put("internalPort", internalPort);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.PortMapping.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /xdsl/$serviceName/addressMove/extraIpRange
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.telephony.Rma getServiceNameRmaId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/rma/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Rma.class);
	}

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

	public long[] getServiceNameMonitoringNotifications(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/monitoringNotifications";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameLinesNumberDslamPortChangeProfile(long dslamProfileId, java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/lines/" + number + "/dslamPort/changeProfile";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dslamProfileId", dslamProfileId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.Modem getServiceNameModem(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.Modem.class);
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.WLAN getServiceNameModemWifiWifiName(java.lang.String serviceName, java.lang.String wifiName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/xdsl/" + serviceName + "/modem/wifi/" + wifiName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "wifiName=" + wifiName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.xdsl.WLAN.class);
	}

}
