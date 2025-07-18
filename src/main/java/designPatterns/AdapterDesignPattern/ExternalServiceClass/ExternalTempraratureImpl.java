package designPatterns.AdapterDesignPattern.ExternalServiceClass;

import java.util.Random;

public class ExternalTempraratureImpl implements ExternalTemperature{

	@Override
	public float getTempratureInFahrenheit(int cityCode) {
		float fTemp=0.0f;
		if(cityCode==1101) { // Mumbai
			fTemp = new Random().nextFloat()*100;
		}else if(cityCode==1102) { // Pune
			fTemp = new Random().nextFloat()*100;
		}else if(cityCode==1103) { // Nagpur
			fTemp = new Random().nextFloat()*100;
		}else if(cityCode==1104) { // Satara
			fTemp = new Random().nextFloat()*100;
		}else {
			throw new IllegalArgumentException("City not Found");
		}
		return fTemp;
	}

}
