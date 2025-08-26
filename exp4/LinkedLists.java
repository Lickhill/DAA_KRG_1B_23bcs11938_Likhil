package exp4;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = prev = null;
    }
}

class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (temp.next == null) {
            head = null;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class CNode {
    int data;
    CNode next;

    CNode(int val) {
        data = val;
        next = this;
    }
}

class CircularLinkedList {
    private CNode tail;

    public CircularLinkedList() {
        tail = null;
    }

    public void insertAtBeginning(int val) {
        CNode newNode = new CNode(val);
        if (tail == null) {
            tail = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
    }

    public void insertAtEnd(int val) {
        CNode newNode = new CNode(val);
        if (tail == null) {
            tail = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteAtBeginning() {
        if (tail == null) {
            return;
        }
        CNode head = tail.next;
        if (head == tail) {
            tail = null;
            return;
        }
        tail.next = head.next;
    }

    public void deleteAtEnd() {
        if (tail == null) {
            return;
        }
        CNode head = tail.next;
        if (head == tail) {
            tail = null;
            return;
        }
        CNode temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = tail.next;
        tail = temp;
    }

    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        CNode temp = tail.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println();
    }
}

public class LinkedLists {
    public static void main(String[] args) {
        System.out.println("Doubly Linked List:");
        DoublyLinkedList obj1 = new DoublyLinkedList();
        obj1.insertAtBeginning(10);
        obj1.insertAtEnd(20);
        obj1.insertAtBeginning(5);
        obj1.display();
        obj1.deleteAtBeginning();
        obj1.display();
        obj1.deleteAtEnd();
        obj1.display();

        System.out.println("\nCircular Linked List:");
        CircularLinkedList obj2 = new CircularLinkedList();
        obj2.insertAtBeginning(10);
        obj2.insertAtEnd(20);
        obj2.insertAtBeginning(5);
        obj2.display();
        obj2.deleteAtBeginning();
        obj2.display();
        obj2.deleteAtEnd();
        obj2.display();
    }
}
