
import java.util.*;
import java.io.*;

class MyTree {

    Node root;

    MyTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node p, int value) {
        if (p == null) {
            p = new Node(value);
        } else if (value < p.info) {
            p.left = insertRec(p.left, value);
        } else if (value > p.info) {
            p.right = insertRec(p.right, value);
        }
        return p;
    }

    public void load() {
        insert(20);
        insert(10);
        insert(30);
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        insert(100);

    }

    int search(Node p, int x) {
        if (p == null) {
            return 0;
        }
        if (p.info == x) {
            return 1;
        }
        if (x < p.info) {
            return (search(p.left, x));
        } else {
            return (search(p.right, x));
        }
    }

    public int f1() {
        return 0;
    }

    public int f2() {
        return 0;
    }

    public int f3() {
        return 0;
    }

    public int f4() {
        return 0;
    }

    void visit(Node p) {
        System.out.print(p.info + "  ");
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void f5() {
        preOrder(root);
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void f6() {
        inOrder(root);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    void f7() {
        postOrder(root);
    }

    int f8(int n) {
        return search(root, n);
    }

}
