package designPatterns.FactoryDesignPattern.SolutionCode.Customers;

import designPatterns.FactoryDesignPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.Problemcode.CarType;
import designPatterns.FactoryDesignPattern.SolutionCode.CarFactory;

public class CarCustomer2 {
	public static void main(String[] args) {
		Car bcar = CarFactory.getcar(CarType.LUXURY);
		bcar.driveMode();
	}
}
