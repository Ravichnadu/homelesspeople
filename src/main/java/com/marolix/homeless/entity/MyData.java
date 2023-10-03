package com.marolix.homeless.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class MyData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private long num;
	
	@CreationTimestamp
	private LocalDateTime createdAT;

	@Override
	public String toString() {
		return "MyData [id=" + id + ", name=" + name + ", num=" + num + ", createdAT=" + createdAT + "]";
	}

	public MyData(Integer id, String name, long num, LocalDateTime createdAT) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
		this.createdAT = createdAT;
	}

	public MyData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public LocalDateTime getCreatedAT() {
		return createdAT;
	}

	public void setCreatedAT(LocalDateTime createdAT) {
		this.createdAT = createdAT;
	}
	
	
	

}
