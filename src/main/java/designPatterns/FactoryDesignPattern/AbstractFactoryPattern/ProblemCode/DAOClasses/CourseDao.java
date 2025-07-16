package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.DAOClasses;

import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.dao;

public class CourseDao implements dao {

	@Override
	public void insertdata() {
		System.out.println("CourseDao.insertdata()");
	}

	@Override
	public void update() {
		System.out.println("CourseDao.update()");
	}

	@Override
	public void delete() {
		System.out.println("CourseDao.delete()");
	}

	
}
