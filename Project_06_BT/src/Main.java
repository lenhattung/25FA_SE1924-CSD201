/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Main {

    public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node i = new Node('I');

        d.left = c;
        d.right = e;
        b.left = a;
        b.right = d;
        i.left = h;
        g.right = i;
        f.left = b;
        f.right = g;

        BinaryTree bt = new BinaryTree();
        bt.root = f;
        System.out.println("\nPre-Order Traversal:");
        bt.preOrder();
        System.out.println("\nIn-Order Traversal:");
        bt.inOrder();
        System.out.println("\nPost-Order Traversal:");
        bt.postOrder();
        System.out.println("\nBreadth Traversal:");
        bt.breadth();
    }
}
