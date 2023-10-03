package com.marolix.homeless.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

public class FuctionDto {

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
	public FuctionDto(int id, String town, String time, String landmark, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.town = town;
		this.time = time;
		this.landmark = landmark;
		this.createdAt = createdAt;
	}
	public FuctionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FuctionDto [id=" + id + ", town=" + town + ", time=" + time + ", landmark=" + landmark + ", createdAt="
				+ createdAt + "]";
	}
	
	
	
}
