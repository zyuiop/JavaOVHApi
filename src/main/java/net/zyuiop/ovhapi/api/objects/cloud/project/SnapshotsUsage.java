package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Snapshots usage for current month
 */

public class SnapshotsUsage { 

	private net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotUsageDetail[] detail;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public SnapshotsUsage() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotUsageDetail[] getDetail() { 
		return this.detail;
	} 

	public void setDetail(net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotUsageDetail[] detail) { 
		this.detail = detail;
	} 

	public SnapshotsUsage detail(net.zyuiop.ovhapi.api.objects.cloud.project.SnapshotUsageDetail[] detail) { 
		this.detail = detail;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public SnapshotsUsage total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
