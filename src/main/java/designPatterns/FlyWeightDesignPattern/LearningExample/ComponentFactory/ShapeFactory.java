package designPatterns.FlyWeightDesignPattern.LearningExample.ComponentFactory;

import java.util.HashMap;
import java.util.Map;

import designPatterns.FlyWeightDesignPattern.LearningExample.ComponentInterface.Shape;
//ComponentFactory
public class ShapeFactory <T extends Shape>{
	private static Map<String,Shape> cachedShape = new HashMap<>();
	
	public static <T> T getInstance(String type,Class<T> clazz) throws Exception{
		if(!cachedShape.containsKey(type)) {
			cachedShape.put(type, (Shape)clazz.getConstructors()[0].newInstance());
		}
		return (T) cachedShape.get(type);
	}//getInstance
}//Class
