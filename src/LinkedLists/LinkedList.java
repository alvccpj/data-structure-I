package LinkedLists;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addOrdered(int data) {
        Node newNode = new Node(data);
    
        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
    
        Node current = head;
        while (current.next != null && data > current.next.data) {
            current = current.next;
        }
    
        newNode.next = current.next;
        current.next = newNode;
    }
    

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
