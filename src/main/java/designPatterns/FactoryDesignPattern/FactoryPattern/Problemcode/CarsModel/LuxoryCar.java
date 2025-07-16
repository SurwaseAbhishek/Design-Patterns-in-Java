package designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarsModel;

import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Car;

public class LuxoryCar extends Car {
	private String  carSpace;
	private String carFacility;
	
	// business Methods
	
	@Override
	public void driveMode() {
		System.out.println("LuxoryCar.driveMode()");
	}
	@Override
	public void carAssebmly() {
		System.out.println("LuxoryCar.carAssebmly()");
	}
	@Override
	public void carErrection() {
		System.out.println("LuxoryCar.carErrection()");
	}
	
	// Getter and Setters 

	public String getCarSpace() {
		return carSpace;
	}
	public void setCarSpace(String carSpace) {
		this.carSpace = carSpace;
	}
	public String getCarFacility() {
		return carFacility;
	}
	public void setCarFacility(String carFacility) {
		this.carFacility = carFacility;
	}
			
	
}	
