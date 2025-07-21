package designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ConcreteDecoratorClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.AbstractDecorator.TextViewDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ComponentInterface.TextView;

//DecoratorComponentClass
public class PlainDecorator extends TextViewDecorator{
	public static final String ANSI_RESET    = "\u001B[0m";
	public PlainDecorator(TextView textView) {
		super(textView);
	}//1-Param-Constructor
	
	@Override
	public String render(String text) {
		return plainDecoration(text);
	}//rendor

	private String plainDecoration(String text) {
		return ANSI_RESET+text+ANSI_RESET;
	}//plainDecoration
	
}//Class
