package designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Customers;

import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarsModel.LuxoryCar;

public class CarCustomer2 {
	public static void main(String[] args) {
		Car lcar = new LuxoryCar();
		lcar.carAssebmly();
		lcar.carErrection();
		lcar.driveMode();
	}
}
