package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.factories;import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.DAOClasses.CourseDao;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.DAOClasses.StudentDao;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.StudentFactoryType;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.dao;

public class StudentFactory{

	public dao getInstance(String type) throws IllegalArgumentException {
		if(type.equalsIgnoreCase(StudentFactoryType.STUDENT))
			return new StudentDao();
		else if(type.equalsIgnoreCase(StudentFactoryType.COURSE))
			return new CourseDao();
		else
			throw new IllegalArgumentException("In valid type");
	}

}
