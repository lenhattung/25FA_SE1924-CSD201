public class Node {
    Student info;
    Node next;

    public Node(Student info) {
        this.info = info;
    }

    
    public Node(Student info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Student getInfo() {
        return info;
    }

    public void setInfo(Student info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
