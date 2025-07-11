package designPatterns.singletonPattern.tinyProject.Controller;

import java.util.Hashtable;
import java.util.List;

import javax.management.InstanceAlreadyExistsException;

import designPatterns.singletonPattern.tinyProject.service.ServiceClass;

public class ControllerClass {
	public static void main(String[] args) throws InstanceAlreadyExistsException {
		ServiceClass service = ServiceClass.getInstance();
		Hashtable<String, List<String>> contriesList = service.getCountriesList();
		System.out.println(contriesList.get("cInfo"));
		experimentMethod1();
		experimentMethod2();
	}

	private static void experimentMethod2() throws InstanceAlreadyExistsException {
		ServiceClass service = ServiceClass.getInstance();
		Hashtable<String, List<String>> contriesList = service.getCountriesList();
		System.out.println(contriesList.get("cInfo"));		
	}

	private static void experimentMethod1() throws InstanceAlreadyExistsException {
		ServiceClass service = ServiceClass.getInstance();
		Hashtable<String, List<String>> contriesList = service.getCountriesList();
		System.out.println(contriesList.get("cInfo"));
	}
	
	
	/*
	 * Most of the time if u are thinking to create Singleton class at that time
	 * utility class we can create it doesont means every time utility class can
	 * replace singleton everyone is perfect at there own position Utility class is
	 * class which is having all methods as static method
	 */
}
