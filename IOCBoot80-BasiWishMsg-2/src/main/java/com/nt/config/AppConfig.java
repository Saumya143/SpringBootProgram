package com.nt.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	
	@Bean
	public Calendar createDate() {
		System.out.println("AppConfig.createDate()");
		return Calendar.getInstance();
	}

}
