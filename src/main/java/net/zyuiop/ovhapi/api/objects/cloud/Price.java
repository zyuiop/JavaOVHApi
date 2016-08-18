package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * A structure defining prices for cloud services
 */

public class Price { 

	private net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice[] bandwidthStorage;
	private net.zyuiop.ovhapi.api.objects.cloud.VolumePrice[] volumes;
	private net.zyuiop.ovhapi.api.objects.order.Price projectCreation;
	private net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice[] instances;
	private net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice[] snapshots;
	private net.zyuiop.ovhapi.api.objects.cloud.StoragePrice[] storage;

	public Price() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice[] getBandwidthStorage() { 
		return this.bandwidthStorage;
	} 

	public void setBandwidthStorage(net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice[] bandwidthStorage) { 
		this.bandwidthStorage = bandwidthStorage;
	} 

	public Price bandwidthStorage(net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice[] bandwidthStorage) { 
		this.bandwidthStorage = bandwidthStorage;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.VolumePrice[] getVolumes() { 
		return this.volumes;
	} 

	public void setVolumes(net.zyuiop.ovhapi.api.objects.cloud.VolumePrice[] volumes) { 
		this.volumes = volumes;
	} 

	public Price volumes(net.zyuiop.ovhapi.api.objects.cloud.VolumePrice[] volumes) { 
		this.volumes = volumes;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getProjectCreation() { 
		return this.projectCreation;
	} 

	public void setProjectCreation(net.zyuiop.ovhapi.api.objects.order.Price projectCreation) { 
		this.projectCreation = projectCreation;
	} 

	public Price projectCreation(net.zyuiop.ovhapi.api.objects.order.Price projectCreation) { 
		this.projectCreation = projectCreation;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice[] getInstances() { 
		return this.instances;
	} 

	public void setInstances(net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice[] instances) { 
		this.instances = instances;
	} 

	public Price instances(net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice[] instances) { 
		this.instances = instances;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice[] getSnapshots() { 
		return this.snapshots;
	} 

	public void setSnapshots(net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice[] snapshots) { 
		this.snapshots = snapshots;
	} 

	public Price snapshots(net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice[] snapshots) { 
		this.snapshots = snapshots;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.StoragePrice[] getStorage() { 
		return this.storage;
	} 

	public void setStorage(net.zyuiop.ovhapi.api.objects.cloud.StoragePrice[] storage) { 
		this.storage = storage;
	} 

	public Price storage(net.zyuiop.ovhapi.api.objects.cloud.StoragePrice[] storage) { 
		this.storage = storage;
		return this;
	} 

}
