package secondi_esercizi;

public class Riparazione {
    protected String tecnico;
    private String indirizzo;
    protected enum Priorità{
        BASSA, MEDIA, ALTA, DISASTRO
    }

    Priorità priorità;
    boolean conclusa= false;

    public Riparazione(Priorità priorità, String indirizzo){
        this.priorità=priorità;
        this.indirizzo=indirizzo;
    }
    public Riparazione(){
        this.priorità=Priorità.BASSA;
        this.indirizzo="Sconosciuto";
    }

    public Priorità getPriorità() {
        return priorità;
    }

    public String toString(){
        String temp_tecnico;
        if (tecnico==null){
            temp_tecnico="DA Assegnare";
        }else
        {temp_tecnico=tecnico;}
        return "La riparazione ha indirizzo: "+indirizzo+" e priorità: "+this.priorità+". Il tecnico adibito è: "+temp_tecnico;

    }

}
