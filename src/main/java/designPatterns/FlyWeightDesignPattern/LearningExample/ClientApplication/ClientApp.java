package designPatterns.FlyWeightDesignPattern.LearningExample.ClientApplication;

import designPatterns.FlyWeightDesignPattern.LearningExample.ComponentFactory.ShapeFactory;
import designPatterns.FlyWeightDesignPattern.LearningExample.ConcreteComponentClass.Circle;
import designPatterns.FlyWeightDesignPattern.LearningExample.ConcreteComponentClass.Square;

public class ClientApp {
	public static void main(String[] args) throws Exception {
		for(int i=0;i<100;++i) {
			Circle shape = ShapeFactory.getInstance("circle", Circle.class);
			shape.draw(i+10);
		}
		System.out.println("-----------------------------------------------");
		for(int i=0;i<100;++i) {
			Square shape = ShapeFactory.getInstance("square", Square.class);
			shape.draw(i+10);

		}
	}
}
