package com.gopi.BCConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.gopi.Formatters.CardFormatter;
import com.gopi.converters.CreditCardConverter;

@EnableWebMvc
@Controller
@ComponentScan(basePackages = "com.gopi")
public class BillCalculatorConfigContext implements WebMvcConfigurer{
		
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		
		//System.out.println("Inside ViewResolver");
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		
		view.setPrefix("/WEB-INF/view/");
		view.setSuffix(".jsp");
		
		
		return view;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		registry.addConverter(new CreditCardConverter());
		
	}
	
}
