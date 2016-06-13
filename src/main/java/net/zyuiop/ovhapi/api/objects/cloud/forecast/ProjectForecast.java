package net.zyuiop.ovhapi.api.objects.cloud.forecast;

/**
 * ProjectForecast
 */

public interface ProjectForecast { 

	/**
	 * @return Time when we got last metric
	 */
	java.util.Date getLastMetric(); 

	/**
	 * @return Forecast for your whole project
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getProjectForecast(); 

}
