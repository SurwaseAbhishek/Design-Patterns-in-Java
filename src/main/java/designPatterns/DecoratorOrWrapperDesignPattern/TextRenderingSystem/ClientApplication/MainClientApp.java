package designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ClientApplication;

import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ComponentConcreteClasses.PlanTextView;
import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ComponentInterface.TextView;
import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ConcreteDecoratorClasses.BolderDecorator;
import designPatterns.DecoratorOrWrapperDesignPattern.TextRenderingSystem.ConcreteDecoratorClasses.PlainDecorator;
//ClientApplication
public class MainClientApp {
	public static void main(String[] args) {
		TextView view = new PlanTextView();
		System.out.println(view.render("Hey this is Abhishek !! "));
		
		System.out.println("---------------------------------------");
		
		TextView view2 = new BolderDecorator(new PlanTextView());
		System.out.println(view2.render("Hey this is Abhishek !! "));
		
		System.out.println("---------------------------------------");
		
		TextView view3 = new PlainDecorator(new BolderDecorator(new PlanTextView()));
		System.out.println(view3.render("Hey this is Abhishek !! "));
	}//main
}//class
