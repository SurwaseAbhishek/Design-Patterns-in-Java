package designPatterns.FlyWeightDesignPattern.LearningExample.ConcreteComponentClass;

import designPatterns.FlyWeightDesignPattern.LearningExample.ComponentInterface.Shape;
//ConcreteComponenetClass
public class Circle implements Shape {
	private String label;
	
	public Circle() {
		System.out.println("Circle.Circle()");
		label = "Circle";
	}//0-Param Constructor
	
	@Override
	public void draw(int measurement) {
		System.out.println("Circle.draw() with radius : "+measurement);
	}//draw
	
}//Class
