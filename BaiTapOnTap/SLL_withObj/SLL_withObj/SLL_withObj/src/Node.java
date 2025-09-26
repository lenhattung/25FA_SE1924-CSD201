
public class Node {

    private Phone info;
    private Node next;

    Node() {
    }

    Node(Phone x, Node p) {
        this.info = x; // data stored inside the node
        this.next = p; // link to the next node
    }

    Node(Phone x) {
        this(x, null);
    }

    public Phone getInfo() {
        return info;
    }

    public void setInfo(Phone info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    

}

class Phone {
    private String name;
    private int price;

    Phone() {
    }

    Phone(String n, int p) {
        this.name = n; // data stored inside the node
        this.price = p; // link to the next node
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
