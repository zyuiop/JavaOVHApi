package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountDiagnosis;
/**
 * Exchange Account Diagnosis
 */

public class ExchangeAccountDiagnosisImpl implements ExchangeAccountDiagnosis { 

	private boolean isSpammer;
	private boolean isSuspended;
	private boolean isLocked;
	private java.util.Date lastCheck;
	private boolean connectiveOWA;

	public ExchangeAccountDiagnosisImpl() {
	}

	public boolean getIsSpammer() { 
		return this.isSpammer;
	} 

	public void setIsSpammer(boolean isSpammer) { 
		this.isSpammer = isSpammer;
	} 

	public ExchangeAccountDiagnosisImpl isSpammer(boolean isSpammer) { 
		this.isSpammer = isSpammer;
		return this;
	} 

	public boolean getIsSuspended() { 
		return this.isSuspended;
	} 

	public void setIsSuspended(boolean isSuspended) { 
		this.isSuspended = isSuspended;
	} 

	public ExchangeAccountDiagnosisImpl isSuspended(boolean isSuspended) { 
		this.isSuspended = isSuspended;
		return this;
	} 

	public boolean getIsLocked() { 
		return this.isLocked;
	} 

	public void setIsLocked(boolean isLocked) { 
		this.isLocked = isLocked;
	} 

	public ExchangeAccountDiagnosisImpl isLocked(boolean isLocked) { 
		this.isLocked = isLocked;
		return this;
	} 

	public java.util.Date getLastCheck() { 
		return this.lastCheck;
	} 

	public void setLastCheck(java.util.Date lastCheck) { 
		this.lastCheck = lastCheck;
	} 

	public ExchangeAccountDiagnosisImpl lastCheck(java.util.Date lastCheck) { 
		this.lastCheck = lastCheck;
		return this;
	} 

	public boolean getConnectiveOWA() { 
		return this.connectiveOWA;
	} 

	public void setConnectiveOWA(boolean connectiveOWA) { 
		this.connectiveOWA = connectiveOWA;
	} 

	public ExchangeAccountDiagnosisImpl connectiveOWA(boolean connectiveOWA) { 
		this.connectiveOWA = connectiveOWA;
		return this;
	} 

}
