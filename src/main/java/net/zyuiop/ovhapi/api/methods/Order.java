package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /order APIs
 */

public interface Order { 

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHpcspotNewDuration(java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'quota' option
	 * Facultative parameters ? false
	 * @param quota quota number in TB that will be added to the CDN service
	 * @param serviceName The internal name of your CDN offer
	*/
	java.lang.String getCdnDedicatedServiceNameQuota(long quota, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ram' option
	 * Facultative parameters ? false
	 * @param ram Private database ram size
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String getHostingPrivateDatabaseServiceNameRam(java.lang.String ram, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	*/
	java.lang.String getLicenseSqlserverNew(java.lang.String version, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String getIpLoadBalancingServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'backupStorage' option
	 * Facultative parameters ? false
	 * @param capacity The capacity in gigabytes of your backup storage
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameBackupStorage(long capacity, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	java.lang.String getCloudProjectServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Retrieve coupons associated to cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	java.lang.String getCartCartIdCoupon(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? true
	 * @param serviceName The name of your Windows license
	 * @param sqlVersion The SQL Server version to enable on this license Windows license
	 * @param version The windows version you want to enable on your windows license
	*/
	java.lang.String getLicenseWindowsServiceNameUpgrade(java.lang.String serviceName, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	*/
	java.lang.String getLicenseWindowsServiceNameUpgrade(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param serviceName The name of your Windows license
	 * @param duration Duration
	 * @param sqlVersion The SQL Server version to enable on this license Windows license
	 * @param version The windows version you want to enable on your windows license
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param country Ip localization
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFailoverIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param quantity Fax quantity possibilities to purchase
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getFreefaxNew(long quantity) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param ip The IP to move to this server
	 * @param token IP migration token
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpMigrationDuration(java.lang.String ip, java.lang.String token, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getLicensePlesk() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param bandwidth Traffic in TB that will be added to the cdn.webstorage service
	 * @param serviceName The internal name of your CDN Static offer
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCdnWebstorageServiceNameTraffic(long bandwidth, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information for your cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCartCartIdCheckout(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String getHostingPrivateDatabaseServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameAutomatedBackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param serviceName The name of your WorkLight license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseWorklightServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param retractation Retractation rights if set
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param accessory Accessory brand name
	 * @param quantity Quantity of request repetition in this configuration
	 * @param billingAccount The name of your billingAccount
	 * @param mondialRelayId Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount, java.lang.String mondialRelayId) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param retractation Retractation rights if set
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param accessory Accessory brand name
	 * @param quantity Quantity of request repetition in this configuration
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? false
	 * @param offer The offer on which you want to be upgraded
	 * @param serviceName null
	*/
	java.lang.String getVeeamCloudConnectServiceNameUpgrade(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? false
	 * @param offer New offers for your hosting account
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getHostingWebServiceNameUpgrade(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	*/
	java.lang.String getHpcspotNew() throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String getEmailExchangeOrganizationNameServiceExchangeService(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;


	/**
	 * Get allowed durations for 'failoverIP' option
	 * Facultative parameters ? false
	 * @param country Ip localization
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameFailoverIP(java.lang.String country, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'cpanel' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameCpanel(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'cdn' option
	 * Facultative parameters ? false
	 * @param offer Cdn offers you can add to your hosting
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getHostingWebServiceNameCdn(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Assign a shopping cart to an loggedin client
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	void postCartCartIdAssign(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param amount Amount to add in your cloud credit
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameCredit(long amount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyNew() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param typology Special range typology
	 * @param ape Company ape
	 * @param range Special range
	 * @param siret Companu siret
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param socialNomination Company social nomination
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	 * @param firstname Contact firstname
	 * @param email null
	 * @param city Contact city
	 * @param streetName Street name
	 * @param pool Number of alias in case of pool
	 * @param specificNumber Preselected standard number
	 * @param organisation Contact organisation
	 * @param name Contact name
	 * @param phone Contact phone
	 * @param zip Contact zip
	 * @param streetNumber Street number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String email, java.lang.String city, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String organisation, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param typology Special range typology
	 * @param ape Company ape
	 * @param range Special range
	 * @param siret Companu siret
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param socialNomination Company social nomination
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param capacity Capacity in gigabytes
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameUsbKeyDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseCloudLinuxNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'plesk' option
	 * Facultative parameters ? false
	 * @param domainNumber Domain number you want to order a licence for
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNamePlesk(java.lang.String domainNumber, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param vrack The name of your vrack
	*/
	java.lang.String getRouterNew(java.lang.String vrack) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? true
	 * @param domain Domain name which will be linked to this hosting account
	 * @param offer Offer for your new hosting account
	 * @param dnsZone Dns zone modification possibilities ( by default : RESET_ALL )
	 * @param module Module installation ready to use
	*/
	java.lang.String getHostingWebNew(java.lang.String domain, java.lang.String offer, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param domain Domain name which will be linked to this hosting account
	 * @param offer Offer for your new hosting account
	*/
	java.lang.String getHostingWebNew(java.lang.String domain, java.lang.String offer) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getHostingWebServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get a summary of your current order
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCartCartIdSummary(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The name of your Plesk license
	*/
	java.lang.String getLicensePleskServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getDedicatedServer() throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param datacenter Nas HA localization
	 * @param model Capacity of Nas HA offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedNashaNewDuration(java.lang.String datacenter, java.lang.String model, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param storage Storage option that will be ordered
	 * @param serviceName The internal name of your CDN Static offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCdnWebstorageServiceNameStorageDuration(java.lang.String storage, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param licence Outlook version
	 * @param primaryEmailAddress Primary email address for account which You want to buy an outlook
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceOutlookDuration(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param domain Domain name which will be linked to this mx account
	 * @param offer Offer for your new mx account
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postEmailDomainNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param ram Private database ram size
	 * @param serviceName The internal name of your private database
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingPrivateDatabaseServiceNameRamDuration(java.lang.String ram, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param powerpack powerpack current activation state on your license
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param applicationSet Wanted application set
	 * @param wordpressToolkit WordpressToolkit option activation
	 * @param languagePackNumber The amount of language pack numbers to include in this licences
	 * @param antivirus The antivirus to enable on this Plesk license
	 * @param domainNumber This license domain number
	*/
	java.lang.String getLicensePleskNew(java.lang.String version, java.lang.String ip, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	*/
	java.lang.String getLicensePleskNew(java.lang.String version, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneZoneNameDnsAnycastDuration(java.lang.String zoneName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedHousingServiceNameAPCDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameSpla(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	 * @param firstname Contact firstname
	 * @param ape Company ape
	 * @param email null
	 * @param city Contact city
	 * @param pool Number of alias in case of pool
	 * @param streetName Street name
	 * @param specificNumber Preselected standard number
	 * @param siret Companu siret
	 * @param organisation Contact organisation
	 * @param socialNomination Company social nomination
	 * @param name Contact name
	 * @param phone Contact phone
	 * @param zip Contact zip
	 * @param streetNumber Street number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String city, long pool, java.lang.String streetName, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameKvmExpressDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgradeRessource' option
	 * Facultative parameters ? true
	 * @param upgradedRessourceType The type of ressource you want to upgrade.
	 * @param upgradeType The type of upgrade you want to process on the ressource(s)
	 * @param serviceName null
	 * @param upgradedRessourceId The id of a particular ressource you want to upgrade in your Dedicated Cloud (useless for "all" UpgradeRessourceTypeEnum)
	*/
	java.lang.String getDedicatedCloudServiceNameUpgradeRessource(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, long upgradedRessourceId) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgradeRessource' option
	 * Facultative parameters ? false
	 * @param upgradedRessourceType The type of ressource you want to upgrade.
	 * @param upgradeType The type of upgrade you want to process on the ressource(s)
	 * @param serviceName null
	*/
	java.lang.String getDedicatedCloudServiceNameUpgradeRessource(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'account' option
	 * Facultative parameters ? false
	 * @param number Number of Accounts to order
	 * @param licence Licence type for the account
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String getEmailExchangeOrganizationNameServiceExchangeServiceAccount(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param bandwidth Traffic in TB that will be added to the cdn.webstorage service
	 * @param serviceName The internal name of your CDN Static offer
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCdnWebstorageServiceNameTraffic(long bandwidth, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param pop The domain of the ip Load Balancing you want to add pop on
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingServiceNamePop(java.lang.String pop, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ipMigration' option
	 * Facultative parameters ? false
	 * @param ip The IP to move to this server
	 * @param token IP migration token
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameIpMigration(java.lang.String ip, java.lang.String token, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ip' option
	 * Facultative parameters ? true
	 * @param blockSize IP block size
	 * @param type The type of IP
	 * @param serviceName The internal name of your dedicated server
	 * @param organisationId Your organisation id to add on block informations
	 * @param country IP localization
	*/
	java.lang.String getDedicatedServerServiceNameIp(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String organisationId, java.lang.String country) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ip' option
	 * Facultative parameters ? false
	 * @param blockSize IP block size
	 * @param type The type of IP
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameIp(long blockSize, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param containerNumber How much container is this license able to manage ...
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param containerNumber How much container is this license able to manage ...
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? true
	 * @param serviceName The name of your Plesk license
	 * @param version This license version
	 * @param powerpack powerpack current activation state on your license
	 * @param antispam The antispam currently enabled on this Plesk License
	 * @param applicationSet Wanted application set
	 * @param wordpressToolkit WordpressToolkit option activation
	 * @param languagePackNumber The amount (between 0 and 5) of language pack numbers to include in this licences
	 * @param antivirus The antivirus to enable on this Plesk license
	 * @param domainNumber This license domain number
	*/
	java.lang.String getLicensePleskServiceNameUpgrade(java.lang.String serviceName, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? false
	 * @param serviceName The name of your Plesk license
	*/
	java.lang.String getLicensePleskServiceNameUpgrade(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param domain Domain name which will be linked to this mx account
	 * @param offer Offer for your new mx account
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getEmailDomainNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'windows' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameWindows(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param quantity Fax quantity possibilities to purchase
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postFreefaxNew(long quantity) throws java.io.IOException;

	/**
	 * Create a new OVH order cart
	 * Facultative parameters ? true
	 * @param ovhSubsidiary OVH Subsidiary where you want to order
	 * @param description Description of your cart
	 * @param expire Time of expiration of the cart
	*/
	net.zyuiop.ovhapi.api.objects.order.cart.Cart postCart(java.lang.String ovhSubsidiary, java.lang.String description, java.util.Date expire) throws java.io.IOException;

	/**
	 * Create a new OVH order cart
	 * Facultative parameters ? false
	 * @param ovhSubsidiary OVH Subsidiary where you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.cart.Cart postCart(java.lang.String ovhSubsidiary) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param duration Duration
	 * @param officeBusinessQuantity Number of prepaid office business license
	 * @param officeProPlusQuantity Number of prepaid office pro plus license
	 * @param giftCode Gift code for office license
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseOfficeNewDuration(java.lang.String duration, long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseOfficeNewDuration(java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'extraSqlPerso' option
	 * Facultative parameters ? false
	 * @param offer Offers you can add to your hosting
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getHostingWebServiceNameExtraSqlPerso(java.lang.String offer, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param socialReason Your social reason
	 * @param offer The offer : individual or company
	 * @param contactNumber Your contact phone number
	 * @param city Address city
	 * @param streetName Address street name
	 * @param displayUniversalDirectory Publish informations on directory ? (Yellow Pages, 118XXX, ...)
	 * @param country Country of number
	 * @param callNumber The number you want to port
	 * @param firstName Your firstname
	 * @param contactName Your contact name
	 * @param streetType Address street type
	 * @param name Your name
	 * @param zip Address zip code
	 * @param desireDate The date you want for portability execution
	 * @param streetNumber Address street number
	 * @param type The type of number : landline or special
	 * @param billingAccount The name of your billingAccount
	 * @param floor Address floor
	 * @param stair Address stair
	 * @param streetNumberExtra Address street number extra : bis,ter,...
	 * @param listNumbers Extra numbers to be ported
	 * @param siret If you port under your society, the SIRET number
	 * @param groupNumber Secondary designation number
	 * @param comment Comment
	 * @param door Address door
	 * @param building Address building
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount, double floor, double stair, java.lang.String streetNumberExtra, java.lang.String listNumbers, java.lang.String siret, java.lang.String groupNumber, java.lang.String comment, java.lang.String door, java.lang.String building) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param socialReason Your social reason
	 * @param offer The offer : individual or company
	 * @param contactNumber Your contact phone number
	 * @param city Address city
	 * @param streetName Address street name
	 * @param displayUniversalDirectory Publish informations on directory ? (Yellow Pages, 118XXX, ...)
	 * @param country Country of number
	 * @param callNumber The number you want to port
	 * @param firstName Your firstname
	 * @param contactName Your contact name
	 * @param streetType Address street type
	 * @param name Your name
	 * @param zip Address zip code
	 * @param desireDate The date you want for portability execution
	 * @param streetNumber Address street number
	 * @param type The type of number : landline or special
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param additionalDiskSize Size of the additional disk
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameAdditionalDiskDuration(java.lang.String additionalDiskSize, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;



	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param vrack The name of your vrack
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postRouterNewDuration(java.lang.String vrack, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseCloudLinuxNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param blockSize IP block size
	 * @param type The type of IP
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	 * @param organisationId Your organisation id to add on block informations
	 * @param country IP localization
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration, java.lang.String organisationId, java.lang.String country) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param blockSize IP block size
	 * @param type The type of IP
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	java.lang.String getLicenseVirtuozzoServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param licence Outlook version
	 * @param primaryEmailAddress Primary email address for account which You want to buy an outlook
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceOutlookDuration(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param instanceId Instance id where ip will be routed to
	 * @param quantity Number of failover ip
	 * @param serviceName The project id
	 * @param country IP geolocation
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName, java.lang.String country) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param instanceId Instance id where ip will be routed to
	 * @param quantity Number of failover ip
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getLicenseWindows() throws java.io.IOException;

	/**
	 * Get allowed durations for 'kvm' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameKvm(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	void putEmailExchangeOrganizationNameServiceExchangeServiceServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	*/
	java.lang.String getEmailExchangeOrganizationNameService(java.lang.String organizationName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'additionalDisk' option
	 * Facultative parameters ? false
	 * @param additionalDiskSize Size of the additional disk
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameAdditionalDisk(java.lang.String additionalDiskSize, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameAutomatedBackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'bandwidth' option
	 * Facultative parameters ? false
	 * @param bandwidth Bandwidth to allocate
	 * @param type bandwidth type
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameBandwidth(long bandwidth, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param serviceName The name of your SQL Server license
	*/
	java.lang.String getLicenseSqlserverServiceNameUpgrade(java.lang.String version, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceDiskSpace(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getCdnWebstorage() throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param domain Domain name which will be linked to this hosting account
	 * @param offer Offer for your new hosting account
	 * @param duration Duration
	 * @param dnsZone Dns zone modification possibilities ( by default : RESET_ALL )
	 * @param module Module installation ready to use
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param domain Domain name which will be linked to this hosting account
	 * @param offer Offer for your new hosting account
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param offer The offer on which you want to be upgraded
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVeeamCloudConnectServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceUpgrade(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param country Ip localization
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameStaticIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param domain The domain for which you want an SSL option. A DCV mail will be sent at postmaster@your_domain.abc, make sure this address exists before ordering
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingServiceNameSsl(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseCpanelNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getCdnDedicated() throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param usage Basic information of how will this bloc be used (as "web","ssl","cloud" or other things)
	 * @param country This Ip block country
	 * @param estimatedClientsNumber How much clients would be hosted on those ips ?
	 * @param description Information visible on whois (minimum 3 and maximum 250 alphanumeric characters)
	 * @param size The network ranges orderable
	 * @param networkName Information visible on whois (between 2 and maximum 20 alphanumeric characters)
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameIpDuration(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param feature the feature
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFeatureDuration(java.lang.String feature, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneZoneNameDnsAnycastDuration(java.lang.String zoneName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param number Number of IPs to order
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	 * @param country Choose a geolocation for your IP Address
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration, java.lang.String country) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param number Number of IPs to order
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param number Number of Accounts to order
	 * @param licence Licence type for the account
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postEmailExchangeOrganizationNameServiceExchangeServiceAccountDuration(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getIpLoadBalancing() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHpcspotNewDuration(java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param number Number of IPs to order
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	 * @param country Choose a geolocation for your IP Address
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration, java.lang.String country) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param number Number of IPs to order
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameIpDuration(long number, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param ram Private database ram size
	 * @param serviceName The internal name of your private database
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingPrivateDatabaseServiceNameRamDuration(java.lang.String ram, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param traffic Available offers to increase bandwidth quota (unit: GB)
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameBandwidthDuration(long traffic, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'usbKey' option
	 * Facultative parameters ? false
	 * @param capacity Capacity in gigabytes
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameUsbKey(long capacity, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param firewallModel Firewall type
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFirewallDuration(java.lang.String firewallModel, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getLicenseVirtuozzo() throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param zone Zone
	 * @param city Contact city
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	 * @param firstname Contact firstname
	 * @param ape Company ape
	 * @param email null
	 * @param streetName Street name
	 * @param pool Number of alias in case of pool
	 * @param specificNumber Preselected standard number
	 * @param siret Companu siret
	 * @param organisation Contact organisation
	 * @param socialNomination Company social nomination
	 * @param name Contact name
	 * @param phone Contact phone
	 * @param zip Contact zip
	 * @param streetNumber Street number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param zone Zone
	 * @param city Contact city
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param quantity Number of phone quantity
	 * @param brand Spare phone brand model
	 * @param mondialRelayId Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param quantity Number of phone quantity
	 * @param brand Spare phone brand model
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getDedicatedHousing() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param pop The domain of the ip Load Balancing you want to add pop on
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingServiceNamePop(java.lang.String pop, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'kvmExpress' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameKvmExpress(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameVeeamDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param name Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param serviceName null
	 * @param duration Duration
	 * @param quantity Quantity of filer you want to order (default 1)
	 * @param datacenterId Datacenter where the filer will be mounted (if not precised, will be mounted in each Datacenter of this Dedicated Cloud)
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration, long quantity, long datacenterId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param name Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version Private database available versions
	 * @param ram Private database ram size
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingPrivateDatabaseNewDuration(java.lang.String version, java.lang.String ram, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ip' option
	 * Facultative parameters ? false
	 * @param usage Basic information of how will this bloc be used (as "web","ssl","cloud" or other things)
	 * @param country This Ip block country
	 * @param estimatedClientsNumber How much clients would be hosted on those ips ?
	 * @param description Information visible on whois (minimum 3 and maximum 250 alphanumeric characters)
	 * @param size The network ranges orderable
	 * @param networkName Information visible on whois (between 2 and maximum 20 alphanumeric characters)
	 * @param serviceName null
	*/
	java.lang.String getDedicatedCloudServiceNameIp(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	java.lang.String getLicenseCpanelNew(java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	*/
	java.lang.String getLicenseCpanelNew(java.lang.String version, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param bandwidth Bandwidth to allocate
	 * @param type bandwidth type
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameBandwidthDuration(long bandwidth, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param capacity Capacity in gigabytes
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameUsbKeyDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameCpanelDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'backend' option
	 * Facultative parameters ? false
	 * @param backend Backend number that will be ordered
	 * @param serviceName The internal name of your CDN offer
	*/
	java.lang.String getCdnDedicatedServiceNameBackend(long backend, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param offer Cdn offers you can add to your hosting
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameCdnDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param serviceName The name of your Plesk license
	 * @param duration Duration
	 * @param version This license version
	 * @param powerpack powerpack current activation state on your license
	 * @param antispam The antispam currently enabled on this Plesk License
	 * @param applicationSet Wanted application set
	 * @param wordpressToolkit WordpressToolkit option activation
	 * @param languagePackNumber The amount (between 0 and 5) of language pack numbers to include in this licences
	 * @param antivirus The antivirus to enable on this Plesk license
	 * @param domainNumber This license domain number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The name of your Plesk license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Setup configuration item for the product
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	 * @param itemId Product item identifier
	 * @param label Label for your configuration item
	 * @param value Value or resource URL on API.OVH.COM of your configuration item
	*/
	net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem postCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId, java.lang.String label, java.lang.String value) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? true
	 * @param containerNumber How much container is this license able to manage ...
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	java.lang.String getLicenseVirtuozzoNew(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param containerNumber How much container is this license able to manage ...
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	*/
	java.lang.String getLicenseVirtuozzoNew(java.lang.String containerNumber, java.lang.String version, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get allowed durations for 'additionalBandwidth' option
	 * Facultative parameters ? false
	 * @param bandwidth How much additional bandwidth do you want ?
	 * @param serviceName null
	*/
	java.lang.String getDedicatedCloudServiceNameAdditionalBandwidth(java.lang.String bandwidth, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param offer New offers for your hosting account
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	java.lang.String getLicenseDirectadminNew(java.lang.String version, java.lang.String ip, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	*/
	java.lang.String getLicenseDirectadminNew(java.lang.String version, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get allowed durations for 'APC' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	java.lang.String getDedicatedHousingServiceNameAPC(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param upgradedRessourceType The type of ressource you want to upgrade.
	 * @param upgradeType The type of upgrade you want to process on the ressource(s)
	 * @param serviceName null
	 * @param duration Duration
	 * @param upgradedRessourceId The id of a particular ressource you want to upgrade in your Dedicated Cloud (useless for "all" UpgradeRessourceTypeEnum)
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration, long upgradedRessourceId) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param upgradedRessourceType The type of ressource you want to upgrade.
	 * @param upgradeType The type of upgrade you want to process on the ressource(s)
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param bandwidth Bandwidth to allocate
	 * @param type bandwidth type
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameBandwidthDuration(long bandwidth, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param quantity Sms credit quantity
	 * @param serviceName The internal name of your SMS offer
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getSmsServiceNameCredits(long quantity, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param quantity Number of vrack you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVrackNew(long quantity) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVrackNew() throws java.io.IOException;

	/**
	 * Get allowed durations for 'storage' option
	 * Facultative parameters ? false
	 * @param storage Storage option that will be ordered
	 * @param serviceName The internal name of your CDN Static offer
	*/
	java.lang.String getCdnWebstorageServiceNameStorage(java.lang.String storage, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getHostingPrivateDatabase() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameSnapshotDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param vrack The name of your vrack
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getRouterNewDuration(java.lang.String vrack, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'cacheRule' option
	 * Facultative parameters ? false
	 * @param cacheRule cache rule upgrade option to 100 or 1000
	 * @param serviceName The internal name of your CDN offer
	*/
	java.lang.String getCdnDedicatedServiceNameCacheRule(long cacheRule, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'firewall' option
	 * Facultative parameters ? false
	 * @param firewallModel Firewall type
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameFirewall(java.lang.String firewallModel, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param cacheRule cache rule upgrade option to 100 or 1000
	 * @param serviceName The internal name of your CDN offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameCacheRuleDuration(long cacheRule, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameFtpbackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param serviceName The name of your Plesk license
	 * @param duration Duration
	 * @param version This license version
	 * @param powerpack powerpack current activation state on your license
	 * @param antispam The antispam currently enabled on this Plesk License
	 * @param applicationSet Wanted application set
	 * @param wordpressToolkit WordpressToolkit option activation
	 * @param languagePackNumber The amount (between 0 and 5) of language pack numbers to include in this licences
	 * @param antivirus The antivirus to enable on this Plesk license
	 * @param domainNumber This license domain number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String version, boolean powerpack, java.lang.String antispam, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The name of your Plesk license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param serviceName The name of your SQL Server license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseSqlserverServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;


	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param offer Cdn offers you can add to your hosting
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameCdnDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseSqlserverNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param types Number type. Set several types for each line per phone
	 * @param quantity Quantity of request repetition in this configuration
	 * @param brand Phone brands wanted with the offer. Set null for NO phone
	 * @param retractation Retractation rights if set
	 * @param offers The line offers. Set several offers for each line per phone
	 * @param displayUniversalDirectories Publish owner contact informations on universal directories or not
	 * @param ownerContactIds Owner contact information id from /me entry point for each line
	 * @param extraSimultaneousLines Additional simultaneous numbers. Set several simultaneous lines for each line per phone
	 * @param billingAccount The name of your billingAccount
	 * @param mondialRelayId Use /supply/mondialRelay entry point to specify a relay point and ignore shipping address information entry.
	 * @param zones Geographic zones. Let empty for nogeographic type. Set several zones for each line per phone
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount, java.lang.String mondialRelayId, java.lang.String zones) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param types Number type. Set several types for each line per phone
	 * @param quantity Quantity of request repetition in this configuration
	 * @param brand Phone brands wanted with the offer. Set null for NO phone
	 * @param retractation Retractation rights if set
	 * @param offers The line offers. Set several offers for each line per phone
	 * @param displayUniversalDirectories Publish owner contact informations on universal directories or not
	 * @param ownerContactIds Owner contact information id from /me entry point for each line
	 * @param extraSimultaneousLines Additional simultaneous numbers. Set several simultaneous lines for each line per phone
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Retrieve configuration item
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	 * @param itemId Product item identifier
	 * @param configurationId Configuration item identifier
	*/
	net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem getCartCartIdItemItemIdConfigurationConfigurationId(java.lang.String cartId, long itemId, long configurationId) throws java.io.IOException;

	/**
	 * Delete a coupon from cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	 * @param coupon Coupon identifier
	*/
	void deleteCartCartIdCoupon(java.lang.String cartId, java.lang.String coupon) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param backend Backend number that will be ordered
	 * @param serviceName The internal name of your CDN offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameBackendDuration(long backend, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyNew() throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getVps() throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param ip The IP to move to this server
	 * @param token IP migration token
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpMigrationDuration(java.lang.String ip, java.lang.String token, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param usage Basic information of how will this bloc be used (as "web","ssl","cloud" or other things)
	 * @param country This Ip block country
	 * @param estimatedClientsNumber How much clients would be hosted on those ips ?
	 * @param description Information visible on whois (minimum 3 and maximum 250 alphanumeric characters)
	 * @param size The network ranges orderable
	 * @param networkName Information visible on whois (between 2 and maximum 20 alphanumeric characters)
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameIpDuration(java.lang.String usage, java.lang.String country, long estimatedClientsNumber, java.lang.String description, java.lang.String size, java.lang.String networkName, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'snapshot' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param offer Offers you can add to your hosting
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameExtraSqlPersoDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param datacenter Nas HA localization
	 * @param model Capacity of Nas HA offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedNashaNewDuration(java.lang.String datacenter, java.lang.String model, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameProfessionalUseDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	 * @param sqlVersion The SQL Server version to enable on this license Windows license
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameProfessionalUseDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getVrack() throws java.io.IOException;

	/**
	 * Get allowed durations for 'bandwidth' option
	 * Facultative parameters ? false
	 * @param traffic Available offers to increase bandwidth quota (unit: GB)
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getHostingWebServiceNameBandwidth(long traffic, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param feature the feature
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameFeatureDuration(java.lang.String feature, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameWindowsDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;



	/**
	 * Get allowed durations for 'filer' option
	 * Facultative parameters ? true
	 * @param name Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param serviceName null
	 * @param quantity Quantity of filer you want to order (default 1)
	 * @param datacenterId Datacenter where the filer will be mounted (if not precised, will be mounted in each Datacenter of this Dedicated Cloud)
	*/
	java.lang.String getDedicatedCloudServiceNameFiler(java.lang.String name, java.lang.String serviceName, long quantity, long datacenterId) throws java.io.IOException;

	/**
	 * Get allowed durations for 'filer' option
	 * Facultative parameters ? false
	 * @param name Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param serviceName null
	*/
	java.lang.String getDedicatedCloudServiceNameFiler(java.lang.String name, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param serviceName The name of your WorkLight license
	*/
	java.lang.String getLicenseWorklightServiceNameUpgrade(java.lang.String version, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param lessThan1000Users Does your company have less than 1000 potential users
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	*/
	java.lang.String getLicenseWorklightNew(boolean lessThan1000Users, java.lang.String version, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param cacheRule cache rule upgrade option to 100 or 1000
	 * @param serviceName The internal name of your CDN offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameCacheRuleDuration(long cacheRule, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param offer New offers for your hosting account
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param lessThan1000Users Does your company have less than 1000 potential users
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseWorklightNewDuration(boolean lessThan1000Users, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	java.lang.String getDedicatedHousingServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName null
	*/
	java.lang.String getDedicatedCloudServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	void deleteCartCartId(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param capacity The capacity in gigabytes of your backup storage
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameBackupStorageDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Add a new coupon to cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	 * @param coupon Coupon identifier
	*/
	java.lang.String postCartCartIdCoupon(java.lang.String cartId, java.lang.String coupon) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getSms() throws java.io.IOException;

	/**
	 * Modify information about a specific cart
	 * Facultative parameters ? true
	 * @param cartId Cart identifier
	 * @param description Description of your cart
	 * @param expire Time of expiration of the cart
	*/
	net.zyuiop.ovhapi.api.objects.order.cart.Cart putCartCartId(java.lang.String cartId, java.lang.String description, java.util.Date expire) throws java.io.IOException;

	/**
	 * Modify information about a specific cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	net.zyuiop.ovhapi.api.objects.order.cart.Cart putCartCartId(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Get allowed durations for 'feature' option
	 * Facultative parameters ? false
	 * @param feature the feature
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameFeature(java.lang.String feature, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param quantity Number of modem quantity
	 * @param brand Spare modem brand model
	 * @param mondialRelayId Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param quantity Number of modem quantity
	 * @param brand Spare modem brand model
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param name Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId Datacenter where the Host will be added
	 * @param serviceName null
	 * @param duration Duration
	 * @param quantity Quantity of hosts you want to order (default 1)
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration, long quantity) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param name Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId Datacenter where the Host will be added
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param lessThan1000Users Does your company have less than 1000 potential users
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseWorklightNewDuration(boolean lessThan1000Users, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameSslDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param backend Backend number that will be ordered
	 * @param serviceName The internal name of your CDN offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameBackendDuration(long backend, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'outlook' option
	 * Facultative parameters ? false
	 * @param licence Outlook version
	 * @param primaryEmailAddress Primary email address for account which You want to buy an outlook
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String getEmailExchangeOrganizationNameServiceExchangeServiceOutlook(java.lang.String licence, java.lang.String primaryEmailAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The name of your WorkLight license
	*/
	java.lang.String getLicenseWorklightServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param model Model
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameUpgradeDuration(java.lang.String model, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param quantity Number of vrack you want to order
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVrackNew(long quantity) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVrackNew() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param quota quota number in TB that will be added to the CDN service
	 * @param serviceName The internal name of your CDN offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCdnDedicatedServiceNameQuotaDuration(long quota, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Delete an item from a cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	 * @param itemId Product item identifier
	*/
	void deleteCartCartIdItemItemId(java.lang.String cartId, long itemId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameKvmDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	*/
	java.lang.String getLicenseCloudLinuxNew(java.lang.String version, java.lang.String ip) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param storage Storage option that will be ordered
	 * @param serviceName The internal name of your CDN Static offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCdnWebstorageServiceNameStorageDuration(java.lang.String storage, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getEmailExchangeOrganizationNameServiceExchangeServiceServiceInfos(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getLicenseWorklight() throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param capacity The capacity in gigabytes of your backup storage
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameBackupStorageDuration(long capacity, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameSslDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getCloudProject() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param domain New domain for change the main domain
	 * @param mxplan MX plan linked to the odl main domain
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameChangeMainDomainDuration(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param number Number of Accounts to order
	 * @param licence Licence type for the account
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceAccountDuration(long number, java.lang.String licence, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameVeeamDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameKvmDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param offer Offer name
	 * @param duration Duration
	 * @param deviceId The id of the device
	 * @param voucher An optional voucher
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param offer Offer name
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param name Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param serviceName null
	 * @param duration Duration
	 * @param quantity Quantity of filer you want to order (default 1)
	 * @param datacenterId Datacenter where the filer will be mounted (if not precised, will be mounted in each Datacenter of this Dedicated Cloud)
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration, long quantity, long datacenterId) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param name Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameFilerDuration(java.lang.String name, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ssl' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getHostingWebServiceNameSsl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete configuration item
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	 * @param itemId Product item identifier
	 * @param configurationId Configuration item identifier
	*/
	void deleteCartCartIdItemItemIdConfigurationConfigurationId(java.lang.String cartId, long itemId, long configurationId) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String getTelephonyBillingAccount(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param types Number type. Set several types for each line per phone
	 * @param quantity Quantity of request repetition in this configuration
	 * @param brand Phone brands wanted with the offer. Set null for NO phone
	 * @param retractation Retractation rights if set
	 * @param offers The line offers. Set several offers for each line per phone
	 * @param displayUniversalDirectories Publish owner contact informations on universal directories or not
	 * @param ownerContactIds Owner contact information id from /me entry point for each line
	 * @param extraSimultaneousLines Additional simultaneous numbers. Set several simultaneous lines for each line per phone
	 * @param billingAccount The name of your billingAccount
	 * @param mondialRelayId Use /supply/mondialRelay entry point to specify a relay point and ignore shipping address information entry.
	 * @param zones Geographic zones. Let empty for nogeographic type. Set several zones for each line per phone
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount, java.lang.String mondialRelayId, java.lang.String zones) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param types Number type. Set several types for each line per phone
	 * @param quantity Quantity of request repetition in this configuration
	 * @param brand Phone brands wanted with the offer. Set null for NO phone
	 * @param retractation Retractation rights if set
	 * @param offers The line offers. Set several offers for each line per phone
	 * @param displayUniversalDirectories Publish owner contact informations on universal directories or not
	 * @param ownerContactIds Owner contact information id from /me entry point for each line
	 * @param extraSimultaneousLines Additional simultaneous numbers. Set several simultaneous lines for each line per phone
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountLine(long shippingContactId, java.lang.String types, long quantity, java.lang.String brand, boolean retractation, java.lang.String offers, boolean[] displayUniversalDirectories, long[] ownerContactIds, long[] extraSimultaneousLines, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param country Ip localization
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedServerServiceNameStaticIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param domain New domain for change the main domain
	 * @param mxplan MX plan linked to the odl main domain
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameChangeMainDomainDuration(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Validate your shopping and create order
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCartCartIdCheckout(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param bandwidth How much additional bandwidth do you want ?
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameAdditionalBandwidthDuration(java.lang.String bandwidth, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The name of your SQL Server license
	*/
	java.lang.String getLicenseSqlserverServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseSqlserverNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param instanceId Instance id where ip will be routed to
	 * @param quantity Number of failover ip
	 * @param serviceName The project id
	 * @param country IP geolocation
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName, java.lang.String country) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param instanceId Instance id where ip will be routed to
	 * @param quantity Number of failover ip
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameIp(java.lang.String instanceId, long quantity, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getTelephony() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param offer The offer on which you want to be upgraded
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVeeamCloudConnectServiceNameUpgradeDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param datacenter Nas HA localization
	 * @param model Capacity of Nas HA offer
	*/
	java.lang.String getDedicatedNashaNew(java.lang.String datacenter, java.lang.String model) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param quantity Number of phone quantity
	 * @param brand Spare phone brand model
	 * @param mondialRelayId Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param quantity Number of phone quantity
	 * @param brand Spare phone brand model
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonySpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param offer Offer name
	 * @param duration Duration
	 * @param deviceId The id of the device
	 * @param voucher An optional voucher
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param offer Offer name
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getOverTheBoxNewDuration(java.lang.String offer, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param socialReason Your social reason
	 * @param offer The offer : individual or company
	 * @param contactNumber Your contact phone number
	 * @param city Address city
	 * @param streetName Address street name
	 * @param displayUniversalDirectory Publish informations on directory ? (Yellow Pages, 118XXX, ...)
	 * @param country Country of number
	 * @param callNumber The number you want to port
	 * @param firstName Your firstname
	 * @param contactName Your contact name
	 * @param streetType Address street type
	 * @param name Your name
	 * @param zip Address zip code
	 * @param desireDate The date you want for portability execution
	 * @param streetNumber Address street number
	 * @param type The type of number : landline or special
	 * @param billingAccount The name of your billingAccount
	 * @param floor Address floor
	 * @param stair Address stair
	 * @param streetNumberExtra Address street number extra : bis,ter,...
	 * @param listNumbers Extra numbers to be ported
	 * @param siret If you port under your society, the SIRET number
	 * @param groupNumber Secondary designation number
	 * @param comment Comment
	 * @param door Address door
	 * @param building Address building
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount, double floor, double stair, java.lang.String streetNumberExtra, java.lang.String listNumbers, java.lang.String siret, java.lang.String groupNumber, java.lang.String comment, java.lang.String door, java.lang.String building) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param socialReason Your social reason
	 * @param offer The offer : individual or company
	 * @param contactNumber Your contact phone number
	 * @param city Address city
	 * @param streetName Address street name
	 * @param displayUniversalDirectory Publish informations on directory ? (Yellow Pages, 118XXX, ...)
	 * @param country Country of number
	 * @param callNumber The number you want to port
	 * @param firstName Your firstname
	 * @param contactName Your contact name
	 * @param streetType Address street type
	 * @param name Your name
	 * @param zip Address zip code
	 * @param desireDate The date you want for portability execution
	 * @param streetNumber Address street number
	 * @param type The type of number : landline or special
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountPortability(java.lang.String socialReason, java.lang.String offer, java.lang.String contactNumber, java.lang.String city, java.lang.String streetName, boolean displayUniversalDirectory, java.lang.String country, java.lang.String callNumber, java.lang.String firstName, java.lang.String contactName, java.lang.String streetType, java.lang.String name, java.lang.String zip, java.util.Date desireDate, double streetNumber, java.lang.String type, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param bandwidth How much additional bandwidth do you want ?
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameAdditionalBandwidthDuration(java.lang.String bandwidth, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param offer Offers you can add to your hosting
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingWebServiceNameExtraSqlPersoDuration(java.lang.String offer, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedHousingServiceNameAPCDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? false
	 * @param containerNumber How much container is this license able to manage ...
	 * @param serviceName The name of your Virtuozzo license
	*/
	java.lang.String getLicenseVirtuozzoServiceNameUpgrade(java.lang.String containerNumber, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param name Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId Datacenter where the Host will be added
	 * @param serviceName null
	 * @param duration Duration
	 * @param quantity Quantity of hosts you want to order (default 1)
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration, long quantity) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param name Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId Datacenter where the Host will be added
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameHostDuration(java.lang.String name, long datacenterId, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param pop The pop(s) you want your IP LoadBalancing on
	*/
	java.lang.String getIpLoadBalancingNew(java.lang.String pop) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param serviceName The name of your Windows license
	 * @param duration Duration
	 * @param sqlVersion The SQL Server version to enable on this license Windows license
	 * @param version The windows version you want to enable on your windows license
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration, java.lang.String sqlVersion, java.lang.String version) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsServiceNameUpgradeDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param quantity Sms credit quantity
	 * @param serviceName The internal name of your SMS offer
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postSmsServiceNameCredits(long quantity, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'host' option
	 * Facultative parameters ? true
	 * @param name Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId Datacenter where the Host will be added
	 * @param serviceName null
	 * @param quantity Quantity of hosts you want to order (default 1)
	*/
	java.lang.String getDedicatedCloudServiceNameHost(java.lang.String name, long datacenterId, java.lang.String serviceName, long quantity) throws java.io.IOException;

	/**
	 * Get allowed durations for 'host' option
	 * Facultative parameters ? false
	 * @param name Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId Datacenter where the Host will be added
	 * @param serviceName null
	*/
	java.lang.String getDedicatedCloudServiceNameHost(java.lang.String name, long datacenterId, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceDiskSpace(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? true
	 * @param officeBusinessQuantity Number of prepaid office business license
	 * @param officeProPlusQuantity Number of prepaid office pro plus license
	 * @param giftCode Gift code for office license
	*/
	java.lang.String getLicenseOfficeNew(long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	*/
	java.lang.String getLicenseOfficeNew() throws java.io.IOException;

	/**
	 * Retrieve all required configuration item of the cart item
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	 * @param itemId Product item identifier
	*/
	net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements getCartCartIdItemItemIdRequiredConfiguration(java.lang.String cartId, long itemId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param containerNumber How much container is this license able to manage ...
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param containerNumber How much container is this license able to manage ...
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoNewDuration(java.lang.String containerNumber, java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param zone Zone
	 * @param city Contact city
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	 * @param firstname Contact firstname
	 * @param ape Company ape
	 * @param email null
	 * @param streetName Street name
	 * @param pool Number of alias in case of pool
	 * @param specificNumber Preselected standard number
	 * @param siret Companu siret
	 * @param organisation Contact organisation
	 * @param socialNomination Company social nomination
	 * @param name Contact name
	 * @param phone Contact phone
	 * @param zip Contact zip
	 * @param streetNumber Street number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param zone Zone
	 * @param city Contact city
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberGeographic(java.lang.String zone, java.lang.String city, boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameFtpbackupDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? true
	 * @param offer Offer name
	 * @param deviceId The id of the device
	 * @param voucher An optional voucher
	*/
	java.lang.String getOverTheBoxNew(java.lang.String offer, java.lang.String deviceId, java.lang.String voucher) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param offer Offer name
	*/
	java.lang.String getOverTheBoxNew(java.lang.String offer) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Static offer
	*/
	java.lang.String getCdnWebstorageServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param version Private database available versions
	 * @param ram Private database ram size
	*/
	java.lang.String getHostingPrivateDatabaseNew(java.lang.String version, java.lang.String ram) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameCpanelDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	 * @param sqlVersion The SQL Server version to enable on this license Windows license
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseWindowsNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameSnapshotDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param zoneName Name of the zone to create
	 * @param minimized Create only mandatory records
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneNew(java.lang.String zoneName, boolean minimized) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param zoneName Name of the zone to create
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDomainZoneNew(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param containerNumber How much container is this license able to manage ...
	 * @param serviceName The name of your Virtuozzo license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseVirtuozzoServiceNameUpgradeDuration(java.lang.String containerNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getEmailExchangeOrganizationNameServiceExchangeServiceUpgrade(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	java.lang.String getDomainZoneZoneName(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	 * @param powerpack powerpack current activation state on your license
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param applicationSet Wanted application set
	 * @param wordpressToolkit WordpressToolkit option activation
	 * @param languagePackNumber The amount of language pack numbers to include in this licences
	 * @param antivirus The antivirus to enable on this Plesk license
	 * @param domainNumber This license domain number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getVeeamCloudConnect() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDedicatedCloudServiceNameSpla(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param traffic Available offers to increase bandwidth quota (unit: GB)
	 * @param serviceName The internal name of your hosting
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingWebServiceNameBandwidthDuration(long traffic, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ftpbackup' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameFtpbackup(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version Private database available versions
	 * @param ram Private database ram size
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postHostingPrivateDatabaseNewDuration(java.lang.String version, java.lang.String ram, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param upgradedRessourceType The type of ressource you want to upgrade.
	 * @param upgradeType The type of upgrade you want to process on the ressource(s)
	 * @param serviceName null
	 * @param duration Duration
	 * @param upgradedRessourceId The id of a particular ressource you want to upgrade in your Dedicated Cloud (useless for "all" UpgradeRessourceTypeEnum)
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration, long upgradedRessourceId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param upgradedRessourceType The type of ressource you want to upgrade.
	 * @param upgradeType The type of upgrade you want to process on the ressource(s)
	 * @param serviceName null
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedCloudServiceNameUpgradeRessourceDuration(java.lang.String upgradedRessourceType, java.lang.String upgradeType, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	*/
	java.lang.String getLicenseWindowsServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param quantity Number of modem quantity
	 * @param brand Spare modem brand model
	 * @param mondialRelayId Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand, java.lang.String mondialRelayId) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param quantity Number of modem quantity
	 * @param brand Spare modem brand model
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getXdslSpareNew(long shippingContactId, long quantity, java.lang.String brand) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param pop The pop(s) you want your IP LoadBalancing on
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postIpLoadBalancingNewDuration(java.lang.String pop, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param domain The domain for which you want an SSL option. A DCV mail will be sent at postmaster@your_domain.abc, make sure this address exists before ordering
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingServiceNameSsl(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'automatedBackup' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameAutomatedBackup(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of your OVH order carts
	 * Facultative parameters ? true
	 * @param description Filter the value of description property (=)
	*/
	java.lang.String getCart(java.lang.String description) throws java.io.IOException;

	/**
	 * List of your OVH order carts
	 * Facultative parameters ? false
	*/
	java.lang.String getCart() throws java.io.IOException;

	/**
	 * Get allowed durations for 'dnsAnycast' option
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	java.lang.String getDomainZoneZoneNameDnsAnycast(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'upgrade' option
	 * Facultative parameters ? false
	 * @param model Model
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameUpgrade(java.lang.String model, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param duration Duration
	 * @param officeBusinessQuantity Number of prepaid office business license
	 * @param officeProPlusQuantity Number of prepaid office pro plus license
	 * @param giftCode Gift code for office license
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseOfficeNewDuration(java.lang.String duration, long officeBusinessQuantity, long officeProPlusQuantity, java.lang.String giftCode) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseOfficeNewDuration(java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param containerNumber How much container is this license able to manage ...
	 * @param serviceName The name of your Virtuozzo license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseVirtuozzoServiceNameUpgradeDuration(java.lang.String containerNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	 * @param powerpack powerpack current activation state on your license
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param applicationSet Wanted application set
	 * @param wordpressToolkit WordpressToolkit option activation
	 * @param languagePackNumber The amount of language pack numbers to include in this licences
	 * @param antivirus The antivirus to enable on this Plesk license
	 * @param domainNumber This license domain number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, boolean powerpack, java.lang.String serviceType, java.lang.String applicationSet, boolean wordpressToolkit, java.lang.String languagePackNumber, java.lang.String antivirus, java.lang.String domainNumber) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicensePleskNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	*/
	java.lang.String getCdnDedicatedServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameKvmExpressDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Retrieve information about a specific cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	net.zyuiop.ovhapi.api.objects.order.cart.Cart getCartCartId(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ip' option
	 * Facultative parameters ? true
	 * @param number Number of IPs to order
	 * @param serviceName The internal name of your VPS offer
	 * @param country Choose a geolocation for your IP Address
	*/
	java.lang.String getVpsServiceNameIp(long number, java.lang.String serviceName, java.lang.String country) throws java.io.IOException;

	/**
	 * Get allowed durations for 'ip' option
	 * Facultative parameters ? false
	 * @param number Number of IPs to order
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameIp(long number, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param sqlVersion The SQL Server version to enable on this license Windows license
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	java.lang.String getLicenseWindowsNew(java.lang.String version, java.lang.String ip, java.lang.String sqlVersion, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed (for dedicated your main server Ip)
	*/
	java.lang.String getLicenseWindowsNew(java.lang.String version, java.lang.String ip) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param country Ip localization
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFailoverIPDuration(java.lang.String country, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param serviceName The name of your SQL Server license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postLicenseSqlserverServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName null
	*/
	java.lang.String getVeeamCloudConnectServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'professionalUse' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameProfessionalUse(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getDomainZone() throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameWindowsDuration(java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param firewallModel Firewall type
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameFirewallDuration(java.lang.String firewallModel, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param amount Amount to add in your cloud credit
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getCloudProjectServiceNameCredit(long amount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param additionalDiskSize Size of the additional disk
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNameAdditionalDiskDuration(java.lang.String additionalDiskSize, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * List all the items of a cart
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	*/
	long[] getCartCartIdItem(java.lang.String cartId) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	 * @param serviceType # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration, java.lang.String serviceType) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param ip Ip on which this license would be installed
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseDirectadminNewDuration(java.lang.String version, java.lang.String ip, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getEmailExchange() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param pop The pop(s) you want your IP LoadBalancing on
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getIpLoadBalancingNewDuration(java.lang.String pop, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param model Model
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNameUpgradeDuration(java.lang.String model, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getLicenseSqlserver() throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param typology Special range typology
	 * @param ape Company ape
	 * @param range Special range
	 * @param siret Companu siret
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param socialNomination Company social nomination
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	 * @param firstname Contact firstname
	 * @param email null
	 * @param city Contact city
	 * @param streetName Street name
	 * @param pool Number of alias in case of pool
	 * @param specificNumber Preselected standard number
	 * @param organisation Contact organisation
	 * @param name Contact name
	 * @param phone Contact phone
	 * @param zip Contact zip
	 * @param streetNumber Street number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String email, java.lang.String city, java.lang.String streetName, long pool, java.lang.String specificNumber, java.lang.String organisation, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param typology Special range typology
	 * @param ape Company ape
	 * @param range Special range
	 * @param siret Companu siret
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param socialNomination Company social nomination
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountNumberSpecial(java.lang.String typology, java.lang.String ape, java.lang.String range, java.lang.String siret, boolean displayUniversalDirectory, java.lang.String country, java.lang.String socialNomination, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param zoneName Name of the zone to create
	 * @param minimized Create only mandatory records
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneNew(java.lang.String zoneName, boolean minimized) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param zoneName Name of the zone to create
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getDomainZoneNew(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'veeam' option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String getVpsServiceNameVeeam(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param version This license version
	 * @param serviceName The name of your WorkLight license
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getLicenseWorklightServiceNameUpgradeDuration(java.lang.String version, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param blockSize IP block size
	 * @param type The type of IP
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	 * @param organisationId Your organisation id to add on block informations
	 * @param country IP localization
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration, java.lang.String organisationId, java.lang.String country) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param blockSize IP block size
	 * @param type The type of IP
	 * @param serviceName The internal name of your dedicated server
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postDedicatedServerServiceNameIpDuration(long blockSize, java.lang.String type, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param domain Domain name which will be linked to this hosting account
	 * @param offer Offer for your new hosting account
	 * @param duration Duration
	 * @param dnsZone Dns zone modification possibilities ( by default : RESET_ALL )
	 * @param module Module installation ready to use
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration, java.lang.String dnsZone, java.lang.String module) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param domain Domain name which will be linked to this hosting account
	 * @param offer Offer for your new hosting account
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getHostingWebNewDuration(java.lang.String domain, java.lang.String offer, java.lang.String duration) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? true
	 * @param retractation Retractation rights if set
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param accessory Accessory brand name
	 * @param quantity Quantity of request repetition in this configuration
	 * @param billingAccount The name of your billingAccount
	 * @param mondialRelayId Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount, java.lang.String mondialRelayId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param retractation Retractation rights if set
	 * @param shippingContactId Shipping contact information id from /me entry point
	 * @param accessory Accessory brand name
	 * @param quantity Quantity of request repetition in this configuration
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postTelephonyBillingAccountAccessory(boolean retractation, long shippingContactId, java.lang.String accessory, long quantity, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param quota quota number in TB that will be added to the CDN service
	 * @param serviceName The internal name of your CDN offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postCdnDedicatedServiceNameQuotaDuration(long quota, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * Get allowed durations for 'changeMainDomain' option
	 * Facultative parameters ? false
	 * @param domain New domain for change the main domain
	 * @param mxplan MX plan linked to the odl main domain
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getHostingWebServiceNameChangeMainDomain(java.lang.String domain, java.lang.String mxplan, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get allowed durations for 'staticIP' option
	 * Facultative parameters ? false
	 * @param country Ip localization
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String getDedicatedServerServiceNameStaticIP(java.lang.String country, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param domainNumber Domain number you want to order a licence for
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getVpsServiceNamePleskDuration(java.lang.String domainNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getEmailDomain() throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? true
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	 * @param firstname Contact firstname
	 * @param ape Company ape
	 * @param email null
	 * @param city Contact city
	 * @param pool Number of alias in case of pool
	 * @param streetName Street name
	 * @param specificNumber Preselected standard number
	 * @param siret Companu siret
	 * @param organisation Contact organisation
	 * @param socialNomination Company social nomination
	 * @param name Contact name
	 * @param phone Contact phone
	 * @param zip Contact zip
	 * @param streetNumber Street number
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount, java.lang.String firstname, java.lang.String ape, java.lang.String email, java.lang.String city, long pool, java.lang.String streetName, java.lang.String specificNumber, java.lang.String siret, java.lang.String organisation, java.lang.String socialNomination, java.lang.String name, java.lang.String phone, java.lang.String zip, java.lang.String streetNumber) throws java.io.IOException;

	/**
	 * Get prices and contracts information
	 * Facultative parameters ? false
	 * @param displayUniversalDirectory Publish contact informations on universal directories
	 * @param country Number country
	 * @param retractation Retractation rights if set
	 * @param legalform Legal form
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.order.Order getTelephonyBillingAccountNumberNogeographic(boolean displayUniversalDirectory, java.lang.String country, boolean retractation, java.lang.String legalform, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get allowed durations for 'new' option
	 * Facultative parameters ? false
	 * @param domain Domain name which will be linked to this mx account
	 * @param offer Offer for your new mx account
	*/
	java.lang.String getEmailDomainNew(java.lang.String domain, java.lang.String offer) throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String getVrackServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getDedicatedCloud() throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getHostingWeb() throws java.io.IOException;

	/**
	 * Get allowed options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	java.lang.String getSmsServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Retrieve all configuration item of the cart item
	 * Facultative parameters ? true
	 * @param cartId Cart identifier
	 * @param itemId Product item identifier
	 * @param label Filter the value of label property (=)
	*/
	long[] getCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId, java.lang.String label) throws java.io.IOException;

	/**
	 * Retrieve all configuration item of the cart item
	 * Facultative parameters ? false
	 * @param cartId Cart identifier
	 * @param itemId Product item identifier
	*/
	long[] getCartCartIdItemItemIdConfiguration(java.lang.String cartId, long itemId) throws java.io.IOException;

	/**
	 * Create order
	 * Facultative parameters ? false
	 * @param domainNumber Domain number you want to order a licence for
	 * @param serviceName The internal name of your VPS offer
	 * @param duration Duration
	*/
	net.zyuiop.ovhapi.api.objects.order.Order postVpsServiceNamePleskDuration(java.lang.String domainNumber, java.lang.String serviceName, java.lang.String duration) throws java.io.IOException;

}
