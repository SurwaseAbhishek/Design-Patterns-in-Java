package designPatterns.FactoryDesignPattern.Problemcode.Customers;

import designPatterns.FactoryDesignPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.Problemcode.CarsModel.BudgetCar;

public class CarCustomer1 {
	public static void main(String[] args) {
		Car bcar = new BudgetCar();
		bcar.carAssebmly();
		bcar.carErrection();
		bcar.driveMode();
	}
}
