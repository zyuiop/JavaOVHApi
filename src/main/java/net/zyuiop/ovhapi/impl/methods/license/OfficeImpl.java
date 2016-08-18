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

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUser(java.lang.String domain, java.lang.String licence, java.lang.String login, java.lang.String serviceName, java.lang.String firstName, java.lang.String lastName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("licence", licence);
		__dataMap.put("login", login);
		__dataMap.put("firstName", firstName);
		__dataMap.put("lastName", lastName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUser(java.lang.String domain, java.lang.String licence, java.lang.String login, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("licence", licence);
		__dataMap.put("login", login);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask deleteServiceNameUserActivationEmail(java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/user/" + activationEmail + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.Statistics[] getServiceNameUsageStatistics(java.util.Date to, java.util.Date from, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/usageStatistics";
		String __data = "?";
		__data += "to=" + to;
		__data += "from=" + from;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.Statistics[].class);
	}

	public java.lang.String[] getLicenseOffice() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/license/office";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameDomain(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/domain";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeUser getServiceNameUserActivationEmail(java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/user/" + activationEmail + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "activationEmail=" + activationEmail;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeUser.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUserActivationEmailChangePassword(boolean shouldSendMail, java.lang.String serviceName, java.lang.String activationEmail, java.lang.String password, java.lang.String notifyEmail) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/user/" + activationEmail + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("shouldSendMail", shouldSendMail);
		__dataMap.put("password", password);
		__dataMap.put("notifyEmail", notifyEmail);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUserActivationEmailChangePassword(boolean shouldSendMail, java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/user/" + activationEmail + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("shouldSendMail", shouldSendMail);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeTask.class);
	}

	public java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.license.office.OfficeDomain getServiceNameDomainDomainName(java.lang.String serviceName, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/domain/" + domainName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domainName=" + domainName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.license.office.OfficeDomain.class);
	}

}
