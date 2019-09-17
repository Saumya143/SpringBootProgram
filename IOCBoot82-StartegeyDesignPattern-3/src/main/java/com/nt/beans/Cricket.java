package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cricket")
@Primary
public final class Cricket implements Sports {
	
	public Cricket() {
		System.out.println("Cricket.Cricket() 0 param constructer");
	}

	@Override
	public String equipment() {
		
		return "CRICKET EQUIPMENTS::Ball,Bat,Wicket,globes,pad,etc";
	}

}
