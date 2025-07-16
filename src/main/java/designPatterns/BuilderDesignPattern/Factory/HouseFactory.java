package designPatterns.BuilderDesignPattern.Factory;

import designPatterns.BuilderDesignPattern.ProductBuilder.HouseBuilder;
import designPatterns.BuilderDesignPattern.ProductBuilder.ConcreteBuilder.ConcreteBuilder;
import designPatterns.BuilderDesignPattern.ProductBuilder.ConcreteBuilder.IceBuilder;
import designPatterns.BuilderDesignPattern.ProductBuilder.ConcreteBuilder.MarbelBuilder;
import designPatterns.BuilderDesignPattern.ProductBuilder.ConcreteBuilder.WoodenBuilder;

public class HouseFactory {
		HouseBuilder houseBuilder = null;
		
	public static HouseBuilder getInstance(String type) {
		if(type.equalsIgnoreCase("Concrete")) {
			return new ConcreteBuilder();
		}else if(type.equalsIgnoreCase("Ice")) {
			return new IceBuilder();
		}else if(type.equalsIgnoreCase("Marbel")) {
			return new MarbelBuilder();
		}else if(type.equalsIgnoreCase("Wooden")) {
			return new WoodenBuilder();
		}else
		{
			throw new IllegalArgumentException("Invalid type of House");
		}	
	}
}
