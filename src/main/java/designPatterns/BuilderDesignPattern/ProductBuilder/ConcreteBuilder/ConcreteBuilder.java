package designPatterns.BuilderDesignPattern.ProductBuilder.ConcreteBuilder;

import designPatterns.BuilderDesignPattern.ProductBuilder.House;
import designPatterns.BuilderDesignPattern.ProductBuilder.HouseBuilder;

public class ConcreteBuilder implements HouseBuilder {
	private House house;
	public ConcreteBuilder() {
		this.house=new House();
	}
	
	@Override
	public void builtBasement() {
		house.setBasement("Concrete Basement");
	}

	@Override
	public void builtInterior() {
		house.setInterior("Concrete Interior");

	}

	@Override
	public void builtPiller() {
		house.setPiller("Concrete Piller");

	}

	@Override
	public void builtRoofing() {
		house.setRoofing("Concrete Roofing");
  
	}

	@Override
	public House getHouse() {
		return house;
	}

}
