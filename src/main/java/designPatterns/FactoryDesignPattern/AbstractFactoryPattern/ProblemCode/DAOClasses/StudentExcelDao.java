package designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.DAOClasses;

import designPatterns.FactoryDesignPattern.AbstractFactoryPattern.ProblemCode.interfaces.dao;

public class StudentExcelDao implements dao {

	@Override
	public void insertdata() {
		System.out.println("StudentExcelDao.insertdata()");
	}

	@Override
	public void update() {
		System.out.println("StudentExcelDao.update()");
	}

	@Override
	public void delete() {
		System.out.println("StudentExcelDao.delete()");
	}
}
