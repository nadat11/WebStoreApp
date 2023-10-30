package com.packt.webstore.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	// FOR SPRING TO INITIALIZATE BEANS FROM CONFIGURATION DATA FILES
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {
				RootApplicationContextConfig.class
				//WebApplicationContextConfig.class
		};
	}

	
	//SERVLET MAPPING-which web container of java servlet will invoke for a given URL
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	
}
