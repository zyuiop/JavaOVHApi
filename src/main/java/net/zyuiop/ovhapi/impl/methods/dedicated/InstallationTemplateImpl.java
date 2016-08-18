package net.zyuiop.ovhapi.impl.methods.dedicated;

import net.zyuiop.ovhapi.api.methods.dedicated.InstallationTemplate;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class InstallationTemplateImpl implements InstallationTemplate { 

	private final OVHRawCalls client;

	public InstallationTemplateImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.TemplatePartitioningSchemes getTemplateNamePartitionSchemeSchemeName(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "";
		String __data = "?";
		__data += "templateName=" + templateName;
		__data += "schemeName=" + schemeName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.TemplatePartitioningSchemes.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.Templates getTemplateName(java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/installationTemplate/" + templateName + "";
		String __data = "?";
		__data += "templateName=" + templateName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.Templates.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.HardwareRaid getTemplateNamePartitionSchemeSchemeNameHardwareRaidName(java.lang.String templateName, java.lang.String schemeName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid/" + name + "";
		String __data = "?";
		__data += "templateName=" + templateName;
		__data += "schemeName=" + schemeName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.HardwareRaid.class);
	}

	public java.lang.String[] getTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid";
		String __data = "?";
		__data += "templateName=" + templateName;
		__data += "schemeName=" + schemeName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		String __data = "?";
		__data += "templateName=" + templateName;
		__data += "schemeName=" + schemeName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.TemplatePartitions getTemplateNamePartitionSchemeSchemeNamePartitionMountpoint(java.lang.String templateName, java.lang.String schemeName, java.lang.String mountpoint) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/installationTemplate/" + templateName + "/partitionScheme/" + schemeName + "/partition/" + mountpoint + "";
		String __data = "?";
		__data += "templateName=" + templateName;
		__data += "schemeName=" + schemeName;
		__data += "mountpoint=" + mountpoint;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.TemplatePartitions.class);
	}

	public java.lang.String[] getDedicatedInstallationTemplate() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/installationTemplate/dedicated/installationTemplate";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public java.lang.String[] getTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicated/installationTemplate/" + templateName + "/partitionScheme";
		String __data = "?";
		__data += "templateName=" + templateName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
