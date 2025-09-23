
public class Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // tạo một vài sinh viên
        Student s1 = new Student("S01", "Nguyen Van A", 6.5);
        Student s2 = new Student("S02", "Tran Thi B", 7.8);
        Student s3 = new Student("S03", "Le Van C", 4.9);

        // test push
        System.out.println(">>> push students vào stack:");
        stack.push(s1);
        stack.push(s2);
        stack.push(s3);

        // test peek
        System.out.println("\n>>> phần tử trên cùng (peek):");
        System.out.println(stack.peek());

        // test pop
        //        System.out.println("\n>>> pop students ra khỏi stack:");
        //        while (!stack.isEmpty()) {
        //            Student st = stack.pop();
        //            System.out.println("pop: " + st);
        //        }
        System.out.println("\nSize: " + stack.size());
        System.out.println("\n>>> pop students ra khỏi stack:");
        System.out.println(stack.pop());
        System.out.println("\nSize: " + stack.size());
        System.out.println("\n>>> clear stack:");
        stack.clear();
        System.out.println("\nSize: " + stack.size());

        // test stack rỗng
        System.out.println("\n>>> thử pop khi stack rỗng:");
        System.out.println(stack.pop()); // sẽ ra null
    }
}
