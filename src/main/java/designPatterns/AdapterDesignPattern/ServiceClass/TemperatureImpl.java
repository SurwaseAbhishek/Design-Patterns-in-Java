package designPatterns.AdapterDesignPattern.ServiceClass;

import designPatterns.AdapterDesignPattern.AdapterClass.TemperatureAdapter;

public class TemperatureImpl implements Temperature {

	@Override
	public String getTempratureByCity(String city) {
		TemperatureAdapter temp = new TemperatureAdapter();
		return temp.getTemperature(city);
	}

}
