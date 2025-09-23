/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyStack {

    Node top;
    int count = 0;

    public MyStack() {
        top = null;
        count = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Student st) {
        Node newNode = new Node(st);
        newNode.setNext(top);
        top = newNode;
        count++;
    }

    // Utility function to pop top element from the stack
    public Student pop() {
        if(isEmpty())
            return null;
        
        Student temp = top.getInfo();
        top = top.getNext();
        
        count--;
        return temp;
    }

    
    // Utility function to return top element in a stack
    public Student peek() {
        if(isEmpty())
            return null;
        
        Student temp = top.getInfo();
        return temp;
    }
    
    // size
    //    public int size(){
    //        Node temp = top;
    //        int count = 0;
    //        while(temp!=null){
    //            count++;
    //            temp = temp.getNext();
    //        }
    //        return count;
    //    }
    public int size(){
        return count;
    }
    
    public void clear(){
      top = null;
      count =0;
    }
}
