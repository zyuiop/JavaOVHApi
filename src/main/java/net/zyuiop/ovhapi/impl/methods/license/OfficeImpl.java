package net.zyuiop.ovhapi.impl.methods.license;

import net.zyuiop.ovhapi.api.methods.license.Office;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class OfficeImpl implements Office { 

	private final OVHRawCalls client;

	public OfficeImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.license.office.Statistics getServiceNameUsageStatistics(java.util.Date to, java.util.Date from, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/usageStatistics";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.Statistics.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeDomain getServiceNameDomainDomainName(java.lang.String serviceName, java.lang.String domainName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domain/" + domainName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeDomain.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getLicenseOffice() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//license/office";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUser(java.lang.String domain, java.lang.String licence, java.lang.String login, java.lang.String serviceName, java.lang.String firstName, java.lang.String lastName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("licence", licence);
		dataMap.put("login", login);
		dataMap.put("firstName", firstName);
		dataMap.put("lastName", lastName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUser(java.lang.String domain, java.lang.String licence, java.lang.String login, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("licence", licence);
		dataMap.put("login", login);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public java.lang.String getServiceNameDomain(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask deleteServiceNameUserActivationEmail(java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + activationEmail + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUserActivationEmailChangePassword(boolean shouldSendMail, java.lang.String serviceName, java.lang.String activationEmail, java.lang.String password, java.lang.String notifyEmail) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + activationEmail + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("shouldSendMail", shouldSendMail);
		dataMap.put("password", password);
		dataMap.put("notifyEmail", notifyEmail);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUserActivationEmailChangePassword(boolean shouldSendMail, java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + activationEmail + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("shouldSendMail", shouldSendMail);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeUser getServiceNameUserActivationEmail(java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + activationEmail + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeUser.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

}
