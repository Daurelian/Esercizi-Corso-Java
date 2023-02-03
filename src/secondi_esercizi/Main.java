package secondi_esercizi;

public class Main {

    public static void main(String[] args) {
        contatore();
        quadrato(4);
        cerchio(5);
        colore();
        lampadina();
    }

    //Contatore
    public static void contatore(){
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

    public static void quadrato(int n){

        Quadrato quadrato= new Quadrato(n);
        System.out.println("Lato: :" +quadrato.lato);
        System.out.println("Perimetro :"+quadrato.calcolaPerimetro());
        quadrato.stampaQuadrato();
        System.out.println("Colore e Cambia Colore - Quadrato");
        quadrato.colore.stampaColore();
        quadrato.colore.setColore(5,6,7);
        quadrato.colore.stampaColore();
    }

    public static void cerchio(int n){
    Cerchio cerchio= new Cerchio(n);
        System.out.println("Raggio :"+ cerchio.raggio);
        System.out.println("Circonferenza :"+ cerchio.calcolaCirconferenza());
        System.out.println("Area :"+cerchio.calcolaArea());
        System.out.println("Colore e Cambia Colore - Cerchio");
        cerchio.colore.stampaColore();
        cerchio.colore.setColore(2,3,4);
        cerchio.colore.stampaColore();
    }

    public static void colore(){
        System.out.println("Colore e Cambia Colore - Classe colore");
    Colore colore = new Colore(22,55,77);
    colore.stampaColore();
    colore.setColore(33,66,88);
    colore.stampaColore();
    }

    public static void lampadina(){
        Lampadina lampadina = new Lampadina();
        lampadina.mostraStato();
        for(int i=0; i<5; i++){
            lampadina.click();
            lampadina.mostraStato();
        }
    }

}
