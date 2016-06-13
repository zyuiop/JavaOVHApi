package net.zyuiop.ovhapi.impl.methods.dedicated;

import net.zyuiop.ovhapi.api.methods.dedicated.Server;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class ServerImpl implements Server { 

	private final OVHRawCalls client;

	public ServerImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/process
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameLicenseWindows(java.lang.String licenseId, java.lang.String version, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/license/windows";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("licenseId", licenseId);
		__dataMap.put("version", version);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public java.lang.String getServiceNameFeaturesBackupFTPAccess(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getServiceNameSpla(java.lang.String serviceName, java.lang.String status, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/spla";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameSpla(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/spla";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameIpMove(java.lang.String ip, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ipMove";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public java.lang.String getServiceNameVrack(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vrack";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Kvm getServiceNameFeaturesKvm(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/kvm";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Kvm.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Intervention getServiceNameInterventionInterventionId(java.lang.String serviceName, long interventionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/intervention/" + interventionId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Intervention.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName, boolean ftp) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBlock", ipBlock);
		__dataMap.put("nfs", nfs);
		__dataMap.put("cifs", cifs);
		__dataMap.put("ftp", ftp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBlock", ipBlock);
		__dataMap.put("nfs", nfs);
		__dataMap.put("cifs", cifs);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public long[] getServiceNameServiceMonitoringMonitoringIdAlertEmail(java.lang.String serviceName, long monitoringId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/email";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.RtmDiskSmart getServiceNameStatisticsDiskDiskSmart(java.lang.String serviceName, java.lang.String disk) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/disk/" + disk + "/smart";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.RtmDiskSmart.class);
	}

	public boolean getServiceNameOrderableProfessionalUse(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/professionalUse";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameReboot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/reboot";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.VirtualMacManagement getServiceNameVirtualMacMacAddressVirtualAddressIpAddress(java.lang.String serviceName, java.lang.String macAddress, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/virtualMac/" + macAddress + "/virtualAddress/" + ipAddress + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.VirtualMacManagement.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Ipmi getServiceNameFeaturesIpmi(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/ipmi";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Ipmi.class);
	}

	public long[] getServiceNameIntervention(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/intervention";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.VirtualMac getServiceNameVirtualMacMacAddress(java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/virtualMac/" + macAddress + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.VirtualMac.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl getServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl.class);
	}

	public java.lang.String getServiceNameFeaturesBackupFTPAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/authorizableBlocks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/cpu
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.Netboot getServiceNameBootBootId(java.lang.String serviceName, long bootId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/boot/" + bootId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Netboot.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.InstallTemplate getServiceNameInstallCompatibleTemplates(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/install/compatibleTemplates";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.InstallTemplate.class);
	}

	public void postServiceNameSplaIdRevoke(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/spla/" + id + "/revoke";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vrack/" + vrack + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring getServiceNameServiceMonitoringMonitoringId(java.lang.String serviceName, long monitoringId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert postServiceNameServiceMonitoringMonitoringIdAlertSms(java.lang.String smsAccount, java.lang.String phoneNumberTo, java.lang.String language, java.lang.String serviceName, long monitoringId, long toHour, long fromHour) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/sms";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("smsAccount", smsAccount);
		__dataMap.put("phoneNumberTo", phoneNumberTo);
		__dataMap.put("language", language);
		__dataMap.put("toHour", toHour);
		__dataMap.put("fromHour", fromHour);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert postServiceNameServiceMonitoringMonitoringIdAlertSms(java.lang.String smsAccount, java.lang.String phoneNumberTo, java.lang.String language, java.lang.String serviceName, long monitoringId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/sms";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("smsAccount", smsAccount);
		__dataMap.put("phoneNumberTo", phoneNumberTo);
		__dataMap.put("language", language);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert.class);
	}

	public long[] getServiceNameServiceMonitoring(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.RtmOs getServiceNameStatisticsOs(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/os";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.RtmOs.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getServiceNameLicenseCompliantWindows(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/license/compliantWindows";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/raid/$unit/volume/$volume
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameStatisticsDisk(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/disk";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameIps(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ips";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.IpmiAccessValue getServiceNameFeaturesIpmiAccess(java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/ipmi/access";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.IpmiAccessValue.class);
	}

	public long[] getServiceNameServiceMonitoringMonitoringIdAlertSms(java.lang.String serviceName, long monitoringId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/sms";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getServiceNameVirtualMacMacAddressVirtualAddress(java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/virtualMac/" + macAddress + "/virtualAddress";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/specifications/hardware
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameStatisticsRaidUnitVolume(java.lang.String serviceName, java.lang.String unit) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/raid/" + unit + "/volume";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameLicenseCompliantWindowsSqlServer(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/license/compliantWindowsSqlServer";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNameServiceMonitoringMonitoringIdAlertEmailAlertId(net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert param0, java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/email/" + alertId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/secondaryDnsNameServerAvailable
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiAccess(long ttl, java.lang.String type, java.lang.String serviceName, java.lang.String ipToAllow, java.lang.String sshKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/ipmi/access";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ttl", ttl);
		__dataMap.put("type", type);
		__dataMap.put("ipToAllow", ipToAllow);
		__dataMap.put("sshKey", sshKey);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiAccess(long ttl, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/ipmi/access";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ttl", ttl);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPPassword(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/password";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public java.lang.String getServiceNameBootBootIdOption(java.lang.String serviceName, long bootId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/boot/" + bootId + "/option";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderable getServiceNameOrderableIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/ip";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderable.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Option getServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/option/" + option + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Option.class);
	}

	public void putServiceNameServiceMonitoringMonitoringId(net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring param0, java.lang.String serviceName, long monitoringId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void getServiceNameIpCanBeMovedTo(java.lang.String ip, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ipCanBeMovedTo";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.UsbKeyOrderableDetails getServiceNameOrderableUsbKey(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/usbKey";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.UsbKeyOrderableDetails.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/mrtg
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiResetInterface(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/ipmi/resetInterface";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public java.lang.String getServiceNameOption(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/option";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/specifications/network
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressStatus getServiceNameInstallStatus(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/install/status";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressStatus.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/burst
	* Message : Missing identifier.
	*/


	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getServiceNameSecondaryDnsDomains(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/secondaryDnsDomains";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/partition/$partition
	* Message : Missing identifier.
	*/


	public void deleteServiceNameServiceMonitoringMonitoringIdAlertEmailAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/email/" + alertId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/raid/$unit/volume/$volume/port/$port
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/disk/$disk
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.BackupStorageOrderable getServiceNameOrderableBackupStorage(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/backupStorage";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.BackupStorageOrderable.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert getServiceNameServiceMonitoringMonitoringIdAlertSmsAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/sms/" + alertId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.dedicated.server.Dedicated param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiResetSessions(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/ipmi/resetSessions";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public java.lang.String getServiceNameStatisticsPartition(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/partition";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/features/backupFTP
	* Message : Missing identifier.
	*/


	public void deleteServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/secondaryDnsDomains/" + domain + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.IpmiTestResult getServiceNameFeaturesIpmiTest(java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/ipmi/test";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.IpmiTestResult.class);
	}

	public void putServiceNameServiceMonitoringMonitoringIdAlertSmsAlertId(net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert param0, java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/sms/" + alertId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.BandwidthOrderable getServiceNameOrderableBandwidth(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/bandwidth";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.BandwidthOrderable.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert getServiceNameServiceMonitoringMonitoringIdAlertEmailAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/email/" + alertId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameVirtualMacMacAddressVirtualAddress(java.lang.String virtualMachineName, java.lang.String ipAddress, java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/virtualMac/" + macAddress + "/virtualAddress";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("virtualMachineName", virtualMachineName);
		__dataMap.put("ipAddress", ipAddress);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert postServiceNameServiceMonitoringMonitoringIdAlertEmail(java.lang.String email, java.lang.String language, java.lang.String serviceName, long monitoringId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/email";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		__dataMap.put("language", language);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/vrack/$vrack/mrtg
	* Message : Missing identifier.
	*/


	public long postServiceNameSpla(java.lang.String type, java.lang.String serialNumber, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/spla";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("type", type);
		__dataMap.put("serialNumber", serialNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /dedicated/server/$serviceName/secondaryDnsDomains/$domain
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameInstallCompatibleTemplatePartitionSchemes(java.lang.String templateName, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/install/compatibleTemplatePartitionSchemes";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteServiceNameServiceMonitoringMonitoringIdAlertSmsAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "/alert/sms/" + alertId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public java.lang.String getDedicatedServer() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0//dedicated/server";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNameFeaturesBackupFTPAccessIpBlock(net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl param0, java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/backupFTP/access/" + ipBlock + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public boolean getServiceNameOrderableFeature(java.lang.String feature, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/feature";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Dedicated getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Dedicated.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/load
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameIpBlockMerge(java.lang.String block, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ipBlockMerge";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("block", block);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.RtmConnection getServiceNameStatisticsConnection(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/connection";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.RtmConnection.class);
	}

	public java.lang.String getServiceNameStatisticsRaidUnitVolumeVolumePort(java.lang.String serviceName, java.lang.String unit, java.lang.String volume) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/raid/" + unit + "/volume/" + volume + "/port";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderable getServiceNameSpecificationsIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/specifications/ip";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderable.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/secondaryDnsDomains/$domain
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.dedicated.server.Rtm getServiceNameStatistics(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Rtm.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.RtmPci getServiceNameStatisticsPci(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/pci";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.RtmPci.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.RtmRaid getServiceNameStatisticsRaidUnit(java.lang.String serviceName, java.lang.String unit) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/raid/" + unit + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.RtmRaid.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Firewall getServiceNameFeaturesFirewall(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/firewall";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Firewall.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/install/hardwareRaidProfile
	* Message : Missing identifier.
	*/


	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/changeContact";
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
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.NetbootOption getServiceNameBootBootIdOptionOption(java.lang.String serviceName, long bootId, java.lang.String option) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/boot/" + bootId + "/option/" + option + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.NetbootOption.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/secondaryDnsNameDomainToken
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/install/hardwareRaidSize
	* Message : Missing identifier.
	*/


	public void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/secondaryDnsDomains";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/secondaryDnsDomains";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameFeaturesFirewall(net.zyuiop.ovhapi.api.objects.dedicated.server.Firewall param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/firewall";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getServiceNameStatisticsRaid(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/raid";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/partition/$partition/chart
	* Message : Missing identifier.
	*/


	public void deleteServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/option/" + option + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public boolean getServiceNameOrderableKvm(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/kvm";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/chart
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/statistics/memory
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameIpCountryAvailable(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ipCountryAvailable";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring postServiceNameServiceMonitoring(java.lang.String protocol, java.lang.String ip, java.lang.String interval, long port, boolean enabled, java.lang.String serviceName, java.lang.String challengeText, java.lang.String url) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("protocol", protocol);
		__dataMap.put("ip", ip);
		__dataMap.put("interval", interval);
		__dataMap.put("port", port);
		__dataMap.put("enabled", enabled);
		__dataMap.put("challengeText", challengeText);
		__dataMap.put("url", url);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring postServiceNameServiceMonitoring(java.lang.String protocol, java.lang.String ip, java.lang.String interval, long port, boolean enabled, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("protocol", protocol);
		__dataMap.put("ip", ip);
		__dataMap.put("interval", interval);
		__dataMap.put("port", port);
		__dataMap.put("enabled", enabled);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameVirtualMacMacAddressVirtualAddressIpAddress(java.lang.String serviceName, java.lang.String macAddress, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/virtualMac/" + macAddress + "/virtualAddress/" + ipAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Spla getServiceNameSplaId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/spla/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Spla.class);
	}

	public boolean getServiceNameOrderableKvmExpress(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderable/kvmExpress";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiTest(long ttl, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/features/ipmi/test";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ttl", ttl);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public void postServiceNameTaskTaskIdCancel(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + taskId + "/cancel";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameSplaId(net.zyuiop.ovhapi.api.objects.dedicated.server.Spla param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/spla/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameVirtualMac(java.lang.String virtualMachineName, java.lang.String ipAddress, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/virtualMac";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("virtualMachineName", virtualMachineName);
		__dataMap.put("ipAddress", ipAddress);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public java.lang.String getServiceNameVirtualMac(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/virtualMac";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer getServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vrack/" + vrack + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.RtmMotherboardHw getServiceNameStatisticsMotherboard(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/statistics/motherboard";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.RtmMotherboardHw.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameInstallStart(java.lang.String templateName, java.lang.String serviceName, java.lang.String partitionSchemeName, net.zyuiop.ovhapi.api.objects.dedicated.server.InstallCustom details) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/install/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("templateName", templateName);
		__dataMap.put("partitionSchemeName", partitionSchemeName);
		__dataMap.put("details", details);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameInstallStart(java.lang.String templateName, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/install/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("templateName", templateName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /dedicated/server/$serviceName/burst
	* Message : Missing identifier.
	*/


	public long[] getServiceNameBoot(java.lang.String serviceName, java.lang.String bootType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/boot";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameBoot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/boot";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteServiceNameServiceMonitoringMonitoringId(java.lang.String serviceName, long monitoringId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceMonitoring/" + monitoringId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/server/$serviceName/secondaryDnsDomains/$domain/dnsServer
	* Message : Missing identifier.
	*/


}
