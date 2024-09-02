package com.nt.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CollectionIdMutability;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Actor_Info_Rest")
@Data
public class ActorInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@Column(length = 25)
	private String aname;
	@Column(length = 30)
	private String addrs;
	private Double remuneration;// fee
	@Column(length = 10)
	private String active_SW;

//Meta data about Actor
	@Column(length = 20)
	private String createdBy;
	@Column(length = 20)
	private String updatedBy;

	@CreationTimestamp
	@Column(updatable = false, insertable = true)
	private LocalDate creationDate;// creation time
	@UpdateTimestamp
	@Column(insertable = false, updatable = true)
	private LocalDate updationDate;// updation time
	@Version
	private Integer updationCount;

}
