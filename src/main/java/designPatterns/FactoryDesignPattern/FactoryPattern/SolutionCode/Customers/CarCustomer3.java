package designPatterns.FactoryDesignPattern.FactoryPattern.SolutionCode.Customers;

import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarType;
import designPatterns.FactoryDesignPattern.FactoryPattern.SolutionCode.CarFactory;

public class CarCustomer3 {
	public static void main(String[] args) {
		Car bcar = CarFactory.getcar(CarType.SPORTS);
		bcar.driveMode();
	}
}
