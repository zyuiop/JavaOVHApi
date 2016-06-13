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


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/installationTemplate/$templateName/partitionScheme/$schemeName/partition/$mountpoint
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/installationTemplate/$templateName/partitionScheme/$schemeName
	* Message : Missing identifier.
	*/


	public java.lang.String getTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + templateName + "/partitionScheme/" + schemeName + "/partition";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + templateName + "/partitionScheme/" + schemeName + "/hardwareRaid";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/installationTemplate/$templateName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicated/installationTemplate/$templateName/partitionScheme/$schemeName/hardwareRaid/$name
	* Message : Missing identifier.
	*/


	public java.lang.String getTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + templateName + "/partitionScheme";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDedicatedInstallationTemplate() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//dedicated/installationTemplate";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

}
