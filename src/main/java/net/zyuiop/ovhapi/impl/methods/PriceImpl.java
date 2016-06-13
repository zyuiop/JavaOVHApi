package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Price;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class PriceImpl implements Price { 

	private final OVHRawCalls client;

	public PriceImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/sbg1a/enterprise/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/bhs1a/infrastructure/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/sbg1a/infrastructure/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getCdnAnycastModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/anycast/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2b/enterprise/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2b/infrastructure/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/sbg1a/enterprise/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2b/infrastructure/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2b/enterprise/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getHostingWebExtraSqlPersoExtraSqlPersoName(java.lang.String extraSqlPersoName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/extraSqlPerso/" + extraSqlPersoName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Sbg1aFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/sbg1a/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedServerFirewallFirewallModel(java.lang.String firewallModel) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/firewall/" + firewallModel + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Rbx2aHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/rbx2a/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2b/enterprise/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/sbg1a/enterprise/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/sbg1a/infrastructure/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2015v1SsdModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2015v1/ssd/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2014v1CloudModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2014v1/cloud/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getHostingWebSslSslName(java.lang.String sslName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/ssl/" + sslName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/sbg1a/enterprise/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2a/infrastructure/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/bhs1a/infrastructure/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedServerBackupStorageCapacity(java.lang.String capacity) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/backupStorage/" + capacity + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/bhs1a/enterprise/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2013v1CloudModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2013v1/cloud/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedServerIpRoutedTo(java.lang.String routedTo) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/ip/" + routedTo + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2a/infrastructure/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getHpcspotConsumptionJobReference(java.lang.String reference) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hpcspot/consumption/job/" + reference + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2b/infrastructure/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/bhs1a/enterprise/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getHostingPrivateDatabasePrivateDatabaseName(java.lang.String privateDatabaseName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/privateDatabase/" + privateDatabaseName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2b/enterprise/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/bhs1a/enterprise/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Bhs1aHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/bhs1a/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getCdnAnycastOptionOptionName(java.lang.String optionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/anycast/option/" + optionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getHostingWebCdnCdnName(java.lang.String cdnName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hosting/web/cdn/" + cdnName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/sbg1a/enterprise/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedServerAntiDDoSProCommercialRange(java.lang.String commercialRange) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/server/antiDDoSPro/" + commercialRange + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2b/infrastructure/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/sbg1a/infrastructure/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2b/infrastructure/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2b/infrastructure/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/sbg1a/infrastructure/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/bhs1a/infrastructure/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Sbg1aFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/sbg1a/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Sbg1aHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/sbg1a/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/bhs1a/infrastructure/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Rbx2aFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/rbx2a/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/sbg1a/infrastructure/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDomainZoneOptionOptionName(java.lang.String optionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/domain/zone/option/" + optionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/bhs1a/enterprise/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/bhs1a/enterprise/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Rbx2aFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/rbx2a/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2015v1CloudModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2015v1/cloud/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2015v1SsdOptionOptionName(java.lang.String optionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2015v1/ssd/option/" + optionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2013v1CloudOptionOptionName(java.lang.String optionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2013v1/cloud/option/" + optionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Bhs1aHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/bhs1a/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getCdnAnycastOptionCacherulesCacheruleNumber(java.lang.String cacheruleNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/anycast/option/cacherules/" + cacheruleNumber + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getCdnAnycastOptionQuotaQuotaSize(java.lang.String quotaSize) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/cdn/anycast/option/quota/" + quotaSize + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2a/enterprise/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/bhs1a/infrastructure/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/bhs1a/infrastructure/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2b/infrastructure/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2a/enterprise/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getOfficeLicenseLicenseName(java.lang.String licenseName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/office/license/" + licenseName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getHpcspotAccountSubscriptionSubscriptionName(java.lang.String subscriptionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hpcspot/account/subscription/" + subscriptionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2a/enterprise/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2b/enterprise/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2a/infrastructure/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2a/enterprise/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedNashaModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicated/nasha/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVpsCloudModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/cloud/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Bhs1aFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/bhs1a/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2a/enterprise/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2b/enterprise/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/sbg1a/enterprise/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2a/infrastructure/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/bhs1a/infrastructure/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2b/infrastructure/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2a/enterprise/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2a/enterprise/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/sbg1a/infrastructure/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2013v1ClassicModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2013v1/classic/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2a/infrastructure/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2a/infrastructure/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Bhs1aFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/bhs1a/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2015v1CloudOptionOptionName(java.lang.String optionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2015v1/cloud/option/" + optionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getHpcspotConsumptionReservationReference(java.lang.String reference) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hpcspot/consumption/reservation/" + reference + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2013v1LowlatModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2013v1/lowlat/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Rbx2aHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/rbx2a/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2014v1ClassicModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2014v1/classic/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/bhs1a/enterprise/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/bhs1a/enterprise/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2a/infrastructure/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2b/enterprise/filer/hourly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getOverTheBoxOfferOfferName(java.lang.String offerName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/overTheBox/offer/" + offerName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/sbg1a/enterprise/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/sbg1a/infrastructure/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getXdslOptionsIpv4IpRange(java.lang.String ipRange) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/xdsl/options/ipv4/" + ipRange + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/sbg1a/enterprise/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/bhs1a/infrastructure/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVpsClassicModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/classic/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2b/enterprise/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVps2014v1CloudOptionOptionName(java.lang.String optionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/2014v1/cloud/option/" + optionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVpsCloudOptionOptionName(java.lang.String optionName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/cloud/option/" + optionName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/sbg1a/infrastructure/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getVpsLowlatModelModelName(java.lang.String modelName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/vps/lowlat/model/" + modelName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getHpcspotConsumptionSessionReference(java.lang.String reference) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/hpcspot/consumption/session/" + reference + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Sbg1aHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2013v1/sbg1a/host/hourly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v1/rbx2a/enterprise/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/rbx2a/infrastructure/filer/monthly/" + filerProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/dedicatedCloud/2014v2/bhs1a/enterprise/host/monthly/" + hostProfile + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.order.Price.class);
	}

}