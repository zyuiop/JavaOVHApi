package net.zyuiop.ovhapi.impl.objects.imapcopy;

import net.zyuiop.ovhapi.api.objects.imapcopy.StructImapCopy;
/**
 * Structure of imapCopy
 */

public class StructImapCopyImpl implements StructImapCopy { 

	private boolean SSL;
	private java.lang.String password;
	private java.lang.String serverIMAP;
	private java.lang.String account;

	public StructImapCopyImpl() {
	}

	public boolean getSSL() { 
		return this.SSL;
	} 

	public void setSSL(boolean SSL) { 
		this.SSL = SSL;
	} 

	public StructImapCopyImpl SSL(boolean SSL) { 
		this.SSL = SSL;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public StructImapCopyImpl password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getServerIMAP() { 
		return this.serverIMAP;
	} 

	public void setServerIMAP(java.lang.String serverIMAP) { 
		this.serverIMAP = serverIMAP;
	} 

	public StructImapCopyImpl serverIMAP(java.lang.String serverIMAP) { 
		this.serverIMAP = serverIMAP;
		return this;
	} 

	public java.lang.String getAccount() { 
		return this.account;
	} 

	public void setAccount(java.lang.String account) { 
		this.account = account;
	} 

	public StructImapCopyImpl account(java.lang.String account) { 
		this.account = account;
		return this;
	} 

}
