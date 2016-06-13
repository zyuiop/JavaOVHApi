package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Order;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class OrderImpl implements Order { 

	private final OVHRawCalls client;

	public OrderImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHpcspotNewDuration(java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hpcspot/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getCdnDedicatedServiceNameQuota(long quota, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/quota";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingPrivateDatabaseServiceNameRam(java.lang.String ram, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/ram";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseSqlserverNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/sqlserver/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getIpLoadBalancingServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedServerServiceNameBackupStorage(long capacity, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/backupStorage";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getCloudProjectServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getCartCartIdCoupon(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/coupon";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

	public java.lang.String getLicenseWindowsServiceNameUpgrade(java.lang.String serviceName, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseWindowsServiceNameUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFailoverIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/failoverIP/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getFreefaxNew(long quantity) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/freefax/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpMigrationDuration(java.lang.String ip, java.lang.String token, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ipMigration/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicensePlesk() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnWebstorageServiceNameTraffic(long bandwidth, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/webstorage/" + serviceName + "/traffic";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCartCartIdCheckout(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/checkout";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getHostingPrivateDatabaseServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameAutomatedBackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/automatedBackup/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWorklightServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount, java.lang.String mondialRelayId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/accessory";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/accessory";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVeeamCloudConnectServiceNameUpgrade(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingWebServiceNameUpgrade(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHpcspotNew() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hpcspot/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getEmailExchangeOrganizationNameServiceExchangeService(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/domain
	* Message : Missing identifier.
	*/


	public java.lang.String getDedicatedServerServiceNameFailoverIP(java.lang.String country, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/failoverIP";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getVpsServiceNameCpanel(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/cpanel";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingWebServiceNameCdn(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cdn";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postCartCartIdAssign(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/assign";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameCredit(long amount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/credit";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("amount", amount);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyNew() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String email, java.lang.String city, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String organisation, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberSpecial";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberSpecial";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameUsbKeyDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/usbKey/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseCloudLinuxNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cloudLinux/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVpsServiceNamePlesk(java.lang.String domainNumber, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/plesk";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getRouterNew(java.lang.String vrack) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/router/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingWebNew(java.lang.String domain, java.lang.String offer, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingWebNew(java.lang.String domain, java.lang.String offer) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingWebServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCartCartIdSummary(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/summary";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicensePleskServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedServer() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedNashaNewDuration(java.lang.String datacenter, java.lang.String model, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/nasha/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("datacenter", datacenter);
		dataMap.put("model", model);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnWebstorageServiceNameStorageDuration(java.lang.String storage, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/webstorage/" + serviceName + "/storage/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceOutlookDuration(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/outlook/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("licence", licence);
		dataMap.put("primaryEmailAddress", primaryEmailAddress);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailDomainNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/domain/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("offer", offer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingPrivateDatabaseServiceNameRamDuration(java.lang.String ram, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/ram/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ram", ram);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicensePleskNew(java.lang.String version, java.lang.String ip, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicensePleskNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneZoneNameDnsAnycastDuration(java.lang.String zoneName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dnsAnycast/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedHousingServiceNameAPCDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/APC/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameSpla(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/spla";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String city, long pool, java.lang.String streetName, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberNogeographic";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		dataMap.put("country", country);
		dataMap.put("retractation", retractation);
		dataMap.put("legalform", legalform);
		dataMap.put("firstname", firstname);
		dataMap.put("ape", ape);
		dataMap.put("email", email);
		dataMap.put("city", city);
		dataMap.put("pool", pool);
		dataMap.put("streetName", streetName);
		dataMap.put("specificNumber", specificNumber);
		dataMap.put("siret", siret);
		dataMap.put("organisation", organisation);
		dataMap.put("socialNomination", socialNomination);
		dataMap.put("name", name);
		dataMap.put("phone", phone);
		dataMap.put("zip", zip);
		dataMap.put("streetNumber", streetNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberNogeographic";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		dataMap.put("country", country);
		dataMap.put("retractation", retractation);
		dataMap.put("legalform", legalform);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameKvmExpressDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/kvmExpress/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedCloudServiceNameUpgradeRessource(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, long upgradedRessourceId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/upgradeRessource";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedCloudServiceNameUpgradeRessource(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/upgradeRessource";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getEmailExchangeOrganizationNameServiceExchangeServiceAccount(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnWebstorageServiceNameTraffic(long bandwidth, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/webstorage/" + serviceName + "/traffic";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("bandwidth", bandwidth);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingServiceNamePop(java.lang.String pop, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/pop";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("pop", pop);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedServerServiceNameIpMigration(java.lang.String ip, java.lang.String token, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ipMigration";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedServerServiceNameIp(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String organisationId, java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedServerServiceNameIp(long blockSize, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicensePleskServiceNameUpgrade(java.lang.String serviceName, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicensePleskServiceNameUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailDomainNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/domain/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVpsServiceNameWindows(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/windows";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postFreefaxNew(long quantity) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/freefax/new";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("quantity", quantity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart postCart(java.lang.String ovhSubsidiary, java.lang.String description, java.util.Date expire) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ovhSubsidiary", ovhSubsidiary);
		dataMap.put("description", description);
		dataMap.put("expire", expire);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart postCart(java.lang.String ovhSubsidiary) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ovhSubsidiary", ovhSubsidiary);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseOfficeNewDuration(java.lang.String duration, long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/office/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("officeBusinessQuantity", officeBusinessQuantity);
		dataMap.put("officeProPlusQuantity", officeProPlusQuantity);
		dataMap.put("giftCode", giftCode);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseOfficeNewDuration(java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/office/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getHostingWebServiceNameExtraSqlPerso(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/extraSqlPerso";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount, double floor, double stair, java.lang.String streetNumberExtra, java.lang.String listNumbers, java.lang.String siret, java.lang.String groupNumber, java.lang.String comment, java.lang.String door, java.lang.String building) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/portability";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/portability";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameAdditionalDiskDuration(java.lang.String additionalDiskSize, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/additionalDisk/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("additionalDiskSize", additionalDiskSize);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/cart/$cartId/domainTransfer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cart/$cartId/domainTransfer
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.order.Order postRouterNewDuration(java.lang.String vrack, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/router/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("vrack", vrack);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseCloudLinuxNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cloudLinux/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration, java.lang.String organisationId, java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ip/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ip/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseVirtuozzoServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceOutlookDuration(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/outlook/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName, java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/ip";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("instanceId", instanceId);
		dataMap.put("quantity", quantity);
		dataMap.put("country", country);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/ip";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("instanceId", instanceId);
		dataMap.put("quantity", quantity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseWindows() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedServerServiceNameKvm(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/kvm";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cpanel/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		dataMap.put("serviceType", serviceType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cpanel/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public void putEmailExchangeOrganizationNameServiceExchangeServiceServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getEmailExchangeOrganizationNameService(java.lang.String organizationName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getVpsServiceNameAdditionalDisk(java.lang.String additionalDiskSize, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/additionalDisk";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameAutomatedBackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/automatedBackup/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedServerServiceNameBandwidth(long bandwidth, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/bandwidth";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseSqlserverServiceNameUpgrade(java.lang.String version, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/sqlserver/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceDiskSpace(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/diskSpace";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getCdnWebstorage() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/webstorage";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("offer", offer);
		dataMap.put("dnsZone", dnsZone);
		dataMap.put("module", module);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("offer", offer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVeeamCloudConnectServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("offer", offer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceUpgrade(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/upgrade";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameStaticIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/staticIP/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("country", country);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingServiceNameSsl(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/ssl";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cpanel/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cpanel/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getCdnDedicated() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameIpDuration(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("usage", usage);
		dataMap.put("country", country);
		dataMap.put("estimatedClientsNumber", estimatedClientsNumber);
		dataMap.put("description", description);
		dataMap.put("size", size);
		dataMap.put("networkName", networkName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFeatureDuration(java.lang.String feature, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/feature/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("feature", feature);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneZoneNameDnsAnycastDuration(java.lang.String zoneName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dnsAnycast/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration, java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		dataMap.put("country", country);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceAccountDuration(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		dataMap.put("licence", licence);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/directadmin/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		dataMap.put("serviceType", serviceType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/directadmin/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getIpLoadBalancing() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHpcspotNewDuration(java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hpcspot/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration, java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ip/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ip/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingPrivateDatabaseServiceNameRamDuration(java.lang.String ram, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + serviceName + "/ram/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameBandwidthDuration(long traffic, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/bandwidth/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedServerServiceNameUsbKey(long capacity, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/usbKey";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFirewallDuration(java.lang.String firewallModel, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/firewall/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseVirtuozzo() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberGeographic";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("zone", zone);
		dataMap.put("city", city);
		dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		dataMap.put("country", country);
		dataMap.put("retractation", retractation);
		dataMap.put("legalform", legalform);
		dataMap.put("firstname", firstname);
		dataMap.put("ape", ape);
		dataMap.put("email", email);
		dataMap.put("streetName", streetName);
		dataMap.put("pool", pool);
		dataMap.put("specificNumber", specificNumber);
		dataMap.put("siret", siret);
		dataMap.put("organisation", organisation);
		dataMap.put("socialNomination", socialNomination);
		dataMap.put("name", name);
		dataMap.put("phone", phone);
		dataMap.put("zip", zip);
		dataMap.put("streetNumber", streetNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberGeographic";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("zone", zone);
		dataMap.put("city", city);
		dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		dataMap.put("country", country);
		dataMap.put("retractation", retractation);
		dataMap.put("legalform", legalform);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/spare/new";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("shippingContactId", shippingContactId);
		dataMap.put("quantity", quantity);
		dataMap.put("brand", brand);
		dataMap.put("mondialRelayId", mondialRelayId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/spare/new";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("shippingContactId", shippingContactId);
		dataMap.put("quantity", quantity);
		dataMap.put("brand", brand);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedHousing() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/housing";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingServiceNamePop(java.lang.String pop, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/pop";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedServerServiceNameKvmExpress(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/kvmExpress";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameVeeamDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration, long quantity, long datacenterId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		dataMap.put("quantity", quantity);
		dataMap.put("datacenterId", datacenterId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingPrivateDatabaseNewDuration(java.lang.String version, java.lang.String ram, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedCloudServiceNameIp(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseCpanelNew(java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cpanel/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseCpanelNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cpanel/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameBandwidthDuration(long bandwidth, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/bandwidth/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameUsbKeyDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/usbKey/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("capacity", capacity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameCpanelDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/cpanel/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getCdnDedicatedServiceNameBackend(long backend, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/backend";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameCdnDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cdn/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("offer", offer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("powerpack", powerpack);
		dataMap.put("antispam", antispam);
		dataMap.put("applicationSet", applicationSet);
		dataMap.put("wordpressToolkit", wordpressToolkit);
		dataMap.put("languagePackNumber", languagePackNumber);
		dataMap.put("antivirus", antivirus);
		dataMap.put("domainNumber", domainNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem postCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId, java.lang.String label, java.lang.String value) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/item/" + itemId + "/configuration";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("label", label);
		dataMap.put("value", value);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem.class);
	}

	public java.lang.String getLicenseVirtuozzoNew(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseVirtuozzoNew(java.lang.String containerNumber, java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedCloudServiceNameAdditionalBandwidth(java.lang.String bandwidth, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/additionalBandwidth";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("offer", offer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseDirectadminNew(java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/directadmin/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseDirectadminNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/directadmin/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedHousingServiceNameAPC(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/APC";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration, long upgradedRessourceId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/upgradeRessource/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/upgradeRessource/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameBandwidthDuration(long bandwidth, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/bandwidth/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("bandwidth", bandwidth);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getSmsServiceNameCredits(long quantity, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/credits";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVrackNew(long quantity) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vrack/new";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("quantity", quantity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVrackNew() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vrack/new";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getCdnWebstorageServiceNameStorage(java.lang.String storage, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/webstorage/" + serviceName + "/storage";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingPrivateDatabase() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameSnapshotDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/snapshot/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getRouterNewDuration(java.lang.String vrack, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/router/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getCdnDedicatedServiceNameCacheRule(long cacheRule, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/cacheRule";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedServerServiceNameFirewall(java.lang.String firewallModel, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/firewall";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameCacheRuleDuration(long cacheRule, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/cacheRule/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("cacheRule", cacheRule);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameFtpbackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ftpbackup/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseSqlserverServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/sqlserver/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/item/$itemId
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameCdnDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/cdn/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseSqlserverNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/sqlserver/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount, java.lang.String mondialRelayId, java.lang.String zones) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem getCartCartIdItemItemIdConfigurationConfigurationId(java.lang.String cartId, long itemId, long configurationId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/item/" + itemId + "/configuration/" + configurationId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem.class);
	}

	public void deleteCartCartIdCoupon(java.lang.String cartId, java.lang.String coupon) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/coupon";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, false);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameBackendDuration(long backend, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/backend/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("backend", backend);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyNew() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/new";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVps() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpMigrationDuration(java.lang.String ip, java.lang.String token, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ipMigration/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ip", ip);
		dataMap.put("token", token);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameIpDuration(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/ip/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVpsServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/snapshot";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameExtraSqlPersoDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/extraSqlPerso/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("offer", offer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedNashaNewDuration(java.lang.String datacenter, java.lang.String model, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/nasha/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameProfessionalUseDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/professionalUse/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameProfessionalUseDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/professionalUse/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVrack() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vrack";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingWebServiceNameBandwidth(long traffic, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/bandwidth";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFeatureDuration(java.lang.String feature, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/feature/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameWindowsDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/windows/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/cart/$cartId/domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cart/$cartId/domain
	* Message : Missing identifier.
	*/


	public java.lang.String getDedicatedCloudServiceNameFiler(java.lang.String name, java.lang.String serviceName, long quantity, long datacenterId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedCloudServiceNameFiler(java.lang.String name, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseWorklightServiceNameUpgrade(java.lang.String version, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseWorklightNew(boolean lessThan1000Users, java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/worklight/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameCacheRuleDuration(long cacheRule, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/cacheRule/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWorklightNewDuration(boolean lessThan1000Users, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/worklight/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedHousingServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedCloudServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteCartCartId(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameBackupStorageDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/backupStorage/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String postCartCartIdCoupon(java.lang.String cartId, java.lang.String coupon) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/coupon";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("coupon", coupon);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

	public java.lang.String getSms() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart putCartCartId(java.lang.String cartId, java.lang.String description, java.util.Date expire) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("description", description);
		dataMap.put("expire", expire);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart putCartCartId(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public java.lang.String getDedicatedServerServiceNameFeature(java.lang.String feature, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/feature";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/xdsl/spare/new";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("shippingContactId", shippingContactId);
		dataMap.put("quantity", quantity);
		dataMap.put("brand", brand);
		dataMap.put("mondialRelayId", mondialRelayId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/xdsl/spare/new";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("shippingContactId", shippingContactId);
		dataMap.put("quantity", quantity);
		dataMap.put("brand", brand);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration, long quantity) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/host/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/host/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWorklightNewDuration(boolean lessThan1000Users, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/worklight/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("lessThan1000Users", lessThan1000Users);
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameSslDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ssl/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameBackendDuration(long backend, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/backend/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getEmailExchangeOrganizationNameServiceExchangeServiceOutlook(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/outlook";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseWorklightServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameUpgradeDuration(java.lang.String model, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVrackNew(long quantity) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vrack/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVrackNew() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vrack/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameQuotaDuration(long quota, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/quota/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public void deleteCartCartIdItemItemId(java.lang.String cartId, long itemId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/item/" + itemId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, false);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameKvmDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/kvm/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseCloudLinuxNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/cloudLinux/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnWebstorageServiceNameStorageDuration(java.lang.String storage, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/webstorage/" + serviceName + "/storage/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("storage", storage);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getEmailExchangeOrganizationNameServiceExchangeServiceServiceInfos(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public java.lang.String getLicenseWorklight() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/worklight";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameBackupStorageDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/backupStorage/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("capacity", capacity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameSslDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ssl/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getCloudProject() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cloud/project";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameChangeMainDomainDuration(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/changeMainDomain/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceAccountDuration(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameVeeamDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameKvmDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/kvm/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/overTheBox/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("offer", offer);
		dataMap.put("deviceId", deviceId);
		dataMap.put("voucher", voucher);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/overTheBox/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("offer", offer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVpsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration, long quantity, long datacenterId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getHostingWebServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/ssl";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteCartCartIdItemItemIdConfigurationConfigurationId(java.lang.String cartId, long itemId, long configurationId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/item/" + itemId + "/configuration/" + configurationId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getTelephonyBillingAccount(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount, java.lang.String mondialRelayId, java.lang.String zones) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("shippingContactId", shippingContactId);
		dataMap.put("types", types);
		dataMap.put("quantity", quantity);
		dataMap.put("brand", brand);
		dataMap.put("retractation", retractation);
		dataMap.put("offers", offers);
		dataMap.put("displayUniversalDirectories", displayUniversalDirectories);
		dataMap.put("ownerContactIds", ownerContactIds);
		dataMap.put("extraSimultaneousLines", extraSimultaneousLines);
		dataMap.put("mondialRelayId", mondialRelayId);
		dataMap.put("zones", zones);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("shippingContactId", shippingContactId);
		dataMap.put("types", types);
		dataMap.put("quantity", quantity);
		dataMap.put("brand", brand);
		dataMap.put("retractation", retractation);
		dataMap.put("offers", offers);
		dataMap.put("displayUniversalDirectories", displayUniversalDirectories);
		dataMap.put("ownerContactIds", ownerContactIds);
		dataMap.put("extraSimultaneousLines", extraSimultaneousLines);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameStaticIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/staticIP/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameChangeMainDomainDuration(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/changeMainDomain/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("mxplan", mxplan);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCartCartIdCheckout(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/checkout";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameAdditionalBandwidthDuration(java.lang.String bandwidth, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/additionalBandwidth/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseSqlserverServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/sqlserver/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseSqlserverNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/sqlserver/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName, java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/domainTransfer
	* Message : Missing identifier.
	*/


	public java.lang.String getTelephony() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVeeamCloudConnectServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedNashaNew(java.lang.String datacenter, java.lang.String model) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/nasha/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/spare/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/spare/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/overTheBox/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/overTheBox/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount, double floor, double stair, java.lang.String streetNumberExtra, java.lang.String listNumbers, java.lang.String siret, java.lang.String groupNumber, java.lang.String comment, java.lang.String door, java.lang.String building) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/portability";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("socialReason", socialReason);
		dataMap.put("offer", offer);
		dataMap.put("contactNumber", contactNumber);
		dataMap.put("city", city);
		dataMap.put("streetName", streetName);
		dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		dataMap.put("country", country);
		dataMap.put("callNumber", callNumber);
		dataMap.put("firstName", firstName);
		dataMap.put("contactName", contactName);
		dataMap.put("streetType", streetType);
		dataMap.put("name", name);
		dataMap.put("zip", zip);
		dataMap.put("desireDate", desireDate);
		dataMap.put("streetNumber", streetNumber);
		dataMap.put("type", type);
		dataMap.put("floor", floor);
		dataMap.put("stair", stair);
		dataMap.put("streetNumberExtra", streetNumberExtra);
		dataMap.put("listNumbers", listNumbers);
		dataMap.put("siret", siret);
		dataMap.put("groupNumber", groupNumber);
		dataMap.put("comment", comment);
		dataMap.put("door", door);
		dataMap.put("building", building);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/portability";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("socialReason", socialReason);
		dataMap.put("offer", offer);
		dataMap.put("contactNumber", contactNumber);
		dataMap.put("city", city);
		dataMap.put("streetName", streetName);
		dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		dataMap.put("country", country);
		dataMap.put("callNumber", callNumber);
		dataMap.put("firstName", firstName);
		dataMap.put("contactName", contactName);
		dataMap.put("streetType", streetType);
		dataMap.put("name", name);
		dataMap.put("zip", zip);
		dataMap.put("desireDate", desireDate);
		dataMap.put("streetNumber", streetNumber);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameAdditionalBandwidthDuration(java.lang.String bandwidth, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/additionalBandwidth/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("bandwidth", bandwidth);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameExtraSqlPersoDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/extraSqlPerso/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedHousingServiceNameAPCDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/housing/" + serviceName + "/APC/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseVirtuozzoServiceNameUpgrade(java.lang.String containerNumber, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration, long quantity) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/host/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		dataMap.put("datacenterId", datacenterId);
		dataMap.put("quantity", quantity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/host/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		dataMap.put("datacenterId", datacenterId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getIpLoadBalancingNew(java.lang.String pop) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("sqlVersion", sqlVersion);
		dataMap.put("version", version);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postSmsServiceNameCredits(long quantity, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/credits";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("quantity", quantity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedCloudServiceNameHost(java.lang.String name, long datacenterId, java.lang.String serviceName, long quantity) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/host";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedCloudServiceNameHost(java.lang.String name, long datacenterId, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/host";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceDiskSpace(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/diskSpace";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDedicatedServerServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseOfficeNew(long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/office/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseOfficeNew() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/office/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements getCartCartIdItemItemIdRequiredConfiguration(java.lang.String cartId, long itemId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/item/" + itemId + "/requiredConfiguration";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("containerNumber", containerNumber);
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		dataMap.put("serviceType", serviceType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("containerNumber", containerNumber);
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberGeographic";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberGeographic";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameFtpbackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ftpbackup/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getOverTheBoxNew(java.lang.String offer, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/overTheBox/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getOverTheBoxNew(java.lang.String offer) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/overTheBox/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getCdnWebstorageServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/webstorage/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingPrivateDatabaseNew(java.lang.String version, java.lang.String ram) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameCpanelDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/cpanel/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		dataMap.put("sqlVersion", sqlVersion);
		dataMap.put("serviceType", serviceType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameSnapshotDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/snapshot/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneNew(java.lang.String zoneName, boolean minimized) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/new";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("zoneName", zoneName);
		dataMap.put("minimized", minimized);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneNew(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/new";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("zoneName", zoneName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoServiceNameUpgradeDuration(java.lang.String containerNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceUpgrade(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getDomainZoneZoneName(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVeeamCloudConnect() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/veeamCloudConnect";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameSpla(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/spla";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameBandwidthDuration(long traffic, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/bandwidth/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("traffic", traffic);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVpsServiceNameFtpbackup(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ftpbackup";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingPrivateDatabaseNewDuration(java.lang.String version, java.lang.String ram, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ram", ram);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration, long upgradedRessourceId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/upgradeRessource/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("upgradedRessourceType", upgradedRessourceType);
		dataMap.put("upgradeType", upgradeType);
		dataMap.put("upgradedRessourceId", upgradedRessourceId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/upgradeRessource/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("upgradedRessourceType", upgradedRessourceType);
		dataMap.put("upgradeType", upgradeType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseWindowsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/xdsl/spare/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/xdsl/spare/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingNewDuration(java.lang.String pop, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("pop", pop);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingServiceNameSsl(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/ssl";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVpsServiceNameAutomatedBackup(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/automatedBackup";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getCart(java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getCart() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainZoneZoneNameDnsAnycast(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/" + zoneName + "/dnsAnycast";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getVpsServiceNameUpgrade(java.lang.String model, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/upgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseOfficeNewDuration(java.lang.String duration, long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/office/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseOfficeNewDuration(java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/office/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoServiceNameUpgradeDuration(java.lang.String containerNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/virtuozzo/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("containerNumber", containerNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		dataMap.put("powerpack", powerpack);
		dataMap.put("serviceType", serviceType);
		dataMap.put("applicationSet", applicationSet);
		dataMap.put("wordpressToolkit", wordpressToolkit);
		dataMap.put("languagePackNumber", languagePackNumber);
		dataMap.put("antivirus", antivirus);
		dataMap.put("domainNumber", domainNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/plesk/new/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getCdnDedicatedServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameKvmExpressDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/kvmExpress/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart getCartCartId(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public java.lang.String getVpsServiceNameIp(long number, java.lang.String serviceName, java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getVpsServiceNameIp(long number, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseWindowsNew(java.lang.String version, java.lang.String ip, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseWindowsNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/windows/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFailoverIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/failoverIP/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("country", country);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseSqlserverServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/sqlserver/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("version", version);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVeeamCloudConnectServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedServerServiceNameProfessionalUse(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/professionalUse";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainZone() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameWindowsDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/windows/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFirewallDuration(java.lang.String firewallModel, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/firewall/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("firewallModel", firewallModel);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameCredit(long amount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cloud/project/" + serviceName + "/credit";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameAdditionalDiskDuration(java.lang.String additionalDiskSize, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/additionalDisk/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public long[] getCartCartIdItem(java.lang.String cartId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/item";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/directadmin/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/directadmin/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getEmailExchange() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/exchange";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingNewDuration(java.lang.String pop, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameUpgradeDuration(java.lang.String model, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("model", model);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getLicenseSqlserver() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/sqlserver";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String email, java.lang.String city, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String organisation, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberSpecial";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("typology", typology);
		dataMap.put("ape", ape);
		dataMap.put("range", range);
		dataMap.put("siret", siret);
		dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		dataMap.put("country", country);
		dataMap.put("socialNomination", socialNomination);
		dataMap.put("retractation", retractation);
		dataMap.put("legalform", legalform);
		dataMap.put("firstname", firstname);
		dataMap.put("email", email);
		dataMap.put("city", city);
		dataMap.put("streetName", streetName);
		dataMap.put("pool", pool);
		dataMap.put("specificNumber", specificNumber);
		dataMap.put("organisation", organisation);
		dataMap.put("name", name);
		dataMap.put("phone", phone);
		dataMap.put("zip", zip);
		dataMap.put("streetNumber", streetNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberSpecial";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("typology", typology);
		dataMap.put("ape", ape);
		dataMap.put("range", range);
		dataMap.put("siret", siret);
		dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		dataMap.put("country", country);
		dataMap.put("socialNomination", socialNomination);
		dataMap.put("retractation", retractation);
		dataMap.put("legalform", legalform);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneNew(java.lang.String zoneName, boolean minimized) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneNew(java.lang.String zoneName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getVpsServiceNameVeeam(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/veeam";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWorklightServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/upgrade/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration, java.lang.String organisationId, java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("blockSize", blockSize);
		dataMap.put("type", type);
		dataMap.put("organisationId", organisationId);
		dataMap.put("country", country);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("blockSize", blockSize);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/new/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount, java.lang.String mondialRelayId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/accessory";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("retractation", retractation);
		dataMap.put("shippingContactId", shippingContactId);
		dataMap.put("accessory", accessory);
		dataMap.put("quantity", quantity);
		dataMap.put("mondialRelayId", mondialRelayId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/accessory";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("retractation", retractation);
		dataMap.put("shippingContactId", shippingContactId);
		dataMap.put("accessory", accessory);
		dataMap.put("quantity", quantity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameQuotaDuration(long quota, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/quota/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("quota", quota);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getHostingWebServiceNameChangeMainDomain(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/" + serviceName + "/changeMainDomain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedServerServiceNameStaticIP(java.lang.String country, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/" + serviceName + "/staticIP";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNamePleskDuration(java.lang.String domainNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/plesk/" + duration + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getEmailDomain() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/domain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String city, long pool, java.lang.String streetName, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberNogeographic";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/numberNogeographic";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String getEmailDomainNew(java.lang.String domain, java.lang.String offer) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/email/domain/new";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getVrackServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedCloud() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getHostingWeb() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getSmsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId, java.lang.String label) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/item/" + itemId + "/configuration";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cart/" + cartId + "/item/" + itemId + "/configuration";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNamePleskDuration(java.lang.String domainNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/" + serviceName + "/plesk/" + duration + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domainNumber", domainNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

}
