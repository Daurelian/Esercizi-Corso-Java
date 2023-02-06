package secondi_esercizi;

public class Lampadina {
    static boolean corrente= true;
    private Stato stato;
     enum Stato{
        SPENTO, ACCESO, ROTTO;
    }
    int contatore=0;
    int resistenza;

    public Lampadina() {
        this.stato = stato.SPENTO;

        resistenza=5;
    }

    public Lampadina(int resistenza) {
        this.stato = stato.SPENTO;
        this.resistenza=resistenza;
    }

    public Stato getStato() {
        return stato;
    }

    public void mostraStato(){
        if (stato==stato.SPENTO)
            System.out.println("Lampadina Spenta");
        else
            if (stato==stato.ACCESO)
                System.out.println("Lampadina Accesa");
            else
                System.out.println("Lampadina Rotta");
    }

    public void click(){
        if(!corrente){
            if(stato== stato.ROTTO)
                mostraStato();
                else
            stato= stato.SPENTO;
        }else{
            if(stato== stato.ROTTO){
                    mostraStato();
        }else{
                if(stato== stato.SPENTO){
                    stato= stato.ACCESO;

                }else{
                    stato=stato.SPENTO;
                }
                contatore++;
                checkContatore();
                if(stato==stato.ROTTO){
                    System.out.println("Boom!!!");
                }
            }
            }

    }

    public void checkContatore(){
        if (contatore>=resistenza){
            stato=stato.ROTTO;
        }

    }
    public void interruttoreCorrente(){
        corrente=!corrente;
        System.out.println(corrente?"La corrente è attaccata": "La corrente è staccata");
        checkCorrente();
    }
    public void checkCorrente(){
        //Se volessimo che le lampadine si accendano al ritorno della corrente
        if(corrente){
            if(stato!=stato.ROTTO){
                stato=stato.ACCESO;
            }
        }
        //Altrimenti solo la riga sotto per spegnerle quando si stacca la corrente
        else{
            if(stato!=stato.ROTTO) {
                stato=stato.SPENTO;
            }

        }

    }
}
