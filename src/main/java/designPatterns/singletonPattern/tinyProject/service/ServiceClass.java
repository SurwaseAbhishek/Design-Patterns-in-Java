package designPatterns.singletonPattern.tinyProject.service;

import java.util.Hashtable;
import java.util.List;

import javax.management.InstanceAlreadyExistsException;

import designPatterns.singletonPattern.tinyProject.dao.daoClass;

public class ServiceClass  {
	private static ServiceClass SERVICE;
	private Hashtable<String, List<String>> Countries; ;
	boolean isIstanciated;
	public ServiceClass() throws InstanceAlreadyExistsException {
		if(isIstanciated) {
			throw new InstanceAlreadyExistsException();
		}
		isIstanciated = false;
		Countries = new Hashtable<String, List<String>>();
	}
	
	public static ServiceClass getInstance() throws InstanceAlreadyExistsException {
		if(SERVICE == null) {
			synchronized (ServiceClass.class) {
				if(SERVICE==null) {
					SERVICE = new ServiceClass();
				}
			}
		}
		return SERVICE;
	}
	
	public Object readResolve() {
		return SERVICE;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return SERVICE;
	}
	
	// business Logic 
	public Hashtable getCountriesList() {
		if(!Countries.containsKey("cInfo")) {
			daoClass dao = new daoClass();
			List<String> counties = dao.contriesList;
			Countries.put("cInfo", counties);
		}
		return Countries;
		
	}
}
