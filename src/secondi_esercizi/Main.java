package secondi_esercizi;

public class Main {

    public static void main(String[] args) {
        contatore();
        quadrato(4);
        cerchio(5);
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
    }

    public static void cerchio(int n){
    Cerchio cerchio= new Cerchio(n);
        System.out.println("Raggio :"+ cerchio.raggio);
        System.out.println("Circonferenza :"+ cerchio.calcolaCirconferenza());
        System.out.println("Area :"+cerchio.calcolaArea());
    }


}
