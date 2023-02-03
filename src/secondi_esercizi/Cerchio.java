package secondi_esercizi;

import java.util.Arrays;

public class Cerchio {

    int raggio;
    Colore colore = new Colore();

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
