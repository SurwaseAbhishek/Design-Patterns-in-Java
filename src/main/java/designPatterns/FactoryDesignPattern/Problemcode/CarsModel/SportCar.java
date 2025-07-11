package designPatterns.FactoryDesignPattern.Problemcode.CarsModel;

import designPatterns.FactoryDesignPattern.Problemcode.Car;

public class SportCar extends Car {
	private double carSpeed;
	private String carlook;
	
	// business Methods
	
	@Override
	public void driveMode() {
		System.out.println("SportCar.driveMode()");
	}
	@Override
	public void carAssebmly() {
		System.out.println("SportCar.carAssebmly()");
	}
	@Override
	public void carErrection() {
		System.out.println("SportCar.carErrection()");
	}
	
	// Getter and Setters 

	public double getCarSpeed() {
		return carSpeed;
	}
	public void setCarSpeed(double carSpeed) {
		this.carSpeed = carSpeed;
	}
	public String getCarlook() {
		return carlook;
	}
	public void setCarlook(String carlook) {
		this.carlook = carlook;
	}
	
	
	
	
	
		
	
}	
