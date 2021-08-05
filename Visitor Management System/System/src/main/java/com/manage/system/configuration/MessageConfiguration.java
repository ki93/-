package com.manage.system.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConfiguration {
	@Bean 
	public ResourceBundleMessageSource messageSource() { 
		ResourceBundleMessageSource source = new ResourceBundleMessageSource(); 
		/* message properties 위치 설정 */ 
		source.setBasenames("messages/security_message"); 
		/* encoding 룰 설정 */ 
		source.setDefaultEncoding("UTF-8"); 
		/* 5초간 케싱*/ 
		source.setCacheSeconds(5); 
		return source; 
		} 
}