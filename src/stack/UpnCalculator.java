package stack;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpnCalculator {

	// Meine Version:
	
	public static double calculateTwoNumbers(double num1, double num2, char operator) {
		switch(operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num2 - num1;
			case '*':
				return num1 * num2;
			case '/':
				return num2 / num1;
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
	
	// Petz-Version:
	
	public static int UPN(String input) {
		LinkedList<Integer> stack = new LinkedList<>();
		// operatorPattern: Überprüft auf mathematische Rechnezeichen
		Pattern operatorPattern = Pattern.compile("[+*-/]");
		// numericPattern: \\d ... Ziffer [0 - 9], + ... beliebig viele Ziffern
		Pattern numericPattern = Pattern.compile("\\d+");
		
		// \\s+ ... teilt den String auch nach mehreren Leerzeichen
		for (String token : input.split("\\s+")) {
			Matcher operatorMatcher = operatorPattern.matcher(token);
			Matcher numericMatcher = numericPattern.matcher(token);
			if (numericMatcher.matches()) {
				stack.push(Integer.parseInt(token));
			} else if(operatorMatcher.matches()) {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				int result;
				switch(token) {
					case "+": 
						result = operand1 + operand2;
						break;
					case "-":
						result = operand2 - operand1;
						break;
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(calculateUPN("7 5 +"));

	}

}
