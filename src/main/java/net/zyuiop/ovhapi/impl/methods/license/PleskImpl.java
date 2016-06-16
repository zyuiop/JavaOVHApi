package net.zyuiop.ovhapi.impl.methods.license;

import net.zyuiop.ovhapi.api.methods.license.Plesk;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class PleskImpl implements Plesk { 

	private final OVHRawCalls client;

	public PleskImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.license.plesk.Plesk param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.license.ChangeIpStatus getServiceNameCanLicenseBeMovedTo(java.lang.String destinationIp, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/canLicenseBeMovedTo";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.ChangeIpStatusImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.Task postServiceNameChangeIp(java.lang.String destinationIp, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/changeIp";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("destinationIp", destinationIp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.TaskImpl.class);
	}

	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getServiceNameAllowedDestinationIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/allowedDestinationIp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.PleskOrderConfiguration getOrderableVersions(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/orderableVersions";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.PleskOrderConfigurationImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.Task getServiceNameTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/tasks/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public java.lang.String getServiceNameOption(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/option";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.Task deleteServiceNameOptionLabel(java.lang.String serviceName, java.lang.String label) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/option/" + label + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.TaskImpl.class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String action) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.license.Option getServiceNameOptionLabel(java.lang.String serviceName, java.lang.String label) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "/option/" + label + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.OptionImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.plesk.Plesk getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/" + serviceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.plesk.PleskImpl.class);
	}

	public java.lang.String getLicensePlesk() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/plesk/license/plesk";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

}
