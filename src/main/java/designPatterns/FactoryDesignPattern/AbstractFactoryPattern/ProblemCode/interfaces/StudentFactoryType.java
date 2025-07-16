package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces;

public interface StudentFactoryType {

	 static final String STUDENT ="student";
	 static final String COURSE ="course";
	 
	 public dao getInstance(String type);
}
