package net.zyuiop.ovhapi.impl.methods.email;

import net.zyuiop.ovhapi.api.methods.email.ImapCopy;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class ImapCopyImpl implements ImapCopy { 

	private final OVHRawCalls client;

	public ImapCopyImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.imapcopy.Task getTask(long id, java.lang.String secretKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.imapcopy.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.imapcopy.TaskIds postEmailImapCopy(net.zyuiop.ovhapi.api.objects.imapcopy.StructImapCopy to, net.zyuiop.ovhapi.api.objects.imapcopy.StructImapCopy from) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//email/imapCopy";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("to", to);
		dataMap.put("from", from);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.imapcopy.TaskIds.class);
	}

}
