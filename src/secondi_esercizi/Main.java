package secondi_esercizi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testContatore();
        System.out.println();

        testQuadrato(4);
        System.out.println();

        testCerchio(5);
        System.out.println();

        testColore();
        System.out.println();

        testLampadina();
        System.out.println();

        testInterruttori();
        System.out.println();

    }

    //Contatore
    public static void testContatore(){
        Contatore contatore = new Contatore(22);
        contatore.incrementaContatore();
        System.out.println(contatore.getContatore());
        contatore.resettaContatore();
        System.out.println(contatore.getContatore());
        contatore.setContatore(50);
        System.out.println(contatore.getContatore());
        Contatore contatore2= new Contatore();
        contatore2.incrementaContatore();
        System.out.println(contatore2.getContatore());
    }

    public static void testQuadrato(int n){

        Quadrato quadrato= new Quadrato(n);
        System.out.println("Lato: :" +quadrato.lato);
        System.out.println("Perimetro :"+quadrato.calcolaPerimetro());
        quadrato.stampaQuadrato();
        System.out.println("Colore e Cambia Colore - Quadrato");
        quadrato.colore.stampaColore();
        quadrato.colore.setColore(5,6,7);
        quadrato.colore.stampaColore();
    }

    public static void testCerchio(int n){
    Cerchio cerchio= new Cerchio(n);
        System.out.println("Raggio :"+ cerchio.raggio);
        System.out.println("Circonferenza :"+ cerchio.calcolaCirconferenza());
        System.out.println("Area :"+cerchio.calcolaArea());
        System.out.println("Colore e Cambia Colore - Cerchio");
        cerchio.colore.stampaColore();
        cerchio.colore.setColore(2,3,4);
        cerchio.colore.stampaColore();
    }

    public static void testColore(){
        System.out.println("Colore e Cambia Colore - Classe colore");
    Colore colore = new Colore(22,55,77);
    colore.stampaColore();
    colore.setColore(33,66,88);
    colore.stampaColore();
    }

    public static void testLampadina(){
        Lampadina lampadina = new Lampadina();
        lampadina.mostraStato();
        for(int i=0; i<5; i++){
            lampadina.click();
            lampadina.mostraStato();
        }
    }

    public static void testInterruttori(){
        System.out.println("TEST CON DUE INTERRUTTORI");
        Lampadina lampadinaTest=  new Lampadina();
        Interruttore interruttore1= new Interruttore(lampadinaTest);
        Interruttore interruttore2= new Interruttore(lampadinaTest);
        System.out.println(cicloInterruttori(interruttore1, interruttore2, lampadinaTest));

        }
        public static String cicloInterruttori(Interruttore interruttore1, Interruttore interruttore2, Lampadina lampadinaTest){
            Scanner scan = new Scanner(System.in);
            System.out.println("1->primo interruttore; 2 -> secondo interruttore; 3-> Interrompi");
            int input = scan.nextInt();

            if(checkInputInterruttori(input)==1){
                interruttore1.click();
                interruttore1.lampadina.mostraStato();
                if(lampadinaTest.stato[2]==1){
                    return "Operazione Conclusa perché la lampadina si è rotta";
                }
               return cicloInterruttori(interruttore1,interruttore2,lampadinaTest);
            }else if(checkInputInterruttori(input)==2){
                interruttore2.click();;
                interruttore2.lampadina.mostraStato();
                if(lampadinaTest.stato[2]==1){
                    return "Operazione Conclusa perché la lampadina si è rotta";
                }
               return cicloInterruttori(interruttore1,interruttore2, lampadinaTest);
            }else {
                if(lampadinaTest.stato[2]==1){
                    return "Operazione Conclusa perché la lampadina si è rotta";
                }
               return "Operazione Conclusa";
            }
        }
        public static int checkInputInterruttori(int input) {

            switch (input) {
                case 1:
                case 2:
                case 3:
                    return input;
                default:

                    return checkInputInterruttori(input);
            }
        }
}
