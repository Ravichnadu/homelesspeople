package com.marolix.homeless.dto;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

public class HomlessDto {

	private Integer id;
	private String town;
	private int members;
	private String landmark;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "HomlessDto [id=" + id + ", town=" + town + ", members=" + members + ", landmark=" + landmark
				 + "]";
	}
	public HomlessDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HomlessDto(Integer id, String town, int members, String landmark) {
		super();
		this.id = id;
		this.town = town;
		this.members = members;
		this.landmark = landmark;
		
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
}
