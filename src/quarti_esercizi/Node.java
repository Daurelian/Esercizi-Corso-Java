package quarti_esercizi;

public class Node <T>{
    private T values;
    private Node next;

    private Node before;



    public Node(T values) {
        this.values = values;
        this.next=null;
        this.before=null;
    }

    public Node(T values, Node next, Node before) {
        this.values = values;
        this.next = next;
        this.before=before;
    }

    public T getValues() {
        return values;
    }

    public void setValues(T values) {
        this.values = values;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getBefore() {
        return before;
    }

    public void setBefore(Node before) {
        this.before = before;
    }

    @Override
    public String toString() {
        return "Node{" +
                "values=" + values +
                '}';
    }
}
