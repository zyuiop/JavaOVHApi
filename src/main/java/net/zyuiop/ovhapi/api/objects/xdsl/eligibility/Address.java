package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Represents an address
 */

public interface Address { 

	/**
	 * @return The information about the street
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street getStreet(); 

	/**
	 * @return The identifier of the floor, if any
	 */
	java.lang.String getFloor(); 

	/**
	 * @return The identifier of the stair, if any
	 */
	java.lang.String getStair(); 

	/**
	 * @return The name of the residence, if any
	 */
	java.lang.String getResidence(); 

	/**
	 * @return The information about the city
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City getCity(); 

	/**
	 * @return The number in the street
	 */
	java.lang.String getStreetNumber(); 

	/**
	 * @return The identifier of the door, if any
	 */
	java.lang.String getDoor(); 

	/**
	 * @return The name of the building, if any
	 */
	java.lang.String getBuilding(); 

}
