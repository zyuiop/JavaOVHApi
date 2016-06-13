package net.zyuiop.ovhapi.impl.methods.supply;

import net.zyuiop.ovhapi.api.methods.supply.MondialRelay;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class MondialRelayImpl implements MondialRelay { 

	private final OVHRawCalls client;

	public MondialRelayImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn postSupplyMondialRelay(java.lang.String country, java.lang.String city, java.lang.String address, java.lang.String zipcode) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//supply/mondialRelay";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("country", country);
		dataMap.put("city", city);
		dataMap.put("address", address);
		dataMap.put("zipcode", zipcode);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn.class);
	}

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn postSupplyMondialRelay(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//supply/mondialRelay";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("country", country);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn.class);
	}

}
