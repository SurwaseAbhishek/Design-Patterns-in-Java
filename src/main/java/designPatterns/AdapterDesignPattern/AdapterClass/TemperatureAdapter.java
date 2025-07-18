package designPatterns.AdapterDesignPattern.AdapterClass;

import designPatterns.AdapterDesignPattern.ExternalServiceClass.ExternalTemperature;
import designPatterns.AdapterDesignPattern.ExternalServiceClass.ExternalTempraratureImpl;

public class TemperatureAdapter {
	
	public String getTemperature(String city) {
		int citycode;
		if(city.equalsIgnoreCase("Pune")) {
			citycode = 1101; 
		}else if(city.equalsIgnoreCase("Mumbai")) {
			citycode = 1102; 
		}else if(city.equalsIgnoreCase("NagPur")) {
			citycode = 1103; 
		}else if(city.equalsIgnoreCase("Satara")) {
			citycode = 1104; 
		}else {
			return "City not found";
		}
		
		ExternalTemperature temp = new ExternalTempraratureImpl();
		float fTemp = temp.getTempratureInFahrenheit(citycode);
		float cTempt;
		cTempt = 5/9.0f*(fTemp-32);
		
		return cTempt+" Celcius";
	}
	
	
}
