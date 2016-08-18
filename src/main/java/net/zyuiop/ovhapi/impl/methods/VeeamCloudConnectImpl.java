package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.VeeamCloudConnect;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class VeeamCloudConnectImpl implements VeeamCloudConnect { 

	private final OVHRawCalls client;

	public VeeamCloudConnectImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /veeamCloudConnect/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameBackupRepository(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/backupRepository";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /veeamCloudConnect/$serviceName/backupRepository
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String name, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public java.lang.String[] getVeeamCloudConnect() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/veeamCloudConnect";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /veeamCloudConnect/$serviceName/backupRepository/$inventoryName/upgradeQuota
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameOrderableUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/orderableUpgrade";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/veeamCloudConnect/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /veeamCloudConnect/$serviceName/backupRepository/$inventoryName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /veeamCloudConnect/$serviceName/backupRepository/$inventoryName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /veeamCloudConnect/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/


}
