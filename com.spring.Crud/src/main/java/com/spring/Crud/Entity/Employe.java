package com.spring.Crud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private String name;
	private String cityName;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Employe [Id=" + Id + ", name=" + name + ", cityName=" + cityName + "]";
	}
	public Employe(long id, String name, String cityName) {
		super();
		Id = id;
		this.name = name;
		this.cityName = cityName;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
