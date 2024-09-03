package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ee")
public class ElectricEngine implements IEngine {

	@Override
	public void engineStart() {
		
		 System.out.println("ElectricEngine::Engine started");
	}

	@Override
	public void engineStop() {
		// TODO Auto-generated method stub
		System.out.println("ElectricEngine::Engine stoped");
	}

}
