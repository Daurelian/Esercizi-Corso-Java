package terzi_esercizi;

public class Main {
    public static void main(String[] args) {
        testForme();
        testVeicoli();
        testDistributore();
    }

    public static void testForme(){
    System.out.println("Creo Rettangolo");
    System.out.println();
    Rettangolo rettangolo= new Rettangolo(5,6);
    System.out.println("Perimetro: ");
    System.out.println(rettangolo.getPerimetro());;
    System.out.println("Area: ");
    System.out.println(rettangolo.getArea());
    System.out.println("Stringa: ");
    System.out.println(rettangolo.toString());
    System.out.println();
    System.out.println("Creo Quadrato: ");
    System.out.println();
    Quadrato quadrato= new Quadrato(5);
    System.out.println("Perimetro: ");
    System.out.println(quadrato.getPerimetro());;
    System.out.println("Area: ");
    System.out.println(quadrato.getArea());
    System.out.println("Stringa: ");
    System.out.println(quadrato.toString());
    System.out.println();

}
    public static void testVeicoli(){
        System.out.println("Creo un Automobile");
        System.out.println();
        Automobile automobile= new Automobile("cf123rm", 4, 4);
        System.out.println("Stampo: ");
        System.out.println(automobile.toString());
        System.out.println();
        System.out.println("Creao un Autocarro");
        System.out.println();
        Autocarro autocarro= new Autocarro("ca133sm", 4, 2);
        System.out.println("Stampo: ");
        System.out.println(autocarro.toString());
        System.out.println();
    }
    public static void testDistributore(){
        System.out.println("Creo caffe e cappuccino");
        Caffe caffe = new Caffe();
        Cappuccino cappuccino = new Cappuccino();
        System.out.println("Creo Distributore di Bevande");
        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande(10);
        System.out.println("Aggiungo caffe");
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        System.out.println("Lista Prodotti");
        distributoreDiBevande.stampaProdotti();
        System.out.println("Utente Controlla il saldo e il resto");
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto() == 0);
        System.out.println("Utente inserisce denaro (0.4)");
        distributoreDiBevande.inserisciImporto(0.4);
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println("Utente sceglie cappuccino");
        distributoreDiBevande.scegliProdotto("cappuccino");
        System.out.println();
        System.out.println("Lista Prodotti");
        distributoreDiBevande.stampaProdotti();
        System.out.println("Utente inserisce denaro (0.8) e risceglie cappuccino");
        distributoreDiBevande.inserisciImporto((0.8));
        distributoreDiBevande.scegliProdotto("cappuccino");
        System.out.println();
        System.out.println("Lista Prodotti");
        distributoreDiBevande.stampaProdotti();
        System.out.println("Utente chiede il resto");
        distributoreDiBevande.getResto();
        System.out.println("Utente sceglie il the");
        distributoreDiBevande.scegliProdotto("the");
        System.out.println();
    }
}

