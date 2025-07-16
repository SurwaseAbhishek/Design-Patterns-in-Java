package designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Customers;

import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarsModel.SportCar;

public class CarCustomer3 {
	public static void main(String[] args) {
		Car scar = new SportCar();
		scar.carAssebmly();
		scar.carErrection();
		scar.driveMode();
	}
}
