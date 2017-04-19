package testng3;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class RepeatingChar {

	public static void main(String[] args) {

		String CompanyName="Cognizant";

		Map<Character,Integer> map = new TreeMap<>();
		char[] str = CompanyName.toCharArray();
		for (char c : str) {

			if(map.containsKey(c))
			{

				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}	

		//System.out.println(map);
		Set<Character> keys = map.keySet();
		for(Character ch:keys){
			if(map.get(ch) > 1){
				System.out.println(ch+"--->"+map.get(ch));
			}
		}
	}
}






