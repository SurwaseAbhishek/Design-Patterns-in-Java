package designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ConcreteDecorartorClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentInterface.IceCream;

public class StrawberryIceCream implements IceCream {

	@Override
	public void prepare() {
		System.out.println("StrawberryIceCream.prepare()");
}

}
