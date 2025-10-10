/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Node {
    char info;
    Node left, right;
    Node next;

    public Node(char info) {
        this.info = info;
        this.left = null;
        this.right = null;
        this.next = null;
    }

    public Node(char info, Node left, Node right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public char getInfo() {
        return info;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
     
    
}
