package stack;

import java.util.LinkedList;

public class StackTask {

	public static String reverseString(String input) {
		LinkedList <Character> list = new LinkedList<Character>();
		char [] reversedList = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			list.push(input.charAt(i));
		}
		for (int i = 0; i < input.length(); i++) {
			reversedList[i] = list.pop();
		}
		return String.valueOf(reversedList);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Andi"));
		System.out.println(reverseString("Nevio"));
	}

}
