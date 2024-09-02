package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nt.binding.ActorData;
import com.nt.entity.ActorInfo;
import com.nt.repository.IActorInfoRepository;

@Service
public class ActorInfoMgmtServiceImp implements IActorInfoMgmtService {
	@Autowired
	private IActorInfoRepository actorRepo;
	@Value("${user.name}")
	private String osuser;

	// register actor
	@Override
	public String registerActor(ActorData actor) {
		// binding data to entity class data
		ActorInfo entity = new ActorInfo();
		BeanUtils.copyProperties(actor, entity);
		System.out.println("entity :"+entity);
		// set meta data
		entity.setCreatedBy(osuser);
		entity.setUpdatedBy(osuser);
		int id=actorRepo.save(entity).getAid();
		return "Actor registred successfully with id:"+id;
	}

}
