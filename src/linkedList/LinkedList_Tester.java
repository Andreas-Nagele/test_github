package linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Tester {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.rotate(list, 2);
		// "Laufvariable" zum iterieren einer Datenstruktur
		// l�uft immer vom Anfang bis zum Ende
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			if(iterator.next() == 3) {
				//System.out.println("Found 3");
				iterator.remove();
			}
		}
		// Iterator muss wieder zur�ckgesetzt werden
		// Iterator muss wieder an den Anfang der List gesetzt werden
		iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
