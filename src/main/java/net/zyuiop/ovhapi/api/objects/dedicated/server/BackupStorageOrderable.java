package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations storage backup orderable for this dedicated server
 */

public class BackupStorageOrderable { 

	private long[] capacities;
	private boolean orderable;

	public BackupStorageOrderable() {
	}

	public long[] getCapacities() { 
		return this.capacities;
	} 

	public void setCapacities(long[] capacities) { 
		this.capacities = capacities;
	} 

	public BackupStorageOrderable capacities(long[] capacities) { 
		this.capacities = capacities;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public BackupStorageOrderable orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

}
