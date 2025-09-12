/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyList2 {

    Node head, tail;

    public MyList2() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
//        if(head==null && tail==null){
//            return true;
//        }else{
//            return false;
//        }

        return head == null && tail == null;
    }

    public void add(Student st) {
        if (st != null && st.getGpa() >= 5) {
            Node newNode = new Node(st, null);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getNext();
        }
    }
}
