package secondi_esercizi;

public class Tecnico {
    private String nome;
    private Riparazione riparazione;

    public Tecnico(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public Riparazione getRiparazione() {
        return riparazione;
    }
}
