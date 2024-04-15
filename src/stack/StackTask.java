package stack;

import java.util.LinkedList;
import java.util.Scanner;

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
	
	public static void isBracketCorrect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte gib einen geklammerten Ausdruck ein!");
		String [] input = (sc.nextLine()).split("");
		
		LinkedList <Character> list = new LinkedList<Character>();
		
		for (int i = 0; i < input.length; i++) {
			list.push(input[i].charAt(0));
		}
		for (Character c : list) {
			System.out.println(c);
		}
		sc.close();
		
	}
	
	public static double calculateTwoNumbers(double num1, double num2, char operator) {
		switch(operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
		}
		System.out.println("Invalid operation!");
		return 0;
	}
		
	public static boolean isStringNumeric(String input) {
		if (!input.equalsIgnoreCase("+") && !input.equalsIgnoreCase("-")
			&& !input.equalsIgnoreCase("*") && !input.equalsIgnoreCase("/")) {
			return true;
		}
		return false;
	}
	public static double calculateUPN(String input) {
		LinkedList<Double> numbers = new LinkedList<Double>();
		LinkedList<Character> operators = new LinkedList<Character>();
		
		String[] list = input.split(" ");
		for(int i = 0; i < list.length; i++) {
			if (isStringNumeric(list[i])) {
				numbers.push(Double.parseDouble(list[i]));
			} else {
				operators.push(list[i].charAt(0));
			}
		}
		do {
			double num1 = numbers.pop();
			double num2 = numbers.pop();
			char operator = operators.pop();
			numbers.push(calculateTwoNumbers(num1, num2, operator));
		} while (!(numbers.size() == 1));
		return numbers.pop();
	}
	
	public static void main(String[] args) {
		//System.out.println(reverseString("Andi"));
		//System.out.println(reverseString("Nevio"));
		
		System.out.println(calculateUPN("12 34 5 8 + + *"));
		
		isBracketCorrect();
	}

}
