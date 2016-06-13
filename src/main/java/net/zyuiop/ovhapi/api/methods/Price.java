package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /price APIs
 */

public interface Price { 

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of CDN
	 * Facultative parameters ? false
	 * @param modelName Type of CDN
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getCdnAnycastModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get the price for extra sql perso option
	 * Facultative parameters ? false
	 * @param extraSqlPersoName ExtraSqlPerso
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getHostingWebExtraSqlPersoExtraSqlPersoName(java.lang.String extraSqlPersoName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Sbg1aFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of available firewall models
	 * Facultative parameters ? false
	 * @param firewallModel Model of firewall
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedServerFirewallFirewallModel(java.lang.String firewallModel) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Rbx2aHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of VPS SSD 2015
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2015v1SsdModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of VPS Cloud 2014
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2014v1CloudModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get the price for hosted ssl option
	 * Facultative parameters ? false
	 * @param sslName Ssl
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getHostingWebSslSslName(java.lang.String sslName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of backup storage offer
	 * Facultative parameters ? false
	 * @param capacity Capacity in gigabytes of backup storage offer
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedServerBackupStorageCapacity(java.lang.String capacity) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of VPS Classic 2013
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2013v1CloudModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of IPs
	 * Facultative parameters ? false
	 * @param routedTo Ip
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedServerIpRoutedTo(java.lang.String routedTo) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get the price of a JOB consumption for 1 hour
	 * Facultative parameters ? false
	 * @param reference The reference of the JOB consumption
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getHpcspotConsumptionJobReference(java.lang.String reference) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get the price for a private database
	 * Facultative parameters ? false
	 * @param privateDatabaseName PrivateDatabase
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getHostingPrivateDatabasePrivateDatabaseName(java.lang.String privateDatabaseName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Bhs1aHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price
	 * Facultative parameters ? false
	 * @param optionName Option
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getCdnAnycastOptionOptionName(java.lang.String optionName) throws java.io.IOException;

	/**
	 * Get the price for cdn option
	 * Facultative parameters ? false
	 * @param cdnName Cdn
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getHostingWebCdnCdnName(java.lang.String cdnName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of anti-DDos Pro option
	 * Facultative parameters ? false
	 * @param commercialRange commercial range of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedServerAntiDDoSProCommercialRange(java.lang.String commercialRange) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Sbg1aFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Sbg1aHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Rbx2aFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of zone options
	 * Facultative parameters ? false
	 * @param optionName Option
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDomainZoneOptionOptionName(java.lang.String optionName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Rbx2aFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of VPS Cloud 2015
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2015v1CloudModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of VPS SSD Options 2015/2016
	 * Facultative parameters ? false
	 * @param optionName Option
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2015v1SsdOptionOptionName(java.lang.String optionName) throws java.io.IOException;

	/**
	 * Get price of VPS Cloud Options 2013
	 * Facultative parameters ? false
	 * @param optionName Option
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2013v1CloudOptionOptionName(java.lang.String optionName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Bhs1aHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of CDN cache rules
	 * Facultative parameters ? false
	 * @param cacheruleNumber Number of cache rules
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getCdnAnycastOptionCacherulesCacheruleNumber(java.lang.String cacheruleNumber) throws java.io.IOException;

	/**
	 * Get price of CDN Quota
	 * Facultative parameters ? false
	 * @param quotaSize Quota in TB
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getCdnAnycastOptionQuotaQuotaSize(java.lang.String quotaSize) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get the monthly price for an office license
	 * Facultative parameters ? false
	 * @param licenseName License
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getOfficeLicenseLicenseName(java.lang.String licenseName) throws java.io.IOException;

	/**
	 * Get the price of a HPC Spot Account for 1 month
	 * Facultative parameters ? false
	 * @param subscriptionName Subscription
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getHpcspotAccountSubscriptionSubscriptionName(java.lang.String subscriptionName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get the price of Nas HA offers
	 * Facultative parameters ? false
	 * @param modelName capacity in gigabit of Nas Ha
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedNashaModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of VPS Cloud
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVpsCloudModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Bhs1aFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aInfrastructureHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of VPS Cloud 2013
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2013v1ClassicModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aInfrastructureFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Bhs1aFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of VPS Cloud Options 2015/2016
	 * Facultative parameters ? false
	 * @param optionName Option
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2015v1CloudOptionOptionName(java.lang.String optionName) throws java.io.IOException;

	/**
	 * Get the price of a RESERVATION consumption for 1 hour
	 * Facultative parameters ? false
	 * @param reference The reference of the RESERVATION consumption
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getHpcspotConsumptionReservationReference(java.lang.String reference) throws java.io.IOException;

	/**
	 * Get price of VPS Low Latency 2013
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2013v1LowlatModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Rbx2aHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of VPS Classic 2014
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2014v1ClassicModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2bEnterpriseFilerHourlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get the price of overTheBox offers
	 * Facultative parameters ? false
	 * @param offerName The name of the offer
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getOverTheBoxOfferOfferName(java.lang.String offerName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aEnterpriseFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Sbg1aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get the price of IPv4 options
	 * Facultative parameters ? false
	 * @param ipRange The range of the IPv4
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getXdslOptionsIpv4IpRange(java.lang.String ipRange) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Bhs1aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of VPS Classic
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVpsClassicModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2bEnterpriseHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of VPS Cloud Options 2014
	 * Facultative parameters ? false
	 * @param optionName Option
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVps2014v1CloudOptionOptionName(java.lang.String optionName) throws java.io.IOException;

	/**
	 * Get price of VPS Cloud Options
	 * Facultative parameters ? false
	 * @param optionName Option
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVpsCloudOptionOptionName(java.lang.String optionName) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Sbg1aInfrastructureHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of VPS Low Latency
	 * Facultative parameters ? false
	 * @param modelName Model
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getVpsLowlatModelModelName(java.lang.String modelName) throws java.io.IOException;

	/**
	 * Get the price of a SESSION consumption for 1 hour
	 * Facultative parameters ? false
	 * @param reference The reference of the SESSION consumption
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getHpcspotConsumptionSessionReference(java.lang.String reference) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the hourly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2013v1Sbg1aHostHourlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v1Rbx2aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * Facultative parameters ? false
	 * @param filerProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Rbx2aInfrastructureFilerMonthlyFilerProfile(java.lang.String filerProfile) throws java.io.IOException;

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * Facultative parameters ? false
	 * @param hostProfile type of the monthly ressources you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Price getDedicatedCloud2014v2Bhs1aEnterpriseHostMonthlyHostProfile(java.lang.String hostProfile) throws java.io.IOException;

}
