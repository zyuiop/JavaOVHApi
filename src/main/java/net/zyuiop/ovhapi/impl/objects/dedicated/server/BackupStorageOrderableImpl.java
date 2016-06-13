package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.BackupStorageOrderable;
/**
 * A structure describing informations storage backup orderable for this dedicated server
 */

public class BackupStorageOrderableImpl implements BackupStorageOrderable { 

	private long[] capacities;
	private boolean orderable;

	public BackupStorageOrderableImpl() {
	}

	public long[] getCapacities() { 
		return this.capacities;
	} 

	public void setCapacities(long[] capacities) { 
		this.capacities = capacities;
	} 

	public BackupStorageOrderableImpl capacities(long[] capacities) { 
		this.capacities = capacities;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public BackupStorageOrderableImpl orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

}
