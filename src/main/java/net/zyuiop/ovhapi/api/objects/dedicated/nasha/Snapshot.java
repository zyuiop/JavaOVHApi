package net.zyuiop.ovhapi.api.objects.dedicated.nasha;

/**
 * Partition Snapshot
 */

public class Snapshot { 

	private java.lang.String snapshotType;

	public Snapshot() {
	}

	public java.lang.String getSnapshotType() { 
		return this.snapshotType;
	} 

	public void setSnapshotType(java.lang.String snapshotType) { 
		this.snapshotType = snapshotType;
	} 

	public Snapshot snapshotType(java.lang.String snapshotType) { 
		this.snapshotType = snapshotType;
		return this;
	} 

}
