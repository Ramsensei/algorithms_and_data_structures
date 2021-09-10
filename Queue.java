public class Queue {
	private DoubleLinkedList queueList;
	public Queue() {
		queueList = new DoubleLinkedList();
	}

	public void enqueue(Object newElement) {
		this.queueList.insertRear(newElement);
	}

	public Node dequeue() {
		return this.queueList.deleteFirst();
	}

	public Node peek() {
		return this.queueList.getHead();
	}
	
	public void printAll() {
		Node aux = this.peek();
		for(int i = 0; i < this.queueList.getSize(); i++) {
			System.out.print(aux.getData());
			System.out.print(", ");
			aux = aux.next;
		}
		System.out.println(aux.getData());
	}
	
	public static void main(String[] args) {
		//Create an empty queue
		Queue q = new Queue();
		
		//Insert some elements in the queue
		q.enqueue(5);
		q.enqueue(8);
		q.enqueue(3);
		q.enqueue(12);
		q.enqueue(0);
		q.enqueue(89);
		q.enqueue(77);
		
		//Print the queue (Expected: 5, 8, 3, 12, 0, 89, 77)
		q.printAll();
		
		//Dequeue some elements
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		//Print the queue (Expected: 12, 0, 89, 77)
		q.printAll();
	}

}
