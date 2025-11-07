import java.util.*;
import java.io.*;

class MyTree {
    Node root;
    
    // Constructor
    MyTree() { this.root = null; }
 
    public Node insert_Rec(Node t, int x) 
{
	if (t.info > x)
		if (t.left == null)
			t.left = new Node (x);
		else
			t.left = insert_Rec(t.left, x);
	if (t.info < x)
		if (t.right == null)
			t.right = new Node (x);
		else
			t.right = insert_Rec(t.right, x);
	return t;
}


public Node insert(int x) 
{
	if (root == null)
		root = new Node (x);
	else
		root = insert_Rec(root, x);
	return root;
}
    
     public void load() // insert at the beginning
    {
        this.insert(10);
        this.insert(14);
        this.insert(7);
        this.insert(3);
        this.insert(2);
        this.insert(15);
        this.insert(9);
    }
 
    // Utility function to return top element in a stack
    public void preOrder()
    {
      

    }
    
    public void inOrder(Node p)
    {
      if(p==null) return;
      inOrder(p.left);
      System.out.println(p.info + "   ");
      inOrder(p.right);


    }
    public void postOrder()
    {
      

    }
    
    public void bft()
    {
      

    }
    
    public int computeHeight()
    {
        return 0;
    }
    
   public int countLeaf()
{
	return countLeaf_Rec(root);
}
public int countLeaf_Rec(Node t)
{
	if (t == null)
		return 0;
	if (t.left == null && t.right == null)
		return 1;
	return countLeaf_Rec(t.left) + countLeaf_Rec(t.right);
}
public int countNode()
{
	return countNode_Rec(root);
}
public int countNode_Rec(Node t)
{
	if (t == null)
		return 0;
	return countNode_Rec(t.left) + countNode_Rec(t.right) + 1;
}
   
 public boolean search (int k)
 {
   return true;
 }
 
 public int countLargerThan(int k)
{
	return countLargerThan_Rec(root, k);
}
public int countLargerThan_Rec(Node t, int k)
{
	if (t == null)
		return 0;
	if (t.info>k)
		return countLargerThan_Rec(t.left, k) + countLargerThan_Rec(t.right, k) + 1;
	return countLargerThan_Rec(t.right, k);
	// code nay chua duoc toi uu ==> co the viet ngan hon nua
	
}
    // some extensions: delete, rotation, balance, etc.
 
}
