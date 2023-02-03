package secondi_esercizi;

public class Quadrato {
    int lato;

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
}
