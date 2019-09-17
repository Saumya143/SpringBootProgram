package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wish")
public class WishMsgGenerator {
	
    @Autowired
	private Calendar calander=null;
    
    public WishMsgGenerator() {
      System.out.println("WishMsgGenerator.WishMsgGenerator()");
    }
	
	public String genarateWishMessage(String user) {
		int hour=0;
		hour=calander.get(Calendar.HOUR_OF_DAY);
		//b logic
				if(hour<12)
					return "GOOD MORNING"+user;
				else if(hour<16)
					return "GOOD AFTERNOON"+user;
				else if(hour<20)
					return "GOOD EVENING"+user;
				else
					return "GOOD NIGHT"+user;
	}
}
