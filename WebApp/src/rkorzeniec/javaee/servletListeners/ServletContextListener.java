package rkorzeniec.javaee.servletListeners;

import java.util.Date;
import javax.servlet.ServletContextEvent;

public class ServletContextListener implements javax.servlet.ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) 
	{
		System.out.println("End of application: " + new Date());

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) 
	{
		System.out.println("Start of application: " + new Date());

	}

}
