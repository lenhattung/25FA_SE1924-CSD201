
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
        listSt.add(new Student("00", "Nguyen Van A", 10));
        for (int i = 0; i < 35; i++) {
            listSt.add(new Student("ST" + i, "Nguyen Van " + i, i));
        }

        listSt.traverse();
        
//      MyList2 listSt2 = new MyList2();
    }
}
