package com.gopi.BCConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BillCalculatotConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//System.out.println("Inside servletConfigClass");
		Class[] cls= {BillCalculatorConfigContext.class};
		
		return cls;
	}

	@Override
	protected String[] getServletMappings() {
		//System.out.println("Inside servletMapping");
		String[] urls= {"/mybill/*","/"};
		return urls;
	}

}
