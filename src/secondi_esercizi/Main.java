package secondi_esercizi;

public class Main {

    public static void main(String[] args) {
        proveContatore();
    }

    //Contatore
    public static void proveContatore(){
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
}
