package designPatterns.FlyWeightDesignPattern.LearningExample.ConcreteComponentClass;

import designPatterns.FlyWeightDesignPattern.LearningExample.ComponentInterface.Shape;
//ConcreteComponenetClass
public class Square implements Shape {
	private String label;
	
	public Square() {
		System.out.println("Square.Square()");
		label = "Square";
	}//0-Param Constructor
	
	@Override
	public void draw(int measurement) {
		System.out.println("Square.draw() with side : "+measurement);
	}//draw
	
}//Class
