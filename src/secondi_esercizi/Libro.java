package secondi_esercizi;

public class Libro {

    private String titolo;
    private String autore;
    private String categoria;
    private int indice;

    public Libro(String titolo, String autore, String categoria, int indice){
        this.titolo=titolo;
        this.autore=autore;
        this.categoria=categoria;
        this.indice=indice;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getIndice() {
        return indice;
    }

    public String toString(){
        return "Indice: "+indice+", Titolo: "+titolo+ ", Autore: "+autore+", Categoria: "+categoria;
    }


}
