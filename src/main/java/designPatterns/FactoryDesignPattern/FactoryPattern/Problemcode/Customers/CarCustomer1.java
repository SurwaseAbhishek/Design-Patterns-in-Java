package designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Customers;

import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarsModel.BudgetCar;

public class CarCustomer1 {
	public static void main(String[] args) {
		Car bcar = new BudgetCar();
		bcar.carAssebmly();
		bcar.carErrection();
		bcar.driveMode();
	}
}
