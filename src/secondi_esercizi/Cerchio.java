package secondi_esercizi;

public class Cerchio {

    int raggio;

    public Cerchio(int raggio){
        this.raggio=raggio;
    }

    public int calcolaCirconferenza(){
        return (int) (2*raggio*Math.PI);
    }



    public int calcolaArea() {
        return (int) (2*Math.PI*Math.pow(raggio,2));
    }


}
