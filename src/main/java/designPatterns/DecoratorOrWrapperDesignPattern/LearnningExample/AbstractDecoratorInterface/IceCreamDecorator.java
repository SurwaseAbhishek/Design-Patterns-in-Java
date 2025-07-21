package designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.AbstractDecoratorInterface;

import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentInterface.IceCream;

public abstract class IceCreamDecorator implements IceCream {
	IceCream iceCream;
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	@Override
	public void prepare() {
		iceCream.prepare();
	}

}
