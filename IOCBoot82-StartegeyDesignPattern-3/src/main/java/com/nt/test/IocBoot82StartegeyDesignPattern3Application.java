package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.Players;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class IocBoot82StartegeyDesignPattern3Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		Players player=null;
		
	    ctx=SpringApplication.run(IocBoot82StartegeyDesignPattern3Application.class, args);
	
	    player=ctx.getBean("player",Players.class);
	    System.out.println("Players Equipments ::"+player.playGames());
	
	
	}

}
