package arrayList;

import java.util.List;

public class ArrayList {

	public static void reduceToComments (List<String> lines) {
		if (lines.size() > 3) {
			for (int i = 0; i < 3; i++) {
				lines.remove(i);
			}
		} else {
			System.out.println("Illegal size " + lines.size() + " of list, must be divisble by 4");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
