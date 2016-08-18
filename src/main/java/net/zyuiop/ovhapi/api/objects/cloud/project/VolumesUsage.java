package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Volumes usage for current month
 */

public class VolumesUsage { 

	private net.zyuiop.ovhapi.api.objects.cloud.project.VolumeUsageDetail[] detail;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public VolumesUsage() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.VolumeUsageDetail[] getDetail() { 
		return this.detail;
	} 

	public void setDetail(net.zyuiop.ovhapi.api.objects.cloud.project.VolumeUsageDetail[] detail) { 
		this.detail = detail;
	} 

	public VolumesUsage detail(net.zyuiop.ovhapi.api.objects.cloud.project.VolumeUsageDetail[] detail) { 
		this.detail = detail;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public VolumesUsage total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
