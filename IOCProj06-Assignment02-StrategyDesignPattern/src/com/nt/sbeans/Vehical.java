package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vhl")
public class Vehical {
	@Autowired
	@Qualifier("pe")
	private IEngine engine;

	public void journeyStart(String s1, String s2) {
		System.out.println("Journey Started from:" + s1);
		engine.engineStart();
		System.out.println("Reached to destination:" + s2);
		engine.engineStop();

	}

}
