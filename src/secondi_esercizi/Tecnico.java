package secondi_esercizi;

public class Tecnico {

    private String nome;
    private Riparazione riparazione;

    private boolean assegnato=false;

    public Tecnico(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public Riparazione getRiparazione() {
        return riparazione;
    }

    public void setRiparazione(Riparazione riparazione) {
        this.riparazione = riparazione;
    }

    public void setAssegnato(boolean assegnato) {
        this.assegnato = assegnato;
    }

    public boolean isAssegnato() {
        return assegnato;
    }

    public String toString(){
        return "Il nome del tecnico è: "+this.nome;
    }
}

