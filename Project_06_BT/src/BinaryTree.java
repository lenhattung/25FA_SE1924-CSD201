/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    //void insert(int x)  {... }
    void visit(Node p) {
        System.out.print(p.info+" ");
    }

    void preOrder(){
        preOrder(root);
    }
    
    void preOrder(Node p) {
        // root - left - right
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    
    void inOrder(){
        inOrder(root);
    }

    void inOrder(Node p) {
        // left - root - right
        if (p == null) {
            return;
        }
        preOrder(p.left);
        visit(p);
        preOrder(p.right);
    }

    void postOrder(){
        postOrder(root);
    }
    void postOrder(Node p) {
        // left -right - root
        if (p == null) {
            return;
        }
        preOrder(p.left);
        preOrder(p.right);
        visit(p);
    }
//    Node search(int x) {...}
//    void deleteByMerging(int x) {...}
//    void deleteByCopying(int x) {...}

}
