package com.example.demo2.controller;

import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class Entity {
	@Id
	private int id;
	private String name;
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
	public Entity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
