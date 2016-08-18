package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Instances usage for current month
 */

public class InstancesUsage { 

	private net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail[] detail;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public InstancesUsage() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail[] getDetail() { 
		return this.detail;
	} 

	public void setDetail(net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail[] detail) { 
		this.detail = detail;
	} 

	public InstancesUsage detail(net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail[] detail) { 
		this.detail = detail;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public InstancesUsage total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
