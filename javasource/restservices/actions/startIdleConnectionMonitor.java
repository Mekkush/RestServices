// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import restservices.consume.RestConsumer;

/**
 * Regularly checks for connections that have been idle for at least the given amount of time, and closes them.
 * 
 * This action returns true when the connection monitor has been started, and false when a connection monitor is already running.
 * 
 * Parameters:
 *  - interval The number of milliseconds to wait between checks for idle connections
 *  - maxIdleTime Specifies a number of miiliseconds. If a connection has been idle for this long, it will be closed.
 */
public class startIdleConnectionMonitor extends CustomJavaAction<Boolean>
{
	private Long interval;
	private Long maxIdleTime;

	public startIdleConnectionMonitor(IContext context, Long interval, Long maxIdleTime)
	{
		super(context);
		this.interval = interval;
		this.maxIdleTime = maxIdleTime;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return RestConsumer.startIdleConnectionMonitor(interval, maxIdleTime);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "startIdleConnectionMonitor";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
