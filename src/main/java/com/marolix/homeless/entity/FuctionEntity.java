package com.marolix.homeless.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "fuction")
public class FuctionEntity {

	@Id
	private int id;
	private String town;
	private String time;
	private String landmark;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public FuctionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FuctionEntity(int id, String town, String time, String landmark, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.town = town;
		this.time = time;
		this.landmark = landmark;
		this.createdAt = createdAt;
	}
	
	
	
	
}
