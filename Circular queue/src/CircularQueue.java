import java.util.Scanner;

public class CircularQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter max queue size: ");
		int qSize = scan.nextInt(), choice;

		Queue q = new Queue(qSize);

		do {
			q.print();
			System.out.print("Enter a choice (zero stops):\n  1. Dequeue\n  2. Enqueue\n\nChoose: ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				q.dequeue();
				break;
			case 2:
				q.enqueue((int) (Math.random() * 100));
				break;// enqueue random int
			}
		} while (choice != 0);

	}

	static class Queue {
		int front, rear;
		int[] Q;

		public Queue(int size) {

			Q = new int[size + 1];

			/*
			 * 'size+1' because one spot is always kept empty (the 'front' index) otherwise,
			 * "empty" and "full" conditions will match
			 */
			front = 0;
			rear = 0;
		}

		public void enqueue(int val) {
			rear = (rear + 1) % Q.length;
			if (rear == front) { // if full
				System.out.println("Queue is full.");
				if (rear == 0)
					rear = Q.length - 1;
				else
					rear = rear - 1;
				return;
			}
			Q[rear] = val;
		}

		public int dequeue() {
			if (rear == front) {// if empty
				System.out.println("Queue is empty.");
				return -1;
			}
			int tmp = Q[front];
			front = (front + 1) % Q.length;
			return tmp;
		}

		public void print() {
			int curr = front;
			System.out.print("Queue state: ");
			if (curr == rear) {
				System.out.print("[empty]");
			} else
				while (curr != rear) {
					curr = (curr + 1) % Q.length;
					System.out.print(Q[curr] + " ");
				}
			System.out.println();
		}
	}

}
