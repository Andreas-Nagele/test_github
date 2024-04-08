package stack;

public class ReverseWords {

	public static void reverseWord(String input) {
		char [] words = new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			words[i] = input.charAt(i);
		}
	}
	
	public static void main(String[] args) {

	}

}
