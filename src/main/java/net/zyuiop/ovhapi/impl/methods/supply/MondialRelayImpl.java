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
		String __callUrl = "https://api.ovh.com/1.0/supply/mondialRelay/supply/mondialRelay";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("country", country);
		__dataMap.put("city", city);
		__dataMap.put("address", address);
		__dataMap.put("zipcode", zipcode);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn.class);
	}

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn postSupplyMondialRelay(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/supply/mondialRelay/supply/mondialRelay";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("country", country);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn.class);
	}

}
