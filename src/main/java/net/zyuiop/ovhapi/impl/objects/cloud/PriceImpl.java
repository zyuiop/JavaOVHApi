package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.Price;
/**
 * A structure defining prices for cloud services
 */

public class PriceImpl implements Price { 

	private net.zyuiop.ovhapi.impl.objects.cloud.BandwidthStoragePriceImpl bandwidthStorage;
	private net.zyuiop.ovhapi.impl.objects.cloud.VolumePriceImpl volumes;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl projectCreation;
	private net.zyuiop.ovhapi.impl.objects.cloud.FlavorPriceImpl instances;
	private net.zyuiop.ovhapi.impl.objects.cloud.SnapshotPriceImpl snapshots;
	private net.zyuiop.ovhapi.impl.objects.cloud.StoragePriceImpl storage;

	public PriceImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.cloud.BandwidthStoragePriceImpl getBandwidthStorage() { 
		return this.bandwidthStorage;
	} 

	public void setBandwidthStorage(net.zyuiop.ovhapi.impl.objects.cloud.BandwidthStoragePriceImpl bandwidthStorage) { 
		this.bandwidthStorage = bandwidthStorage;
	} 

	public PriceImpl bandwidthStorage(net.zyuiop.ovhapi.impl.objects.cloud.BandwidthStoragePriceImpl bandwidthStorage) { 
		this.bandwidthStorage = bandwidthStorage;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.VolumePriceImpl getVolumes() { 
		return this.volumes;
	} 

	public void setVolumes(net.zyuiop.ovhapi.impl.objects.cloud.VolumePriceImpl volumes) { 
		this.volumes = volumes;
	} 

	public PriceImpl volumes(net.zyuiop.ovhapi.impl.objects.cloud.VolumePriceImpl volumes) { 
		this.volumes = volumes;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getProjectCreation() { 
		return this.projectCreation;
	} 

	public void setProjectCreation(net.zyuiop.ovhapi.impl.objects.order.PriceImpl projectCreation) { 
		this.projectCreation = projectCreation;
	} 

	public PriceImpl projectCreation(net.zyuiop.ovhapi.impl.objects.order.PriceImpl projectCreation) { 
		this.projectCreation = projectCreation;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.FlavorPriceImpl getInstances() { 
		return this.instances;
	} 

	public void setInstances(net.zyuiop.ovhapi.impl.objects.cloud.FlavorPriceImpl instances) { 
		this.instances = instances;
	} 

	public PriceImpl instances(net.zyuiop.ovhapi.impl.objects.cloud.FlavorPriceImpl instances) { 
		this.instances = instances;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.SnapshotPriceImpl getSnapshots() { 
		return this.snapshots;
	} 

	public void setSnapshots(net.zyuiop.ovhapi.impl.objects.cloud.SnapshotPriceImpl snapshots) { 
		this.snapshots = snapshots;
	} 

	public PriceImpl snapshots(net.zyuiop.ovhapi.impl.objects.cloud.SnapshotPriceImpl snapshots) { 
		this.snapshots = snapshots;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.StoragePriceImpl getStorage() { 
		return this.storage;
	} 

	public void setStorage(net.zyuiop.ovhapi.impl.objects.cloud.StoragePriceImpl storage) { 
		this.storage = storage;
	} 

	public PriceImpl storage(net.zyuiop.ovhapi.impl.objects.cloud.StoragePriceImpl storage) { 
		this.storage = storage;
		return this;
	} 

}
