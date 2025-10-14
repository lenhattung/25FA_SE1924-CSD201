/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyQueue {
    Node head, tail;
    int count = 0;
    
    public MyQueue() {
        head = tail = null;
        count =0;
    }
    
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    
    public int size(){
        return count;
    }
    
    public void enqueue(Node newNode){
        if (isEmpty()){
            head = tail = newNode;
        }else{
            tail.next= newNode;
            tail = newNode;
        }
        count++;
    }
    
    public Node dequeue(){
        if (isEmpty()){
            return null;
        }else{
            Node temp = head;
            head = head.next;
            if (head ==null){
                tail=null;
            }
            count--;
            return temp;
        }
    }
}
