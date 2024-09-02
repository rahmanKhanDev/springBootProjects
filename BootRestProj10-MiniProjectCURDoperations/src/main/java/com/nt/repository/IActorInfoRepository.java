package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.ActorInfo;

public interface IActorInfoRepository extends JpaRepository<ActorInfo,Integer> {

}
