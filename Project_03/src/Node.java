public class Node {
    private Student info;
    private Node next;
    private Node prev;

    public Node(Student info) {
        this.info = info;
    }

    
    public Node(Student info, Node next, Node prev) {
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

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    
}
