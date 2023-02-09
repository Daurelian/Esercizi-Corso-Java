package terzi_esercizi;

public class Bevanda {
    protected String codice;
    protected double prezzo;

    public Bevanda(String codice, double prezzo) {
        this.codice = codice;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return codice;
    }
}
