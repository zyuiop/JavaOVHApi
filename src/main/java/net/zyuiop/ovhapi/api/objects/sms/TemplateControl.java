package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms template for moderation (Needed to send in US country)
 */

public interface TemplateControl { 

	/**
	 * @return Message sent by the moderator
	 */
	java.lang.String getComment(); 

	/**
	 * @return Template status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Name of the template
	 */
	java.lang.String getName(); 

	/**
	 * @return Template description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Specify the kind of template
	 */
	java.lang.String getActivity(); 

	/**
	 * @return Message pattern to be moderated. Use "#VALUE#" format for dynamic text area.
	 */
	java.lang.String getMessage(); 

	/**
	 * @return Template creation datetime
	 */
	java.util.Date getDatetime(); 

}
