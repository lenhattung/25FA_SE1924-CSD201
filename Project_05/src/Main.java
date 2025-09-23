
public class Main {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        // tạo một vài sinh viên
        Student s1 = new Student("S01", "Nguyen Van A", 6.5);
        Student s2 = new Student("S02", "Tran Thi B", 7.8);
        Student s3 = new Student("S03", "Le Van C", 4.9);

        // test enqueue
        System.out.println(">>> enqueue students vào queue:");
        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);

        // test front
        System.out.println("\n>>> phần tử dau hang (front):");
        System.out.println(queue.front());

        System.out.println("\nSize: " + queue.size());
        System.out.println("\n>>> dequeue students ra khỏi queue:");
        System.out.println(queue.dequeue());
        System.out.println("\nSize: " + queue.size());
        System.out.println("\n>>> clear queue:");
        queue.clear();
        System.out.println("\nSize: " + queue.size());

        // test queue rỗng
        System.out.println("\n>>> thử dequeue khi queue rỗng:");
        System.out.println(queue.dequeue()); // sẽ ra null
        
    }
}
