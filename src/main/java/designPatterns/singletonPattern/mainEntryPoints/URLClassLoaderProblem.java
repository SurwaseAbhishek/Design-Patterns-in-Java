package designPatterns.singletonPattern.mainEntryPoints;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import designPatterns.singletonPattern.allPossibleWays.Printer2;

public class URLClassLoaderProblem {

	public static void main(String[] args) throws InstantiationException, InterruptedException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Printer2 p = Printer2.getInstance();
		System.out.println(p.hashCode());
//		System.out.println(p.getClass().getClassLoader());
		
		try {
//			URLClassLoader url = new URLClassLoader(new URL[] {new URL("file:/D:\\Technologies\\AbhishekIT\\INeuron Java\\SingletonJar.jar")},null); // null mean independent loading of class by class loader
			
//			To overcome this problem solution is from developers perspective at it is at the time of custom loading of class add it is existiing loading process
			URLClassLoader url = new URLClassLoader(new URL[] {new URL("file:/D:\\Technologies\\AbhishekIT\\INeuron Java\\SingletonJar.jar")},p.getClass().getClassLoader()); // null mean independent loading of class by class loader
//			here no custom class loader will followed by the application class loader 
			
			Class<?> c1 = url.loadClass("designPatterns.singletonPattern.allPossibleWays.Printer2");
			Method method = c1.getDeclaredMethod("getInstance", new Class[] {});
			Object obj1 = method.invoke(null);
			System.out.println(obj1.hashCode());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * here i get that we can not cereate perfect singleton class because custom
	 * class loading is concept in java developers have to take care of this so that
	 * at the time of custom loading also same object can be loaded how it is entire
	 * core java class loader concept
	 */
}
