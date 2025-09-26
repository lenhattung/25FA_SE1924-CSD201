
import java.util.*;
import java.io.*;

public class MyList {

    Node head;

    MyList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void clear() {
        this.head = null;
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.getInfo());
            System.out.print("   ");
            p = p.getNext();
        }
    }

    void loadData(int k) {
        for (int i = 0; i < k; i++) {
            Random generator = new Random();
            int number = generator.nextInt(1000) + 1;
            addFirst(number);
        }
    }

    void addFirst(int n) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }

    void addLast(int n) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            // Tim ra node cuoi
            Node tail = head;
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            // thêm vào cuoi
            tail.setNext(newNode);
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }

    void addPos(int n, int k) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n, null);
        Node temp = head;
        // 0 1 2 3 4
        // Tim vi tri truoc node can them
        for (int i = 0; i < k - 1; i++) {
            if (temp != null) {
                temp = temp.getNext();
            }
        }
        if (temp != null) {
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            // p -> x -> [q] -> r
            // newNOde.setNext q
            // p.setNext = newNode

        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }

    void f1() {
        System.out.print("Linked list:   ");
        this.traverse();
    }

    // f2: ham addLast ==> du lieu nhap tu ban phim
    void f2() {
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        try {
            int n = sc.nextInt();
            addLast(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }

    // f3: ham addPos ==> them node vao vi tri thu k, trong do node moi va chi so k duoc nhap tu ban phim
    void f3() {
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input n: ");
            int n = sc.nextInt();

            System.out.print("Input k: ");
            int k = sc.nextInt();

            addPos(n, k);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }

    // f4: removeFirst
    void f4() {
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if (isEmpty()) {
            return;
        } else {
            head = head.getNext();
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }

    // f5: removeLast
    void f5() throws Exception {
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if (isEmpty()) {
            return;
        } else {
            if (head.getNext() == null) {
                head = null;
            } else {
                // Tim ra node cuoi
                Node beForeTail = head;
                while (beForeTail.getNext() != null && beForeTail.getNext().getNext() != null) {
                    beForeTail = beForeTail.getNext();
                }
                // xoa node cuoi
                beForeTail.setNext(null);
            }
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }
}
