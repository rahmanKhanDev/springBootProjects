package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CallerTune;
import com.nt.repository.ICallerTuneRepository;

@Service("callerService")
public class CallerTuneServiceMgmtImp implements ICallerTuneServiceMgmt {

	@Autowired
	private ICallerTuneRepository tuneRepo;

	@Override
	public String registerCallerTune(CallerTune callerTune) {
		int id = tuneRepo.save(callerTune).getId();

		return "CallerTune regiseterd successfully with id::" + id;
	}

	@Override
	public String updateCallerTuneById(Integer id, String tuneName, String movieName) {
		Optional<CallerTune> opt = tuneRepo.findById(id);
		if (opt.isPresent()) {
			CallerTune callerTune = opt.get();
			callerTune.setTuneName(tuneName);
			callerTune.setMovieName(movieName);
			int id1 = tuneRepo.save(callerTune).getId();
			return "Tune Updated successfully with id::" + id1;
		} else {
			return "Tune not found";
		}
	}

	@Override
	public String registerAllCallerTune(List<CallerTune> list) {
	int count=tuneRepo.saveAllAndFlush(list).size();
		
		return count+" no of tunes saved successfully";
	}

	@Override
	public List<CallerTune> getAllCallerTune() {
		List<CallerTune> list=tuneRepo.findAll();
		
		return list;
	}

	

}
