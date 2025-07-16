package designPatterns.BuilderDesignPattern.ProductBuilder.ConcreteBuilder;

import designPatterns.BuilderDesignPattern.ProductBuilder.House;
import designPatterns.BuilderDesignPattern.ProductBuilder.HouseBuilder;

public class MarbelBuilder implements HouseBuilder {
	private House house;
	public MarbelBuilder() {
		this.house=new House();
	}
	
	@Override
	public void builtBasement() {
		house.setBasement("Marbel Basement");
	}

	@Override
	public void builtInterior() {
		house.setInterior("Marbel Interior");

	}

	@Override
	public void builtPiller() {
		house.setPiller("Marbel Piller");

	}

	@Override
	public void builtRoofing() {
		house.setRoofing("Marbel Roofing");

	}

	@Override
	public House getHouse() {
		return house;
	}

}
