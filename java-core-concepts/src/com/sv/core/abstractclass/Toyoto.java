package com.sv.core.abstractclass;

public  class Toyoto extends Car{
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
		return "Toyoto [color=" + color + ", tyres=" + tyres + "]";
	}
}