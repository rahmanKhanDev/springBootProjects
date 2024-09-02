package com.nt.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.ActorData;
import com.nt.service.IActorInfoMgmtService;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationController {
//inject service
	@Autowired
	private IActorInfoMgmtService actorService;
	
	
	//save actor
	@PostMapping("/save")
	public ResponseEntity<String> saveActor(@RequestBody ActorData actor){
		//invoke b.logic
//		System.out.println(actor);
		String msg=actorService.registerActor(actor);
		//return api
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	
}
