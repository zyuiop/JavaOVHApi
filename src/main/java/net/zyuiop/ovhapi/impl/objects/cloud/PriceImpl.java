package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.Price;
/**
 * A structure defining prices for cloud services
 */

public class PriceImpl implements Price { 

	private net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice bandwidthStorage;
	private net.zyuiop.ovhapi.api.objects.cloud.VolumePrice volumes;
	private net.zyuiop.ovhapi.api.objects.order.Price projectCreation;
	private net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice instances;
	private net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice snapshots;
	private net.zyuiop.ovhapi.api.objects.cloud.StoragePrice storage;

	public PriceImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice getBandwidthStorage() { 
		return this.bandwidthStorage;
	} 

	public void setBandwidthStorage(net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice bandwidthStorage) { 
		this.bandwidthStorage = bandwidthStorage;
	} 

	public PriceImpl bandwidthStorage(net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice bandwidthStorage) { 
		this.bandwidthStorage = bandwidthStorage;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.VolumePrice getVolumes() { 
		return this.volumes;
	} 

	public void setVolumes(net.zyuiop.ovhapi.api.objects.cloud.VolumePrice volumes) { 
		this.volumes = volumes;
	} 

	public PriceImpl volumes(net.zyuiop.ovhapi.api.objects.cloud.VolumePrice volumes) { 
		this.volumes = volumes;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getProjectCreation() { 
		return this.projectCreation;
	} 

	public void setProjectCreation(net.zyuiop.ovhapi.api.objects.order.Price projectCreation) { 
		this.projectCreation = projectCreation;
	} 

	public PriceImpl projectCreation(net.zyuiop.ovhapi.api.objects.order.Price projectCreation) { 
		this.projectCreation = projectCreation;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice getInstances() { 
		return this.instances;
	} 

	public void setInstances(net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice instances) { 
		this.instances = instances;
	} 

	public PriceImpl instances(net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice instances) { 
		this.instances = instances;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice getSnapshots() { 
		return this.snapshots;
	} 

	public void setSnapshots(net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice snapshots) { 
		this.snapshots = snapshots;
	} 

	public PriceImpl snapshots(net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice snapshots) { 
		this.snapshots = snapshots;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.StoragePrice getStorage() { 
		return this.storage;
	} 

	public void setStorage(net.zyuiop.ovhapi.api.objects.cloud.StoragePrice storage) { 
		this.storage = storage;
	} 

	public PriceImpl storage(net.zyuiop.ovhapi.api.objects.cloud.StoragePrice storage) { 
		this.storage = storage;
		return this;
	} 

}
