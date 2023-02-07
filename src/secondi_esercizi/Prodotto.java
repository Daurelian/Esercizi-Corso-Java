package secondi_esercizi;

public class Prodotto {
    private String nome;
    private double prezzo;

    private int quantità;


    private boolean genereAlimentare;


    public Prodotto(String nome, double prezzo, int quantità, boolean genereAlimentare) {
        this.nome=nome;
        this.prezzo=prezzo;
        this.quantità=quantità;
        this.genereAlimentare=genereAlimentare;
    }

    public String getNome() {
        return nome;
    }

    public boolean isGenereAlimentare() {
        return genereAlimentare;
    }



    public int getQuantità() {
        return quantità;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }

    public void setGenereAlimentare(boolean genereAlimentare) {
        this.genereAlimentare = genereAlimentare;
    }

    public String toString(){
        return this.getNome();
    }
}
