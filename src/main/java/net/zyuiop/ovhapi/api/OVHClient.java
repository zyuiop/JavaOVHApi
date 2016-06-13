package net.zyuiop.ovhapi.api;

public interface OVHClient {

	void authenticate(String customerKey);

	String callRaw(java.net.URL url, OVHApiMethod method, String data) throws java.io.IOException;

	String callRaw(java.net.URL url, OVHApiMethod method, String data, boolean hasAuth) throws java.io.IOException, IllegalStateException;

	net.zyuiop.ovhapi.api.methods.dedicated.InstallationTemplate dedicatedInstallationTemplate();

	net.zyuiop.ovhapi.api.methods.Hpcspot hpcspot();

	net.zyuiop.ovhapi.api.methods.Vps vps();

	net.zyuiop.ovhapi.api.methods.IpLoadbalancing ipLoadbalancing();

	net.zyuiop.ovhapi.api.methods.Sms sms();

	net.zyuiop.ovhapi.api.methods.Me me();

	net.zyuiop.ovhapi.api.methods.pack.Xdsl packXdsl();

	net.zyuiop.ovhapi.api.methods.license.Office licenseOffice();

	net.zyuiop.ovhapi.api.methods.license.Plesk licensePlesk();

	net.zyuiop.ovhapi.api.methods.Ip ip();

	net.zyuiop.ovhapi.api.methods.Order order();

	net.zyuiop.ovhapi.api.methods.supply.MondialRelay supplyMondialRelay();

	net.zyuiop.ovhapi.api.methods.license.Windows licenseWindows();

	net.zyuiop.ovhapi.api.methods.Auth auth();

	net.zyuiop.ovhapi.api.methods.email.Exchange emailExchange();

	net.zyuiop.ovhapi.api.methods.Router router();

	net.zyuiop.ovhapi.api.methods.OverTheBox overTheBox();

	net.zyuiop.ovhapi.api.methods.dedicated.Nas dedicatedNas();

	net.zyuiop.ovhapi.api.methods.Price price();

	net.zyuiop.ovhapi.api.methods.dedicated.Server dedicatedServer();

	net.zyuiop.ovhapi.api.methods.hosting.Windows hostingWindows();

	net.zyuiop.ovhapi.api.methods.Telephony telephony();

	net.zyuiop.ovhapi.api.methods.Freefax freefax();

	net.zyuiop.ovhapi.api.methods.NewAccount newAccount();

	net.zyuiop.ovhapi.api.methods.Domain domain();

	net.zyuiop.ovhapi.api.methods.license.Virtuozzo licenseVirtuozzo();

	net.zyuiop.ovhapi.api.methods.hosting.PrivateDatabase hostingPrivateDatabase();

	net.zyuiop.ovhapi.api.methods.cdn.Dedicated cdnDedicated();

	net.zyuiop.ovhapi.api.methods.Xdsl xdsl();

	net.zyuiop.ovhapi.api.methods.cluster.Hadoop clusterHadoop();

	net.zyuiop.ovhapi.api.methods.license.CloudLinux licenseCloudLinux();

	net.zyuiop.ovhapi.api.methods.license.Worklight licenseWorklight();

	net.zyuiop.ovhapi.api.methods.license.Sqlserver licenseSqlserver();

	net.zyuiop.ovhapi.api.methods.hosting.Web hostingWeb();

	net.zyuiop.ovhapi.api.methods.cdn.Website cdnWebsite();

	net.zyuiop.ovhapi.api.methods.Cloud cloud();

	net.zyuiop.ovhapi.api.methods.VeeamCloudConnect veeamCloudConnect();

	net.zyuiop.ovhapi.api.methods.license.Directadmin licenseDirectadmin();

	net.zyuiop.ovhapi.api.methods.email.ImapCopy emailImapCopy();

	net.zyuiop.ovhapi.api.methods.Vrack vrack();

	net.zyuiop.ovhapi.api.methods.DedicatedCloud dedicatedCloud();

	net.zyuiop.ovhapi.api.methods.Support support();

	net.zyuiop.ovhapi.api.methods.cdn.Webstorage cdnWebstorage();

	net.zyuiop.ovhapi.api.methods.dedicated.Nasha dedicatedNasha();

	net.zyuiop.ovhapi.api.methods.license.Cpanel licenseCpanel();

	net.zyuiop.ovhapi.api.methods.email.Domain emailDomain();

	net.zyuiop.ovhapi.api.methods.stack.Mis stackMis();

	net.zyuiop.ovhapi.api.methods.AllDom allDom();

	net.zyuiop.ovhapi.api.methods.dedicated.Housing dedicatedHousing();

}
