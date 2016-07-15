package com.jj.json;

public class JsonModel {
	private String name;
	private Integer id;
	
	public JsonModel(String inName,Integer id)  {
		name= inName;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	
}
