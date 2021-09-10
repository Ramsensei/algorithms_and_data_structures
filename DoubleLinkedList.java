public class DoubleLinkedList {
	private Node head;
	private Node rear;
    private int size;
    
    // Constructor
    public DoubleLinkedList() {
    	this.head = null;
    	this.rear = null;
    	this.size = 0;
    }
    
    
	// Getters and Setters
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getRear() {
		return rear;
	}
	public void setRear(Node rear) {
		this.rear = rear;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	// Methods
	public void insertRear(Object data) {
		Node newNode = new Node(data);
		if (this.head != null) {
			newNode.prev = this.rear;
			this.rear.next = newNode;
			this.rear = newNode;
			this.size++; 
		}
		else {
			this.head = newNode;
			this.rear = this.head;
		}
	}
	
	public Node deleteFirst() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            if(this.head != null)this.head.prev = null;
            this.size--;
            return temp;
        } else {
            return null;
        }
    }
	
	 
}
