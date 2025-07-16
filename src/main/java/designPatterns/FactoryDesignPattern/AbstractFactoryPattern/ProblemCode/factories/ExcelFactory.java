package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.factories;import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.DAOClasses.CourseExcelDao;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.DAOClasses.StudentExcelDao;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.CourseFactoryType;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.StudentFactoryType;
import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.dao;

public class ExcelFactory{

	public dao getInstance(String type) throws IllegalArgumentException {
		if(type.equalsIgnoreCase(StudentFactoryType.STUDENT))
			return new StudentExcelDao();
		else if(type.equalsIgnoreCase(StudentFactoryType.COURSE))
			return new CourseExcelDao();
		else
			throw new IllegalArgumentException("In valid type");
	}

}
