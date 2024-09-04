package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.micrometer.common.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "Caller_Tune_Info")
public class CallerTune {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CallerTune_Id")
	private Integer id;
	@Column(name="Tune_Name")
	@NonNull
	private String tuneName;
	public CallerTune(String tuneName, String movieName) {
		super();
		this.tuneName = tuneName;
		this.movieName = movieName;
	}
	@Column(name="Movie_Name")
	@NonNull
	private String movieName;
	@Version
    @Column(name="Update_Count")
	private Integer updateCount;
	@Column(name="Service_Opted_On")
	@CreationTimestamp
	private LocalDateTime sericeOptedOn;
	@UpdateTimestamp
	private LocalDateTime lastUpdated;

}
