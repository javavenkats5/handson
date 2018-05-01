package com.sv.core.abstractclass;

public  class Honda extends Car{

	private String color;
	@Override
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "Honda [color=" + color + ", tyres=" + tyres + "]";
	}
	
	

}