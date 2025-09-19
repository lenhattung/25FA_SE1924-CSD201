
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Node n1 = new Node(new Student("01", "Tung", 10));
        Node n2 = new Node(new Student("02", "Le", 8));
        Node n3 = new Node(new Student("03", "Nhat", 1));

        n1.setNext(n2);
        n2.setNext(n3);

        //ArrayList<Student> list = new ArrayList<>();
        MyDoublyLinkedList listSt = new MyDoublyLinkedList();
        listSt.addLast(new Student("00", "Nguyen Van A", 10));
        for (int i = 0; i < 10; i++) {
            listSt.addLast(new Student("ST" + i, "Nguyen Van " + i, i));
        }

        listSt.traverse1();
        System.out.println(listSt.size());
        System.out.println("=====");
        listSt.traverse2();
        System.out.println(listSt.size());
        System.out.println("=====");
        listSt.delete(5);
        listSt.traverse1();

        System.out.println("=====");
        listSt.delete(0);
        listSt.traverse1();

        System.out.println("=====");
        listSt.delete(listSt.size()-1);
        listSt.traverse1();
//     
    }
}
