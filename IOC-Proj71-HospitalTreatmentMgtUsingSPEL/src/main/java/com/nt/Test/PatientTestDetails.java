package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.SeniorPatient;

public class PatientTestDetails {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=null;
		SeniorPatient patient=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
		patient=ctx.getBean("patient",SeniorPatient.class);
		System.out.println(patient);
		//close Container..
		((AbstractApplicationContext) ctx).close();
	}

}
