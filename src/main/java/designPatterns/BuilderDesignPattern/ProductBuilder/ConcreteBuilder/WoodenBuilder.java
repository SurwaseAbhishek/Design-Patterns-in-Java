package designPatterns.BuilderDesignPattern.ProductBuilder.ConcreteBuilder;

import designPatterns.BuilderDesignPattern.ProductBuilder.House;
import designPatterns.BuilderDesignPattern.ProductBuilder.HouseBuilder;

public class WoodenBuilder implements HouseBuilder {
	private House house;
	public WoodenBuilder() {
		this.house=new House();
	}
	
	@Override
	public void builtBasement() {
		house.setBasement("Wooden Basement");
	}

	@Override
	public void builtInterior() {
		house.setInterior("Wooden Interior");

	}

	@Override
	public void builtPiller() {
		house.setPiller("Wooden Piller");

	}

	@Override
	public void builtRoofing() {
		house.setRoofing("Wooden Roofing");

	}

	@Override
	public House getHouse() {
		return house;
	}

}
