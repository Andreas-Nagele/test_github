package string_builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {

	public static String camelCaseSplitter(String str) {
		Pattern capitalLetters = Pattern.compile(".*[A-Z].*");
		
		StringBuilder res = new StringBuilder();
		for (String s : str.split("")) {
			Matcher cLMatcher = capitalLetters.matcher(s);
			if(cLMatcher.matches() && res.length() > 0) {
				res.append(" ");
			}
			res.append(s);
		}
		return res.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(camelCaseSplitter("List"));
		System.out.println(camelCaseSplitter("numberOfElements"));
	}

}
