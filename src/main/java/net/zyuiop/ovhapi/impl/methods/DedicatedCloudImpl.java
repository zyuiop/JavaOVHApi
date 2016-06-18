package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.DedicatedCloud;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class DedicatedCloudImpl implements DedicatedCloud { 

	private final OVHRawCalls client;

	public DedicatedCloudImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String[] getServiceNameCommercialRangeOrderable(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/commercialRange/orderable";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicatedCloud/$serviceName/datacenter/$datacenterId/backup
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDatacenterDatacenterIdTask(java.lang.String serviceName, long datacenterId, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDatacenterDatacenterIdTask(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /dedicatedCloud/$serviceName/datacenter/$datacenterId/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/user/$userId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/user/$userId/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /dedicatedCloud/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /dedicatedCloud/$serviceName/user/$userId/task/$taskId
	* Message : Missing identifier.
	*/


	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/user/$userId/right/$rightId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/ip
	* Message : Missing identifier.
	*/


	public long[] getServiceNameUserUserIdRight(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/right";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/upgradeHypervisor
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDatacenterDatacenterIdFiler(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/filer";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/allowedNetwork/$networkAccessId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicatedCloud/$serviceName/datacenter/$datacenterId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/vlan/$vlanId
	* Message : Missing identifier.
	*/


	public long[] getServiceNameVlan(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vlan";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/datacenter/$datacenterId/host/$hostId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/commercialRange/$commercialRangeName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameOrderableIpCountries(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/orderableIpCountries";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user/$userId/resetPassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/datacenter/$datacenterId/orderableHostProfiles
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicatedCloud/$serviceName/user/$userId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user/$userId/disable
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/datacenter/$datacenterId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDedicatedCloud() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/dedicatedCloud";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getServiceNameUserUserIdTask(java.lang.String serviceName, long userId, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameUserUserIdTask(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /dedicatedCloud/$serviceName/user/$userId
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public long[] getServiceNameFiler(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /dedicatedCloud/$serviceName/allowedNetwork/$networkAccessId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/datacenter/$datacenterId/filer/$filerId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/allowedNetwork
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/filer/$filerId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameCommercialRangeCompliance(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/commercialRange/compliance";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getCommercialRange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/commercialRange";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user/$userId/changeProperties
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user/$userId/changeProperties
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /dedicatedCloud/$serviceName/datacenter/$datacenterId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/ip/$network
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/datacenter/$datacenterId/backup
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud getServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vrack/" + vrack + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "vrack=" + vrack;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vrack.DedicatedCloudImpl.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/orderNewFilerHourly
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/datacenter/$datacenterId/orderNewHostHourly
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user/$userId/changePassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user/$userId/changePassword
	* Message : Missing identifier.
	*/


	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("contactAdmin", contactAdmin);
		__dataMap.put("contactTech", contactTech);
		__dataMap.put("contactBilling", contactBilling);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameUser(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/capabilities
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/datacenter/$datacenterId/orderNewFilerHourly
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/newPrices
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/datacenter/$datacenterId/orderableFilerProfiles
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/passwordPolicy
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/user/$userId/enable
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameVrack(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vrack";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getServiceNameAllowedNetwork(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/allowedNetwork";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/datacenter
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /dedicatedCloud/$serviceName/datacenter
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /dedicatedCloud/$serviceName/allowedNetwork/$networkAccessId
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vrack/" + vrack + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.vrack.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /dedicatedCloud/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /dedicatedCloud/$serviceName/user/$userId/right/$rightId
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDatacenterDatacenterIdHost(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/host";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/datacenter/$datacenterId/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /dedicatedCloud/$serviceName/datacenter/$datacenterId/backup
	* Message : Missing identifier.
	*/


}
