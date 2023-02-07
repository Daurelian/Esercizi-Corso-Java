package secondi_esercizi;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int età;

    private ArrayList<Prodotto> carrello= new ArrayList<>();

    public Cliente(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public Prodotto[] getCarrello() {
        Prodotto[] array_carrello=carrello.toArray(new Prodotto[carrello.size()]);
        return array_carrello;
    }

    public ArrayList<Prodotto> aggiungiProdottoCarrello( Prodotto prodotto){
        boolean contenuto=false;
        boolean aggiornato=false;
        for(Prodotto prodottoInventario: carrello){
            if(prodottoInventario.getNome().equals(prodotto.getNome())){
                contenuto=true;
                if(contenuto){
                    int index= carrello.indexOf(prodottoInventario);
                    int quantità_precedente=carrello.get(index).getQuantità();
                    carrello.set(index,new Prodotto(prodotto.getNome(), prodotto.getPrezzo(),prodotto.getQuantità()+quantità_precedente, prodotto.isGenereAlimentare()));
                }
                aggiornato=true;
                break;
            }
        }
        if(!aggiornato&&carrello.size()<=100){
            carrello.add(prodotto);
        }else if(!aggiornato) System.out.println("Limite massimo raggiunto, impossibile aggiungere altri prodotti");

        return carrello;
    }
    public void stampaQuantitàCarrello(){
        for(Prodotto prodotto: carrello){
            System.out.println("Il Cliente è "+this.nome+" e il prodotto è: "+prodotto.getNome()+" e la sua quantità è: "+prodotto.getQuantità()+" e il suo prezzo è: "+prodotto.getPrezzo());
        }}

    public ArrayList<Prodotto> getArrayListCarrello(){
        return carrello;
    }

}
