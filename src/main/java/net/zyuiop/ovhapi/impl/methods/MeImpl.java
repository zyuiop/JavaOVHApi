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

	public net.zyuiop.ovhapi.api.objects.nichandle.SshKey getSshKeyKeyName(java.lang.String keyName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sshKey/" + keyName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.SshKey.class);
	}

	public java.lang.String getInstallationTemplate() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.billing.FidelityMovement getFidelityAccountMovementsMovementId(long movementId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/fidelityAccount/movements/" + movementId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.FidelityMovement.class);
	}

	public java.lang.String getOrderOrderIdStatus(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/status";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/document/$id
	* Message : Missing identifier.
	*/


	public void postInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String disks, long step, java.lang.String mode, java.lang.String name, java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid";
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

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaidName(java.lang.String templateName, java.lang.String schemeName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putAccessRestrictionIpId(net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction param0, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/ip/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postTaskContactChangeIdResendEmail(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/contactChange/" + id + "/resendEmail";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postAccessRestrictionSmsIdValidate(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/sms/" + id + "/validate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postAccessRestrictionIp(java.lang.String ip, boolean warning, java.lang.String rule) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/ip";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		__dataMap.put("warning", warning);
		__dataMap.put("rule", rule);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putMe(net.zyuiop.ovhapi.api.objects.nichandle.Nichandle param0) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0//me";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName/partitionScheme/$schemeName/hardwareRaid/$name
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.api.Application getApiApplicationApplicationId(long applicationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/api/application/" + applicationId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.api.Application.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName/partitionScheme/$schemeName
	* Message : Missing identifier.
	*/


	public void postTaskDomainIdRelaunch(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/relaunch";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/task/emailChange/$id
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.billing.FidelityAccount getFidelityAccount() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/fidelityAccount";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.FidelityAccount.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.VipStatus getVipStatus() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vipStatus";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.VipStatus.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Movement getOvhAccountOvhAccountIdMovementsMovementId(java.lang.String ovhAccountId, long movementId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/movements/" + movementId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Movement.class);
	}

	public void postPaymentMeanCreditCardIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.VoucherStatus postVoucherCheckValidity(java.lang.String voucher) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/voucher/checkValidity";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("voucher", voucher);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.VoucherStatus.class);
	}

	public void postChangePassword() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/task/contactChange/$id
	* Message : Missing identifier.
	*/


	public long[] getOrder(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOrder() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Payment getOrderOrderIdPayment(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/payment";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Payment.class);
	}

	public void deletePaymentMeanPaypalId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/paypal/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteAccessRestrictionBackupCode() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/backupCode";
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


	public void postAccessRestrictionBackupCodeDisable(java.lang.String code) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/backupCode/disable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postPaymentMeanBankAccountIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postTaskContactChangeIdAccept(java.lang.String token, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/contactChange/" + id + "/accept";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName/partitionScheme/$schemeName
	* Message : Missing identifier.
	*/


	public void postDocumentCors(java.lang.String origin) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/document/cors";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("origin", origin);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction getAccessRestrictionIpId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/ip/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.order.RegisteredPaymentMean getOrderOrderIdAvailableRegisteredPaymentMean(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/availableRegisteredPaymentMean";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.order.RegisteredPaymentMean.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule getAccessRestrictionIpDefaultRule() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/ipDefaultRule";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule.class);
	}

	public java.lang.String getBill(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/bill";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getBill() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/bill";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putIpOrganisationOrganisationId(net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org param0, java.lang.String organisationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipOrganisation/" + organisationId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteAccessRestrictionSmsId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/sms/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postIpOrganisation(java.lang.String country, java.lang.String firstname, java.lang.String registry, java.lang.String lastname, java.lang.String phone, java.lang.String abuse_mailbox, java.lang.String city, java.lang.String address, java.lang.String zip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipOrganisation";
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
		String __callUrl = "https://api.ovh.com/1.0/ipOrganisation";
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

	public void putAutorenew(net.zyuiop.ovhapi.api.objects.nichandle.NicAutorenewInfos param0) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/autorenew";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact getContactContactId(long contactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/contact/" + contactId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public long[] getAccessRestrictionTotp() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/totp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.api.Application getApiCredentialCredentialIdApplication(long credentialId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/api/credential/" + credentialId + "/application";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.api.Application.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Payment getRefundRefundIdPayment(java.lang.String refundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/refund/" + refundId + "/payment";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Payment.class);
	}

	public void postAccessRestrictionTotpIdValidate(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/totp/" + id + "/validate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postAccessRestrictionBackupCodeEnable(java.lang.String code) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/backupCode/enable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteAccessRestrictionTotpId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/totp/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Payment getBillBillIdPayment(java.lang.String billId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/bill/" + billId + "/payment";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Payment.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/sms/$id
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.nichandle.EmailNotification getNotificationEmailHistoryId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/notification/email/history/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.EmailNotification.class);
	}

	public void deleteAccessRestrictionIpId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/ip/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.order.AssociatedObject getOrderOrderIdAssociatedObject(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/associatedObject";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.order.AssociatedObject.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName/partitionScheme/$schemeName/partition/$mountpoint
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.billing.Order postOvhAccountOvhAccountIdCreditOrder(long amount, java.lang.String ovhAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/creditOrder";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("amount", amount);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Order.class);
	}

	public long[] getAgreements(java.lang.String agreed, long contractId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/agreements";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getAgreements() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/agreements";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getSshKey() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sshKey";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteInstallationTemplateTemplateName(java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "";
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


	public void postAccessRestrictionTotpIdDisable(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/totp/" + id + "/disable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Refund getOrderOrderIdRefund(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/refund";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Refund.class);
	}

	public void deleteDocumentId(java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/document/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putFidelityAccount(net.zyuiop.ovhapi.api.objects.billing.FidelityAccount param0) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/fidelityAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getApiApplication() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/api/application";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String postAgreementsIdAccept(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/agreements/" + id + "/accept";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getRefund(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/refund";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getRefund() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/refund";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postAccessRestrictionSmsIdDisable(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/sms/" + id + "/disable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putPaymentMeanCreditCardId(net.zyuiop.ovhapi.api.objects.billing.CreditCard param0, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName
	* Message : Missing identifier.
	*/


	public void postTaskContactChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/contactChange/" + id + "/refuse";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postOrderOrderIdPayWithRegisteredPaymentMean(java.lang.String paymentMean, long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/payWithRegisteredPaymentMean";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("paymentMean", paymentMean);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.Ipxe getIpxeScriptName(java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipxeScript/" + name + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.Ipxe.class);
	}

	public java.lang.String getInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.SlaApply getSlaId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sla/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.SlaApply.class);
	}

	public net.zyuiop.ovhapi.api.objects.contact.FieldInformation getContactContactIdFields(long contactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/contact/" + contactId + "/fields";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.contact.FieldInformation.class);
	}

	public void putSshKeyKeyName(net.zyuiop.ovhapi.api.objects.nichandle.SshKey param0, java.lang.String keyName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sshKey/" + keyName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.Subscription getSubscriptionSubscriptionType(java.lang.String subscriptionType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/subscription/" + subscriptionType + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.Subscription.class);
	}

	public java.lang.String getInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org getIpOrganisationOrganisationId(java.lang.String organisationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipOrganisation/" + organisationId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Order postFidelityAccountCreditOrder(long amount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/fidelityAccount/creditOrder";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("amount", amount);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.SlaService getSlaIdServices(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sla/" + id + "/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.SlaService.class);
	}

	public void putPaymentMeanPaypalId(net.zyuiop.ovhapi.api.objects.billing.Paypal param0, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/paypal/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putTaskDomainIdArgumentKey(net.zyuiop.ovhapi.api.objects.nichandle.DomainTaskArgument param0, long id, java.lang.String key) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/argument/" + key + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Bill getOrderOrderIdBill(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/bill";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Bill.class);
	}


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
	* Involved method : POST > /me/accessRestriction/totp
	* Message : Missing identifier.
	*/


	public void putPaymentMeanBankAccountId(net.zyuiop.ovhapi.api.objects.billing.BankAccount param0, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact putContactContactId(long contactId, net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String cellPhone, java.lang.String phone, java.lang.String fax, java.util.Date birthDay, java.lang.String birthCity, java.lang.String birthZip, java.lang.String birthCountry, java.lang.String vat, java.lang.String companyNationalIdentificationNumber, java.lang.String nationalIdentificationNumber, java.lang.String organisationType, java.lang.String organisationName, java.lang.String email, java.lang.String firstName, java.lang.String gender, java.lang.String language, java.lang.String nationality, java.lang.String lastName, java.lang.String legalForm) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/contact/" + contactId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("address", address);
		__dataMap.put("cellPhone", cellPhone);
		__dataMap.put("phone", phone);
		__dataMap.put("fax", fax);
		__dataMap.put("birthDay", birthDay);
		__dataMap.put("birthCity", birthCity);
		__dataMap.put("birthZip", birthZip);
		__dataMap.put("birthCountry", birthCountry);
		__dataMap.put("vat", vat);
		__dataMap.put("companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		__dataMap.put("nationalIdentificationNumber", nationalIdentificationNumber);
		__dataMap.put("organisationType", organisationType);
		__dataMap.put("organisationName", organisationName);
		__dataMap.put("email", email);
		__dataMap.put("firstName", firstName);
		__dataMap.put("gender", gender);
		__dataMap.put("language", language);
		__dataMap.put("nationality", nationality);
		__dataMap.put("lastName", lastName);
		__dataMap.put("legalForm", legalForm);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact putContactContactId(long contactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/contact/" + contactId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public void postSshKey(java.lang.String key, java.lang.String keyName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sshKey";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("key", key);
		__dataMap.put("keyName", keyName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postTaskDomainIdCancel(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/cancel";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getTaskEmailChange(java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/emailChange";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getTaskEmailChange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/emailChange";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.BillDetail getBillBillIdDetailsBillDetailId(java.lang.String billId, java.lang.String billDetailId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/bill/" + billId + "/details/" + billDetailId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.BillDetail.class);
	}

	public void postPasswordRecover(java.lang.String ovhId, java.lang.String ovhCompany) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/passwordRecover";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ovhId", ovhId);
		__dataMap.put("ovhCompany", ovhCompany);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, false);
	}

	public void deleteApiCredentialCredentialId(long credentialId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/api/credential/" + credentialId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deletePaymentMeanBankAccountId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deletePaymentMeanCreditCardId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putAccessRestrictionIpDefaultRule(net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule param0) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/ipDefaultRule";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Order postOvhAccountOvhAccountIdRetrieveMoney(long amount, long bankAccountId, java.lang.String ovhAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/retrieveMoney";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("amount", amount);
		__dataMap.put("bankAccountId", bankAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Order.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/totp/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName/partitionScheme/$schemeName/hardwareRaid/$name
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.billing.Paypal getPaymentMeanPaypalId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/paypal/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Paypal.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanBankAccount(java.lang.String iban, java.lang.String ownerAddress, java.lang.String ownerName, java.lang.String bic, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("iban", iban);
		__dataMap.put("ownerAddress", ownerAddress);
		__dataMap.put("ownerName", ownerName);
		__dataMap.put("bic", bic);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanBankAccount(java.lang.String iban, java.lang.String ownerAddress, java.lang.String ownerName, java.lang.String bic) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("iban", iban);
		__dataMap.put("ownerAddress", ownerAddress);
		__dataMap.put("ownerName", ownerName);
		__dataMap.put("bic", bic);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public long[] getNotificationEmailHistory() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/notification/email/history";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/backupCode
	* Message : Missing identifier.
	*/


	public long[] getOvhAccountOvhAccountIdMovements(java.lang.String ovhAccountId, java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/movements";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOvhAccountOvhAccountIdMovements(java.lang.String ovhAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/movements";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/sms/$id/sendCode
	* Message : Missing identifier.
	*/


	public long[] getPaymentMeanPaypal() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/paypal";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getIpOrganisation() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipOrganisation";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getRefundRefundIdDetails(java.lang.String refundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/refund/" + refundId + "/details";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postTaskEmailChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/emailChange/" + id + "/refuse";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getTaskDomain(java.lang.String domain, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getTaskDomain() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Refund getRefundRefundId(java.lang.String refundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/refund/" + refundId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Refund.class);
	}

	public void postTaskDomainIdAccelerate(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/accelerate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postSlaIdApply(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sla/" + id + "/apply";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.AutomaticPaymentMean getAvailableAutomaticPaymentMeans() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/availableAutomaticPaymentMeans";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.AutomaticPaymentMean.class);
	}

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartitionMountpoint(java.lang.String templateName, java.lang.String schemeName, java.lang.String mountpoint) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition/" + mountpoint + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postAccessRestrictionTotpIdEnable(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/totp/" + id + "/enable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.OvhAccount getOvhAccountOvhAccountId(java.lang.String ovhAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.OvhAccount.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/backupCode/validate
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.nichandle.Ipxe postIpxeScript(java.lang.String script, java.lang.String name, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipxeScript";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("script", script);
		__dataMap.put("name", name);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.Ipxe.class);
	}

	public java.lang.String getIpxeScript() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipxeScript";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getTaskContactChange(java.lang.String toAccount, java.lang.String askingAccount, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/contactChange";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getTaskContactChange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/contactChange";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postPaymentMeanPaypalIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/paypal/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getBillBillIdDetails(java.lang.String billId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/bill/" + billId + "/details";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getPaymentMeanCreditCard() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.agreements.Contract getAgreementsIdContract(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/agreements/" + id + "/contract";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.agreements.Contract.class);
	}

	public void deleteIpxeScriptName(java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipxeScript/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postTaskEmailChangeIdAccept(java.lang.String token, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/emailChange/" + id + "/accept";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postInstallationTemplateTemplateNamePartitionScheme(long priority, java.lang.String name, java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("priority", priority);
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getInstallationTemplateTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteApiApplicationApplicationId(long applicationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/api/application/" + applicationId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getTaskDomainIdArgument(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/argument";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postInstallationTemplate(java.lang.String defaultLanguage, java.lang.String name, java.lang.String baseTemplateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("defaultLanguage", defaultLanguage);
		__dataMap.put("name", name);
		__dataMap.put("baseTemplateName", baseTemplateName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public boolean getSlaIdCanBeApplied(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sla/" + id + "/canBeApplied";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.OrderDetail getOrderOrderIdDetailsOrderDetailId(long orderId, long orderDetailId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/details/" + orderDetailId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.OrderDetail.class);
	}

	public void putSubscriptionSubscriptionType(net.zyuiop.ovhapi.api.objects.nichandle.Subscription param0, java.lang.String subscriptionType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/subscription/" + subscriptionType + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postInstallationTemplateTemplateNameCheckIntegrity(java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/checkIntegrity";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.api.Credential getApiCredentialCredentialId(long credentialId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/api/credential/" + credentialId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.api.Credential.class);
	}

	public java.lang.String getSubscription() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/subscription";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact postContact(net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String phone, java.lang.String email, java.lang.String firstName, java.lang.String language, java.lang.String lastName, java.lang.String legalForm, java.lang.String cellPhone, java.lang.String fax, java.util.Date birthDay, java.lang.String birthCity, java.lang.String birthZip, java.lang.String birthCountry, java.lang.String vat, java.lang.String companyNationalIdentificationNumber, java.lang.String nationalIdentificationNumber, java.lang.String organisationType, java.lang.String organisationName, java.lang.String gender, java.lang.String nationality) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/contact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("address", address);
		__dataMap.put("phone", phone);
		__dataMap.put("email", email);
		__dataMap.put("firstName", firstName);
		__dataMap.put("language", language);
		__dataMap.put("lastName", lastName);
		__dataMap.put("legalForm", legalForm);
		__dataMap.put("cellPhone", cellPhone);
		__dataMap.put("fax", fax);
		__dataMap.put("birthDay", birthDay);
		__dataMap.put("birthCity", birthCity);
		__dataMap.put("birthZip", birthZip);
		__dataMap.put("birthCountry", birthCountry);
		__dataMap.put("vat", vat);
		__dataMap.put("companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		__dataMap.put("nationalIdentificationNumber", nationalIdentificationNumber);
		__dataMap.put("organisationType", organisationType);
		__dataMap.put("organisationName", organisationName);
		__dataMap.put("gender", gender);
		__dataMap.put("nationality", nationality);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact postContact(net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String phone, java.lang.String email, java.lang.String firstName, java.lang.String language, java.lang.String lastName, java.lang.String legalForm) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/contact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("address", address);
		__dataMap.put("phone", phone);
		__dataMap.put("email", email);
		__dataMap.put("firstName", firstName);
		__dataMap.put("language", language);
		__dataMap.put("lastName", lastName);
		__dataMap.put("legalForm", legalForm);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.BankAccount getPaymentMeanBankAccountId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.BankAccount.class);
	}

	public void postAutorenew(long renewDay) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/autorenew";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("renewDay", renewDay);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteSshKeyKeyName(java.lang.String keyName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sshKey/" + keyName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postAccessRestrictionSmsIdEnable(java.lang.String code, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/sms/" + id + "/enable";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getFidelityAccountMovements(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/fidelityAccount/movements";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getFidelityAccountMovements() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/fidelityAccount/movements";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getAccessRestrictionSms() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/sms";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.CreditCard getPaymentMeanCreditCardId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.CreditCard.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanCreditCard(java.lang.String returnUrl, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("returnUrl", returnUrl);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanCreditCard() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.Nichandle getMe() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0//me";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.Nichandle.class);
	}

	public long[] getOrderOrderIdDetails(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/details";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getContact() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/contact";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/backupCode
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /me/document/$id
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.nichandle.NicAutorenewInfos getAutorenew() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/autorenew";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.NicAutorenewInfos.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/sms
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /me/order/$orderId/paymentMeans
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.nichandle.DomainTask getTaskDomainId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.DomainTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.agreements.ContractAgreement getAgreementsId(long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/agreements/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.agreements.ContractAgreement.class);
	}

	public long[] getApiCredential(java.lang.String status, long applicationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/api/credential";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getApiCredential() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/api/credential";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Bill getBillBillId(java.lang.String billId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/bill/" + billId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Bill.class);
	}

	public java.lang.String getOvhAccount() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ovhAccount";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(long step, java.lang.String filesystem, java.lang.String mountpoint, java.lang.String type, long size, java.lang.String templateName, java.lang.String schemeName, java.lang.String volumeName, long raid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
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
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
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

	public net.zyuiop.ovhapi.api.objects.billing.RefundDetail getRefundRefundIdDetailsRefundDetailId(java.lang.String refundId, java.lang.String refundDetailId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/refund/" + refundId + "/details/" + refundDetailId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.RefundDetail.class);
	}

	public java.lang.String getDocument() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/document";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Order getOrderOrderId(long orderId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/" + orderId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.Order.class);
	}

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeName(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanPaypal(java.lang.String returnUrl, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/paypal";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("returnUrl", returnUrl);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanPaypal() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/paypal";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.DomainTaskArgument getTaskDomainIdArgumentKey(long id, java.lang.String key) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/argument/" + key + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.nichandle.DomainTaskArgument.class);
	}

	public long[] getAccessRestrictionIp() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/accessRestriction/ip";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getSla() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sla";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getPaymentMeanBankAccount(java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getPaymentMeanBankAccount() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

}
