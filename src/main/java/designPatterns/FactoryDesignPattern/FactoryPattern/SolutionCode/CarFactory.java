package designPatterns.FactoryDesignPattern.FactoryPattern.SolutionCode;

import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.Car;
import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarType;
import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarsModel.BudgetCar;
import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarsModel.LuxoryCar;
import designPatterns.FactoryDesignPattern.FactoryPattern.Problemcode.CarsModel.SportCar;

public class CarFactory {
	/*
	 * Creating object without knowing to client just cleint have to told which car
	 * he wants and this method is static because why should client create object to
	 * call he is interested in car not in car supplier
	 */
	
	public static Car getcar(String type) {
		Car car = null;
		if(type.equalsIgnoreCase(CarType.BUDGET)) {
			car = new BudgetCar();
		}
		else if(type.equalsIgnoreCase(CarType.LUXURY))
		{
			car = new LuxoryCar();
		}else if(type.equalsIgnoreCase(CarType.SPORTS))
		{
			car= new SportCar();
		}else {
			throw new IllegalArgumentException("Given type is not exist in Car Type");
		}
		car.carAssebmly();
		car.carErrection();
		return car;
	}
}
