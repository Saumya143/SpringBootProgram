package com.nt.test;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.nt.test")
//@SpringBootApplication

public class IocBoot80BasiWishMsg1Application {

	@Bean
	public Calendar createCalendar() {
		return Calendar.getInstance();

	}

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		WishMsgGenerator genartor = null;
		// get ioc cointainer
		ctx = SpringApplication.run(IocBoot80BasiWishMsg1Application.class, args);

		// get bean
		genartor = ctx.getBean("wish", WishMsgGenerator.class);
		System.out.println("Wish Message" + genartor.genarateWishMessage("saumya"));
		// close container
		((ConfigurableApplicationContext) ctx).close();

	}

}
