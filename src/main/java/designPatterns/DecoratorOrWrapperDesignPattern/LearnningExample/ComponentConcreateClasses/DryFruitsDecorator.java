package designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentConcreateClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.AbstractDecoratorInterface.IceCreamDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentInterface.IceCream;

public class DryFruitsDecorator extends IceCreamDecorator {

	public DryFruitsDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override 
	public void prepare() {
		super.prepare();
		addDryFruits();
	}

	private void addDryFruits() {
		System.out.println("DryFruitsDecorator.addDryFruits()");		
	}

	
}
