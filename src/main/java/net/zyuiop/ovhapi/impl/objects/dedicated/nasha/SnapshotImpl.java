package net.zyuiop.ovhapi.impl.objects.dedicated.nasha;

import net.zyuiop.ovhapi.api.objects.dedicated.nasha.Snapshot;
/**
 * Partition Snapshot
 */

public class SnapshotImpl implements Snapshot { 

	private java.lang.String snapshotType;

	public SnapshotImpl() {
	}

	public java.lang.String getSnapshotType() { 
		return this.snapshotType;
	} 

	public void setSnapshotType(java.lang.String snapshotType) { 
		this.snapshotType = snapshotType;
	} 

	public SnapshotImpl snapshotType(java.lang.String snapshotType) { 
		this.snapshotType = snapshotType;
		return this;
	} 

}
