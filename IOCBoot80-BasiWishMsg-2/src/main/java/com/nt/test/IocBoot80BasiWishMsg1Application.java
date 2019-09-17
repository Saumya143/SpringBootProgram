package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.WishMsgGenerator;
import com.nt.config.AppConfig;
@Import(AppConfig.class)
@SpringBootApplication
public class IocBoot80BasiWishMsg1Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		WishMsgGenerator genartor=null;
		//get ioc cointainer
		ctx=SpringApplication.run(IocBoot80BasiWishMsg1Application.class, args);
		
		//get bean
		genartor=ctx.getBean("wish",WishMsgGenerator.class);
		System.out.println("Wish Message"+genartor.genarateWishMessage("saumya"));
				}

}
