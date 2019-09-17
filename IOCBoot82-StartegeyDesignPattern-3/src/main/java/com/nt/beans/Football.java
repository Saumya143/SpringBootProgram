package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("football")
public final class Football implements Sports {
	public Football() {
		System.out.println("football 0 param constructer");
	}

	@Override
	public String equipment() {
		
		return "FOOTBALL EQUIPMENT::Ball,Net,Whisle,etc";
	}

}
