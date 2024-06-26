package queue;

public class ArrayQueue {
	
	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	/**
	 * Method inserts an int item at the back of the queue.
	 * @param item ist an integer you want to insert.
	 */
	public static void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		}else {
			queue[rear]=item;
			rear++;
		}
	}
	
	/**
	 * Method deletes last element in queue.
	 * @return first element in queue.
	 */
	public static int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		} else {
			firstElement = queue[front];
			//TODO Elemente im Array verr�cken
			for (int i = 0; i < (rear-1); i++) {
				queue[i] = queue[i+1];
			}
			if (rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		}
		return firstElement;
	}
	
	/**
	 * Method prints the entire queue.
	 */
	public static void queueDisplay() {
		if (rear == front) {
			System.out.println("Queue is empty!");
		} else {
			for (int i = front; i < rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}
	
	/**
	 * Method returns first element without deleting it.
	 * @return first element.
	 */
	public static int queueFront() {
		//TODO erstes Element ohne L�schen zur�ckgeben
		int firstElement = 0;
		if (rear == front) {
			System.out.println("Queue is empty");
		} else {
			firstElement = queue[front];
		}
		return firstElement;
	}
	
	//H� : ArrayQueue Testklasse schreiben (Alle Methoden testen)
	//	   JavaDoc Kommentare
	//	   Kapitel 5 nochmal durcharbeiten
}