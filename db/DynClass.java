package db;

import java.lang.reflect.Method;



public class DynClass {

	public static void main(String[] args) throws ClassNotFoundException {
       
		Class leaftaps = Class.forName("wrappers.LeafTapsWrappers"); 
		Method[] allMethods = leaftaps.getMethods();
		
		for (Method method : allMethods) {
			System.out.println(method.getName());
			
		}
	//	leaftaps.get
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
