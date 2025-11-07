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
        Node p = head;
        while(p != null) {
            System.out.print(p.info);
            System.out.print("   ");
            p = p.next;
        }
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

        
        
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }
    
    void addLast(int n) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        
       
        
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
    
    // f3: ham addPos ==> them node vao vi tri thu k, trong do node moi va chi so k duoc nhap tu ban phim
    void f3(){
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------

       

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

       

        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }
}

