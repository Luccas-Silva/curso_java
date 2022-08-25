package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private Double Height;
	private Double Width;
	
	public Rectangle() {
		super();
	}
	public Rectangle(Color color, Double height, Double width) {
		super(color);
		Height = height;
		Width = width;
	}

	public Double getHeight() {
		return Height;
	}
	public void setHeight(Double height) {
		Height = height;
	}
	
	public Double getWidth() {
		return Width;
	}
	public void setWidth(Double width) {
		Width = width;
	}
	
	@Override
	public double area() {
		return Height * Width;
	}

}
