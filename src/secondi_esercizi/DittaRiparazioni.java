package secondi_esercizi;

import java.util.ArrayList;
import java.util.Arrays;

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
        if(checkTecnici(tecnico)){
            tecnici.add(tecnico);
        }else{
            System.out.println("Esiste già questo tecnico");
        }
    }
    public boolean checkTecnici(Tecnico tecnico){
        for(Tecnico c_tecnico: tecnici){
            if(c_tecnico.getNome()==tecnico.getNome())
                return false;
        }
        return true;
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
        if(!tecnico.isAssegnato()){
            riparazione.tecnico=tecnico.getNome();
            tecnico.setAssegnato(true);
            tecnico.setRiparazione(riparazione);
        }else
            System.out.println("Tecnico già assegnato");
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

    public void riparazioneConclusa(Tecnico tecnico){
        int count=0;
        ArrayList<Riparazione> riparazioniAggiornate= new ArrayList<>();
        for(Riparazione riparazione: riparazioni){
            if(riparazione.tecnico==tecnico.getNome()){
                riparazione.conclusa=true;
                System.out.println("La riparazione è conclusa con successo!");

            }else{
                riparazioniAggiornate.add(riparazione);
                count++;
            }
        }
        if(count==riparazioni.size()){
            System.out.println("Nessuna riparazione trovata con quel tecnico");
        }else{
            riparazioni=riparazioniAggiornate;
            System.out.println("Ecco la lista delle riparazioni rimanenti:");
            System.out.println(Arrays.toString(getRiparazioni()));
        }
    }

    public void mandainFerie(Tecnico[] tecniciFerie){
        for(Tecnico tecnicoFerie: tecniciFerie){
            if(tecnici.contains(tecnicoFerie)){
                if(tecnicoFerie.getRiparazione()!=null){
                    System.out.println("Impossibile, il tecnico è già assegnato");
                }else
                tecnici.remove(tecnicoFerie);
            }
        }
        System.out.println("I Tecnici sono stati mandati in ferie. Ecco la nuova lista dei Tecnici");
        System.out.println(Arrays.toString(getTecnici()));
    }
}
