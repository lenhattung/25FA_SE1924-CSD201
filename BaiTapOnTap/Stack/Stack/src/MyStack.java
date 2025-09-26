
import java.util.*;
import java.io.*;

class MyStack {

    Node top;

    // Constructor
    MyStack() {
        this.top = null;
    }

    public void push(int x) // insert at the beginning
    {
        Node newNode = new Node(x);
        newNode.setNext(top);
        top = newNode;
    }

    public void load() // insert at the beginning
    {
        this.push(10);
        this.push(14);
        this.push(7);
        this.push(7);
        this.push(3);
        this.push(2);
        this.push(15);
        this.push(9);
    }

    // Utility function to check if the stack is empty or
    // not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek() {
        if (isEmpty()) {
            return 0;
        } else {
            return top.getInfo();
        }
    }

    // Utility function to pop top element from the stack
    public int pop() // remove at the beginning
    {
        if (isEmpty()) {
            return 0;
        } else {
            int temp = top.getInfo();
            top = top.getNext();
            return temp;
        }
    }

    public void display() {
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.getInfo()+" ");
            temp = temp.getNext();
        }
    }

}
