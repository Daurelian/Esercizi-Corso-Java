package secondi_esercizi;

public class Colore {

int[] colore=new int[3];



    public Colore(){
        this.colore[0]=255;
        this.colore[1]=255;
        this.colore[2]=255;
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
        final int[] bianco={0,0,0};
        return bianco;
    }

    public int[] getNero() {
        final int[] nero={255,255,255};
        return nero;
    }

    public void setColore(int r, int g, int b) {
        this.colore[0] = r;
        this.colore[1] = g;
        this.colore[2] = b;
    }
}
