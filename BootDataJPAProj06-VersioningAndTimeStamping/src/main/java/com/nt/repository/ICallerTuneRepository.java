package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.CallerTune;

public interface ICallerTuneRepository extends JpaRepository<CallerTune, Integer> {

}
