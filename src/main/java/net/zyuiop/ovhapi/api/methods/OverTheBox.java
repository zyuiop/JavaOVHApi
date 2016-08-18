package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /overTheBox APIs
 */

public interface OverTheBox { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Cancel the resiliation of the Service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.Service getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.Device getServiceNameDevice(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a device action on the device
	 * Facultative parameters ? false
	 * @param name Name of the action
	 * @param serviceName The internal name of your overTheBox offer
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.DeviceAction postServiceNameDeviceActions(java.lang.String name, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available release channels for this service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	java.lang.String[] getServiceNameAvailableReleaseChannels(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of remote accesses for the service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	java.lang.String[] getServiceNameRemoteAccesses(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Link a device to this service
	 * Facultative parameters ? false
	 * @param deviceId The id of the device
	 * @param serviceName The internal name of your overTheBox offer
	*/
	void postServiceNameLinkDevice(java.lang.String deviceId, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a remote access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	 * @param remoteAccessId The id of the remote access
	*/
	void deleteServiceNameRemoteAccessesRemoteAccessId(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your overTheBox offer
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	 * @param actionId The id of the action
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.DeviceAction getServiceNameDeviceActionsActionId(java.lang.String serviceName, java.lang.String actionId) throws java.io.IOException;

	/**
	 * Create a new remote access for the service
	 * Facultative parameters ? true
	 * @param exposedPort The port that the device will expose
	 * @param serviceName The internal name of your overTheBox offer
	 * @param allowedIp IP block from which the remote access will be allowed (the default value is the IP from which the call is made)
	 * @param publicKey The remote user public key authorized on the device (for SSH purpose)
	 * @param expirationDate The expirationDate of the remote access (default 1 day)
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess postServiceNameRemoteAccesses(long exposedPort, java.lang.String serviceName, java.lang.String allowedIp, java.lang.String publicKey, java.util.Date expirationDate) throws java.io.IOException;

	/**
	 * Create a new remote access for the service
	 * Facultative parameters ? false
	 * @param exposedPort The port that the device will expose
	 * @param serviceName The internal name of your overTheBox offer
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess postServiceNameRemoteAccesses(long exposedPort, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getOverTheBox() throws java.io.IOException;

	/**
	 * List of tasks scheduled for this service
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your overTheBox offer
	 * @param status Filter the value of status property (=)
	 * @param name Filter the value of name property (=)
	*/
	java.lang.String[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String name) throws java.io.IOException;

	/**
	 * List of tasks scheduled for this service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	java.lang.String[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the list of devices connected from the same IP address
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.DeviceForRegistration[] postDevices() throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your overTheBox offer
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.overthebox.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	 * @param taskId The id of the task
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.Task getServiceNameTasksTaskId(java.lang.String serviceName, java.lang.String taskId) throws java.io.IOException;

	/**
	 * Resiliate a service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	void deleteServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of actions scheduled for this device
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your overTheBox offer
	 * @param status Filter the value of status property (=)
	 * @param name Filter the value of name property (=)
	*/
	java.lang.String[] getServiceNameDeviceActions(java.lang.String serviceName, java.lang.String status, java.lang.String name) throws java.io.IOException;

	/**
	 * List of actions scheduled for this device
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	java.lang.String[] getServiceNameDeviceActions(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	 * @param remoteAccessId The id of the remote access
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess getServiceNameRemoteAccessesRemoteAccessId(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException;

	/**
	 * List the available offers for the new call
	 * Facultative parameters ? false
	*/
	java.lang.String[] getAvailableOffers() throws java.io.IOException;

	/**
	 * List the available device actions
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	*/
	net.zyuiop.ovhapi.api.objects.overthebox.AvailableDeviceAction[] getServiceNameDeviceAvailableActions(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Authorize the remote access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your overTheBox offer
	 * @param remoteAccessId The id of the remote access
	*/
	void postServiceNameRemoteAccessesRemoteAccessIdAuthorize(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException;

}
