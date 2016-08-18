package net.zyuiop.ovhapi.impl;

import net.zyuiop.ovhapi.api.OVHClient;

public class OVHClientImpl extends OVHRawCalls implements OVHClient {
	public OVHClientImpl(String appKey, String appSecret, String consumerKey) {
		super(appKey, appSecret, consumerKey);
	}

	public OVHClientImpl(String appKey, String appSecret) {
		super(appKey, appSecret);
	}
	public net.zyuiop.ovhapi.api.methods.pack.Xdsl packXdsl() {
	return new net.zyuiop.ovhapi.impl.methods.pack.XdslImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Vrack vrack() {
	return new net.zyuiop.ovhapi.impl.methods.VrackImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Me me() {
	return new net.zyuiop.ovhapi.impl.methods.MeImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.dedicated.InstallationTemplate dedicatedInstallationTemplate() {
	return new net.zyuiop.ovhapi.impl.methods.dedicated.InstallationTemplateImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Ip ip() {
	return new net.zyuiop.ovhapi.impl.methods.IpImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.email.Exchange emailExchange() {
	return new net.zyuiop.ovhapi.impl.methods.email.ExchangeImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.email.Domain emailDomain() {
	return new net.zyuiop.ovhapi.impl.methods.email.DomainImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.IpLoadbalancing ipLoadbalancing() {
	return new net.zyuiop.ovhapi.impl.methods.IpLoadbalancingImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Router router() {
	return new net.zyuiop.ovhapi.impl.methods.RouterImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.Windows licenseWindows() {
	return new net.zyuiop.ovhapi.impl.methods.license.WindowsImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.dedicated.Nas dedicatedNas() {
	return new net.zyuiop.ovhapi.impl.methods.dedicated.NasImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.Office licenseOffice() {
	return new net.zyuiop.ovhapi.impl.methods.license.OfficeImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.Worklight licenseWorklight() {
	return new net.zyuiop.ovhapi.impl.methods.license.WorklightImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Order order() {
	return new net.zyuiop.ovhapi.impl.methods.OrderImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.Cpanel licenseCpanel() {
	return new net.zyuiop.ovhapi.impl.methods.license.CpanelImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Vps vps() {
	return new net.zyuiop.ovhapi.impl.methods.VpsImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Telephony telephony() {
	return new net.zyuiop.ovhapi.impl.methods.TelephonyImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Cloud cloud() {
	return new net.zyuiop.ovhapi.impl.methods.CloudImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.dedicated.Server dedicatedServer() {
	return new net.zyuiop.ovhapi.impl.methods.dedicated.ServerImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.DedicatedCloud dedicatedCloud() {
	return new net.zyuiop.ovhapi.impl.methods.DedicatedCloudImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Xdsl xdsl() {
	return new net.zyuiop.ovhapi.impl.methods.XdslImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Auth auth() {
	return new net.zyuiop.ovhapi.impl.methods.AuthImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.supply.MondialRelay supplyMondialRelay() {
	return new net.zyuiop.ovhapi.impl.methods.supply.MondialRelayImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.hosting.Web hostingWeb() {
	return new net.zyuiop.ovhapi.impl.methods.hosting.WebImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.AllDom allDom() {
	return new net.zyuiop.ovhapi.impl.methods.AllDomImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.cluster.Hadoop clusterHadoop() {
	return new net.zyuiop.ovhapi.impl.methods.cluster.HadoopImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Freefax freefax() {
	return new net.zyuiop.ovhapi.impl.methods.FreefaxImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.VeeamCloudConnect veeamCloudConnect() {
	return new net.zyuiop.ovhapi.impl.methods.VeeamCloudConnectImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.hosting.Windows hostingWindows() {
	return new net.zyuiop.ovhapi.impl.methods.hosting.WindowsImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.dedicated.Housing dedicatedHousing() {
	return new net.zyuiop.ovhapi.impl.methods.dedicated.HousingImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Domain domain() {
	return new net.zyuiop.ovhapi.impl.methods.DomainImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.OverTheBox overTheBox() {
	return new net.zyuiop.ovhapi.impl.methods.OverTheBoxImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.cdn.Website cdnWebsite() {
	return new net.zyuiop.ovhapi.impl.methods.cdn.WebsiteImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.dedicated.Nasha dedicatedNasha() {
	return new net.zyuiop.ovhapi.impl.methods.dedicated.NashaImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.Virtuozzo licenseVirtuozzo() {
	return new net.zyuiop.ovhapi.impl.methods.license.VirtuozzoImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Price price() {
	return new net.zyuiop.ovhapi.impl.methods.PriceImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.stack.Mis stackMis() {
	return new net.zyuiop.ovhapi.impl.methods.stack.MisImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Sms sms() {
	return new net.zyuiop.ovhapi.impl.methods.SmsImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.Sqlserver licenseSqlserver() {
	return new net.zyuiop.ovhapi.impl.methods.license.SqlserverImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.email.ImapCopy emailImapCopy() {
	return new net.zyuiop.ovhapi.impl.methods.email.ImapCopyImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.cdn.Dedicated cdnDedicated() {
	return new net.zyuiop.ovhapi.impl.methods.cdn.DedicatedImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.Plesk licensePlesk() {
	return new net.zyuiop.ovhapi.impl.methods.license.PleskImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.NewAccount newAccount() {
	return new net.zyuiop.ovhapi.impl.methods.NewAccountImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Support support() {
	return new net.zyuiop.ovhapi.impl.methods.SupportImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.cdn.Webstorage cdnWebstorage() {
	return new net.zyuiop.ovhapi.impl.methods.cdn.WebstorageImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.hosting.PrivateDatabase hostingPrivateDatabase() {
	return new net.zyuiop.ovhapi.impl.methods.hosting.PrivateDatabaseImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.CloudLinux licenseCloudLinux() {
	return new net.zyuiop.ovhapi.impl.methods.license.CloudLinuxImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.Hpcspot hpcspot() {
	return new net.zyuiop.ovhapi.impl.methods.HpcspotImpl(this);
	}

	public net.zyuiop.ovhapi.api.methods.license.Directadmin licenseDirectadmin() {
	return new net.zyuiop.ovhapi.impl.methods.license.DirectadminImpl(this);
	}

}
