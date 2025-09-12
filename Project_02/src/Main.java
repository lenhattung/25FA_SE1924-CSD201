
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        int n = 10;
//        int[] a = new int[n];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i;
//        }
//        
//        for (int i : a) {
//            System.out.print(i+ " ");
//        }

        Node n1 = new Node(new Student("01", "Tung", 10));
        Node n2 = new Node(new Student("02", "Le", 8));
        Node n3 = new Node(new Student("03", "Nhat", 1));

        n1.setNext(n2);
        n2.setNext(n3);

        //ArrayList<Student> list = new ArrayList<>();
        MyList listSt = new MyList();
        listSt.addLast(new Student("00", "Nguyen Van A", 10));
        for (int i = 0; i < 1; i++) {
            listSt.addLast(new Student("ST" + i, "Nguyen Van " + i, i));
        }

        listSt.traverse();
        System.out.println(listSt.size());
        System.out.println("=====");
        listSt.delete(5);
        listSt.traverse();

        System.out.println("=====");
        listSt.delete(0);
        listSt.traverse();

        System.out.println("=====");
        listSt.delete(listSt.size()-1);
        listSt.traverse();
//     
    }
}
