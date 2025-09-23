// =========================================================
// Do NOT modify this file 
// =========================================================

class Node{
    int info;
    Node next;
    
    // Default constructor (no parameter)
    Node () {}
    
    // Constructor for a typical node
    Node (int x, Node p) {
        this.info = x; // data stored inside the node
        this.next = p; // link to the next node
    }
    
    //Copy constructor
    Node (int x) {
        this(x,null);
    }
    
 }

