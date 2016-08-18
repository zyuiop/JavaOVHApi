package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Usage information for current month on your project
 */

public class CurrentUsage { 

	private net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotsUsage volumeSnapshots;
	private net.zyuiop.ovhapi.api.objects.cloud.project.VolumesUsage volumes;
	private net.zyuiop.ovhapi.api.objects.cloud.project.InstancesUsage instances;
	private net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotsUsage snapshots;
	private net.zyuiop.ovhapi.api.objects.cloud.project.StorageUsage storage;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public CurrentUsage() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotsUsage getVolumeSnapshots() { 
		return this.volumeSnapshots;
	} 

	public void setVolumeSnapshots(net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotsUsage volumeSnapshots) { 
		this.volumeSnapshots = volumeSnapshots;
	} 

	public CurrentUsage volumeSnapshots(net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotsUsage volumeSnapshots) { 
		this.volumeSnapshots = volumeSnapshots;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.project.VolumesUsage getVolumes() { 
		return this.volumes;
	} 

	public void setVolumes(net.zyuiop.ovhapi.api.objects.cloud.project.VolumesUsage volumes) { 
		this.volumes = volumes;
	} 

	public CurrentUsage volumes(net.zyuiop.ovhapi.api.objects.cloud.project.VolumesUsage volumes) { 
		this.volumes = volumes;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.project.InstancesUsage getInstances() { 
		return this.instances;
	} 

	public void setInstances(net.zyuiop.ovhapi.api.objects.cloud.project.InstancesUsage instances) { 
		this.instances = instances;
	} 

	public CurrentUsage instances(net.zyuiop.ovhapi.api.objects.cloud.project.InstancesUsage instances) { 
		this.instances = instances;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotsUsage getSnapshots() { 
		return this.snapshots;
	} 

	public void setSnapshots(net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotsUsage snapshots) { 
		this.snapshots = snapshots;
	} 

	public CurrentUsage snapshots(net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotsUsage snapshots) { 
		this.snapshots = snapshots;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.project.StorageUsage getStorage() { 
		return this.storage;
	} 

	public void setStorage(net.zyuiop.ovhapi.api.objects.cloud.project.StorageUsage storage) { 
		this.storage = storage;
	} 

	public CurrentUsage storage(net.zyuiop.ovhapi.api.objects.cloud.project.StorageUsage storage) { 
		this.storage = storage;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public CurrentUsage total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
