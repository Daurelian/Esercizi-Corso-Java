package secondi_esercizi;

import java.util.ArrayList;
import java.util.Random;

public class Negozio {
    ArrayList<Prodotto> prodotti= new ArrayList<Prodotto>(); // MAX 100

GiorniSettimana giorno= GiorniSettimana.LUN;

public Negozio(){

}

    public ArrayList<Prodotto> aggiungiProdottoInventario( Prodotto prodotto){
    boolean contenuto=false;
    boolean aggiornato=false;
    for(Prodotto prodottoInventario: prodotti){
      if(prodottoInventario.getNome().equals(prodotto.getNome())){
          contenuto=true;
          if(contenuto){
              int index= prodotti.indexOf(prodottoInventario);
              int quantità_precedente=prodotti.get(index).getQuantità();
              prodotti.set(index,new Prodotto(prodotto.getNome(), prodotto.getPrezzo(),prodotto.getQuantità()+quantità_precedente, prodotto.isGenereAlimentare()));
          }
          aggiornato=true;
          break;
      }
    }
            if(!aggiornato&&prodotti.size()<=100){
                prodotti.add(prodotto);
            }else if(!aggiornato) System.out.println("Limite massimo raggiunto, impossibile aggiungere altri prodotti");

        return prodotti;
    }

    public ArrayList<Prodotto> rimuoviProdottoInventario(Prodotto prodotto){
        boolean contenuto=false;
        boolean aggiornato=false;
        for(Prodotto prodottoInventario: prodotti){
            if(prodottoInventario.getNome().equals(prodotto.getNome())){
                contenuto=true;
                if(contenuto){
                    int index= prodotti.indexOf(prodottoInventario);
                    int quantità_precedente=prodotti.get(index).getQuantità();
                    if(quantità_precedente- prodotto.getQuantità()>=1){
                        prodotti.set(index,new Prodotto(prodotto.getNome(), prodotto.getPrezzo(),quantità_precedente-prodotto.getQuantità(), prodotto.isGenereAlimentare()));
            }else{
                        prodotti.remove(prodottoInventario);
                        int rimanenza= prodotto.getQuantità()-quantità_precedente;
                        System.out.println("Finite le scorte, non è stato possibile dare: "+ rimanenza +" "+ prodotto.getNome());
                    }}
                aggiornato=true;
                break;
            }
        }
        if(!aggiornato){
            System.out.println("Il prodotto non esiste, impossibile rimuoverlo");
        }
        return prodotti;
    }

    public void stampaQuantitàProdotti(){
    for(Prodotto prodotto: prodotti){
        System.out.println("Il prodotto è: "+prodotto.getNome()+" e la sua quantità è: "+prodotto.getQuantità());
    }
    }
    public Prodotto[] getInventario() {
        Prodotto[] array_prodotti=prodotti.toArray(new Prodotto[prodotti.size()]);
        return array_prodotti;
    }

public Prodotto[] checkCarrello(Cliente cliente){ //controlla che tutti i prodotti del carrello siano nell'inventario del negozio
    ArrayList<Prodotto>array_carrello=new ArrayList<>();
    boolean contenuto=false;
    for(Prodotto prodottoCarrello: cliente.getCarrello()) {
        for(Prodotto prodottoInventario:prodotti){
            if(prodottoInventario.getNome().equals(prodottoCarrello.getNome())){
                contenuto=true;
                if(contenuto) {
                    array_carrello.add(prodottoCarrello);
                }}
        }
    }
    //far pagare solo quello che si ha
    for(Prodotto prodottoCarrello: array_carrello) {
        for(Prodotto prodottoInventario:prodotti) {
            if(prodottoInventario.getNome().equals(prodottoCarrello.getNome())){
                if(prodottoInventario.getQuantità()<prodottoCarrello.getQuantità()){
                    int index= array_carrello.indexOf(prodottoCarrello);
                    array_carrello.set(index,new Prodotto(prodottoCarrello.getNome(), prodottoCarrello.getPrezzo(),prodottoInventario.getQuantità(), prodottoCarrello.isGenereAlimentare()));
                }
            }



        }
    }
    //riaggiorno il carrello del cliente
    cliente.getArrayListCarrello().clear();
    for(Prodotto prodottoCarrelloCheck: array_carrello){
        cliente.getArrayListCarrello().add(prodottoCarrelloCheck);
    }
    Prodotto[]carrelloProdotti=array_carrello.toArray(new Prodotto[array_carrello.size()]);
    return carrelloProdotti;


}

public double cassa(Cliente cliente){
    for(Prodotto prodottoCliente: cliente.getCarrello()){
        rimuoviProdottoInventario(prodottoCliente);
    }
if(giorno==GiorniSettimana.LUN || giorno== GiorniSettimana.MER){
    if(cliente.getEtà()>60){
        for(Prodotto prodottoCliente: cliente.getCarrello()){
            if(prodottoCliente.isGenereAlimentare()){
                prodottoCliente.setPrezzo(prodottoCliente.getPrezzo()-0.2* prodottoCliente.getPrezzo());
            }
        }
    }
}
double totale=0;
for(Prodotto prodottoCliente: cliente.getCarrello()){
    totale+=prodottoCliente.getPrezzo();
}
    totale= (double)Math.round(totale * 100d) / 100d;
return totale;

}

public void giornoCasuale(){
    Random rand= new Random();
    int n= rand.nextInt(7);
    switch(n){
        case 0:
            this.giorno=GiorniSettimana.LUN;
            break;
        case 1:
            this.giorno=GiorniSettimana.MAR;
            break;
        case 2:
            this.giorno=GiorniSettimana.MER;
            break;
        case 3:
            this.giorno=GiorniSettimana.GIO;
            break;
        case 4:
            this.giorno=GiorniSettimana.VEN;
            break;
        case 5:
            this.giorno=GiorniSettimana.SAB;
            break;
        case 6:
            this.giorno=GiorniSettimana.DOM;
            break;

    }
}
public void visualizzaGiorno(){
    System.out.println("Siamo nel giorno: "+this.giorno.toString());
}
}
