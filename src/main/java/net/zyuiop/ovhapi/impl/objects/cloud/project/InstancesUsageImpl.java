package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.InstancesUsage;
/**
 * Instances usage for current month
 */

public class InstancesUsageImpl implements InstancesUsage { 

	private net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail detail;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public InstancesUsageImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail getDetail() { 
		return this.detail;
	} 

	public void setDetail(net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail detail) { 
		this.detail = detail;
	} 

	public InstancesUsageImpl detail(net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail detail) { 
		this.detail = detail;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public InstancesUsageImpl total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
