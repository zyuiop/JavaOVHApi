package net.zyuiop.ovhapi.impl.methods.license;

import net.zyuiop.ovhapi.api.methods.license.Office;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class OfficeImpl implements Office { 

	private final OVHRawCalls client;

	public OfficeImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /license/office/$serviceName/usageStatistics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /license/office/$serviceName/domain/$domainName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /license/office/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /license/office/$serviceName/user/$activationEmail/changePassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /license/office/$serviceName/user/$activationEmail/changePassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /license/office/$serviceName/user
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /license/office/$serviceName/user
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /license/office/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /license/office/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /license/office/$serviceName/user/$activationEmail
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLicenseOffice() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/license/office";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameDomain(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/license/office/" + serviceName + "/domain";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /license/office/$serviceName/user/$activationEmail
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /license/office/$serviceName
	* Message : Missing identifier.
	*/


}
