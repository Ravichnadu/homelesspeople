package com.marolix.homeless.dto;

public class OrphanDto {

	private int id;
	private String name;
	private int members;
	private String town;
	private String landmark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public OrphanDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrphanDto(int id, String name, int members, String town, String landmark) {
		super();
		this.id = id;
		this.name = name;
		this.members = members;
		this.town = town;
		this.landmark = landmark;
	}
	@Override
	public String toString() {
		return "OrphanDto [id=" + id + ", name=" + name + ", members=" + members + ", town=" + town + ", landmark="
				+ landmark + "]";
	}
	
}
