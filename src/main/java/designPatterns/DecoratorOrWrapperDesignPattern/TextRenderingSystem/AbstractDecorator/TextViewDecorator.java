package designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.AbstractDecorator;

import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ComponentInterface.TextView;
//AbstarctDecoratorInterface
public abstract class TextViewDecorator implements TextView {
	TextView textView;
	
	public TextViewDecorator( TextView textView) {
		this.textView=textView;
	}//1-Param-Constructor
	
	@Override
	public String render(String text) {
		return textView.render(text);
	}//render

}//Class
