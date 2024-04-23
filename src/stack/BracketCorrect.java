package stack;

import java.util.LinkedList;
import java.util.Scanner;

public class BracketCorrect {

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
	
	public static void main(String[] args) {

	}

}
