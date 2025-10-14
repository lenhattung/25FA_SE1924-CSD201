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
        
        Node f = new Node('f');
       

        BinarySearchTree b1 = new BinarySearchTree(f);
        b1.insert('e');
        b1.insert('a');
        b1.insert('b');
        b1.insert('d');
        b1.insert('c');
        b1.insert('i');
        b1.insert('h');
        b1.insert('g');
        
        b1.printTree();
        
        System.out.print("\n Pre-order traversal: ");
        b1.preOrder();

        System.out.print("\n In-order traversal: ");
        b1.inOrder();

        System.out.print("\n Post-order traversal: ");
        b1.postOrder();

        System.out.print("\n Breadth-frist traversal: ");
        b1.breadth();
    }
}
