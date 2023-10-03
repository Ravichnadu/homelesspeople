package com.marolix.homeless.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

public class MyDataDto {

private Integer id;
	
	private String name;
	private long num;
	
	@CreationTimestamp
	private LocalDateTime createdAT;

	public MyDataDto(Integer id, String name, long num, LocalDateTime createdAT) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
		this.createdAT = createdAT;
	}

	public MyDataDto() {
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

	@Override
	public String toString() {
		return "MyDataDto [id=" + id + ", name=" + name + ", num=" + num + ", createdAT=" + createdAT + "]";
	}
	
	
}
