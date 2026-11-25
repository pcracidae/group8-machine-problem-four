package controllers;

import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/**
 *
 * @author markj
 */
@WebListener
public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String mp = "MP4";
        sce.getServletContext().setAttribute("mp", mp);
        Date date = new Date();
        sce.getServletContext().setAttribute("date", date);
        sce.getServletContext().setAttribute("pageheader", "ICS2608 | 2CSA | BARROS, LORENZO ETHAN / BOLALIN SEAN / CARO ALDRIN / GONZALES MARK JOSEPH  ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    
    
}
