package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("de")
public class DeselEngine implements IEngine {

	@Override
	public void engineStart() {

		System.out.println("DeselEngine::Engine started");
	}

	@Override
	public void engineStop() {
		// TODO Auto-generated method stub
		System.out.println("DeselEngine::Engine stopped");
	}

}
