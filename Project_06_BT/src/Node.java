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

    public Node(char info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

    public Node(char info, Node left, Node right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }
        
}
