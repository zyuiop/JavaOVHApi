package net.zyuiop.ovhapi.impl.methods.license;

import net.zyuiop.ovhapi.api.methods.license.Worklight;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class WorklightImpl implements Worklight { 

	private final OVHRawCalls client;

	public WorklightImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.license.worklight.WorkLight param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.license.Task getServiceNameTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/tasks/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.TaskImpl.class);
	}

	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.ChangeIpStatus getServiceNameCanLicenseBeMovedTo(java.lang.String destinationIp, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/canLicenseBeMovedTo";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.ChangeIpStatusImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.Task postServiceNameChangeIp(java.lang.String destinationIp, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/changeIp";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("destinationIp", destinationIp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.TaskImpl.class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String action) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getServiceNameAllowedDestinationIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "/allowedDestinationIp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getLicenseWorklight() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/license/worklight";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.WorkLightOrderConfiguration getOrderableVersions(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/orderableVersions";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.WorkLightOrderConfigurationImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.license.worklight.WorkLight getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/worklight/" + serviceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.license.worklight.WorkLightImpl.class);
	}

}
