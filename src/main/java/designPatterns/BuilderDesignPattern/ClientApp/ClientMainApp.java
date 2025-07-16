package designPatterns.BuilderDesignPattern.ClientApp;

import designPatterns.BuilderDesignPattern.Director.CivilEngineer;
import designPatterns.BuilderDesignPattern.Factory.HouseFactory;
import designPatterns.BuilderDesignPattern.ProductBuilder.House;
import designPatterns.BuilderDesignPattern.ProductBuilder.HouseBuilder;

public class ClientMainApp {

	public static void main(String[] args) {
		
		HouseBuilder houseBuilder = null;
		CivilEngineer civil = null;
		House house = null;
		
		//Concrete
		houseBuilder = HouseFactory.getInstance("Concrete");
		civil = new CivilEngineer(houseBuilder);
		civil.ConstructHouse();
		house = civil.getHouse();
		System.out.println(house.toString());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		//Ice
		houseBuilder = HouseFactory.getInstance("Ice");
		civil = new CivilEngineer(houseBuilder);
		civil.ConstructHouse();
		house = civil.getHouse();		
		System.out.println(house.toString());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		//Marbel
		houseBuilder = HouseFactory.getInstance("Marbel");
		civil = new CivilEngineer(houseBuilder);
		civil.ConstructHouse();
		house = civil.getHouse();
		System.out.println(house.toString());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		//Ice
		houseBuilder = HouseFactory.getInstance("Wooden");
		civil = new CivilEngineer(houseBuilder);
		civil.ConstructHouse();
		house = civil.getHouse();		
		System.out.println(house.toString());
		System.out.println("--------------------------------------------------------------------------------------------------------");

	}//main
}//class
