package com.base;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@EnableWebMvc
public class BaseApplication{

	public static void main(String[] args) {
		SpringApplication.run(BaseApplication.class, args);
	}
	
	@Configuration
	public class WebConfig extends WebMvcConfigurationSupport{
		@Override
		protected void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/static/**")
              .addResourceLocations("classpath:/public-web-resources/")
              .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS).cachePublic());
			super.addResourceHandlers(registry);
		}		
	}
}
