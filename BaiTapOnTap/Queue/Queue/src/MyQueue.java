
import java.util.*;
import java.io.*;

class MyQueue {

    Node head, tail;

    public MyQueue() {
        this.head = this.tail = null;
    }

    // Method to add an key to the queue.
    void enqueue(int key) {
        Node newNode = new Node(key);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // Method to remove an key from queue.
    int dequeue() {
        if (isEmpty()) {
            return 0;
        } else {
            int temp = head.getInfo();
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            return temp;
        }
    }

    public void load() // insert at the beginning
    {
        this.enqueue(10);
        this.enqueue(14);
        this.enqueue(7);
        this.enqueue(7);
        this.enqueue(3);
        this.enqueue(2);
        this.enqueue(15);
        this.enqueue(9);
    }

    // Utility function to check if the stack is empty or
    // not
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    // Utility function to return top element in a stack
    public int front() {
        if (isEmpty()) {
            return 0;
        } else {
            int temp = head.getInfo();
            return temp;
        }
    }

    public void display() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.getInfo()+" ");
            temp = temp.getNext();
        }
    }

    void enqueueWithPriority(int key, int priority_level) {

    }

}
