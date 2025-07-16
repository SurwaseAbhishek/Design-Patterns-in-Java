package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.factories;import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.FactoryType;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.dao;

public class AbstractFactory implements FactoryType{

	@Override
	public dao  getFactory(String type) {
		if(type.equalsIgnoreCase(FactoryType.STUDENT))
			return  (dao) new StudentFactory();
		else if(type.equalsIgnoreCase(FactoryType.COURSE))
			return (dao) new ExcelFactory();
		else
			throw new IllegalArgumentException("In valid type");
	}

}
