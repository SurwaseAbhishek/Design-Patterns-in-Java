package designPatterns.FactoryDesignPattern.SolutionCode.Customers;

import designPatterns.FactoryDesignPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.Problemcode.CarType;
import designPatterns.FactoryDesignPattern.SolutionCode.CarFactory;

public class CarCustomer1 {
	public static void main(String[] args) {
		Car bcar = CarFactory.getcar(CarType.BUDGET);
		bcar.driveMode();
	}
}
