package designPatterns.BuilderDesignPattern.Director;

import designPatterns.BuilderDesignPattern.ProductBuilder.House;
import designPatterns.BuilderDesignPattern.ProductBuilder.HouseBuilder;


public class CivilEngineer {
	House house = null;
	HouseBuilder houseBuilder = null;
	
	public CivilEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public House getHouse() {
		 return houseBuilder.getHouse();
	}
	
	public void ConstructHouse() {
		houseBuilder.builtBasement();
		houseBuilder.builtInterior();
		houseBuilder.builtPiller();
		houseBuilder.builtRoofing();
	}
	
	
	
	
}
