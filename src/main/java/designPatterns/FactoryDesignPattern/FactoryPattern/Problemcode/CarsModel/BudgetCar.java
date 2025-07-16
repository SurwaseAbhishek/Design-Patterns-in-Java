package designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarsModel;

import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Car;

public class BudgetCar extends Car {
	private double carPrice;
	private double average;
	
	// business Methods
	
	
	// Getterand Setters 
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	@Override
	public void driveMode() {
		System.out.println("BudgetCar.driveMode()");
	}
	@Override
	public void carAssebmly() {
		System.out.println("BudgetCar.carAssebmly()");
	}
	@Override
	public void carErrection() {
		System.out.println("BudgetCar.carErrection()");
	}
	
}	
