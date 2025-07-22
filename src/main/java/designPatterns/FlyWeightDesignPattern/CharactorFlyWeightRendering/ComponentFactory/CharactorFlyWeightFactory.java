package designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ComponentFactory;

import java.util.HashMap;
import java.util.Map;

import designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ComponentConcreteClass.CharactorFlyWeight;
//Factory
public class CharactorFlyWeightFactory {
	private Map<String,CharactorFlyWeight> cachedMap= new HashMap<String, CharactorFlyWeight>();
	
	public CharactorFlyWeight getInstance(int fontSize,String fontFamily,String fontColor,Character fontSymbol) {
		String key = fontSize+fontFamily+fontColor+fontSymbol;
		if(!cachedMap.containsKey(key)) {
			cachedMap.put(key, new CharactorFlyWeight(fontSize, fontFamily, fontColor, fontSymbol));
		}
		return cachedMap.get(key);
	}//getInstance
}//CharactorFlyWeightFactory
