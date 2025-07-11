package designPatterns.FactoryDesignPattern.Problemcode.Customers;

import designPatterns.FactoryDesignPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.Problemcode.CarsModel.BudgetCar;
import designPatterns.FactoryDesignPattern.Problemcode.CarsModel.LuxoryCar;

public class CarCustomer2 {
	public static void main(String[] args) {
		Car lcar = new LuxoryCar();
		lcar.carAssebmly();
		lcar.carErrection();
		lcar.driveMode();
	}
}
