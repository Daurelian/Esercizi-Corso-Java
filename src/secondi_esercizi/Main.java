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

//         testDittaRiparazioni();
//         System.out.println();
//            testNegozio();
//            System.out.println();
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
            System.out.println("Lista dei tecnici");
            System.out.println(Arrays.toString(ditta.getTecnici()));
            System.out.println();

            System.out.println("Provo ad aggiungere lo stesso tecnico");
            ditta.addTecnico(tecnico1);
            System.out.println();
            System.out.println("Lista dei tecnici");
            System.out.println(Arrays.toString(ditta.getTecnici()));

            System.out.println("Lista di tutte le riparazioni");
            System.out.println(Arrays.toString(ditta.getRiparazioni()));

            ditta.assegnaRiparazione(tecnico1, riparazione1);
            ditta.assegnaRiparazione(tecnico2, riparazione2);
            System.out.println("Ho Assegnato due riparazioni, le rimanenti in attesa sono:");
            System.out.println(Arrays.toString(ditta.listaRiparazioniAttesa()));
            System.out.println();
            System.out.println("Provo ad assegnare lo stesso tecnico");
            ditta.assegnaRiparazione(tecnico1, riparazione1);
            System.out.println();
            System.out.println("Prossima riparazione con priorità alta: ");
            System.out.println(ditta.ottieniRiparazioneMaggioreP().toString());
            ditta.riparazioneConclusa(tecnico2);
            System.out.println();

            System.out.println("Mando in ferie due tecnici");
            Tecnico[] tecniciFerie= new Tecnico[2];
            tecniciFerie[0]=tecnico3;
            tecniciFerie[1]=tecnico4;
            ditta.mandainFerie(tecniciFerie);
            System.out.println();

            System.out.println("Lista dei tecnici");
            System.out.println(Arrays.toString(ditta.getTecnici()));

            System.out.println("Provo a mandare in ferie i tecnici occupati");
            Tecnico[] tecniciFerie2= new Tecnico[2];
            tecniciFerie2[0]=tecnico1;
            tecniciFerie2[1]=tecnico2;
            ditta.mandainFerie(tecniciFerie2);
        }

        public static void testNegozio(){
            Prodotto prodotto1= new Prodotto("mela",2.00,30,true);
            Prodotto prodotto2= new Prodotto("pera",1.00,50,true);
            Prodotto prodotto3= new Prodotto("camicia",20.00,10,false);
            Prodotto prodotto4= new Prodotto("pasta",1.75,200,true);
            Prodotto prodotto5= new Prodotto("passata",2.50,15,true);
            Prodotto prodotto6= new Prodotto("maglietta",35.00,12,false);
            Prodotto prodotto7= new Prodotto("felpa",35.00,14,false);
            Negozio negozio= new Negozio();
            System.out.println("Aggiungiamo singoli prodotti/n");
            System.out.println();
            negozio.aggiungiProdottoInventario(prodotto1);
            negozio.aggiungiProdottoInventario(prodotto2);
            negozio.aggiungiProdottoInventario(prodotto3);
            negozio.aggiungiProdottoInventario(prodotto4);
            negozio.aggiungiProdottoInventario(prodotto5);
            negozio.aggiungiProdottoInventario(prodotto6);
            negozio.aggiungiProdottoInventario(prodotto7);
            negozio.stampaQuantitàProdotti();
            System.out.println();
            System.out.println("Aggiungiamo gli stessi prodotti e vediamo le quantità");
            System.out.println();
            negozio.aggiungiProdottoInventario(prodotto1);
            negozio.aggiungiProdottoInventario(prodotto1);
            negozio.aggiungiProdottoInventario(prodotto1);
            negozio.aggiungiProdottoInventario(prodotto2);
            negozio.aggiungiProdottoInventario(prodotto3);
            negozio.aggiungiProdottoInventario(prodotto4);
            negozio.aggiungiProdottoInventario(prodotto5);
            negozio.aggiungiProdottoInventario(prodotto5); //qui
            negozio.stampaQuantitàProdotti();
            System.out.println();
            System.out.println("Rimuoviamo le mele");
            negozio.rimuoviProdottoInventario(prodotto1);
            negozio.stampaQuantitàProdotti();
            System.out.println();
            System.out.println("Rimuoviamo ancora le mele");
            negozio.rimuoviProdottoInventario(prodotto1);
            negozio.stampaQuantitàProdotti();
            System.out.println();
            System.out.println("Rimuoviamo più felpe di quelle che avremmo");
            Prodotto prodotto8= new Prodotto("felpa",35.00,33,false);
            negozio.rimuoviProdottoInventario(prodotto8);
            System.out.println();
            negozio.stampaQuantitàProdotti();
            System.out.println();
            System.out.println("Creo un cliente");
            Cliente giggino=new Cliente("Giggino", 72);
            System.out.println();
            System.out.println("Aggiungo prodotti al carrello");
            giggino.aggiungiProdottoCarrello(prodotto1);
            giggino.aggiungiProdottoCarrello(prodotto2);
            giggino.aggiungiProdottoCarrello(prodotto3);
            giggino.aggiungiProdottoCarrello(prodotto4);
            giggino.aggiungiProdottoCarrello(prodotto5);
            giggino.aggiungiProdottoCarrello(prodotto5); //qui
            System.out.println("Visualizzo il suo carrello");
            giggino.stampaQuantitàCarrello();
            System.out.println();
            System.out.println("Faccio un check del carrello per essere sicuro che ci siano solo prodotti del Negozio");
            System.out.println(Arrays.toString(negozio.checkCarrello(giggino)));
            System.out.println("Provo ad aggiungere un prodotto non esistente");
            Prodotto prodottoFalso= new Prodotto("ferro da stiro", 0.0, 22, false);
            giggino.aggiungiProdottoCarrello(prodottoFalso);
            giggino.stampaQuantitàCarrello();
            System.out.println("Faccio il check");
            System.out.println(Arrays.toString(negozio.checkCarrello(giggino)));
            System.out.println("Check riuscito");
            System.out.println();
            System.out.println("Vado alla cassa");
            System.out.println("E' lunedì, il totale da pagare è");
            negozio.visualizzaGiorno();
            System.out.println(negozio.cassa(giggino));
            System.out.println();
            System.out.println("Mettiamo un giorno casuale e vediamo il totale");
            System.out.println();
            negozio.giornoCasuale();
            negozio.visualizzaGiorno();
            System.out.println("Faccio il check");
            System.out.println(Arrays.toString(negozio.checkCarrello(giggino)));
            System.out.println("Check riuscito");
            System.out.println(negozio.cassa(giggino));
            System.out.println("Vediamo se finite le scorte paga");
            System.out.println("Faccio il check");
            System.out.println(Arrays.toString(negozio.checkCarrello(giggino)));
            System.out.println("Check riuscito");
            System.out.println(negozio.cassa(giggino));


        }

}
