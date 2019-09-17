package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("player")
public final class Players {
	@Autowired
	private Sports sports;
	
	public Players() {
		System.out.println("Players.Players() 0 param constructer");
	}
	public String playGames() {
		String epic=null;
		epic=sports.equipment();
		return epic;
	}
	

}
