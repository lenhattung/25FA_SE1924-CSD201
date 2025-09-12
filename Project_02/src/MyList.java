/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyList {

    Node head, tail;
    int count = 0;

    public MyList() {
        head = null;
        tail = null;
        count = 0;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addLast(Student st) {
        Node newNode = new Node(st, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public void addFirst(Student st) {
        Node newNode = new Node(st, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; //1 
            head = newNode; //2
        }
        count++;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            return; // Danh sách rỗng
        }
        head = head.next;
        count--;

        if (head == null) {
            // Nếu sau khi xóa head thì không còn phần tử nào
            tail = null;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            return;
        }

        if (head == tail) {
            // Chỉ có 1 phần tử
            head = null;
            tail = null;
        } else {
            Node current = head;
            // Tìm ra node truoc node cuoi cung
            for (int i = 0; i < size() - 1; i++) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        count--;
    }

    public void delete(int position) {
        if (position < 0 || position >= count) {
            return;
        }

        if (position == 0) {
            deleteFirst();
        } else if (position == count - 1) {
            deleteLast();
        } else {
            Node prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            count--;
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getNext();
        }
    }

//    public int size(){
//        Node temp = head;
//        int count =0;
//        while(temp!=null){
//            count++;
//            temp = temp.getNext();
//        }
//        return count;
//    }
    public int size() {
        return this.count;
    }
}
