package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode;

import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.factories.AbstractFactory;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.FactoryType;

public class main {
	
	public static void main(String args[]) {
		FactoryType abstrctObj = new AbstractFactory();
		FactoryType  sObject = (FactoryType) abstrctObj.getFactory("student");
		sObject.getFactory(null);
		
	}
	
}
