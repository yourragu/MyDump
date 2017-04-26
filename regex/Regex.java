package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main (String args[]){

		// Define the pattern
		String pattern = "[a-zA-Z0-9.]+@[a-zA-Z0-9-]{3,}.[a-zA-Z]{2,5}";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = p.matcher("babu@tester.com");

		// Confirm the matches
		System.out.println(match.matches());






	}
}


