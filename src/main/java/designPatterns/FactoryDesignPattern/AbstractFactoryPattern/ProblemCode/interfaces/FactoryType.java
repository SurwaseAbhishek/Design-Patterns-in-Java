package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces;

public interface FactoryType {

	 static final String STUDENT ="student";
	 static final String COURSE ="course";
	 
	 public dao getFactory(String type);
}
