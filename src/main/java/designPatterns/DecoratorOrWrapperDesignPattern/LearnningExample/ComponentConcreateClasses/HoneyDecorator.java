package designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentConcreateClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.AbstractDecoratorInterface.IceCreamDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentInterface.IceCream;

public class HoneyDecorator extends IceCreamDecorator {

	public HoneyDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override 
	public void prepare() {
		super.prepare();
		addHoney();
	}

	private void addHoney() {
		System.out.println("HoneyDecorator.addHoney()");		
	}

	
}
