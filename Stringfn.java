package stringFn;

public class Stringfn {

	public static void main(String[] args) {
		
		
		String str = "{iNautix 65320}";
		
		String str1[] = str.split(" ");
		//System.out.println(str1[1]);
		for (int i = 0; i < str1.length; i++) {
		System.out.println(str1[i]);	
		}
		
		String[] str2 = str1[1].split("}");
		System.out.println(str2[0]);
		
		StringBuilder str3 = new StringBuilder("{iNautix 65320}");
		System.out.println(str3.reverse());
		
		StringBuffer str4 = new StringBuffer("{iNautix 65320}");
		System.out.println(str4.reverse());
		
	}
	}


