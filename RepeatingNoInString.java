import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Interques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String CompName = "Paypal India";
		boolean duplicate = false;
		char[] allchars = CompName.toCharArray();
		Map<Character,Integer> map = new TreeMap<>();

		for (char c : allchars) {

			if(map.containsKey(c))
			{
				duplicate = true;
			map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}



		}
		System.out.println(map);
	}

}
