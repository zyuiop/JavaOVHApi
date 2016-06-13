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
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/role/" + type + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/$serviceName/consumptions
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Hadoop getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Hadoop.class);
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


	public java.lang.String getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Role getServiceNameNodeHostnameRoleType(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/role/" + type + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Role.class);
	}

	public void putServiceNameUserUsername(net.zyuiop.ovhapi.api.objects.cluster.hadoop.User param0, java.lang.String serviceName, java.lang.String username) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + username + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRole(java.lang.String type, java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/role";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public java.lang.String getServiceNameNetworkAcl(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/networkAcl";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeRestart(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/role/" + type + "/restart";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public void putServiceNameNetworkAclBlock(net.zyuiop.ovhapi.api.objects.cluster.hadoop.NetworkAcl param0, java.lang.String serviceName, java.lang.String block) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/networkAcl/" + block + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
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

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceStop(java.lang.String service, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/service/stop";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("service", service);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameOrderNewNodeHourly(java.lang.String nodeProfile, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderNewNodeHourly";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("nodeProfile", nodeProfile);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceRestart(java.lang.String service, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/service/restart";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("service", service);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Node getServiceNameNodeHostname(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Node.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameUserUsernameResetPassword(java.lang.String password, java.lang.String serviceName, java.lang.String username) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + username + "/resetPassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.OrderInformations getOrderInformations() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/orderInformations";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.OrderInformations.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRecommission(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/recommission";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNetworkAcl(java.lang.String serviceName, java.lang.String block, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/networkAcl";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("block", block);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNetworkAcl(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/networkAcl";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
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

	public java.lang.String getServiceNameOrderableNodeProfiles(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/orderableNodeProfiles";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeStop(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/role/" + type + "/stop";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameUser(boolean hue, boolean clouderaManager, java.lang.String password, boolean httpFrontend, java.lang.String username, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("hue", hue);
		dataMap.put("clouderaManager", clouderaManager);
		dataMap.put("password", password);
		dataMap.put("httpFrontend", httpFrontend);
		dataMap.put("username", username);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameStop(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/stop";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameUserUsername(java.lang.String serviceName, java.lang.String username) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + username + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeStart(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/role/" + type + "/start";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public java.lang.String getServiceNameNode(java.lang.String serviceName, java.lang.String softwareProfile) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameNode(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameNetworkAclBlock(java.lang.String serviceName, java.lang.String block) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/networkAcl/" + block + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameNodeHostname(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceStart(java.lang.String service, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/service/start";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("service", service);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.User getServiceNameUserUsername(java.lang.String serviceName, java.lang.String username) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/user/" + username + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.User.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + taskId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameRestart(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/restart";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameStart(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/start";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public java.lang.String getServiceNameNodeHostnameRole(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/role";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getClusterHadoop() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//cluster/hadoop";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cluster/hadoop/orderableNodeProfiles
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameDecommission(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/node/" + hostname + "/decommission";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/terminate";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cluster.hadoop.NetworkAcl getServiceNameNetworkAclBlock(java.lang.String serviceName, java.lang.String block) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/networkAcl/" + block + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cluster.hadoop.NetworkAcl.class);
	}

}
