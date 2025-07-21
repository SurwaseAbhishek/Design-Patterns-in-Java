package designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentConcreateClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.AbstractDecoratorInterface.IceCreamDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentInterface.IceCream;

public class CookiesDecorator extends IceCreamDecorator {

	public CookiesDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override 
	public void prepare() {
		super.prepare();
		addCookies();
	}

	private void addCookies() {
		System.out.println("CookiesDecorator.addCookies()");		
	}

	
}
