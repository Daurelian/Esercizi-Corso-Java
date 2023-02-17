package quarti_esercizi;

public class Main {
    public static void main(String[] args) {
        LinkedListGenerics list= new LinkedListGenerics();
        Node<Integer> node1= new Node<>(1);
        Node<Integer> node2= new Node<>(2);
        Node<Integer> node3= new Node<>(3);
        Node<Integer> node4= new Node<>(4);
        Node<Integer> node5= new Node<>(5);

        System.out.println("Creo lista e aggiungo nodi");
        list.addNodes(node1);
        list.addNodes(node2);
        list.addNodes(node3);
        list.addNodes(node4);
        list.addNodes(node5);

        System.out.println("\nStampo la lista");
        list.getList();
        System.out.println("\nRimuovo il primo");
        list.removeFirst();
        list.getList();
        System.out.println("\nAggiungo il primo");
        list.addFirst(node1);
        list.getList();
        System.out.println("\nRimuovo ultimo nodo");
        list.removeLastNodes();
        list.getList();
        System.out.println("\nE lo riaggingo");
        list.addNodes(node5);
        list.getList();
        System.out.println("\nRimuovo tutti i nodi");
        list.removeLastNodes();
        list.removeLastNodes();
        list.removeLastNodes();
        list.removeLastNodes();
        list.removeLastNodes();
        list.getList();
        System.out.println("\nLi riaggiungo");
        list.addNodes(node1);
        list.addNodes(node2);
        list.addNodes(node3);
        list.addNodes(node4);
        list.addNodes(node5);
        list.getList();
        System.out.println("\nVedo il primo elemento della lista");
        list.peek();
    }


}
