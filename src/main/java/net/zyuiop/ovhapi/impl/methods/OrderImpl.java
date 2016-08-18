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

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String city, long pool, java.lang.String streetName, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberNogeographic";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		__dataMap.put("country", country);
		__dataMap.put("retractation", retractation);
		__dataMap.put("legalform", legalform);
		__dataMap.put("firstname", firstname);
		__dataMap.put("ape", ape);
		__dataMap.put("email", email);
		__dataMap.put("city", city);
		__dataMap.put("pool", pool);
		__dataMap.put("streetName", streetName);
		__dataMap.put("specificNumber", specificNumber);
		__dataMap.put("siret", siret);
		__dataMap.put("organisation", organisation);
		__dataMap.put("socialNomination", socialNomination);
		__dataMap.put("name", name);
		__dataMap.put("phone", phone);
		__dataMap.put("zip", zip);
		__dataMap.put("streetNumber", streetNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberNogeographic";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		__dataMap.put("country", country);
		__dataMap.put("retractation", retractation);
		__dataMap.put("legalform", legalform);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFirewallDuration(java.lang.String firewallModel, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/firewall/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("firewallModel", firewallModel);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration, java.lang.String organisationId, java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("blockSize", blockSize);
		__dataMap.put("type", type);
		__dataMap.put("organisationId", organisationId);
		__dataMap.put("country", country);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("blockSize", blockSize);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getSmsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/sms/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameProfessionalUseDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/professionalUse/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getCloudProject() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServerServiceNameBandwidth(long bandwidth, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/bandwidth";
		String __data = "?";
		__data += "bandwidth=" + bandwidth;
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFeatureDuration(java.lang.String feature, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/feature/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("feature", feature);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration, long quantity, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/filer/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("quantity", quantity);
		__dataMap.put("datacenterId", datacenterId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/filer/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getHostingWebServiceNameUpgrade(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameCpanelDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/cpanel/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseOfficeNewDuration(java.lang.String duration, long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/office/new/" + duration + "";
		String __data = "?";
		__data += "duration=" + duration;
		__data += "officeBusinessQuantity=" + officeBusinessQuantity;
		__data += "officeProPlusQuantity=" + officeProPlusQuantity;
		__data += "giftCode=" + giftCode;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseOfficeNewDuration(java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/office/new/" + duration + "";
		String __data = "?";
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseWorklightServiceNameUpgrade(java.lang.String version, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "version=" + version;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVpsServiceNamePlesk(java.lang.String domainNumber, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/plesk";
		String __data = "?";
		__data += "domainNumber=" + domainNumber;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingWebNew(java.lang.String domain, java.lang.String offer, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/new";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "offer=" + offer;
		__data += "dnsZone=" + dnsZone;
		__data += "module=" + module;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingWebNew(java.lang.String domain, java.lang.String offer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/new";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "offer=" + offer;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements[] getCartCartIdItemItemIdRequiredConfiguration(java.lang.String cartId, long itemId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "/requiredConfiguration";
		String __data = "?";
		__data += "cartId=" + cartId;
		__data += "itemId=" + itemId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceUpgrade(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/upgrade";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseVirtuozzo() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getCartCartIdCoupon(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/coupon";
		String __data = "?";
		__data += "cartId=" + cartId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseSqlserverServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnWebstorageServiceNameStorageDuration(java.lang.String storage, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage/" + serviceName + "/storage/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("storage", storage);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVpsServiceNameIp(long number, java.lang.String serviceName, java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ip";
		String __data = "?";
		__data += "number=" + number;
		__data += "serviceName=" + serviceName;
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVpsServiceNameIp(long number, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ip";
		String __data = "?";
		__data += "number=" + number;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/new/" + duration + "";
		String __data = "?";
		__data += "containerNumber=" + containerNumber;
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		__data += "serviceType=" + serviceType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/new/" + duration + "";
		String __data = "?";
		__data += "containerNumber=" + containerNumber;
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseWorklightServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceDiskSpace(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/diskSpace";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameStaticIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/staticIP/" + duration + "";
		String __data = "?";
		__data += "country=" + country;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseOfficeNew(long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/office/new";
		String __data = "?";
		__data += "officeBusinessQuantity=" + officeBusinessQuantity;
		__data += "officeProPlusQuantity=" + officeProPlusQuantity;
		__data += "giftCode=" + giftCode;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseOfficeNew() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/office/new";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceUpgrade(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/upgrade";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameAutomatedBackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/automatedBackup/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameIpDuration(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/ip/" + duration + "";
		String __data = "?";
		__data += "usage=" + usage;
		__data += "country=" + country;
		__data += "estimatedClientsNumber=" + estimatedClientsNumber;
		__data += "description=" + description;
		__data += "size=" + size;
		__data += "networkName=" + networkName;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getCdnWebstorage() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteCartCartIdCoupon(java.lang.String cartId, java.lang.String coupon) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/coupon";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, false);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameSslDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/ssl/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyNew() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/new";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseCpanelNew(java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cpanel/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "serviceType=" + serviceType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseCpanelNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cpanel/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServerServiceNameIpMigration(java.lang.String ip, java.lang.String token, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ipMigration";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "token=" + token;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseCloudLinuxNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cloudLinux/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseWindowsServiceNameUpgrade(java.lang.String serviceName, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "sqlVersion=" + sqlVersion;
		__data += "version=" + version;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseWindowsServiceNameUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem postCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId, java.lang.String label, java.lang.String value) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "/configuration";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("label", label);
		__dataMap.put("value", value);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem.class);
	}

	public java.lang.String[] getVpsServiceNameWindows(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/windows";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedCloud() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameSnapshotDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/snapshot/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getHostingWebServiceNameCdn(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/cdn";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVrack() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vrack";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameKvmExpressDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/kvmExpress/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public void postCartCartIdAssign(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/assign";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/spare/new";
		String __data = "?";
		__data += "shippingContactId=" + shippingContactId;
		__data += "quantity=" + quantity;
		__data += "brand=" + brand;
		__data += "mondialRelayId=" + mondialRelayId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/spare/new";
		String __data = "?";
		__data += "shippingContactId=" + shippingContactId;
		__data += "quantity=" + quantity;
		__data += "brand=" + brand;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpMigrationDuration(java.lang.String ip, java.lang.String token, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ipMigration/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		__dataMap.put("token", token);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameQuotaDuration(long quota, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/quota/" + duration + "";
		String __data = "?";
		__data += "quota=" + quota;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public void putEmailExchangeOrganizationNameServiceExchangeServiceServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getHostingWebServiceNameBandwidth(long traffic, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/bandwidth";
		String __data = "?";
		__data += "traffic=" + traffic;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getRouterNew(java.lang.String vrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/router/new";
		String __data = "?";
		__data += "vrack=" + vrack;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount, java.lang.String mondialRelayId, java.lang.String zones) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/line";
		String __data = "?";
		__data += "shippingContactId=" + shippingContactId;
		__data += "types=" + types;
		__data += "quantity=" + quantity;
		__data += "brand=" + brand;
		__data += "retractation=" + retractation;
		__data += "offers=" + offers;
		__data += "displayUniversalDirectories=" + displayUniversalDirectories;
		__data += "ownerContactIds=" + ownerContactIds;
		__data += "extraSimultaneousLines=" + extraSimultaneousLines;
		__data += "billingAccount=" + billingAccount;
		__data += "mondialRelayId=" + mondialRelayId;
		__data += "zones=" + zones;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/line";
		String __data = "?";
		__data += "shippingContactId=" + shippingContactId;
		__data += "types=" + types;
		__data += "quantity=" + quantity;
		__data += "brand=" + brand;
		__data += "retractation=" + retractation;
		__data += "offers=" + offers;
		__data += "displayUniversalDirectories=" + displayUniversalDirectories;
		__data += "ownerContactIds=" + ownerContactIds;
		__data += "extraSimultaneousLines=" + extraSimultaneousLines;
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameWindowsDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/windows/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedServerServiceNameProfessionalUse(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/professionalUse";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Item getCartCartIdItemItemId(java.lang.String cartId, long itemId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "";
		String __data = "?";
		__data += "cartId=" + cartId;
		__data += "itemId=" + itemId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Item.class);
	}

	public java.lang.String[] getDedicatedCloudServiceNameUpgradeRessource(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, long upgradedRessourceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/upgradeRessource";
		String __data = "?";
		__data += "upgradedRessourceType=" + upgradedRessourceType;
		__data += "upgradeType=" + upgradeType;
		__data += "serviceName=" + serviceName;
		__data += "upgradedRessourceId=" + upgradedRessourceId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedCloudServiceNameUpgradeRessource(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/upgradeRessource";
		String __data = "?";
		__data += "upgradedRessourceType=" + upgradedRessourceType;
		__data += "upgradeType=" + upgradeType;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingWeb() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingWebServiceNameExtraSqlPerso(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/extraSqlPerso";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getEmailExchangeOrganizationNameService(java.lang.String organizationName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameAdditionalBandwidthDuration(java.lang.String bandwidth, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/additionalBandwidth/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("bandwidth", bandwidth);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration, java.lang.String organisationId, java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ip/" + duration + "";
		String __data = "?";
		__data += "blockSize=" + blockSize;
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		__data += "organisationId=" + organisationId;
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ip/" + duration + "";
		String __data = "?";
		__data += "blockSize=" + blockSize;
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount, double floor, double stair, java.lang.String streetNumberExtra, java.lang.String listNumbers, java.lang.String siret, java.lang.String groupNumber, java.lang.String comment, java.lang.String door, java.lang.String building) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/portability";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("socialReason", socialReason);
		__dataMap.put("offer", offer);
		__dataMap.put("contactNumber", contactNumber);
		__dataMap.put("city", city);
		__dataMap.put("streetName", streetName);
		__dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		__dataMap.put("country", country);
		__dataMap.put("callNumber", callNumber);
		__dataMap.put("firstName", firstName);
		__dataMap.put("contactName", contactName);
		__dataMap.put("streetType", streetType);
		__dataMap.put("name", name);
		__dataMap.put("zip", zip);
		__dataMap.put("desireDate", desireDate);
		__dataMap.put("streetNumber", streetNumber);
		__dataMap.put("type", type);
		__dataMap.put("floor", floor);
		__dataMap.put("stair", stair);
		__dataMap.put("streetNumberExtra", streetNumberExtra);
		__dataMap.put("listNumbers", listNumbers);
		__dataMap.put("siret", siret);
		__dataMap.put("groupNumber", groupNumber);
		__dataMap.put("comment", comment);
		__dataMap.put("door", door);
		__dataMap.put("building", building);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/portability";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("socialReason", socialReason);
		__dataMap.put("offer", offer);
		__dataMap.put("contactNumber", contactNumber);
		__dataMap.put("city", city);
		__dataMap.put("streetName", streetName);
		__dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		__dataMap.put("country", country);
		__dataMap.put("callNumber", callNumber);
		__dataMap.put("firstName", firstName);
		__dataMap.put("contactName", contactName);
		__dataMap.put("streetType", streetType);
		__dataMap.put("name", name);
		__dataMap.put("zip", zip);
		__dataMap.put("desireDate", desireDate);
		__dataMap.put("streetNumber", streetNumber);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNamePleskDuration(java.lang.String domainNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/plesk/" + duration + "";
		String __data = "?";
		__data += "domainNumber=" + domainNumber;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("sqlVersion", sqlVersion);
		__dataMap.put("version", version);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedServerServiceNameStaticIP(java.lang.String country, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/staticIP";
		String __data = "?";
		__data += "country=" + country;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServerServiceNameFirewall(java.lang.String firewallModel, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/firewall";
		String __data = "?";
		__data += "firewallModel=" + firewallModel;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedCloudServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cpanel/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		__dataMap.put("serviceType", serviceType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cpanel/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getFreefaxNew(long quantity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/freefax/new";
		String __data = "?";
		__data += "quantity=" + quantity;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameExtraSqlPersoDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/extraSqlPerso/" + duration + "";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration, java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		__dataMap.put("country", country);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVpsServiceNameUpgrade(java.lang.String model, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "model=" + model;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getEmailExchangeOrganizationNameServiceExchangeServiceServiceInfos(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/serviceInfos";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("offer", offer);
		__dataMap.put("dnsZone", dnsZone);
		__dataMap.put("module", module);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("offer", offer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameFtpbackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ftpbackup/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameCacheRuleDuration(long cacheRule, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/cacheRule/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("cacheRule", cacheRule);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVpsServiceNameFtpbackup(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ftpbackup";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String email, java.lang.String city, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String organisation, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberSpecial";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("typology", typology);
		__dataMap.put("ape", ape);
		__dataMap.put("range", range);
		__dataMap.put("siret", siret);
		__dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		__dataMap.put("country", country);
		__dataMap.put("socialNomination", socialNomination);
		__dataMap.put("retractation", retractation);
		__dataMap.put("legalform", legalform);
		__dataMap.put("firstname", firstname);
		__dataMap.put("email", email);
		__dataMap.put("city", city);
		__dataMap.put("streetName", streetName);
		__dataMap.put("pool", pool);
		__dataMap.put("specificNumber", specificNumber);
		__dataMap.put("organisation", organisation);
		__dataMap.put("name", name);
		__dataMap.put("phone", phone);
		__dataMap.put("zip", zip);
		__dataMap.put("streetNumber", streetNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberSpecial";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("typology", typology);
		__dataMap.put("ape", ape);
		__dataMap.put("range", range);
		__dataMap.put("siret", siret);
		__dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		__dataMap.put("country", country);
		__dataMap.put("socialNomination", socialNomination);
		__dataMap.put("retractation", retractation);
		__dataMap.put("legalform", legalform);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWorklightServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFeatureDuration(java.lang.String feature, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/feature/" + duration + "";
		String __data = "?";
		__data += "feature=" + feature;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameCpanelDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/cpanel/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public void deleteCartCartIdItemItemIdConfigurationConfigurationId(java.lang.String cartId, long itemId, long configurationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "/configuration/" + configurationId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnWebstorageServiceNameTraffic(long bandwidth, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage/" + serviceName + "/traffic";
		String __data = "?";
		__data += "bandwidth=" + bandwidth;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/spare/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("shippingContactId", shippingContactId);
		__dataMap.put("quantity", quantity);
		__dataMap.put("brand", brand);
		__dataMap.put("mondialRelayId", mondialRelayId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/spare/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("shippingContactId", shippingContactId);
		__dataMap.put("quantity", quantity);
		__dataMap.put("brand", brand);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameStaticIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/staticIP/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("country", country);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameQuotaDuration(long quota, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/quota/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("quota", quota);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingServiceNameSsl(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/" + serviceName + "/ssl";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseSqlserver() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameAdditionalDiskDuration(java.lang.String additionalDiskSize, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/additionalDisk/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("additionalDiskSize", additionalDiskSize);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingPrivateDatabaseNewDuration(java.lang.String version, java.lang.String ram, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ram", ram);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration, long quantity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/host/" + duration + "";
		String __data = "?";
		__data += "name=" + name;
		__data += "datacenterId=" + datacenterId;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		__data += "quantity=" + quantity;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/host/" + duration + "";
		String __data = "?";
		__data += "name=" + name;
		__data += "datacenterId=" + datacenterId;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public long[] getCartCartIdItem(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item";
		String __data = "?";
		__data += "cartId=" + cartId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneZoneNameDnsAnycastDuration(java.lang.String zoneName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/" + zoneName + "/dnsAnycast/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicensePleskServiceNameUpgrade(java.lang.String serviceName, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "version=" + version;
		__data += "powerpack=" + powerpack;
		__data += "antispam=" + antispam;
		__data += "applicationSet=" + applicationSet;
		__data += "wordpressToolkit=" + wordpressToolkit;
		__data += "languagePackNumber=" + languagePackNumber;
		__data += "antivirus=" + antivirus;
		__data += "domainNumber=" + domainNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicensePleskServiceNameUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneZoneNameDnsAnycastDuration(java.lang.String zoneName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/" + zoneName + "/dnsAnycast/" + duration + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getCdnDedicatedServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameBackendDuration(long backend, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/backend/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("backend", backend);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameUsbKeyDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/usbKey/" + duration + "";
		String __data = "?";
		__data += "capacity=" + capacity;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFailoverIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/failoverIP/" + duration + "";
		String __data = "?";
		__data += "country=" + country;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String city, long pool, java.lang.String streetName, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberNogeographic";
		String __data = "?";
		__data += "displayUniversalDirectory=" + displayUniversalDirectory;
		__data += "country=" + country;
		__data += "retractation=" + retractation;
		__data += "legalform=" + legalform;
		__data += "billingAccount=" + billingAccount;
		__data += "firstname=" + firstname;
		__data += "ape=" + ape;
		__data += "email=" + email;
		__data += "city=" + city;
		__data += "pool=" + pool;
		__data += "streetName=" + streetName;
		__data += "specificNumber=" + specificNumber;
		__data += "siret=" + siret;
		__data += "organisation=" + organisation;
		__data += "socialNomination=" + socialNomination;
		__data += "name=" + name;
		__data += "phone=" + phone;
		__data += "zip=" + zip;
		__data += "streetNumber=" + streetNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberNogeographic";
		String __data = "?";
		__data += "displayUniversalDirectory=" + displayUniversalDirectory;
		__data += "country=" + country;
		__data += "retractation=" + retractation;
		__data += "legalform=" + legalform;
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getHostingPrivateDatabase() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVpsServiceNameVeeam(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/veeam";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getCdnDedicatedServiceNameQuota(long quota, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/quota";
		String __data = "?";
		__data += "quota=" + quota;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVpsServiceNameAdditionalDisk(java.lang.String additionalDiskSize, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/additionalDisk";
		String __data = "?";
		__data += "additionalDiskSize=" + additionalDiskSize;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration, long upgradedRessourceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/upgradeRessource/" + duration + "";
		String __data = "?";
		__data += "upgradedRessourceType=" + upgradedRessourceType;
		__data += "upgradeType=" + upgradeType;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		__data += "upgradedRessourceId=" + upgradedRessourceId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/upgradeRessource/" + duration + "";
		String __data = "?";
		__data += "upgradedRessourceType=" + upgradedRessourceType;
		__data += "upgradeType=" + upgradeType;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHpcspotNewDuration(java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hpcspot/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getHostingWebServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/ssl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWorklightNewDuration(boolean lessThan1000Users, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("lessThan1000Users", lessThan1000Users);
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getIpLoadBalancingServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceAccountDuration(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + duration + "";
		String __data = "?";
		__data += "number=" + number;
		__data += "licence=" + licence;
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceDiskSpace(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/diskSpace";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedHousingServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/housing/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVeeamCloudConnectServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/veeamCloudConnect/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameBandwidthDuration(long bandwidth, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/bandwidth/" + duration + "";
		String __data = "?";
		__data += "bandwidth=" + bandwidth;
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration, long quantity, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/filer/" + duration + "";
		String __data = "?";
		__data += "name=" + name;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		__data += "quantity=" + quantity;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/filer/" + duration + "";
		String __data = "?";
		__data += "name=" + name;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameCdnDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/cdn/" + duration + "";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName, java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project/" + serviceName + "/ip";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("instanceId", instanceId);
		__dataMap.put("quantity", quantity);
		__dataMap.put("country", country);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project/" + serviceName + "/ip";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("instanceId", instanceId);
		__dataMap.put("quantity", quantity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameKvmExpressDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/kvmExpress/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingNewDuration(java.lang.String pop, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/new/" + duration + "";
		String __data = "?";
		__data += "pop=" + pop;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceOutlookDuration(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/outlook/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("licence", licence);
		__dataMap.put("primaryEmailAddress", primaryEmailAddress);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration, long quantity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/host/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("datacenterId", datacenterId);
		__dataMap.put("quantity", quantity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/host/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("datacenterId", datacenterId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getCdnDedicatedServiceNameCacheRule(long cacheRule, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/cacheRule";
		String __data = "?";
		__data += "cacheRule=" + cacheRule;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameCdnDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/cdn/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("offer", offer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameBandwidthDuration(long bandwidth, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/bandwidth/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("bandwidth", bandwidth);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicensePlesk() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseSqlserverNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseWorklight() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameSslDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/ssl/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getEmailDomain() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/domain";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingServiceNameSsl(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/" + serviceName + "/ssl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart getCartCartId(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "";
		String __data = "?";
		__data += "cartId=" + cartId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameCredit(long amount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project/" + serviceName + "/credit";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("amount", amount);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount, java.lang.String mondialRelayId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/accessory";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("retractation", retractation);
		__dataMap.put("shippingContactId", shippingContactId);
		__dataMap.put("accessory", accessory);
		__dataMap.put("quantity", quantity);
		__dataMap.put("mondialRelayId", mondialRelayId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/accessory";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("retractation", retractation);
		__dataMap.put("shippingContactId", shippingContactId);
		__dataMap.put("accessory", accessory);
		__dataMap.put("quantity", quantity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getIpLoadBalancing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseVirtuozzoServiceNameUpgrade(java.lang.String containerNumber, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "containerNumber=" + containerNumber;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVrackNew(long quantity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vrack/new";
		String __data = "?";
		__data += "quantity=" + quantity;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVrackNew() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vrack/new";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVps() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getRouterNewDuration(java.lang.String vrack, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/router/new/" + duration + "";
		String __data = "?";
		__data += "vrack=" + vrack;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseWorklightNew(boolean lessThan1000Users, java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/new";
		String __data = "?";
		__data += "lessThan1000Users=" + lessThan1000Users;
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCartCartIdCheckout(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/checkout";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyNew() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public long[] getCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId, java.lang.String label) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "/configuration";
		String __data = "?";
		__data += "cartId=" + cartId;
		__data += "itemId=" + itemId;
		__data += "label=" + label;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "/configuration";
		String __data = "?";
		__data += "cartId=" + cartId;
		__data += "itemId=" + itemId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingNewDuration(java.lang.String pop, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("pop", pop);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedNashaNewDuration(java.lang.String datacenter, java.lang.String model, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/nasha/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("datacenter", datacenter);
		__dataMap.put("model", model);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWorklightNewDuration(boolean lessThan1000Users, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/new/" + duration + "";
		String __data = "?";
		__data += "lessThan1000Users=" + lessThan1000Users;
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart postCart(java.lang.String ovhSubsidiary, java.lang.String description, java.util.Date expire) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ovhSubsidiary", ovhSubsidiary);
		__dataMap.put("description", description);
		__dataMap.put("expire", expire);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart postCart(java.lang.String ovhSubsidiary) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ovhSubsidiary", ovhSubsidiary);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/overTheBox/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("offer", offer);
		__dataMap.put("deviceId", deviceId);
		__dataMap.put("voucher", voucher);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/overTheBox/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("offer", offer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedHousingServiceNameAPCDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/housing/" + serviceName + "/APC/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/directadmin/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		__data += "serviceType=" + serviceType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/directadmin/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVeeamCloudConnectServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/veeamCloudConnect/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("offer", offer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoServiceNameUpgradeDuration(java.lang.String containerNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "containerNumber=" + containerNumber;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseSqlserverServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteCartCartId(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameIpDuration(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/ip/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("usage", usage);
		__dataMap.put("country", country);
		__dataMap.put("estimatedClientsNumber", estimatedClientsNumber);
		__dataMap.put("description", description);
		__dataMap.put("size", size);
		__dataMap.put("networkName", networkName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameBackupStorageDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/backupStorage/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("capacity", capacity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameBackendDuration(long backend, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/backend/" + duration + "";
		String __data = "?";
		__data += "backend=" + backend;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingServiceNamePop(java.lang.String pop, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/" + serviceName + "/pop";
		String __data = "?";
		__data += "pop=" + pop;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/new/" + duration + "";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "offer=" + offer;
		__data += "duration=" + duration;
		__data += "dnsZone=" + dnsZone;
		__data += "module=" + module;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/new/" + duration + "";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "offer=" + offer;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicensePleskServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneNew(java.lang.String zoneName, boolean minimized) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/new";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		__data += "minimized=" + minimized;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneNew(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/new";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postCdnWebstorageServiceNameTraffic(long bandwidth, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage/" + serviceName + "/traffic";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("bandwidth", bandwidth);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseWindowsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServerServiceNameKvm(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/kvm";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameChangeMainDomainDuration(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/changeMainDomain/" + duration + "";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "mxplan=" + mxplan;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingServiceNamePop(java.lang.String pop, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/" + serviceName + "/pop";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("pop", pop);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameKvmDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/kvm/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameChangeMainDomainDuration(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/changeMainDomain/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("mxplan", mxplan);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingPrivateDatabaseServiceNameRamDuration(java.lang.String ram, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/" + serviceName + "/ram/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ram", ram);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("containerNumber", containerNumber);
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		__dataMap.put("serviceType", serviceType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("containerNumber", containerNumber);
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		__data += "version=" + version;
		__data += "powerpack=" + powerpack;
		__data += "antispam=" + antispam;
		__data += "applicationSet=" + applicationSet;
		__data += "wordpressToolkit=" + wordpressToolkit;
		__data += "languagePackNumber=" + languagePackNumber;
		__data += "antivirus=" + antivirus;
		__data += "domainNumber=" + domainNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getCart(java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart";
		String __data = "?";
		__data += "description=" + description;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getCart() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNamePleskDuration(java.lang.String domainNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/plesk/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domainNumber", domainNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseSqlserverNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		__data += "sqlVersion=" + sqlVersion;
		__data += "serviceType=" + serviceType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseOfficeNewDuration(java.lang.String duration, long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/office/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("officeBusinessQuantity", officeBusinessQuantity);
		__dataMap.put("officeProPlusQuantity", officeProPlusQuantity);
		__dataMap.put("giftCode", giftCode);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseOfficeNewDuration(java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/office/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Item postCartCartIdDomain(java.lang.String cartId, java.lang.String domain, java.lang.String offerId, long quantity, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/domain";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("offerId", offerId);
		__dataMap.put("quantity", quantity);
		__dataMap.put("duration", duration);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Item.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Item postCartCartIdDomain(java.lang.String cartId, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/domain";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Item.class);
	}

	public java.lang.String[] getLicenseWindowsNew(java.lang.String version, java.lang.String ip, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "sqlVersion=" + sqlVersion;
		__data += "serviceType=" + serviceType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseWindowsNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceAccountDuration(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		__dataMap.put("licence", licence);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingPrivateDatabaseServiceNameRamDuration(java.lang.String ram, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/" + serviceName + "/ram/" + duration + "";
		String __data = "?";
		__data += "ram=" + ram;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		__data += "powerpack=" + powerpack;
		__data += "serviceType=" + serviceType;
		__data += "applicationSet=" + applicationSet;
		__data += "wordpressToolkit=" + wordpressToolkit;
		__data += "languagePackNumber=" + languagePackNumber;
		__data += "antivirus=" + antivirus;
		__data += "domainNumber=" + domainNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameCredit(long amount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project/" + serviceName + "/credit";
		String __data = "?";
		__data += "amount=" + amount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart putCartCartId(java.lang.String cartId, java.lang.String description, java.util.Date expire) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("description", description);
		__dataMap.put("expire", expire);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Cart putCartCartId(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Cart.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameBackupStorageDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/backupStorage/" + duration + "";
		String __data = "?";
		__data += "capacity=" + capacity;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration, java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ip/" + duration + "";
		String __data = "?";
		__data += "number=" + number;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ip/" + duration + "";
		String __data = "?";
		__data += "number=" + number;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getTelephonyBillingAccount(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getSms() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/sms";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServer() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/directadmin/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		__dataMap.put("serviceType", serviceType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/directadmin/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getHostingPrivateDatabaseServiceNameRam(java.lang.String ram, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/" + serviceName + "/ram";
		String __data = "?";
		__data += "ram=" + ram;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem getCartCartIdItemItemIdConfigurationConfigurationId(java.lang.String cartId, long itemId, long configurationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "/configuration/" + configurationId + "";
		String __data = "?";
		__data += "cartId=" + cartId;
		__data += "itemId=" + itemId;
		__data += "configurationId=" + configurationId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceOutlookDuration(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/outlook/" + duration + "";
		String __data = "?";
		__data += "licence=" + licence;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameFtpbackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ftpbackup/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedServerServiceNameFailoverIP(java.lang.String country, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/failoverIP";
		String __data = "?";
		__data += "country=" + country;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberGeographic";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		__dataMap.put("city", city);
		__dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		__dataMap.put("country", country);
		__dataMap.put("retractation", retractation);
		__dataMap.put("legalform", legalform);
		__dataMap.put("firstname", firstname);
		__dataMap.put("ape", ape);
		__dataMap.put("email", email);
		__dataMap.put("streetName", streetName);
		__dataMap.put("pool", pool);
		__dataMap.put("specificNumber", specificNumber);
		__dataMap.put("siret", siret);
		__dataMap.put("organisation", organisation);
		__dataMap.put("socialNomination", socialNomination);
		__dataMap.put("name", name);
		__dataMap.put("phone", phone);
		__dataMap.put("zip", zip);
		__dataMap.put("streetNumber", streetNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberGeographic";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		__dataMap.put("city", city);
		__dataMap.put("displayUniversalDirectory", displayUniversalDirectory);
		__dataMap.put("country", country);
		__dataMap.put("retractation", retractation);
		__dataMap.put("legalform", legalform);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("offer", offer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameUpgradeDuration(java.lang.String model, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "model=" + model;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String email, java.lang.String city, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String organisation, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberSpecial";
		String __data = "?";
		__data += "typology=" + typology;
		__data += "ape=" + ape;
		__data += "range=" + range;
		__data += "siret=" + siret;
		__data += "displayUniversalDirectory=" + displayUniversalDirectory;
		__data += "country=" + country;
		__data += "socialNomination=" + socialNomination;
		__data += "retractation=" + retractation;
		__data += "legalform=" + legalform;
		__data += "billingAccount=" + billingAccount;
		__data += "firstname=" + firstname;
		__data += "email=" + email;
		__data += "city=" + city;
		__data += "streetName=" + streetName;
		__data += "pool=" + pool;
		__data += "specificNumber=" + specificNumber;
		__data += "organisation=" + organisation;
		__data += "name=" + name;
		__data += "phone=" + phone;
		__data += "zip=" + zip;
		__data += "streetNumber=" + streetNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberSpecial";
		String __data = "?";
		__data += "typology=" + typology;
		__data += "ape=" + ape;
		__data += "range=" + range;
		__data += "siret=" + siret;
		__data += "displayUniversalDirectory=" + displayUniversalDirectory;
		__data += "country=" + country;
		__data += "socialNomination=" + socialNomination;
		__data += "retractation=" + retractation;
		__data += "legalform=" + legalform;
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameWindowsDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/windows/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDomainZoneZoneName(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/" + zoneName + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServerServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingPrivateDatabaseServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServerServiceNameBackupStorage(long capacity, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/backupStorage";
		String __data = "?";
		__data += "capacity=" + capacity;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOverTheBoxNew(java.lang.String offer, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/overTheBox/new";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "deviceId=" + deviceId;
		__data += "voucher=" + voucher;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOverTheBoxNew(java.lang.String offer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/overTheBox/new";
		String __data = "?";
		__data += "offer=" + offer;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getEmailExchangeOrganizationNameServiceExchangeServiceAccount(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/account";
		String __data = "?";
		__data += "number=" + number;
		__data += "licence=" + licence;
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("powerpack", powerpack);
		__dataMap.put("antispam", antispam);
		__dataMap.put("applicationSet", applicationSet);
		__dataMap.put("wordpressToolkit", wordpressToolkit);
		__dataMap.put("languagePackNumber", languagePackNumber);
		__dataMap.put("antivirus", antivirus);
		__dataMap.put("domainNumber", domainNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoServiceNameUpgradeDuration(java.lang.String containerNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("containerNumber", containerNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedHousingServiceNameAPCDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/housing/" + serviceName + "/APC/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.ProductInformation[] getCartCartIdDomainTransfer(java.lang.String cartId, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/domainTransfer";
		String __data = "?";
		__data += "cartId=" + cartId;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.ProductInformation[].class);
	}

	public java.lang.String[] getDomainZoneZoneNameDnsAnycast(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/" + zoneName + "/dnsAnycast";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVeeamCloudConnect() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/veeamCloudConnect";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingPrivateDatabaseNewDuration(java.lang.String version, java.lang.String ram, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ram=" + ram;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getSmsServiceNameCredits(long quantity, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/sms/" + serviceName + "/credits";
		String __data = "?";
		__data += "quantity=" + quantity;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseVirtuozzoNew(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/new";
		String __data = "?";
		__data += "containerNumber=" + containerNumber;
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "serviceType=" + serviceType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseVirtuozzoNew(java.lang.String containerNumber, java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/new";
		String __data = "?";
		__data += "containerNumber=" + containerNumber;
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVrackNew(long quantity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vrack/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("quantity", quantity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVrackNew() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vrack/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameAutomatedBackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/automatedBackup/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount, java.lang.String mondialRelayId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/accessory";
		String __data = "?";
		__data += "retractation=" + retractation;
		__data += "shippingContactId=" + shippingContactId;
		__data += "accessory=" + accessory;
		__data += "quantity=" + quantity;
		__data += "billingAccount=" + billingAccount;
		__data += "mondialRelayId=" + mondialRelayId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/accessory";
		String __data = "?";
		__data += "retractation=" + retractation;
		__data += "shippingContactId=" + shippingContactId;
		__data += "accessory=" + accessory;
		__data += "quantity=" + quantity;
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDomainZone() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameUsbKeyDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/usbKey/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("capacity", capacity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cpanel/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		__data += "serviceType=" + serviceType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cpanel/new/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCartCartIdSummary(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/summary";
		String __data = "?";
		__data += "cartId=" + cartId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getTelephony() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseSqlserverServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseCloudLinuxNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cloudLinux/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedServerServiceNameIp(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String organisationId, java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ip";
		String __data = "?";
		__data += "blockSize=" + blockSize;
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		__data += "organisationId=" + organisationId;
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServerServiceNameIp(long blockSize, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ip";
		String __data = "?";
		__data += "blockSize=" + blockSize;
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedCloudServiceNameFiler(java.lang.String name, java.lang.String serviceName, long quantity, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/filer";
		String __data = "?";
		__data += "name=" + name;
		__data += "serviceName=" + serviceName;
		__data += "quantity=" + quantity;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedCloudServiceNameFiler(java.lang.String name, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/filer";
		String __data = "?";
		__data += "name=" + name;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedCloudServiceNameIp(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/ip";
		String __data = "?";
		__data += "usage=" + usage;
		__data += "country=" + country;
		__data += "estimatedClientsNumber=" + estimatedClientsNumber;
		__data += "description=" + description;
		__data += "size=" + size;
		__data += "networkName=" + networkName;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/xdsl/spare/new";
		String __data = "?";
		__data += "shippingContactId=" + shippingContactId;
		__data += "quantity=" + quantity;
		__data += "brand=" + brand;
		__data += "mondialRelayId=" + mondialRelayId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/xdsl/spare/new";
		String __data = "?";
		__data += "shippingContactId=" + shippingContactId;
		__data += "quantity=" + quantity;
		__data += "brand=" + brand;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getEmailExchange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getEmailExchangeOrganizationNameServiceExchangeServiceOutlook(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "/outlook";
		String __data = "?";
		__data += "licence=" + licence;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingWebServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedServerServiceNameFeature(java.lang.String feature, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/feature";
		String __data = "?";
		__data += "feature=" + feature;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameKvmDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/kvm/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		__dataMap.put("powerpack", powerpack);
		__dataMap.put("serviceType", serviceType);
		__dataMap.put("applicationSet", applicationSet);
		__dataMap.put("wordpressToolkit", wordpressToolkit);
		__dataMap.put("languagePackNumber", languagePackNumber);
		__dataMap.put("antivirus", antivirus);
		__dataMap.put("domainNumber", domainNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getCdnDedicated() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration, long upgradedRessourceId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/upgradeRessource/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("upgradedRessourceType", upgradedRessourceType);
		__dataMap.put("upgradeType", upgradeType);
		__dataMap.put("upgradedRessourceId", upgradedRessourceId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/upgradeRessource/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("upgradedRessourceType", upgradedRessourceType);
		__dataMap.put("upgradeType", upgradeType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.ProductInformation[] getCartCartIdDomain(java.lang.String cartId, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/domain";
		String __data = "?";
		__data += "cartId=" + cartId;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.ProductInformation[].class);
	}

	public java.lang.String[] getLicensePleskNew(java.lang.String version, java.lang.String ip, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "powerpack=" + powerpack;
		__data += "serviceType=" + serviceType;
		__data += "applicationSet=" + applicationSet;
		__data += "wordpressToolkit=" + wordpressToolkit;
		__data += "languagePackNumber=" + languagePackNumber;
		__data += "antivirus=" + antivirus;
		__data += "domainNumber=" + domainNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicensePleskNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberGeographic";
		String __data = "?";
		__data += "zone=" + zone;
		__data += "city=" + city;
		__data += "displayUniversalDirectory=" + displayUniversalDirectory;
		__data += "country=" + country;
		__data += "retractation=" + retractation;
		__data += "legalform=" + legalform;
		__data += "billingAccount=" + billingAccount;
		__data += "firstname=" + firstname;
		__data += "ape=" + ape;
		__data += "email=" + email;
		__data += "streetName=" + streetName;
		__data += "pool=" + pool;
		__data += "specificNumber=" + specificNumber;
		__data += "siret=" + siret;
		__data += "organisation=" + organisation;
		__data += "socialNomination=" + socialNomination;
		__data += "name=" + name;
		__data += "phone=" + phone;
		__data += "zip=" + zip;
		__data += "streetNumber=" + streetNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/numberGeographic";
		String __data = "?";
		__data += "zone=" + zone;
		__data += "city=" + city;
		__data += "displayUniversalDirectory=" + displayUniversalDirectory;
		__data += "country=" + country;
		__data += "retractation=" + retractation;
		__data += "legalform=" + legalform;
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVpsServiceNameCpanel(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/cpanel";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameBandwidthDuration(long traffic, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/bandwidth/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("traffic", traffic);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getEmailDomainNew(java.lang.String domain, java.lang.String offer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/domain/new";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "offer=" + offer;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseDirectadminNew(java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/directadmin/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		__data += "serviceType=" + serviceType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseDirectadminNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/directadmin/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getEmailDomainNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/domain/new/" + duration + "";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "offer=" + offer;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVeeamCloudConnectServiceNameUpgrade(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/veeamCloudConnect/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHpcspotNew() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hpcspot/new";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteCartCartIdItemItemId(java.lang.String cartId, long itemId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, false);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postSmsServiceNameCredits(long quantity, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/sms/" + serviceName + "/credits";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("quantity", quantity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedHousingServiceNameAPC(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/housing/" + serviceName + "/APC";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getCdnWebstorageServiceNameStorage(java.lang.String storage, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage/" + serviceName + "/storage";
		String __data = "?";
		__data += "storage=" + storage;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFirewallDuration(java.lang.String firewallModel, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/firewall/" + duration + "";
		String __data = "?";
		__data += "firewallModel=" + firewallModel;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameVeeamDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/veeam/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameAdditionalDiskDuration(java.lang.String additionalDiskSize, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/additionalDisk/" + duration + "";
		String __data = "?";
		__data += "additionalDiskSize=" + additionalDiskSize;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVpsServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/snapshot";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseSqlserverNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVrackServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vrack/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/overTheBox/new/" + duration + "";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "duration=" + duration;
		__data += "deviceId=" + deviceId;
		__data += "voucher=" + voucher;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/overTheBox/new/" + duration + "";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postRouterNewDuration(java.lang.String vrack, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/router/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("vrack", vrack);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneNew(java.lang.String zoneName, boolean minimized) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zoneName", zoneName);
		__dataMap.put("minimized", minimized);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneNew(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zoneName", zoneName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedServerServiceNameKvmExpress(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/kvmExpress";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postFreefaxNew(long quantity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/freefax/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("quantity", quantity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameSpla(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/spla";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnWebstorageServiceNameStorageDuration(java.lang.String storage, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage/" + serviceName + "/storage/" + duration + "";
		String __data = "?";
		__data += "storage=" + storage;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedCloudServiceNameHost(java.lang.String name, long datacenterId, java.lang.String serviceName, long quantity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/host";
		String __data = "?";
		__data += "name=" + name;
		__data += "datacenterId=" + datacenterId;
		__data += "serviceName=" + serviceName;
		__data += "quantity=" + quantity;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedCloudServiceNameHost(java.lang.String name, long datacenterId, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/host";
		String __data = "?";
		__data += "name=" + name;
		__data += "datacenterId=" + datacenterId;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		__data += "sqlVersion=" + sqlVersion;
		__data += "version=" + version;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameSnapshotDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/snapshot/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount, double floor, double stair, java.lang.String streetNumberExtra, java.lang.String listNumbers, java.lang.String siret, java.lang.String groupNumber, java.lang.String comment, java.lang.String door, java.lang.String building) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/portability";
		String __data = "?";
		__data += "socialReason=" + socialReason;
		__data += "offer=" + offer;
		__data += "contactNumber=" + contactNumber;
		__data += "city=" + city;
		__data += "streetName=" + streetName;
		__data += "displayUniversalDirectory=" + displayUniversalDirectory;
		__data += "country=" + country;
		__data += "callNumber=" + callNumber;
		__data += "firstName=" + firstName;
		__data += "contactName=" + contactName;
		__data += "streetType=" + streetType;
		__data += "name=" + name;
		__data += "zip=" + zip;
		__data += "desireDate=" + desireDate;
		__data += "streetNumber=" + streetNumber;
		__data += "type=" + type;
		__data += "billingAccount=" + billingAccount;
		__data += "floor=" + floor;
		__data += "stair=" + stair;
		__data += "streetNumberExtra=" + streetNumberExtra;
		__data += "listNumbers=" + listNumbers;
		__data += "siret=" + siret;
		__data += "groupNumber=" + groupNumber;
		__data += "comment=" + comment;
		__data += "door=" + door;
		__data += "building=" + building;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/portability";
		String __data = "?";
		__data += "socialReason=" + socialReason;
		__data += "offer=" + offer;
		__data += "contactNumber=" + contactNumber;
		__data += "city=" + city;
		__data += "streetName=" + streetName;
		__data += "displayUniversalDirectory=" + displayUniversalDirectory;
		__data += "country=" + country;
		__data += "callNumber=" + callNumber;
		__data += "firstName=" + firstName;
		__data += "contactName=" + contactName;
		__data += "streetType=" + streetType;
		__data += "name=" + name;
		__data += "zip=" + zip;
		__data += "desireDate=" + desireDate;
		__data += "streetNumber=" + streetNumber;
		__data += "type=" + type;
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getCdnWebstorageServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameProfessionalUseDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/professionalUse/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedServerServiceNameUsbKey(long capacity, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/usbKey";
		String __data = "?";
		__data += "capacity=" + capacity;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedNashaNewDuration(java.lang.String datacenter, java.lang.String model, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/nasha/new/" + duration + "";
		String __data = "?";
		__data += "datacenter=" + datacenter;
		__data += "model=" + model;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameBandwidthDuration(long traffic, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/bandwidth/" + duration + "";
		String __data = "?";
		__data += "traffic=" + traffic;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseWindows() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getHpcspotNewDuration(java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hpcspot/new/" + duration + "";
		String __data = "?";
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFailoverIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/failoverIP/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("country", country);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getLicenseWorklightServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/" + serviceName + "/upgrade/" + duration + "";
		String __data = "?";
		__data += "version=" + version;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getIpLoadBalancingNew(java.lang.String pop) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/new";
		String __data = "?";
		__data += "pop=" + pop;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpMigrationDuration(java.lang.String ip, java.lang.String token, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/ipMigration/" + duration + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "token=" + token;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseSqlserverServiceNameUpgrade(java.lang.String version, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "version=" + version;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingWebServiceNameChangeMainDomain(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/changeMainDomain";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "mxplan=" + mxplan;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameUpgradeDuration(java.lang.String model, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/upgrade/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("model", model);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseCloudLinuxNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cloudLinux/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVpsServiceNameAutomatedBackup(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/automatedBackup";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		__dataMap.put("sqlVersion", sqlVersion);
		__dataMap.put("serviceType", serviceType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("version", version);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVpsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameSpla(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/spla";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName, java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project/" + serviceName + "/ip";
		String __data = "?";
		__data += "instanceId=" + instanceId;
		__data += "quantity=" + quantity;
		__data += "serviceName=" + serviceName;
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project/" + serviceName + "/ip";
		String __data = "?";
		__data += "instanceId=" + instanceId;
		__data += "quantity=" + quantity;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postEmailDomainNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/domain/new/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("offer", offer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getVeeamCloudConnectServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/veeamCloudConnect/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameVeeamDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/veeam/" + duration + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getDedicatedHousing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/housing";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameExtraSqlPersoDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/extraSqlPerso/" + duration + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("offer", offer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getEmailExchangeOrganizationNameServiceExchangeService(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getCdnDedicatedServiceNameBackend(long backend, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/backend";
		String __data = "?";
		__data += "backend=" + backend;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount, java.lang.String mondialRelayId, java.lang.String zones) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/line";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("shippingContactId", shippingContactId);
		__dataMap.put("types", types);
		__dataMap.put("quantity", quantity);
		__dataMap.put("brand", brand);
		__dataMap.put("retractation", retractation);
		__dataMap.put("offers", offers);
		__dataMap.put("displayUniversalDirectories", displayUniversalDirectories);
		__dataMap.put("ownerContactIds", ownerContactIds);
		__dataMap.put("extraSimultaneousLines", extraSimultaneousLines);
		__dataMap.put("mondialRelayId", mondialRelayId);
		__dataMap.put("zones", zones);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "/line";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("shippingContactId", shippingContactId);
		__dataMap.put("types", types);
		__dataMap.put("quantity", quantity);
		__dataMap.put("brand", brand);
		__dataMap.put("retractation", retractation);
		__dataMap.put("offers", offers);
		__dataMap.put("displayUniversalDirectories", displayUniversalDirectories);
		__dataMap.put("ownerContactIds", ownerContactIds);
		__dataMap.put("extraSimultaneousLines", extraSimultaneousLines);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] postCartCartIdCoupon(java.lang.String cartId, java.lang.String coupon) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/coupon";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("coupon", coupon);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedNashaNew(java.lang.String datacenter, java.lang.String model) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/nasha/new";
		String __data = "?";
		__data += "datacenter=" + datacenter;
		__data += "model=" + model;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getHostingPrivateDatabaseNew(java.lang.String version, java.lang.String ram) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ram=" + ram;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getCloudProjectServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedCloudServiceNameAdditionalBandwidth(java.lang.String bandwidth, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/additionalBandwidth";
		String __data = "?";
		__data += "bandwidth=" + bandwidth;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Item postCartCartIdDomainTransfer(java.lang.String cartId, java.lang.String domain, java.lang.String offerId, long quantity, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/domainTransfer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("offerId", offerId);
		__dataMap.put("quantity", quantity);
		__dataMap.put("duration", duration);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Item.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.cart.Item postCartCartIdDomainTransfer(java.lang.String cartId, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/domainTransfer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.order.cart.Item.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameAdditionalBandwidthDuration(java.lang.String bandwidth, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/additionalBandwidth/" + duration + "";
		String __data = "?";
		__data += "bandwidth=" + bandwidth;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameCacheRuleDuration(long cacheRule, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/cacheRule/" + duration + "";
		String __data = "?";
		__data += "cacheRule=" + cacheRule;
		__data += "serviceName=" + serviceName;
		__data += "duration=" + duration;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/xdsl/spare/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("shippingContactId", shippingContactId);
		__dataMap.put("quantity", quantity);
		__dataMap.put("brand", brand);
		__dataMap.put("mondialRelayId", mondialRelayId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order postXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/xdsl/spare/new";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("shippingContactId", shippingContactId);
		__dataMap.put("quantity", quantity);
		__dataMap.put("brand", brand);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Order getCartCartIdCheckout(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/checkout";
		String __data = "?";
		__data += "cartId=" + cartId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.order.Order.class);
	}

	public java.lang.String[] getLicenseVirtuozzoServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
