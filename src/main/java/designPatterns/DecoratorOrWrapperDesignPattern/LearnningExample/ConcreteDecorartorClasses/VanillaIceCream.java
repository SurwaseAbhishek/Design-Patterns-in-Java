package designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ConcreteDecorartorClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentInterface.IceCream;

public class VanillaIceCream implements IceCream {

	@Override
	public void prepare() {
		System.out.println("VanillaIceCream.prepare()");
}

}
