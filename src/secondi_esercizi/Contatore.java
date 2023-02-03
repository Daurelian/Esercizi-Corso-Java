package secondi_esercizi;

public class Contatore {
    int contatore;

    public Contatore(){
        this.contatore=0;
    }
    public Contatore(int values){
        this.contatore=values;
    }

    public void incrementaContatore(){
        this.contatore+=1;
    }

    public int getContatore() {
        return contatore;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }
    public void resettaContatore(){
        this.contatore=0;
    }

}
