package designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ConcreteDecoratorClasses;

import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.AbstractDecorator.TextViewDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ComponentInterface.TextView;

//DecoratorComponentClass
public class BolderDecorator extends TextViewDecorator{
    public static final String ANSI_BOLD     = "\u001B[1m";
	public BolderDecorator(TextView textView) {
		super(textView);
	}//1-Param-Constructor
	
	@Override
	public String render(String text) {
		return boldDecoration(text);
	}//rendor

	private String boldDecoration(String text) {
		return ANSI_BOLD+text+ANSI_BOLD;
	}//boldDecoration
	
}//Class
