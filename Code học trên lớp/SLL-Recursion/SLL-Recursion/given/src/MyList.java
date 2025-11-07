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
    
    void traverse(){
        // hay viet lai ham traverse bang de quy
    }
    
    void loadData(int k) {
        for(int i = 0; i < k; i++) 
        {
            Random generator = new Random();
            int number = generator.nextInt(1000) + 1;
            addFirst(number);
        }
    }
     
    void addFirst(int n) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
		head = new Node(n, head);
        
        
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }
    
    
    void f1(){
        System.out.print("Linked list:   ");
        this.traverse();
    }
    
    // f2: ham addLast ==> du lieu nhap tu ban phim
    void f2(){
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------

       

        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }
    
    // f3: find Max
    void f3(){
        System.out.print("List:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------

       

        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }
    
    // f4: compute sum
    void f4() {
        System.out.print("List:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------

       

        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }
	
    // f5: count Node
    void f5() throws Exception {
        System.out.print("List:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------

       

        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }
}

