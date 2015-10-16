package com.incidents.mx.configuration;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
 
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *Acts as replacement of any spring configuration defined in web.xml
 *This class will be loaded and instantiated and 
 *its onStartup method will be called by servlet container.
 * 
 * @author fredcess23
 *
 */

public class IncidentsInitializer implements WebApplicationInitializer {
 
    public void onStartup(ServletContext container) throws ServletException {
 
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(IncidentsConfiguration.class);
        ctx.setServletContext(container);
 
        ServletRegistration.Dynamic servlet = container.addServlet(
                "dispatcher", new DispatcherServlet(ctx));
 
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
 
}