package terzi_esercizi;

import java.util.ArrayList;

public class DistributoreDiBevande {
private Bevanda[] bevande;
private int index =0;

private  double saldo=0;

private double resto=0;


    public DistributoreDiBevande(int n) {
        bevande = new Bevanda[n];
    }

    public Bevanda[] getBevande() {
        return bevande;
    }

public void caricaProdotto(Bevanda p){
        if(index<bevande.length){
            bevande[index]= p;
            index++;
        }else
            System.out.println("Distributore Pieno");
}

public void stampaProdotti(){
        for(Bevanda b: bevande){
            System.out.println(b);
        }
}

public void inserisciImporto(double n){
        saldo+=n;
}

public double saldoAttuale(){
        return saldo;
}

//    public double getResto() {
//        return resto;
//    }

    public void scegliProdotto(String codice){
        //scegliProdotto: dato in ingresso un codice di prodotto, restituisca il prodotto associato a quel
        // codice (se l’importo inserito lo consente) e decrementi il saldo disponibile nel distributore
        boolean trovato=false;
        boolean saldoInsufficente=false;
    for(Bevanda b: bevande){
        if(b==null){
            continue;
        }
        if(b.codice==codice){
            trovato= true;
            if(saldo>=b.prezzo){
                System.out.println("Erogo: "+b.toString());
                resto=saldo-b.prezzo;
                //elimino prodotto dall'array
                ArrayList<Bevanda> nuove_bevande= new ArrayList<>();
                for(Bevanda nb: bevande){
                    nuove_bevande.add(nb);
                }
                nuove_bevande.remove(b);
                bevande=nuove_bevande.toArray(new Bevanda[bevande.length-1]);
            }else{
                saldoInsufficente=true;
            }
            break;
        }
    }
    if(!trovato){
        System.out.println("Il prodotto non è disponibile");
    }
    if(saldoInsufficente){
        System.out.println("Il saldo è insufficente");
    }

    }
    public double getResto(){
        resto=Math.round(resto * 100d) / 100d;
        System.out.println("Ritorno il resto: "+resto);
        resto=0;
        saldo=0;
        return resto;
    }
}
