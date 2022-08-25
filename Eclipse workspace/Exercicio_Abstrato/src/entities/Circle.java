package entities;

import entities.enums.Color;

public class Circle extends Shape {

	private Double Radius;
	
	public Circle() {
		super();	
	}
	public Circle(Color color, Double radius) {
		super(color);
		Radius = radius;
	}

	public Double getRadius() {
		return Radius;
	}
	public void setRadius(Double radius) {
		Radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(Radius, 2);
	}

}
