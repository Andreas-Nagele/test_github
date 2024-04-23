package stack;

import java.util.LinkedList;

public class BracketCorrect {

	public static boolean isBracketCorrect(String input) {
		LinkedList<Character> stack = new LinkedList<>();
		for (char c : input.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char lastOpen = stack.peek();
				if ((c == ')' && lastOpen != '(') || (c == '}' && lastOpen != '{') ||
					(c == ']' && lastOpen != '[')) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(isBracketCorrect("({})"));
		System.out.println(isBracketCorrect("([{]})"));
	}

}
