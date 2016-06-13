package net.zyuiop.ovhapi.api.objects.sms;

/**
 * SMS senders
 */

public interface Sender { 

	/**
	 * @return Message sent by the moderator
	 */
	java.lang.String getComment(); 

	/**
	 * @return The sms sender
	 */
	java.lang.String getSender(); 

	/**
	 * @return Sender status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Specify the kind of sender
	 */
	java.lang.String getType(); 

	/**
	 * @return Sender description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Specify if the sender is custom or not
	 */
	java.lang.String getReferer(); 

	/**
	 * @return Validation media identifier
	 */
	java.lang.String getValidationMedia(); 

}
