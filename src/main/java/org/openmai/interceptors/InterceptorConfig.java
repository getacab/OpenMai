package org.openmai.interceptors;

import org.openmai.beans.MAIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{

	@Bean(name="maiRequest")
	@RequestScope
	public MAIRequest myMai() {
		System.out.println("About to e");
		MAIRequest myMAI = new MAIRequest();
		return  myMAI;
	}

	@Autowired
	RequestHandler requestHandler;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("--------------About to add interceptor");
		registry.addInterceptor(requestHandler);
		WebMvcConfigurer.super.addInterceptors(registry);
	}

}
