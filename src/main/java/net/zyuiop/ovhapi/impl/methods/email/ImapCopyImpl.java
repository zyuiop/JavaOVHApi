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
		String __callUrl = "https://api.ovh.com/1.0/email/imapCopy/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.impl.objects.imapcopy.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.imapcopy.TaskIds postEmailImapCopy(net.zyuiop.ovhapi.api.objects.imapcopy.StructImapCopy to, net.zyuiop.ovhapi.api.objects.imapcopy.StructImapCopy from) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/imapCopy/email/imapCopy";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("to", to);
		__dataMap.put("from", from);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.impl.objects.imapcopy.TaskIdsImpl.class);
	}

}
