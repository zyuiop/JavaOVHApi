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
	* Involved method : GET > /veeamCloudConnect/$serviceName/backupRepository/$inventoryName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /veeamCloudConnect/$serviceName/backupRepository/$inventoryName/upgradeQuota
	* Message : Missing identifier.
	*/


	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String name, java.lang.String state) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /veeamCloudConnect/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameBackupRepository(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backupRepository";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameOrderableUpgrade(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderableUpgrade";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /veeamCloudConnect/$serviceName/backupRepository/$inventoryName
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /veeamCloudConnect/$serviceName/backupRepository
	* Message : Missing identifier.
	*/


	public java.lang.String getVeeamCloudConnect() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//veeamCloudConnect";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /veeamCloudConnect/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/


}
