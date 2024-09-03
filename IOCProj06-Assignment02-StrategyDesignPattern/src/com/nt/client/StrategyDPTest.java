package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehical;

public class StrategyDPTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Vehical vehical = ctx.getBean("vhl", Vehical.class);

		vehical.journeyStart("hyd", "bihar");

		ctx.close();
	}

}
