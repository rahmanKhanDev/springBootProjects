package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name="emp")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "mini_proj_emp_seq_generator",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	@NonNull
	@Column(length = 30)
	private String ename;
	@NonNull
	@Column(length = 35)
    private String job;
	@NonNull
    private Integer sal;
	@NonNull
	@Column(name="DEPT_NO")
    private Integer deptno;
    
}
