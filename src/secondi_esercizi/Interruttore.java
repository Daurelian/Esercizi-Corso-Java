package secondi_esercizi;

public class Interruttore {
    Lampadina lampadina;

    public Interruttore(){
        this.lampadina=new Lampadina();
    }
    public Interruttore(Lampadina lampadina){
        this.lampadina=lampadina;
    }
    public void click(){
        System.out.println("Hai azionato "+this.getClass().getSimpleName()+" interruttore");
        lampadina.click();
    }
}
