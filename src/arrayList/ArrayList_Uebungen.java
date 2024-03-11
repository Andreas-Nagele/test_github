package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Uebungen {

	public static void reduceToComments (List<String> lines) {
		if (lines.size() % 4 == 0 && lines.size() > 0) {
			for (int i = 0; i < lines.size(); i++) {
				lines.remove(i);
				lines.remove(i);
				lines.remove(i);
			}
			for (int i = 0; i < lines.size(); i++) {
				System.out.println(lines.get(i));
			}
		}
		else if (lines.size() == 0) {
			System.out.println("Leere Liste");
		}
		else {
			System.out.println("Illegal size " + lines.size() + " of list, must be divisble by 4");
		}
	}
	
	public static void main(String[] args) {
		List<String> lines = new ArrayList<String>();
		lines.add("A1");
		lines.add("A2");
		lines.add("A3");
		lines.add("A4");
		lines.add("B1");
		lines.add("B2");
		lines.add("B3");
		lines.add("B4");
		lines.add("C1");
		lines.add("C2");
		lines.add("C3");
		lines.add("C4");
		
		reduceToComments(lines);	
	}
}
