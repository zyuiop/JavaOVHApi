package net.zyuiop.ovhapi.impl.methods.cluster;

import net.zyuiop.ovhapi.api.methods.cluster.Hadoop;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class HadoopImpl implements Hadoop { 

	private final OVHRawCalls client;

	public HadoopImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameNodeHostnameRoleType(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/role/" + type + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/consumptions
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Hadoop getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.HadoopImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/nodeBillingProfiles
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/nodeConsumptions
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Role getServiceNameNodeHostnameRoleType(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/role/" + type + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "hostname=" + hostname;
		__data += "type=" + type;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.RoleImpl.class);
	}

	public void putServiceNameUserUsername(net.zyuiop.ovhapi.api.objects.cluster.hadoop.User param0, java.lang.String serviceName, java.lang.String username) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/user/" + username + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRole(java.lang.String type, java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/role";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public java.lang.String[] getServiceNameNetworkAcl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/networkAcl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeRestart(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/role/" + type + "/restart";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public void putServiceNameNetworkAclBlock(net.zyuiop.ovhapi.api.objects.cluster.hadoop.NetworkAcl param0, java.lang.String serviceName, java.lang.String block) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/networkAcl/" + block + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceStop(java.lang.String service, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/service/stop";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("service", service);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameOrderNewNodeHourly(java.lang.String nodeProfile, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/orderNewNodeHourly";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("nodeProfile", nodeProfile);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceRestart(java.lang.String service, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/service/restart";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("service", service);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Node getServiceNameNodeHostname(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "hostname=" + hostname;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.NodeImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameUserUsernameResetPassword(java.lang.String password, java.lang.String serviceName, java.lang.String username) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/user/" + username + "/resetPassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.OrderInformations getOrderInformations() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/orderInformations";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.OrderInformationsImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRecommission(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/recommission";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNetworkAcl(java.lang.String serviceName, java.lang.String block, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/networkAcl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("block", block);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNetworkAcl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/networkAcl";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameOrderableNodeProfiles(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/orderableNodeProfiles";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeStop(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/role/" + type + "/stop";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameUser(boolean hue, boolean clouderaManager, java.lang.String password, boolean httpFrontend, java.lang.String username, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("hue", hue);
		__dataMap.put("clouderaManager", clouderaManager);
		__dataMap.put("password", password);
		__dataMap.put("httpFrontend", httpFrontend);
		__dataMap.put("username", username);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameStop(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/stop";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameUserUsername(java.lang.String serviceName, java.lang.String username) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/user/" + username + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeStart(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/role/" + type + "/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public java.lang.String[] getServiceNameNode(java.lang.String serviceName, java.lang.String softwareProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "softwareProfile=" + softwareProfile;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameNode(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameNetworkAclBlock(java.lang.String serviceName, java.lang.String block) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/networkAcl/" + block + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameNodeHostname(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceStart(java.lang.String service, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/service/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("service", service);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.User getServiceNameUserUsername(java.lang.String serviceName, java.lang.String username) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/user/" + username + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "username=" + username;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.UserImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameRestart(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/restart";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameStart(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public java.lang.String[] getServiceNameNodeHostnameRole(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/role";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "hostname=" + hostname;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getClusterHadoop() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/cluster/hadoop";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/orderableNodeProfiles
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameDecommission(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/node/" + hostname + "/decommission";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.NetworkAcl getServiceNameNetworkAclBlock(java.lang.String serviceName, java.lang.String block) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cluster/hadoop/" + serviceName + "/networkAcl/" + block + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "block=" + block;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cluster.hadoop.NetworkAclImpl.class);
	}

}
