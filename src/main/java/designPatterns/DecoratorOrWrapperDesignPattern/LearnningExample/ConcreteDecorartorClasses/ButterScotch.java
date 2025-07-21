package designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ConcreteDecorartorClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentInterface.IceCream;

public class ButterScotch implements IceCream {

	@Override
	public void prepare() {
		System.out.println("ButterScotch.prepare()");
}

}
