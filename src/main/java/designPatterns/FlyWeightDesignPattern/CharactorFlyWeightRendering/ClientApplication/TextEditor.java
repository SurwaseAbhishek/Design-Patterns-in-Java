package designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ClientApplication;

import java.util.ArrayList;
import java.util.List;

import designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ComponentConcreteClass.CharactorFlyWeight;
import designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ComponentFactory.CharactorFlyWeightFactory;

public class TextEditor {
	CharactorFlyWeightFactory factory = new CharactorFlyWeightFactory();
	List<RenderCharactor> list = new ArrayList<RenderCharactor>();
	
	public void addCharctor(int x,int y,int fontSize,String fontFamily,String fontColor,Character fontSymbol) {
		CharactorFlyWeight glymph = factory.getInstance(fontSize, fontFamily, fontColor, fontSymbol);
		list.add(new RenderCharactor(glymph, x, y));
	}
	
	public void RenderingCharctor() {
		for(RenderCharactor charactor : list) {
			charactor.render();
		}
		
	}
}	
