package net.zyuiop.ovhapi.api.methods.email;

/**
 * A class to interact with OVH's /email/imapCopy APIs
 */

public interface ImapCopy { 

	/**
	 * get information of task
	 * Facultative parameters ? false
	 * @param id Id of task
	 * @param secretKey Secret key of task
	*/
	net.zyuiop.ovhapi.api.objects.imapcopy.Task getTask(long id, java.lang.String secretKey) throws java.io.IOException;

	/**
	 * Copy messages between two mailboxes
	 * Facultative parameters ? false
	 * @param to Where you want to put messages
	 * @param from Where you have messages
	*/
	net.zyuiop.ovhapi.api.objects.imapcopy.TaskIds postEmailImapCopy(net.zyuiop.ovhapi.api.objects.imapcopy.StructImapCopy to, net.zyuiop.ovhapi.api.objects.imapcopy.StructImapCopy from) throws java.io.IOException;

}
