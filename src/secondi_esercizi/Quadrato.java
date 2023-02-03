package secondi_esercizi;

import java.util.Arrays;

public class Quadrato {
    int lato;
    Colore colore = new Colore();

    public Quadrato(int lato){
    this.lato=lato;

    }

    public int calcolaPerimetro(){
        return this.lato*4;
    }

    public void stampaQuadrato(){
        for (int i=0; i< lato; i++){
            for(int j=0; j<lato; j++){
                StringBuilder sb = new StringBuilder();
                sb.append("* ");
                System.out.print(sb);
            }
            System.out.println();
        }
        System.out.println();
    }

//    public void setColore(int r, int g, int b) {
//        this.colore[0] = r;
//        this.colore[1] = g;
//        this.colore[2] = b;
//    }
//
//    public void stampaColore(){
//        System.out.println(Arrays.toString(colore));
//    }

}
