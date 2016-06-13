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
		String callUrl = "https://api.ovh.com/1.0/sshKey/" + keyName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.SshKey.class);
	}

	public java.lang.String getInstallationTemplate() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.billing.FidelityMovement getFidelityAccountMovementsMovementId(long movementId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/fidelityAccount/movements/" + movementId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.FidelityMovement.class);
	}

	public java.lang.String getOrderOrderIdStatus(long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/status";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/document/$id
	* Message : Missing identifier.
	*/


	public void postInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String disks, long step, java.lang.String mode, java.lang.String name, java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("disks", disks);
		dataMap.put("step", step);
		dataMap.put("mode", mode);
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaidName(java.lang.String templateName, java.lang.String schemeName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putAccessRestrictionIpId(net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction param0, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/ip/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postTaskContactChangeIdResendEmail(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/contactChange/" + id + "/resendEmail";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postAccessRestrictionSmsIdValidate(java.lang.String code, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/sms/" + id + "/validate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postAccessRestrictionIp(java.lang.String ip, boolean warning, java.lang.String rule) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/ip";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ip", ip);
		dataMap.put("warning", warning);
		dataMap.put("rule", rule);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putMe(net.zyuiop.ovhapi.api.objects.nichandle.Nichandle param0) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//me";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName/partitionScheme/$schemeName/hardwareRaid/$name
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.api.Application getApiApplicationApplicationId(long applicationId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/api/application/" + applicationId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.api.Application.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName/partitionScheme/$schemeName
	* Message : Missing identifier.
	*/


	public void postTaskDomainIdRelaunch(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/relaunch";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/task/emailChange/$id
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.billing.FidelityAccount getFidelityAccount() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/fidelityAccount";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.FidelityAccount.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.VipStatus getVipStatus() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vipStatus";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.VipStatus.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Movement getOvhAccountOvhAccountIdMovementsMovementId(java.lang.String ovhAccountId, long movementId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/movements/" + movementId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Movement.class);
	}

	public void postPaymentMeanCreditCardIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.VoucherStatus postVoucherCheckValidity(java.lang.String voucher) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/voucher/checkValidity";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("voucher", voucher);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.VoucherStatus.class);
	}

	public void postChangePassword() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/task/contactChange/$id
	* Message : Missing identifier.
	*/


	public long[] getOrder(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getOrder() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Payment getOrderOrderIdPayment(long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/payment";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Payment.class);
	}

	public void deletePaymentMeanPaypalId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/paypal/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteAccessRestrictionBackupCode() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/backupCode";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/changeEmail
	* Message : Missing identifier.
	*/


	public void postAccessRestrictionBackupCodeDisable(java.lang.String code) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/backupCode/disable";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postPaymentMeanBankAccountIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postTaskContactChangeIdAccept(java.lang.String token, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/contactChange/" + id + "/accept";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("token", token);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName/partitionScheme/$schemeName
	* Message : Missing identifier.
	*/


	public void postDocumentCors(java.lang.String origin) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/document/cors";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("origin", origin);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction getAccessRestrictionIpId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/ip/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.order.RegisteredPaymentMean getOrderOrderIdAvailableRegisteredPaymentMean(long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/availableRegisteredPaymentMean";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.order.RegisteredPaymentMean.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule getAccessRestrictionIpDefaultRule() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/ipDefaultRule";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule.class);
	}

	public java.lang.String getBill(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/bill";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getBill() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/bill";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putIpOrganisationOrganisationId(net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org param0, java.lang.String organisationId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipOrganisation/" + organisationId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteAccessRestrictionSmsId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/sms/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postIpOrganisation(java.lang.String country, java.lang.String firstname, java.lang.String registry, java.lang.String lastname, java.lang.String phone, java.lang.String abuse_mailbox, java.lang.String city, java.lang.String address, java.lang.String zip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipOrganisation";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("country", country);
		dataMap.put("firstname", firstname);
		dataMap.put("registry", registry);
		dataMap.put("lastname", lastname);
		dataMap.put("phone", phone);
		dataMap.put("abuse_mailbox", abuse_mailbox);
		dataMap.put("city", city);
		dataMap.put("address", address);
		dataMap.put("zip", zip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postIpOrganisation(java.lang.String country, java.lang.String firstname, java.lang.String registry, java.lang.String lastname, java.lang.String phone, java.lang.String abuse_mailbox, java.lang.String city, java.lang.String address) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipOrganisation";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("country", country);
		dataMap.put("firstname", firstname);
		dataMap.put("registry", registry);
		dataMap.put("lastname", lastname);
		dataMap.put("phone", phone);
		dataMap.put("abuse_mailbox", abuse_mailbox);
		dataMap.put("city", city);
		dataMap.put("address", address);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putAutorenew(net.zyuiop.ovhapi.api.objects.nichandle.NicAutorenewInfos param0) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/autorenew";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact getContactContactId(long contactId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/contact/" + contactId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public long[] getAccessRestrictionTotp() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/totp";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.api.Application getApiCredentialCredentialIdApplication(long credentialId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/api/credential/" + credentialId + "/application";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.api.Application.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Payment getRefundRefundIdPayment(java.lang.String refundId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/refund/" + refundId + "/payment";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Payment.class);
	}

	public void postAccessRestrictionTotpIdValidate(java.lang.String code, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/totp/" + id + "/validate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postAccessRestrictionBackupCodeEnable(java.lang.String code) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/backupCode/enable";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteAccessRestrictionTotpId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/totp/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Payment getBillBillIdPayment(java.lang.String billId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/bill/" + billId + "/payment";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Payment.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/accessRestriction/sms/$id
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.nichandle.EmailNotification getNotificationEmailHistoryId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/notification/email/history/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.EmailNotification.class);
	}

	public void deleteAccessRestrictionIpId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/ip/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.order.AssociatedObject getOrderOrderIdAssociatedObject(long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/associatedObject";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.order.AssociatedObject.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /me/installationTemplate/$templateName/partitionScheme/$schemeName/partition/$mountpoint
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.billing.Order postOvhAccountOvhAccountIdCreditOrder(long amount, java.lang.String ovhAccountId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/creditOrder";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("amount", amount);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Order.class);
	}

	public long[] getAgreements(java.lang.String agreed, long contractId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/agreements";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getAgreements() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/agreements";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getSshKey() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sshKey";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteInstallationTemplateTemplateName(java.lang.String templateName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName/partitionScheme/$schemeName/partition/$mountpoint
	* Message : Missing identifier.
	*/


	public void postAccessRestrictionTotpIdDisable(java.lang.String code, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/totp/" + id + "/disable";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Refund getOrderOrderIdRefund(long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/refund";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Refund.class);
	}

	public void deleteDocumentId(java.lang.String id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/document/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putFidelityAccount(net.zyuiop.ovhapi.api.objects.billing.FidelityAccount param0) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/fidelityAccount";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getApiApplication() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/api/application";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String postAgreementsIdAccept(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/agreements/" + id + "/accept";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getRefund(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/refund";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getRefund() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/refund";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postAccessRestrictionSmsIdDisable(java.lang.String code, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/sms/" + id + "/disable";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putPaymentMeanCreditCardId(net.zyuiop.ovhapi.api.objects.billing.CreditCard param0, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /me/installationTemplate/$templateName
	* Message : Missing identifier.
	*/


	public void postTaskContactChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/contactChange/" + id + "/refuse";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("token", token);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postOrderOrderIdPayWithRegisteredPaymentMean(java.lang.String paymentMean, long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/payWithRegisteredPaymentMean";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("paymentMean", paymentMean);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.Ipxe getIpxeScriptName(java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipxeScript/" + name + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.Ipxe.class);
	}

	public java.lang.String getInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.SlaApply getSlaId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sla/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.SlaApply.class);
	}

	public net.zyuiop.ovhapi.api.objects.contact.FieldInformation getContactContactIdFields(long contactId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/contact/" + contactId + "/fields";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.contact.FieldInformation.class);
	}

	public void putSshKeyKeyName(net.zyuiop.ovhapi.api.objects.nichandle.SshKey param0, java.lang.String keyName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sshKey/" + keyName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.Subscription getSubscriptionSubscriptionType(java.lang.String subscriptionType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/subscription/" + subscriptionType + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.Subscription.class);
	}

	public java.lang.String getInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org getIpOrganisationOrganisationId(java.lang.String organisationId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipOrganisation/" + organisationId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Order postFidelityAccountCreditOrder(long amount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/fidelityAccount/creditOrder";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("amount", amount);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.SlaService getSlaIdServices(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sla/" + id + "/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.SlaService.class);
	}

	public void putPaymentMeanPaypalId(net.zyuiop.ovhapi.api.objects.billing.Paypal param0, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/paypal/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putTaskDomainIdArgumentKey(net.zyuiop.ovhapi.api.objects.nichandle.DomainTaskArgument param0, long id, java.lang.String key) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/argument/" + key + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Bill getOrderOrderIdBill(long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/bill";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Bill.class);
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
		String callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact putContactContactId(long contactId, net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String cellPhone, java.lang.String phone, java.lang.String fax, java.util.Date birthDay, java.lang.String birthCity, java.lang.String birthZip, java.lang.String birthCountry, java.lang.String vat, java.lang.String companyNationalIdentificationNumber, java.lang.String nationalIdentificationNumber, java.lang.String organisationType, java.lang.String organisationName, java.lang.String email, java.lang.String firstName, java.lang.String gender, java.lang.String language, java.lang.String nationality, java.lang.String lastName, java.lang.String legalForm) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/contact/" + contactId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("address", address);
		dataMap.put("cellPhone", cellPhone);
		dataMap.put("phone", phone);
		dataMap.put("fax", fax);
		dataMap.put("birthDay", birthDay);
		dataMap.put("birthCity", birthCity);
		dataMap.put("birthZip", birthZip);
		dataMap.put("birthCountry", birthCountry);
		dataMap.put("vat", vat);
		dataMap.put("companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		dataMap.put("nationalIdentificationNumber", nationalIdentificationNumber);
		dataMap.put("organisationType", organisationType);
		dataMap.put("organisationName", organisationName);
		dataMap.put("email", email);
		dataMap.put("firstName", firstName);
		dataMap.put("gender", gender);
		dataMap.put("language", language);
		dataMap.put("nationality", nationality);
		dataMap.put("lastName", lastName);
		dataMap.put("legalForm", legalForm);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact putContactContactId(long contactId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/contact/" + contactId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public void postSshKey(java.lang.String key, java.lang.String keyName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sshKey";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("key", key);
		dataMap.put("keyName", keyName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postTaskDomainIdCancel(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/cancel";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getTaskEmailChange(java.lang.String state) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/emailChange";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getTaskEmailChange() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/emailChange";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.BillDetail getBillBillIdDetailsBillDetailId(java.lang.String billId, java.lang.String billDetailId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/bill/" + billId + "/details/" + billDetailId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.BillDetail.class);
	}

	public void postPasswordRecover(java.lang.String ovhId, java.lang.String ovhCompany) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/passwordRecover";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ovhId", ovhId);
		dataMap.put("ovhCompany", ovhCompany);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, false);
	}

	public void deleteApiCredentialCredentialId(long credentialId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/api/credential/" + credentialId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deletePaymentMeanBankAccountId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deletePaymentMeanCreditCardId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putAccessRestrictionIpDefaultRule(net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule param0) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/ipDefaultRule";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Order postOvhAccountOvhAccountIdRetrieveMoney(long amount, long bankAccountId, java.lang.String ovhAccountId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/retrieveMoney";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("amount", amount);
		dataMap.put("bankAccountId", bankAccountId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Order.class);
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
		String callUrl = "https://api.ovh.com/1.0/paymentMean/paypal/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Paypal.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanBankAccount(java.lang.String iban, java.lang.String ownerAddress, java.lang.String ownerName, java.lang.String bic, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("iban", iban);
		dataMap.put("ownerAddress", ownerAddress);
		dataMap.put("ownerName", ownerName);
		dataMap.put("bic", bic);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanBankAccount(java.lang.String iban, java.lang.String ownerAddress, java.lang.String ownerName, java.lang.String bic) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("iban", iban);
		dataMap.put("ownerAddress", ownerAddress);
		dataMap.put("ownerName", ownerName);
		dataMap.put("bic", bic);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public long[] getNotificationEmailHistory() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/notification/email/history";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/backupCode
	* Message : Missing identifier.
	*/


	public long[] getOvhAccountOvhAccountIdMovements(java.lang.String ovhAccountId, java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/movements";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getOvhAccountOvhAccountIdMovements(java.lang.String ovhAccountId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "/movements";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/sms/$id/sendCode
	* Message : Missing identifier.
	*/


	public long[] getPaymentMeanPaypal() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/paypal";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getIpOrganisation() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipOrganisation";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getRefundRefundIdDetails(java.lang.String refundId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/refund/" + refundId + "/details";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postTaskEmailChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/emailChange/" + id + "/refuse";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("token", token);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getTaskDomain(java.lang.String domain, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/domain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getTaskDomain() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/domain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Refund getRefundRefundId(java.lang.String refundId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/refund/" + refundId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Refund.class);
	}

	public void postTaskDomainIdAccelerate(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/accelerate";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postSlaIdApply(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sla/" + id + "/apply";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.AutomaticPaymentMean getAvailableAutomaticPaymentMeans() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/availableAutomaticPaymentMeans";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.AutomaticPaymentMean.class);
	}

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartitionMountpoint(java.lang.String templateName, java.lang.String schemeName, java.lang.String mountpoint) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition/" + mountpoint + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postAccessRestrictionTotpIdEnable(java.lang.String code, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/totp/" + id + "/enable";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.OvhAccount getOvhAccountOvhAccountId(java.lang.String ovhAccountId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ovhAccount/" + ovhAccountId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.OvhAccount.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /me/accessRestriction/backupCode/validate
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.nichandle.Ipxe postIpxeScript(java.lang.String script, java.lang.String name, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipxeScript";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("script", script);
		dataMap.put("name", name);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.Ipxe.class);
	}

	public java.lang.String getIpxeScript() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipxeScript";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getTaskContactChange(java.lang.String toAccount, java.lang.String askingAccount, java.lang.String state) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/contactChange";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getTaskContactChange() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/contactChange";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void postPaymentMeanPaypalIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/paypal/" + id + "/chooseAsDefaultPaymentMean";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillBillIdDetails(java.lang.String billId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/bill/" + billId + "/details";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getPaymentMeanCreditCard() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.agreements.Contract getAgreementsIdContract(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/agreements/" + id + "/contract";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.agreements.Contract.class);
	}

	public void deleteIpxeScriptName(java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ipxeScript/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postTaskEmailChangeIdAccept(java.lang.String token, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/emailChange/" + id + "/accept";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("token", token);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postInstallationTemplateTemplateNamePartitionScheme(long priority, java.lang.String name, java.lang.String templateName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("priority", priority);
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getInstallationTemplateTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteApiApplicationApplicationId(long applicationId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/api/application/" + applicationId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getTaskDomainIdArgument(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/argument";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postInstallationTemplate(java.lang.String defaultLanguage, java.lang.String name, java.lang.String baseTemplateName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("defaultLanguage", defaultLanguage);
		dataMap.put("name", name);
		dataMap.put("baseTemplateName", baseTemplateName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public boolean getSlaIdCanBeApplied(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sla/" + id + "/canBeApplied";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), boolean.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.OrderDetail getOrderOrderIdDetailsOrderDetailId(long orderId, long orderDetailId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/details/" + orderDetailId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.OrderDetail.class);
	}

	public void putSubscriptionSubscriptionType(net.zyuiop.ovhapi.api.objects.nichandle.Subscription param0, java.lang.String subscriptionType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/subscription/" + subscriptionType + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postInstallationTemplateTemplateNameCheckIntegrity(java.lang.String templateName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/checkIntegrity";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.api.Credential getApiCredentialCredentialId(long credentialId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/api/credential/" + credentialId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.api.Credential.class);
	}

	public java.lang.String getSubscription() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/subscription";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact postContact(net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String phone, java.lang.String email, java.lang.String firstName, java.lang.String language, java.lang.String lastName, java.lang.String legalForm, java.lang.String cellPhone, java.lang.String fax, java.util.Date birthDay, java.lang.String birthCity, java.lang.String birthZip, java.lang.String birthCountry, java.lang.String vat, java.lang.String companyNationalIdentificationNumber, java.lang.String nationalIdentificationNumber, java.lang.String organisationType, java.lang.String organisationName, java.lang.String gender, java.lang.String nationality) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/contact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("address", address);
		dataMap.put("phone", phone);
		dataMap.put("email", email);
		dataMap.put("firstName", firstName);
		dataMap.put("language", language);
		dataMap.put("lastName", lastName);
		dataMap.put("legalForm", legalForm);
		dataMap.put("cellPhone", cellPhone);
		dataMap.put("fax", fax);
		dataMap.put("birthDay", birthDay);
		dataMap.put("birthCity", birthCity);
		dataMap.put("birthZip", birthZip);
		dataMap.put("birthCountry", birthCountry);
		dataMap.put("vat", vat);
		dataMap.put("companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		dataMap.put("nationalIdentificationNumber", nationalIdentificationNumber);
		dataMap.put("organisationType", organisationType);
		dataMap.put("organisationName", organisationName);
		dataMap.put("gender", gender);
		dataMap.put("nationality", nationality);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public net.zyuiop.ovhapi.api.objects.contact.Contact postContact(net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String phone, java.lang.String email, java.lang.String firstName, java.lang.String language, java.lang.String lastName, java.lang.String legalForm) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/contact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("address", address);
		dataMap.put("phone", phone);
		dataMap.put("email", email);
		dataMap.put("firstName", firstName);
		dataMap.put("language", language);
		dataMap.put("lastName", lastName);
		dataMap.put("legalForm", legalForm);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.contact.Contact.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.BankAccount getPaymentMeanBankAccountId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.BankAccount.class);
	}

	public void postAutorenew(long renewDay) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/autorenew";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("renewDay", renewDay);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteSshKeyKeyName(java.lang.String keyName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sshKey/" + keyName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postAccessRestrictionSmsIdEnable(java.lang.String code, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/sms/" + id + "/enable";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getFidelityAccountMovements(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/fidelityAccount/movements";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getFidelityAccountMovements() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/fidelityAccount/movements";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getAccessRestrictionSms() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/sms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.CreditCard getPaymentMeanCreditCardId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.CreditCard.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanCreditCard(java.lang.String returnUrl, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("returnUrl", returnUrl);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanCreditCard() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/creditCard";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.Nichandle getMe() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//me";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.Nichandle.class);
	}

	public long[] getOrderOrderIdDetails(long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "/details";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getContact() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/contact";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
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
		String callUrl = "https://api.ovh.com/1.0/autorenew";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.NicAutorenewInfos.class);
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
		String callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.DomainTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.agreements.ContractAgreement getAgreementsId(long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/agreements/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.agreements.ContractAgreement.class);
	}

	public long[] getApiCredential(java.lang.String status, long applicationId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/api/credential";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getApiCredential() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/api/credential";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Bill getBillBillId(java.lang.String billId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/bill/" + billId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Bill.class);
	}

	public java.lang.String getOvhAccount() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ovhAccount";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(long step, java.lang.String filesystem, java.lang.String mountpoint, java.lang.String type, long size, java.lang.String templateName, java.lang.String schemeName, java.lang.String volumeName, long raid) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("step", step);
		dataMap.put("filesystem", filesystem);
		dataMap.put("mountpoint", mountpoint);
		dataMap.put("type", type);
		dataMap.put("size", size);
		dataMap.put("volumeName", volumeName);
		dataMap.put("raid", raid);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(long step, java.lang.String filesystem, java.lang.String mountpoint, java.lang.String type, long size, java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("step", step);
		dataMap.put("filesystem", filesystem);
		dataMap.put("mountpoint", mountpoint);
		dataMap.put("type", type);
		dataMap.put("size", size);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.RefundDetail getRefundRefundIdDetailsRefundDetailId(java.lang.String refundId, java.lang.String refundDetailId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/refund/" + refundId + "/details/" + refundDetailId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.RefundDetail.class);
	}

	public java.lang.String getDocument() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/document";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.Order getOrderOrderId(long orderId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/order/" + orderId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.Order.class);
	}

	public void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeName(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanPaypal(java.lang.String returnUrl, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/paypal";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("returnUrl", returnUrl);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanPaypal() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/paypal";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.DomainTaskArgument getTaskDomainIdArgumentKey(long id, java.lang.String key) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task/domain/" + id + "/argument/" + key + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.nichandle.DomainTaskArgument.class);
	}

	public long[] getAccessRestrictionIp() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessRestriction/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getSla() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sla";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getPaymentMeanBankAccount(java.lang.String state) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getPaymentMeanBankAccount() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/paymentMean/bankAccount";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

}
