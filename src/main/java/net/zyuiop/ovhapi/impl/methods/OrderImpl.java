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

	public void deleteCartCartId(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/email/exchange/$organizationName/service/$exchangeService/outlook/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/kvm/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/privateDatabase/$serviceName/ram/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/plesk/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/plesk/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVpsServiceNameCpanel(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/cpanel";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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


	/*
	* Method creation failed.
	* Involved method : GET > /order/domain/zone/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/domain/zone/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/domain/zone/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/domain/zone/new
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVpsServiceNameAdditionalDisk(java.lang.String additionalDiskSize, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/additionalDisk";
		String __data = "?";
		__data += "additionalDiskSize=" + additionalDiskSize;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/staticIP/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseVirtuozzo() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/upgradeRessource/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/upgradeRessource/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseSqlserverNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseVirtuozzoServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/email/exchange/$organizationName/service/$exchangeService/outlook/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getSms() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/sms";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/cloud/project/$serviceName/credit
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/email/domain/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/checkout
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vrack/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vrack/new
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnWebstorage() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/host/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/host/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/cpanel/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/cpanel/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/web/$serviceName/bandwidth/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingWebServiceNameUpgrade(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainZoneZoneNameDnsAnycast(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/" + zoneName + "/dnsAnycast";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/line
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/line
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : PUT > /order/email/exchange/$organizationName/service/$exchangeService/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/feature/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/summary
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/additionalDisk/$duration
	* Message : Missing identifier.
	*/



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



	/*
	* Method creation failed.
	* Involved method : GET > /order/email/exchange/$organizationName/service/$exchangeService/account/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServerServiceNameFailoverIP(java.lang.String country, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/failoverIP";
		String __data = "?";
		__data += "country=" + country;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/web/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/web/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/web/$serviceName/cdn/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/web/$serviceName/ssl/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/filer/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/filer/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseWindowsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/hpcspot/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServerServiceNameUsbKey(long capacity, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/usbKey";
		String __data = "?";
		__data += "capacity=" + capacity;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/web/$serviceName/cdn/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/feature/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVpsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "";
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


	/*
	* Method creation failed.
	* Involved method : GET > /order/cdn/webstorage/$serviceName/traffic
	* Message : Missing identifier.
	*/


	public void deleteCartCartIdItemItemIdConfigurationConfigurationId(java.lang.String cartId, long itemId, long configurationId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item/" + itemId + "/configuration/" + configurationId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/web/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/backupStorage/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getEmailDomain() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/domain";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/host/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/host/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/veeam/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/cpanel/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/windows/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/windows/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cdn/webstorage/$serviceName/storage/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/virtuozzo/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/bandwidth/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/domain/zone/$zoneName/dnsAnycast/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/kvmExpress/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/freefax/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/cpanel/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/cpanel/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVpsServiceNameUpgrade(java.lang.String model, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "model=" + model;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/license/windows/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/windows/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnWebstorageServiceNameStorage(java.lang.String storage, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage/" + serviceName + "/storage";
		String __data = "?";
		__data += "storage=" + storage;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/license/worklight/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getTelephony() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /order/cart/$cartId/item/$itemId/configuration
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /order/license/cloudLinux/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseSqlserverServiceNameUpgrade(java.lang.String version, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "version=" + version;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVps() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/license/directadmin/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/directadmin/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedCloud() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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


	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/item/$itemId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/web/$serviceName/changeMainDomain/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/router/new/$duration
	* Message : Missing identifier.
	*/


	public long[] getCartCartIdItem(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/item";
		String __data = "?";
		__data += "cartId=" + cartId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/license/windows/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/windows/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/item/$itemId/configuration/$configurationId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnDedicated() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVeeamCloudConnectServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/veeamCloudConnect/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServerServiceNameKvmExpress(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/kvmExpress";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /order/cart/$cartId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /order/cart/$cartId
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /order/cdn/dedicated/$serviceName/backend/$duration
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/spla
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/ip/loadBalancing/$serviceName/ssl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/plesk/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/professionalUse/$duration
	* Message : Missing identifier.
	*/


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

	public java.lang.String[] getVpsServiceNameWindows(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/windows";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicensePlesk() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk";
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


	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/numberGeographic
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/numberGeographic
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingPrivateDatabaseNew(java.lang.String version, java.lang.String ram) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ram=" + ram;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/email/exchange/$organizationName/service/$exchangeService/upgrade
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/snapshot/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/usbKey/$duration
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /order/license/cloudLinux/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingWebServiceNameBandwidth(long traffic, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/bandwidth";
		String __data = "?";
		__data += "traffic=" + traffic;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getSmsServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/sms/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
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


	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/privateDatabase/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/worklight/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/spare/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/spare/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/overTheBox/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/overTheBox/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/staticIP/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/virtuozzo/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/virtuozzo/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vrack/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vrack/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/professionalUse/$duration
	* Message : Missing identifier.
	*/


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

	public java.lang.String[] getCdnDedicatedServiceNameQuota(long quota, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/quota";
		String __data = "?";
		__data += "quota=" + quota;
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


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/housing/$serviceName/APC/$duration
	* Message : Missing identifier.
	*/


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

	public java.lang.String[] getHostingWebServiceNameExtraSqlPerso(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/extraSqlPerso";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/overTheBox/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/overTheBox/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServer() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/license/sqlserver/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/xdsl/spare/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/xdsl/spare/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/automatedBackup/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/email/exchange/$organizationName/service/$exchangeService/account/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/web/$serviceName/extraSqlPerso/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedCloudServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/accessory
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/accessory
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVpsServiceNameVeeam(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/veeam";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/web/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/web/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/bandwidth/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cdn/dedicated/$serviceName/cacheRule/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServerServiceNameStaticIP(java.lang.String country, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/staticIP";
		String __data = "?";
		__data += "country=" + country;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/ipMigration/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/spare/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/spare/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/windows/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseWindows() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/windows";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/kvm/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/filer/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/filer/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVrack() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vrack";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/portability
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/portability
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/accessory
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/accessory
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/email/domain/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedHousingServiceNameAPC(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/housing/" + serviceName + "/APC";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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


	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/firewall/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getIpLoadBalancingServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseWorklightServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/" + serviceName + "";
		String __data = "?";
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


	/*
	* Method creation failed.
	* Involved method : POST > /order/cdn/webstorage/$serviceName/traffic
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCloudProjectServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/ftpbackup/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cloud/project/$serviceName/ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cloud/project/$serviceName/ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/upgradeRessource/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/upgradeRessource/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/spla
	* Message : Missing identifier.
	*/


	public java.lang.String[] getEmailExchange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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

	public java.lang.String[] getLicenseSqlserverServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getCloudProject() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cloud/project";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/additionalDisk/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/cpanel/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/web/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingWebServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/license/worklight/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/veeamCloudConnect/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/privateDatabase/$serviceName/ram/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/nasha/new/$duration
	* Message : Missing identifier.
	*/



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


	public java.lang.String[] getDomainZone() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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


	/*
	* Method creation failed.
	* Involved method : POST > /order/ip/loadBalancing/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingWebServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/ssl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/email/exchange/$organizationName/service/$exchangeService/diskSpace
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVeeamCloudConnectServiceNameUpgrade(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/veeamCloudConnect/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/router/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/numberNogeographic
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/numberNogeographic
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/virtuozzo/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/automatedBackup/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/firewall/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVrackServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vrack/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDomainZoneZoneName(java.lang.String zoneName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/domain/zone/" + zoneName + "";
		String __data = "?";
		__data += "zoneName=" + zoneName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/item/$itemId/requiredConfiguration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicatedCloud/$serviceName/additionalBandwidth/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/plesk/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/plesk/new/$duration
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /order/cloud/project/$serviceName/ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cloud/project/$serviceName/ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/ip/loadBalancing/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/virtuozzo/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/virtuozzo/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/plesk/$duration
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /order/ip/loadBalancing/$serviceName/pop
	* Message : Missing identifier.
	*/


	public void deleteCartCartIdCoupon(java.lang.String cartId, java.lang.String coupon) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/coupon";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, false);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/numberGeographic
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/numberGeographic
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cart
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cart
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnDedicatedServiceNameCacheRule(long cacheRule, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/cacheRule";
		String __data = "?";
		__data += "cacheRule=" + cacheRule;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLoadBalancingNew(java.lang.String pop) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing/new";
		String __data = "?";
		__data += "pop=" + pop;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/license/sqlserver/new/$duration
	* Message : Missing identifier.
	*/


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

	public java.lang.String[] getLicenseWorklight() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/license/worklight/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getIpLoadBalancing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/ip/loadBalancing";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/cdn/dedicated/$serviceName/quota/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/backupStorage/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServerServiceNameFeature(java.lang.String feature, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/feature";
		String __data = "?";
		__data += "feature=" + feature;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/hpcspot/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/office/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/office/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/directadmin/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/directadmin/new/$duration
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /order/license/sqlserver/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cdn/dedicated/$serviceName/quota/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getEmailDomainNew(java.lang.String domain, java.lang.String offer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/domain/new";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "offer=" + offer;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/kvmExpress/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/veeamCloudConnect/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/freefax/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/windows/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/web/$serviceName/changeMainDomain/$duration
	* Message : Missing identifier.
	*/


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

	public java.lang.String[] getLicensePleskServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/plesk/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/ip/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getRouterNew(java.lang.String vrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/router/new";
		String __data = "?";
		__data += "vrack=" + vrack;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/usbKey/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnDedicatedServiceNameBackend(long backend, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "/backend";
		String __data = "?";
		__data += "backend=" + backend;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/xdsl/spare/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/xdsl/spare/new
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/nasha/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedCloudServiceNameAdditionalBandwidth(java.lang.String bandwidth, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicatedCloud/" + serviceName + "/additionalBandwidth";
		String __data = "?";
		__data += "bandwidth=" + bandwidth;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/email/exchange/$organizationName/service/$exchangeService/upgrade
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVpsServiceNamePlesk(java.lang.String domainNumber, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/plesk";
		String __data = "?";
		__data += "domainNumber=" + domainNumber;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/sms/$serviceName/credits
	* Message : Missing identifier.
	*/


	public void postCartCartIdAssign(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/assign";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/housing/$serviceName/APC/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/cart/$cartId/checkout
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCartCartIdCoupon(java.lang.String cartId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cart/" + cartId + "/coupon";
		String __data = "?";
		__data += "cartId=" + cartId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/numberSpecial
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/numberSpecial
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServerServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/dedicated/server/$serviceName/failoverIP/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/veeam/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/ip/loadBalancing/$serviceName/ssl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cdn/dedicated/$serviceName/cacheRule/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/email/exchange/$organizationName/service/$exchangeService/diskSpace
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicatedCloud/$serviceName/additionalBandwidth/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseCloudLinuxNew(java.lang.String version, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/cloudLinux/new";
		String __data = "?";
		__data += "version=" + version;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/domain/zone/$zoneName/dnsAnycast/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedNashaNew(java.lang.String datacenter, java.lang.String model) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/nasha/new";
		String __data = "?";
		__data += "datacenter=" + datacenter;
		__data += "model=" + model;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/sms/$serviceName/credits
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/vps/$serviceName/snapshot/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getTelephonyBillingAccount(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/telephony/" + billingAccount + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
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


	/*
	* Method creation failed.
	* Involved method : GET > /order/vps/$serviceName/ftpbackup/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServerServiceNameProfessionalUse(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/professionalUse";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/failoverIP/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cdn/dedicated/$serviceName/backend/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedHousingServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/housing/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getVpsServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/snapshot";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/web/$serviceName/ssl/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseWorklightServiceNameUpgrade(java.lang.String version, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/worklight/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "version=" + version;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/dedicated/server/$serviceName/ipMigration/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingPrivateDatabase() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/cart/$cartId/domainTransfer
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVeeamCloudConnect() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/veeamCloudConnect";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/web/$serviceName/bandwidth/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnWebstorageServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/webstorage/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/license/sqlserver/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/hosting/web/$serviceName/extraSqlPerso/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/hosting/privateDatabase/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cdn/webstorage/$serviceName/storage/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHostingPrivateDatabaseServiceNameRam(java.lang.String ram, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/privateDatabase/" + serviceName + "/ram";
		String __data = "?";
		__data += "ram=" + ram;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDedicatedHousing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/housing";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/numberNogeographic
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/numberNogeographic
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedServerServiceNameKvm(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/dedicated/server/" + serviceName + "/kvm";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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


	/*
	* Method creation failed.
	* Involved method : GET > /order/license/office/new/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/office/new/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getVpsServiceNameFtpbackup(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/vps/" + serviceName + "/ftpbackup";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/numberSpecial
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/numberSpecial
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/cloud/project/$serviceName/credit
	* Message : Missing identifier.
	*/


	public java.lang.String[] getEmailExchangeOrganizationNameServiceExchangeService(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/email/exchange/" + organizationName + "/service/" + exchangeService + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
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


	/*
	* Method creation failed.
	* Involved method : GET > /order/ip/loadBalancing/$serviceName/pop
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseVirtuozzoServiceNameUpgrade(java.lang.String containerNumber, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/virtuozzo/" + serviceName + "/upgrade";
		String __data = "?";
		__data += "containerNumber=" + containerNumber;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/line
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/telephony/$billingAccount/line
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /order/license/plesk/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/plesk/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getHpcspotNew() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hpcspot/new";
		String __data = "";
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

	public java.lang.String[] getHostingWebServiceNameCdn(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/hosting/web/" + serviceName + "/cdn";
		String __data = "?";
		__data += "offer=" + offer;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLicenseSqlserver() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/license/sqlserver";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /order/license/plesk/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /order/license/plesk/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnDedicatedServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/order/cdn/dedicated/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /order/email/exchange/$organizationName/service/$exchangeService/serviceInfos
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/portability
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/telephony/$billingAccount/portability
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/windows/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /order/license/windows/$serviceName/upgrade/$duration
	* Message : Missing identifier.
	*/


}
