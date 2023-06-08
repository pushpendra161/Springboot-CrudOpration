package com.spring.Crud.Dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeDao {

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
		return "EmployeDao [Id=" + Id + ", name=" + name + ", cityName=" + cityName + "]";
	}
	public EmployeDao(long id, String name, String cityName) {
		super();
		Id = id;
		this.name = name;
		this.cityName = cityName;
	}
	public EmployeDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
