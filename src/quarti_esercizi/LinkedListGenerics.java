package quarti_esercizi;

public class LinkedListGenerics{
    private Node head ;

    private Node tail;

    private Node iterator;

    public Node getIterator() {
        return iterator;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public LinkedListGenerics() {
        this.head = new Node(null, tail, null);
        this.tail = new Node(null,null,head);
    }

    public void addNodes(Node node){
        if(head.getNext()==tail){
            head.setNext(node);
        }else{
            tail.getBefore().setNext(node);
        }
            node.setNext(tail);
            tail.setBefore(node);
    }

    public void removeNodes(Node node){
        if(head.getNext()==tail){
            System.out.println("Nessun nodo da rimuovere");
        }else
            tail.getBefore().getBefore().setNext(tail);
    }

    public void getList(){
        iterator=head;
        if(this.getHead().getNext()==tail){
            System.out.println("Nessuna lista da stampare");
            return;
        }while(this.getIterator().getNext()!=null){
            if(iterator.getValues()==null){
                iterator=this.getIterator().getNext();
                continue;
            }else{
                System.out.println(iterator);
                iterator=this.getIterator().getNext();
            }

        }
    }

    public void removeFirst(){
        Node temp;
        if(head.getNext()==tail){
            System.out.println("Nessun elemento da rimuovere");
        }else{
           temp= head.getNext().getNext();
           head.setNext(temp);
        }
    }

    public void addFirst(Node node){
        Node temp;
        if(head.getNext()==tail){
            head.setNext(node);
        }else{
            temp= head.getNext();
            head.setNext(node);
            node.setNext(temp);
        }
    }
}
