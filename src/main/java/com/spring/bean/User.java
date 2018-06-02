package com.spring.bean;

public class User {
	private int id;
	private String name;
	private boolean isMinor;
	private boolean isMajor;

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

	public boolean isMinor() {
		return isMinor;
	}

	public void setMinor(boolean isMinor) {
		this.isMinor = isMinor;
	}

	public boolean isMajor() {
		return isMajor;
	}

	public void setMajor(boolean isMajor) {
		this.isMajor = isMajor;
	}

}
