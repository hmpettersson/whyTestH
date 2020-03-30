package com.example.whyTest;

public class whyTestTree {
	
	private String colour = "Green";
	private int height = 10;
	private String type = "Oak";
	private boolean hasLeaves = true;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int growth(int year) {
		int newHeight;
		newHeight = height * 2 * year;
		return newHeight;
		
	}
	
	public boolean getLeaves() {
		return hasLeaves;
	}
	
	public void setLeaves(boolean hasLeaves) {
		this.hasLeaves= hasLeaves;
	}
}
