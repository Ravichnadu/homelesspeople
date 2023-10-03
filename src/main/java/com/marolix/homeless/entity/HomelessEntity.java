package com.marolix.homeless.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "homeless")
public class HomelessEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public HomelessEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HomelessEntity(Integer id, String town, int members, String landmark) {
		super();
		this.id = id;
		this.town = town;
		this.members = members;
		this.landmark = landmark;
		
	}
	@Override
	public String toString() {
		return "HomelessEntity [id=" + id + ", town=" + town + ", members=" + members + ", landmark=" + landmark
				 + "]";
	}
	
	
	
	
}
