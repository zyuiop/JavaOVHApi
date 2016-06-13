package net.zyuiop.ovhapi.api.objects.imapcopy;

/**
 * Structure of imapCopy
 */

public interface StructImapCopy { 

	/**
	 * @return If true, IMAP Serveur of mailbox
	 */
	boolean getSSL(); 

	/**
	 * @return Password of mailbox
	 */
	java.lang.String getPassword(); 

	/**
	 * @return IMAP Serveur of mailbox
	 */
	java.lang.String getServerIMAP(); 

	/**
	 * @return Account of mailbox
	 */
	java.lang.String getAccount(); 

}
