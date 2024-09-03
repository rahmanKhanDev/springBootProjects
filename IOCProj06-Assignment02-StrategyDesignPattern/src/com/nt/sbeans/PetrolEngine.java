package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pe")
public class PetrolEngine implements IEngine {

	@Override
	public void engineStart() {

		System.out.println("PetrolEngine::Engine Started");
	}

	@Override
	public void engineStop() {

		System.out.println("PetrolEngine::Engine stoped");
	}

}
