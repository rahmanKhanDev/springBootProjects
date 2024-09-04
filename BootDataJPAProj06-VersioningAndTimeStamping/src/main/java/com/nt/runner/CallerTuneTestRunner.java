package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.CallerTune;
import com.nt.service.ICallerTuneServiceMgmt;

@Component
public class CallerTuneTestRunner implements CommandLineRunner {

	@Autowired
	private ICallerTuneServiceMgmt tuneService;

	@Override
	public void run(String... args) throws Exception {
		CallerTune callerTune1 = new CallerTune("Jhome jo Pathaan", "Pathan");
		CallerTune callerTune2 = new CallerTune("Don", "Don");
		CallerTune callerTune3 = new CallerTune("Bang Bang", "Bang Bang");
		CallerTune callerTune4 = new CallerTune("Oo vanta oo mama", "Puspa");
//		String msg = tuneService.registerCallerTune(callerTune);
//      String msg=tuneService.registerAllCallerTune(List.of(callerTune1,callerTune2,callerTune3,callerTune4));
//		String msg = tuneService.updateCallerTuneById(1, "Rasiya", "Brahmastra");
//		System.out.println(msg);
		
		tuneService.getAllCallerTune().forEach(System.out::println);

	}

}
