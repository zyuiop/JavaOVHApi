package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about this dedicated server installation status
 */

public class InstallationProgressStatus { 

	private net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressSteps[] progress;
	private long elapsedTime;

	public InstallationProgressStatus() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressSteps[] getProgress() { 
		return this.progress;
	} 

	public void setProgress(net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressSteps[] progress) { 
		this.progress = progress;
	} 

	public InstallationProgressStatus progress(net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressSteps[] progress) { 
		this.progress = progress;
		return this;
	} 

	public long getElapsedTime() { 
		return this.elapsedTime;
	} 

	public void setElapsedTime(long elapsedTime) { 
		this.elapsedTime = elapsedTime;
	} 

	public InstallationProgressStatus elapsedTime(long elapsedTime) { 
		this.elapsedTime = elapsedTime;
		return this;
	} 

}
