package designPatterns.BuilderDesignPattern.ProductBuilder.ConcreteBuilder;

import designPatterns.BuilderDesignPattern.ProductBuilder.House;
import designPatterns.BuilderDesignPattern.ProductBuilder.HouseBuilder;

public class IceBuilder implements HouseBuilder {
	private House house;
	public IceBuilder() {
		this.house=new House();
	}
	
	@Override
	public void builtBasement() {
		house.setBasement("Ice Basement");
	}

	@Override
	public void builtInterior() {
		house.setInterior("Ice Interior");

	}

	@Override
	public void builtPiller() {
		house.setPiller("Ice Piller");

	}

	@Override
	public void builtRoofing() {
		house.setRoofing("Ice Roofing");

	}

	@Override
	public House getHouse() {
		return house;
	}

}
