package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Me;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class MeImpl implements Me { 

	private final OVHRawCalls client;

	public MeImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public void postAccessRestrictionTotpIdValidate(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/totp/" + id + "/validate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/paymentMean/paypal/$id
	* Message : Missing identifier.
	*/


	public void postChangePassword() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getRefund(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/refund";
		String __data = "?";
		__data += "date.to=" + dateTo;
		__data += "date.from=" + dateFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getRefund() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/refund";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getContact() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/contact";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getInstallationTemplate() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getAccessRestrictionTotp() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/totp";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/paymentMean/bankAccount/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/autorenew
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/sms
	* Message : Missing identifier.
	*/


	public long[] getPaymentMeanCreditCard() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/creditCard";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postTaskContactChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/contactChange/" + id + "/refuse";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getIpxeScript() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/ipxeScript";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postInstallationTemplateTemplateNamePartitionScheme(long priority, java.lang.String name, java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("priority", priority);
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getAgreements(java.lang.String agreed, long contractId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/agreements";
		String __data = "?";
		__data += "agreed=" + agreed;
		__data += "contractId=" + contractId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getAgreements() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/agreements";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteAccessRestrictionBackupCode() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/backupCode";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/ipxeScript
	* Message : Missing identifier.
	*/


	public void postAccessRestrictionBackupCodeEnable(java.lang.String code) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/backupCode/enable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/contact/$contactId
	* Message : Missing identifier.
	*/


	public long[] getOrderOrderIdDetails(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/order/" + orderId + "/details";
		String __data = "?";
		__data += "orderId=" + orderId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/accessRestriction/ip/$id
	* Message : Missing identifier.
	*/


	public void deleteApiCredentialCredentialId(long credentialId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/api/credential/" + credentialId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postTaskDomainIdRelaunch(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/domain/" + id + "/relaunch";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postOrderOrderIdPayWithRegisteredPaymentMean(java.lang.String paymentMean, long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/order/" + orderId + "/payWithRegisteredPaymentMean";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("paymentMean", paymentMean);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/agreements/$id/contract
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/sms/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId/details/$orderDetailId
	* Message : Missing identifier.
	*/


	public void postIpOrganisation(java.lang.String country, java.lang.String firstname, java.lang.String registry, java.lang.String lastname, java.lang.String phone, java.lang.String abuse_mailbox, java.lang.String city, java.lang.String address, java.lang.String zip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/ipOrganisation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("country", country);
		__dataMap.put("firstname", firstname);
		__dataMap.put("registry", registry);
		__dataMap.put("lastname", lastname);
		__dataMap.put("phone", phone);
		__dataMap.put("abuse_mailbox", abuse_mailbox);
		__dataMap.put("city", city);
		__dataMap.put("address", address);
		__dataMap.put("zip", zip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postIpOrganisation(java.lang.String country, java.lang.String firstname, java.lang.String registry, java.lang.String lastname, java.lang.String phone, java.lang.String abuse_mailbox, java.lang.String city, java.lang.String address) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/ipOrganisation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("country", country);
		__dataMap.put("firstname", firstname);
		__dataMap.put("registry", registry);
		__dataMap.put("lastname", lastname);
		__dataMap.put("phone", phone);
		__dataMap.put("abuse_mailbox", abuse_mailbox);
		__dataMap.put("city", city);
		__dataMap.put("address", address);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getApiApplication() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/api/application";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postPaymentMeanBankAccountIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/bankAccount/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getOrderOrderIdStatus(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/order/" + orderId + "/status";
		String __data = "?";
		__data += "orderId=" + orderId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getPaymentMeanPaypal() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/paypal";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId/associatedObject
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/accessRestriction/ipDefaultRule
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/autorenew
	* Message : Missing identifier.
	*/


	public void postTaskDomainIdAccelerate(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/domain/" + id + "/accelerate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postAutorenew(long renewDay) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/autorenew";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("renewDay", renewDay);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getFidelityAccountMovements(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/fidelityAccount/movements";
		String __data = "?";
		__data += "date.to=" + dateTo;
		__data += "date.from=" + dateFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getFidelityAccountMovements() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/fidelityAccount/movements";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getTaskEmailChange(java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/emailChange";
		String __data = "?";
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getTaskEmailChange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/emailChange";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postAccessRestrictionTotpIdDisable(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/totp/" + id + "/disable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getTaskDomain(java.lang.String domain, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/domain";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getTaskDomain() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/domain";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getSshKey() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/sshKey";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/bill/$billId
	* Message : Missing identifier.
	*/


	public void postInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String disks, long step, java.lang.String mode, java.lang.String name, java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("disks", disks);
		__dataMap.put("step", step);
		__dataMap.put("mode", mode);
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/api/credential/$credentialId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/fidelityAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId/paymentMeans
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/task/domain/$id/argument/$key
	* Message : Missing identifier.
	*/


	public void postAccessRestrictionSmsIdEnable(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/sms/" + id + "/enable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/backupCode
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/sla/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/availableAutomaticPaymentMeans
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillBillIdDetails(java.lang.String billId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/bill/" + billId + "/details";
		String __data = "?";
		__data += "billId=" + billId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/task/emailChange/$id
	* Message : Missing identifier.
	*/


	public void postTaskEmailChangeIdAccept(java.lang.String token, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/emailChange/" + id + "/accept";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaidName(java.lang.String templateName, java.lang.String schemeName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/contact/$contactId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/contact/$contactId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName/partitionScheme/$schemeName/hardwareRaid/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/paymentMean/creditCard/$id
	* Message : Missing identifier.
	*/


	public void postPasswordRecover(java.lang.String ovhId, java.lang.String ovhCompany) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/passwordRecover";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ovhId", ovhId);
		__dataMap.put("ovhCompany", ovhCompany);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, false);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId/payment
	* Message : Missing identifier.
	*/


	public void postSlaIdApply(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/sla/" + id + "/apply";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName/partitionScheme/$schemeName/partition/$mountpoint
	* Message : Missing identifier.
	*/


	public void deleteApiApplicationApplicationId(long applicationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/api/application/" + applicationId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/ovhAccount/$ovhAccountId/retrieveMoney
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/voucher/checkValidity
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName
	* Message : Missing identifier.
	*/


	public void deletePaymentMeanPaypalId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/paypal/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/agreements/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/sms/$id/sendCode
	* Message : Missing identifier.
	*/


	public void deleteAccessRestrictionTotpId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/totp/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getPaymentMeanBankAccount(java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/bankAccount";
		String __data = "?";
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getPaymentMeanBankAccount() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/bankAccount";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/ipOrganisation/$organisationId
	* Message : Missing identifier.
	*/


	public void postInstallationTemplate(java.lang.String defaultLanguage, java.lang.String name, java.lang.String baseTemplateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("defaultLanguage", defaultLanguage);
		__dataMap.put("name", name);
		__dataMap.put("baseTemplateName", baseTemplateName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/refund/$refundId/details/$refundDetailId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/api/application/$applicationId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName/partitionScheme/$schemeName
	* Message : Missing identifier.
	*/


	public void postTaskDomainIdCancel(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/domain/" + id + "/cancel";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/ipOrganisation/$organisationId
	* Message : Missing identifier.
	*/


	public boolean getSlaIdCanBeApplied(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/sla/" + id + "/canBeApplied";
		String __data = "?";
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}

	public java.lang.String[] getRefundRefundIdDetails(java.lang.String refundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/refund/" + refundId + "/details";
		String __data = "?";
		__data += "refundId=" + refundId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/task/domain/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/paymentMean/bankAccount/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/paymentMean/bankAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/paymentMean/bankAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/task/domain/$id/argument/$key
	* Message : Missing identifier.
	*/


	public long[] getSla() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/sla";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOrder(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/order";
		String __data = "?";
		__data += "date.to=" + dateTo;
		__data += "date.from=" + dateFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOrder() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/order";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getBill(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/bill";
		String __data = "?";
		__data += "date.to=" + dateTo;
		__data += "date.from=" + dateFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getBill() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/bill";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postAccessRestrictionBackupCodeDisable(java.lang.String code) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/backupCode/disable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/backupCode/validate
	* Message : Missing identifier.
	*/


	public long[] getAccessRestrictionSms() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/sms";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postTaskContactChangeIdResendEmail(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/contactChange/" + id + "/resendEmail";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/fidelityAccount
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOvhAccount() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/ovhAccount";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteAccessRestrictionSmsId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/sms/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/changeEmail
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/task/contactChange/$id
	* Message : Missing identifier.
	*/


	public void postPaymentMeanCreditCardIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/creditCard/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postTaskContactChangeIdAccept(java.lang.String token, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/contactChange/" + id + "/accept";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/document/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/document/$id
	* Message : Missing identifier.
	*/


	public void postPaymentMeanPaypalIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/paypal/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/contact
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/contact
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/contact/$contactId/fields
	* Message : Missing identifier.
	*/


	public java.lang.String[] getInstallationTemplateTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme";
		String __data = "?";
		__data += "templateName=" + templateName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(long step, java.lang.String filesystem, java.lang.String mountpoint, java.lang.String type, long size, java.lang.String templateName, java.lang.String schemeName, java.lang.String volumeName, long raid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("step", step);
		__dataMap.put("filesystem", filesystem);
		__dataMap.put("mountpoint", mountpoint);
		__dataMap.put("type", type);
		__dataMap.put("size", size);
		__dataMap.put("volumeName", volumeName);
		__dataMap.put("raid", raid);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(long step, java.lang.String filesystem, java.lang.String mountpoint, java.lang.String type, long size, java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("step", step);
		__dataMap.put("filesystem", filesystem);
		__dataMap.put("mountpoint", mountpoint);
		__dataMap.put("type", type);
		__dataMap.put("size", size);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteInstallationTemplateTemplateName(java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/refund/$refundId/payment
	* Message : Missing identifier.
	*/


	public void postAccessRestrictionSmsIdValidate(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/sms/" + id + "/validate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postAccessRestrictionTotpIdEnable(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/totp/" + id + "/enable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/notification/email/history/$id
	* Message : Missing identifier.
	*/


	public long[] getTaskContactChange(java.lang.String toAccount, java.lang.String askingAccount, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/contactChange";
		String __data = "?";
		__data += "toAccount=" + toAccount;
		__data += "askingAccount=" + askingAccount;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getTaskContactChange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/contactChange";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/sshKey/$keyName
	* Message : Missing identifier.
	*/


	public void postSshKey(java.lang.String key, java.lang.String keyName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/sshKey";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("key", key);
		__dataMap.put("keyName", keyName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postTaskEmailChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/emailChange/" + id + "/refuse";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName/partitionScheme/$schemeName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid";
		String __data = "?";
		__data += "templateName=" + templateName;
		__data += "schemeName=" + schemeName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deletePaymentMeanCreditCardId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/creditCard/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeName(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getOvhAccountOvhAccountIdMovements(java.lang.String ovhAccountId, java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/ovhAccount/" + ovhAccountId + "/movements";
		String __data = "?";
		__data += "ovhAccountId=" + ovhAccountId;
		__data += "date.to=" + dateTo;
		__data += "date.from=" + dateFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOvhAccountOvhAccountIdMovements(java.lang.String ovhAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/ovhAccount/" + ovhAccountId + "/movements";
		String __data = "?";
		__data += "ovhAccountId=" + ovhAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/paymentMean/creditCard
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/paymentMean/creditCard
	* Message : Missing identifier.
	*/


	public void deleteSshKeyKeyName(java.lang.String keyName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/sshKey/" + keyName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId/refund
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId/availableRegisteredPaymentMean
	* Message : Missing identifier.
	*/


	public java.lang.String[] getInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		String __data = "?";
		__data += "templateName=" + templateName;
		__data += "schemeName=" + schemeName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/paymentMean/paypal/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/totp
	* Message : Missing identifier.
	*/


	public void deletePaymentMeanBankAccountId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/paymentMean/bankAccount/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/bill/$billId/payment
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/subscription/$subscriptionType
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName/partitionScheme/$schemeName/hardwareRaid/$name
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDocument() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/document";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/paymentMean/creditCard/$id
	* Message : Missing identifier.
	*/


	public void postInstallationTemplateTemplateNameCheckIntegrity(java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/checkIntegrity";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/refund/$refundId
	* Message : Missing identifier.
	*/


	public void postAccessRestrictionIp(java.lang.String ip, boolean warning, java.lang.String rule) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/ip";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		__dataMap.put("warning", warning);
		__dataMap.put("rule", rule);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/bill/$billId/details/$billDetailId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/totp/$id
	* Message : Missing identifier.
	*/


	public void postAccessRestrictionSmsIdDisable(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/sms/" + id + "/disable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteIpxeScriptName(java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/ipxeScript/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postDocumentCors(java.lang.String origin) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/document/cors";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("origin", origin);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/backupCode
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/sshKey/$keyName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/ipDefaultRule
	* Message : Missing identifier.
	*/


	public java.lang.String[] getIpOrganisation() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/ipOrganisation";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getSubscription() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/subscription";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getTaskDomainIdArgument(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/task/domain/" + id + "/argument";
		String __data = "?";
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/ipxeScript/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/ovhAccount/$ovhAccountId/movements/$movementId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/subscription/$subscriptionType
	* Message : Missing identifier.
	*/


	public void deleteDocumentId(java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/document/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/paymentMean/paypal
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/paymentMean/paypal
	* Message : Missing identifier.
	*/


	public long[] getNotificationEmailHistory() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/notification/email/history";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String postAgreementsIdAccept(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/agreements/" + id + "/accept";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartitionMountpoint(java.lang.String templateName, java.lang.String schemeName, java.lang.String mountpoint) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition/" + mountpoint + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/sla/$id/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/vipStatus
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/api/credential/$credentialId/application
	* Message : Missing identifier.
	*/


	public long[] getAccessRestrictionIp() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/ip";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/fidelityAccount/movements/$movementId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/document
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/document
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId/bill
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/ovhAccount/$ovhAccountId
	* Message : Missing identifier.
	*/


	public long[] getApiCredential(java.lang.String status, long applicationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/api/credential";
		String __data = "?";
		__data += "status=" + status;
		__data += "applicationId=" + applicationId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getApiCredential() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/api/credential";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/ip/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/ovhAccount/$ovhAccountId/creditOrder
	* Message : Missing identifier.
	*/


	public void deleteAccessRestrictionIpId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/me/accessRestriction/ip/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName/partitionScheme/$schemeName/partition/$mountpoint
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /me/fidelityAccount/creditOrder
	* Message : Missing identifier.
	*/


}
