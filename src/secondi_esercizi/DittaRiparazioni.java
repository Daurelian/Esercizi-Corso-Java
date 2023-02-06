package secondi_esercizi;

import java.util.ArrayList;

public class DittaRiparazioni {
    ArrayList <Tecnico> tecnici= new ArrayList<>();
    ArrayList <Riparazione>riparazioni= new ArrayList<>();

    public DittaRiparazioni(){

    }
    public Tecnico[] getTecnici() {
        Tecnico[] array_tecnici= tecnici.toArray(new Tecnico[tecnici.size()]);
        return array_tecnici;
    }
    public Riparazione[] getRiparazioni() {
        Riparazione[] array_riparazioni= riparazioni.toArray(new Riparazione[riparazioni.size()]);
        return array_riparazioni;
    }

    public void addTecnico(Tecnico tecnico){
        tecnici.add(tecnico);
    }

    public void addRiparazioni(Riparazione riparazione){
        riparazioni.add(riparazione);
    }

    public Riparazione[] listaRiparazioniAttesa(){
        ArrayList<Riparazione> riparazioniInAttesa=new ArrayList<>();
            for(Riparazione riparazione: riparazioni){
                if(riparazione.tecnico==null)
                    riparazioniInAttesa.add(riparazione);
            }
        Riparazione[] array_riparazioni_attesa= riparazioniInAttesa.toArray(new Riparazione[riparazioniInAttesa.size()]);
            return array_riparazioni_attesa;
    }

    public void assegnaRiparazione(Tecnico tecnico, Riparazione riparazione){
        riparazione.tecnico=tecnico.getNome();
    }

    public Riparazione ottieniRiparazioneMaggioreP(){
        Riparazione maggiorePriorità= new Riparazione();
        int punteggio;
        int punteggio_base=0;
        for(Riparazione riparazione: riparazioni){
            if(riparazione.priorità== Riparazione.Priorità.DISASTRO){
                punteggio=4;
            } else if (riparazione.priorità== Riparazione.Priorità.ALTA) {
                punteggio=3;
            }
            else if (riparazione.priorità== Riparazione.Priorità.MEDIA) {
                punteggio=2;
            }
            else {
                punteggio=1;
            }
            if(punteggio>punteggio_base){
                maggiorePriorità=riparazione;
                punteggio_base=punteggio;
            }
        }
        return maggiorePriorità;
    }
}
