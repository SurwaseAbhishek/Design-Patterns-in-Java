	package designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ClientApplication;

import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentConcreateClasses.CookiesDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentConcreateClasses.DryFruitsDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentConcreateClasses.HoneyDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ComponentInterface.IceCream;
import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ConcreteDecorartorClasses.StrawberryIceCream;
import designPatterns.DecoratorOrWrapperDesignPattern.LearnningExample.ConcreteDecorartorClasses.VanillaIceCream;


public class ClientApp {

	public static void main(String[] args) {
		IceCream cream1 = new VanillaIceCream();
		cream1.prepare();
		// We can create n number of combination without using inheritance and creating complex classes
		CarCustomer1();
		CarCustomer2();
	}

	private static void CarCustomer2() {
		System.out.println("------------------------------------------------------");
		IceCream cream3 = new DryFruitsDecorator(new HoneyDecorator(new CookiesDecorator(new StrawberryIceCream())));
		cream3.prepare();
	}

	private static void CarCustomer1() {
		System.out.println("------------------------------------------------------");
		IceCream cream2 = new DryFruitsDecorator(new VanillaIceCream());
		cream2.prepare();
	}
}
