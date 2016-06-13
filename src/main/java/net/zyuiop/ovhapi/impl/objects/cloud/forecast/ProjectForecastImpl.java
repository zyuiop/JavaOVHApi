package net.zyuiop.ovhapi.impl.objects.cloud.forecast;

import net.zyuiop.ovhapi.api.objects.cloud.forecast.ProjectForecast;
/**
 * ProjectForecast
 */

public class ProjectForecastImpl implements ProjectForecast { 

	private java.util.Date lastMetric;
	private net.zyuiop.ovhapi.api.objects.order.Price projectForecast;

	public ProjectForecastImpl() {
	}

	public java.util.Date getLastMetric() { 
		return this.lastMetric;
	} 

	public void setLastMetric(java.util.Date lastMetric) { 
		this.lastMetric = lastMetric;
	} 

	public ProjectForecastImpl lastMetric(java.util.Date lastMetric) { 
		this.lastMetric = lastMetric;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getProjectForecast() { 
		return this.projectForecast;
	} 

	public void setProjectForecast(net.zyuiop.ovhapi.api.objects.order.Price projectForecast) { 
		this.projectForecast = projectForecast;
	} 

	public ProjectForecastImpl projectForecast(net.zyuiop.ovhapi.api.objects.order.Price projectForecast) { 
		this.projectForecast = projectForecast;
		return this;
	} 

}