package designPatterns.FactoryDesignPattern.Problemcode.Customers;

import designPatterns.FactoryDesignPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.Problemcode.CarsModel.BudgetCar;
import designPatterns.FactoryDesignPattern.Problemcode.CarsModel.LuxoryCar;
import designPatterns.FactoryDesignPattern.Problemcode.CarsModel.SportCar;

public class CarCustomer3 {
	public static void main(String[] args) {
		Car scar = new SportCar();
		scar.carAssebmly();
		scar.carErrection();
		scar.driveMode();
	}
}
