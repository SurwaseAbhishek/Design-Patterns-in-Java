package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.DAOClasses;

import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.dao;

public class StudentDao implements dao {

	@Override
	public void insertdata() {
		System.out.println("StudentDao.insertdata()");
	}

	@Override
	public void update() {
		System.out.println("StudentDao.update()");
	}

	@Override
	public void delete() {
		System.out.println("StudentDao.delete()");
	}

	
}
