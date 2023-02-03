package secondi_esercizi;

public class Colore {

int[] colore=new int[3];



    public Colore(){
        this.colore[0]=0;
        this.colore[1]=0;
        this.colore[2]=0;
    }
    public Colore(int r, int g, int b){
    this.colore[0]=r;
    this.colore[1]=g;
    this.colore[2]=b;
    }

    public void stampaColore(){
        System.out.println("Stampa dei Colori");
        System.out.println("R: " + colore[0]);
        System.out.println("G: " + colore[1]);
        System.out.println("B: " + colore[2]);
        System.out.println();
    }
    public int[] getBianco() {
        final int[] bianco={255,255,255};
        return bianco;
    }

    public int[] getNero() {
        final int[] nero={0,0,0};
        return nero;
    }

    public void setColore(int r, int g, int b) {
        this.colore[0] = r;
        this.colore[1] = g;
        this.colore[2] = b;
    }
}
