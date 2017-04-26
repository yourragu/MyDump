package reflection;

import java.lang.reflect.Method;

import wrappers.GenericWrappers;

public class LearnReflection {
	
	public static void main(String[] args) {
		
		Class<GenericWrappers> gw = GenericWrappers.class;
		Method[] allMethods = gw.getDeclaredMethods() ;
		for (Method method : allMethods) {
			System.out.println(method.getName());
		}
		
		

	}

}
