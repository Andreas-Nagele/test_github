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
	
	public static void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		}else {
			queue[rear]=item;
			rear++;
		}
	}
	
	public static int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		} else {
			firstElement = queue[front];
			//TODO Elemente im Array verrücken
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
	
	public static void queueDisplay() {
		if (rear == front) {
			System.out.println("Queue is empty!");
		} else {
			for (int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
	}
	
	public static int queueFront() {
		//TODO erstes Element ohne Löschen zurückgeben
		int firstElement = 0;
		if (rear == front) {
			System.out.println("Queue is empty");
		} else {
			firstElement = queue[front];
		}
		return firstElement;
	}
}