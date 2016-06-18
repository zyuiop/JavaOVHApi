package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressStatus;
/**
 * A structure describing informations about this dedicated server installation status
 */

public class InstallationProgressStatusImpl implements InstallationProgressStatus { 

	private net.zyuiop.ovhapi.impl.objects.dedicated.server.InstallationProgressStepsImpl[] progress;
	private long elapsedTime;

	public InstallationProgressStatusImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.dedicated.server.InstallationProgressStepsImpl[] getProgress() { 
		return this.progress;
	} 

	public void setProgress(net.zyuiop.ovhapi.impl.objects.dedicated.server.InstallationProgressStepsImpl[] progress) { 
		this.progress = progress;
	} 

	public InstallationProgressStatusImpl progress(net.zyuiop.ovhapi.impl.objects.dedicated.server.InstallationProgressStepsImpl[] progress) { 
		this.progress = progress;
		return this;
	} 

	public long getElapsedTime() { 
		return this.elapsedTime;
	} 

	public void setElapsedTime(long elapsedTime) { 
		this.elapsedTime = elapsedTime;
	} 

	public InstallationProgressStatusImpl elapsedTime(long elapsedTime) { 
		this.elapsedTime = elapsedTime;
		return this;
	} 

}
