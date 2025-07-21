package designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ComponentConcreteClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ComponentInterface.TextView;
//ComponentConcreateClass
public class PlanTextView implements TextView {
	
	@Override
	public String render(String text) {
		return "Plain text : "+ text;
	}//render

}//class
