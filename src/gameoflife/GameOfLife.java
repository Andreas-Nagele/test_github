package gameoflife;

import java.util.Scanner;

public class GameOfLife {

	public char [] []field;
	
	public void init(int length, int width) {
		field = new char [length][width];
	}
	
	public void
	
	public static void main(String[] args) {
		GameOfLife game = new GameOfLife();
		Scanner sc = new Scanner (System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		game.init(length, width);
		
		sc.close();
	}

}
