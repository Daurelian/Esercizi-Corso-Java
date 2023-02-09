package terzi_esercizi;

public class Veicoli {
    protected String targa;
   protected int numeroPosti;

    public Veicoli(String targa, int numeroPosti) {
        this.targa = targa;
        this.numeroPosti = numeroPosti;
    }

    public String toString(){
        return targa;
    }


}
