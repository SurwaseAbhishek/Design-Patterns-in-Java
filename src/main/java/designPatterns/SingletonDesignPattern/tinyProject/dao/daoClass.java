package designPatterns.SingletonDesignPattern.tinyProject.dao;

import java.util.ArrayList;
import java.util.List;

public class daoClass {
	public List<String> contriesList = new ArrayList<String>();
	public daoClass() {
		contriesList.add("India");
		contriesList.add("USA");
		contriesList.add("Canada");
		contriesList.add("Germany");
		contriesList.add("Australia");
		contriesList.add("Japan");
		contriesList.add("France");
		contriesList.add("Brazil");
		contriesList.add("South Africa");
		contriesList.add("Italy");
	}
}
