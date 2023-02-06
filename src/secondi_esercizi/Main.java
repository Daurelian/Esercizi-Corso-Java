package secondi_esercizi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        testContatore();
//        System.out.println();
//
//        testQuadrato(4);
//        System.out.println();
//
//        testCerchio(5);
//        System.out.println();
//
//        testColore();
//        System.out.println();

//        testLampadina();
//        System.out.println();
//
//        testInterruttori();
//        System.out.println();
//
//        testCorrente();
//        System.out.println();

//        testBiblioteca();
//        System.out.println();
//
//        testLibri();
//        System.out.println();

         testDittaRiparazioni();
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
        for(int i=0; i<10; i++){
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
                if(lampadinaTest.getStato()== Lampadina.Stato.ROTTO){
                    return "Operazione Conclusa perché la lampadina si è rotta";
                }
               return cicloInterruttori(interruttore1,interruttore2,lampadinaTest);
            }else if(checkInputInterruttori(input)==2){
                interruttore2.click();;
                interruttore2.lampadina.mostraStato();
                if(lampadinaTest.getStato()== Lampadina.Stato.ROTTO){
                    return "Operazione Conclusa perché la lampadina si è rotta";
                }
               return cicloInterruttori(interruttore1,interruttore2, lampadinaTest);
            }else {
                if(lampadinaTest.getStato()== Lampadina.Stato.ROTTO){
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

        public static void testCorrente(){
            Lampadina lampadina1= new Lampadina();
            Lampadina lampadina2= new Lampadina();
            System.out.println("TEST CORRENTE");
            System.out.println("Accendo lampadina 2 come test");
            lampadina2.click();
            lampadina2.mostraStato();
            System.out.println("Stacco la corrente");
            lampadina1.interruttoreCorrente();
            System.out.println();
            System.out.println("Stato lampadina 1:");
            lampadina1.mostraStato();
            System.out.println();
            System.out.println("Stato lampadina 2:");
            lampadina2.checkCorrente();
            lampadina2.mostraStato();
            System.out.println();
            System.out.println("Provo a clickare sulla prima lampadina");
            for(int i=0; i<8; i++){
                lampadina1.click();
                lampadina1.mostraStato();
            }
            System.out.println();
            System.out.println("Provo a clickare sulla seconda lampadina");
            for(int i=0; i<8; i++){
                lampadina2.click();
                lampadina2.mostraStato();
            }
            System.out.println();
            System.out.println("Riattacco la corrente");
            lampadina1.interruttoreCorrente();
            System.out.println();
            System.out.println("Stato lampadina 1:");
            lampadina1.mostraStato();
            System.out.println();
            System.out.println("Stato lampadina 2:");
            lampadina2.checkCorrente();
            lampadina2.mostraStato();
            System.out.println();
            System.out.println("Provo a clickare sulla prima lampadina");
            for(int i=0; i<8; i++){
                lampadina1.click();
                lampadina1.mostraStato();
            }
            System.out.println();
            System.out.println("Provo a clickare sulla seconda lampadina");
            for(int i=0; i<8; i++){
                lampadina2.click();
                lampadina2.mostraStato();
            }

        }

        public static void testBiblioteca(){
            int[] values = new int[7];
            values[0] = 123;
            values[1] = 4;
            values[2] = 98;
            values[3] = 33;
            values[4] = 76;
            values[5] = 2;
            values[6] = 235;
            Biblioteca biblioteca = new Biblioteca(values);
            System.out.println(biblioteca.esisteLibro(76));
            int[] libriOrdinati = biblioteca.getIndiciLibriOrdinati();
            System.out.println(libriOrdinati[0] == 2);
            System.out.println(libriOrdinati[1] == 4);
            System.out.println(libriOrdinati[2] == 33);
            System.out.println(libriOrdinati[3] == 76);
            System.out.println(libriOrdinati[4] == 98);
            System.out.println(libriOrdinati[5] == 123);
            System.out.println(libriOrdinati[6] == 235);
        }

        public static void testLibri(){
            Libro libro1 = new Libro("Titolo1", "Autore1", "Categoria1", 1);
            Libro libro2 = new Libro("Titolo2", "Autore2", "Categoria2", 2);
            Libro libro3 = new Libro("Titolo3", "Autore3", "Categoria3", 3);
            Libro libro4 = new Libro("Titolo4", "Autore4", "Categoria4", 4);
            Biblioteca biblioteca = new Biblioteca();
            biblioteca.aggiungiLibro(libro1);
            biblioteca.aggiungiLibro(libro2);
            biblioteca.aggiungiLibro(libro3);
            biblioteca.aggiungiLibro(libro4);

            biblioteca.getLibriOrdinati();
            for(Libro libro: Biblioteca.getLibri()){
                System.out.println(libro.toString());
            }
        }

        public static void testDittaRiparazioni(){
            Tecnico tecnico1 = new Tecnico("Giuseppe");
            Tecnico tecnico2 = new Tecnico("Michele");
            Tecnico tecnico3 = new Tecnico("Davide");
            Tecnico tecnico4 = new Tecnico("Lucrezia");

            DittaRiparazioni ditta= new DittaRiparazioni();
            ditta.addTecnico(tecnico1);
            ditta.addTecnico(tecnico2);
            ditta.addTecnico(tecnico3);
            ditta.addTecnico(tecnico4);

            Riparazione riparazione1= new Riparazione(Riparazione.Priorità.BASSA, "Via A");
            Riparazione riparazione2= new Riparazione(Riparazione.Priorità.MEDIA, "Via B");
            Riparazione riparazione3= new Riparazione(Riparazione.Priorità.ALTA, "Via C");
            Riparazione riparazione4= new Riparazione(Riparazione.Priorità.DISASTRO, "Via D");

            ditta.addRiparazioni(riparazione1);
            ditta.addRiparazioni(riparazione2);
            ditta.addRiparazioni(riparazione3);
            ditta.addRiparazioni(riparazione4);

            System.out.println("Lista di tutte le riparazioni");
            System.out.println(Arrays.toString(ditta.getRiparazioni()));

            ditta.assegnaRiparazione(tecnico1, riparazione1);
            ditta.assegnaRiparazione(tecnico2, riparazione2);
            System.out.println("Ho Assegnato due riparazioni, le rimanenti in attesa sono:");
            System.out.println(Arrays.toString(ditta.listaRiparazioniAttesa()));
            System.out.println();
            System.out.println("Prossima riparazione con priorità alta: ");
            System.out.println(ditta.ottieniRiparazioneMaggioreP().toString());
        }

}
