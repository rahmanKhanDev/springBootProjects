package com.nt.service;

import java.util.List;

import com.nt.entity.CallerTune;

public interface ICallerTuneServiceMgmt {

	public String registerCallerTune(CallerTune callerTune);
	public String registerAllCallerTune(List<CallerTune> list);
	public String updateCallerTuneById(Integer id,String tuneName,String movieName);
	public List<CallerTune> getAllCallerTune();
}
