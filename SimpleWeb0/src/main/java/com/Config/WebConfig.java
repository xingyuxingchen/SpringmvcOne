package com.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebConfig {
//implements WebApplicationInitializer{

//	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		servletContext.setInitParameter("contextConfigLocation", "classpath:spring-core-config.xml");
		servletContext.addListener(new ContextLoaderListener());  
		
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        context.register(MVCConfig.class);
        context.setServletContext(servletContext); 
        Dynamic servlet=servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        
        
	}

}
