package terzi_esercizi;

public class Automobile extends Veicoli {
    protected int numeroPorte;


    public Automobile(String targa, int numeroPosti, int numeroPorte) {
        super(targa, numeroPosti);
        this.numeroPorte=numeroPorte;
    }

    @Override
    public String toString() {
        return super.toString()+":"+numeroPorte;
    }
}
