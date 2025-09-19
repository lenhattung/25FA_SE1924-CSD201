/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyDoublyLinkedList {

    Node head, tail;
    int count = 0;

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addLast(Student st) {
        Node newNode = new Node(st);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);//1
            newNode.setPrev(tail);// 2
            tail = newNode; // 3
        }
        count++;
    }

    public void addFirst(Student st) {
        Node newNode = new Node(st);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head); //1 
            head.setPrev(newNode); //2
            head = newNode; //3
        }
        count++;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            return; // Danh sách rỗng
        }
        head = head.getNext();
        count--;

        if (head == null) {
            // Nếu sau khi xóa head thì không còn phần tử nào
            tail = null;
        } else {
            head.setPrev(null);
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
            tail = tail.getPrev();
            tail.setNext(null);
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
            Node q = head;
            for (int i = 0; i < position; i++) {
                q = q.getNext();
            }
            Node p = q.getPrev();
            Node r = q.getNext();
            p.setNext(r);
            r.setPrev(p);
        }
    }

    public void traverse1() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getNext();
        }
    }
     public void traverse2() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getPrev();
        }
    }

    public int size() {
        return this.count;
    }

    public int find(String studentId) {
        // Tra ve vi tri cua ban sinh vien co studentId
        // Neu khong tim thay tra ve -1
        return -1;
    }

    public void add(Student st, int position) {
        // Thêm st vao vi tri: position
    }

    public int countPass(double value) {
        // Dem so luong sinh vien co gpa>= value

        return 0;
    }

    public int countByName(String name) {
        // Tra ve so luong sinh vien co ten 
        // co chua tu khoa la gia tri cua name;
        // goi y dung ham: indexOf
        return -1;
    }
}
