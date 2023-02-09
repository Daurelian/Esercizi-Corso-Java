package terzi_esercizi;

public class Autocarro extends Veicoli {
    protected int capacità;

    public Autocarro(String targa, int numeroPosti, int capacità) {
        super(targa, numeroPosti);
        this.capacità=capacità;
    }

    @Override
    public String toString() {
        return super.toString()+":"+capacità;
    }
}
