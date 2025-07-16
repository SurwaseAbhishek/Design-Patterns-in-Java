package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.DAOClasses;

import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.dao;

public class CourseExcelDao implements dao {

	@Override
	public void insertdata() {
		System.out.println("CourseExcelDao.insertdata()");
	}

	@Override
	public void update() {
		System.out.println("CourseExcelDao.update()");
	}

	@Override
	public void delete() {
		System.out.println("CourseExcelDao.delete()");
	}
}
