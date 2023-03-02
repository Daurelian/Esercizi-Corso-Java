package stream_esercizi;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList= List.of("Giggino", "Baugigio", "Gerardo","Rodolfo");
        List<Double> prezziList= List.of(22.0,33.0,55.4,22.4, 76.5);
        List<Integer>numeri1A10=List.of(1,2,3,4,5,6,7,8,9,10);
        List<String> occorrenzeList= List.of("Giggino", "Baugigio", "Gerardo","Rodolfo", "Giggino", "Rodolfo", "Giggino");

        //Ordinare una lista di stringhe senza modificarla
        System.out.println(stringList.stream().sorted().collect(Collectors.toList()));
        //Convertire in maiuscolo le stringhe in una lista
        System.out.println(stringList.stream().map(String::toUpperCase).collect(Collectors.toList()));
        //Vogliamo scrivere un metodo che aggiunga l’IVA ad ogni prezzo contenuto
        //ad una lista di prezzi e li stampi
        System.out.println(prezziList.stream().map(prezzo->prezzo*1.22).collect(Collectors.toList()));
        //Stampa i numeri dispari da 1 a 10
        System.out.println(numeri1A10.stream().filter(n->n%2!=0).collect(Collectors.toList()));
        //Scrivere un metodo per ottenere una stringa che rappresenta la concatenazione delle stringhe
        // contenute in una lista, rese maiuscole e separate da virgola
        System.out.println(stringList.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));
        //Scrivere un metodo per ottenere, a partire da una lista di numeri,
        // una mappa dove ad ogni numero dispari è associata la sua rappresentazione in stringa
        System.out.println(numeri1A10.stream().filter(n->n%2!=0).collect(Collectors.toMap(Function.identity(),n->String.valueOf(n))));
        //Scrivere un metodo per ottenere a partire da una lista di stringhe
        // una mappa con chiave la stringa e valore il numero di occorrenze nella lista
        System.out.println(occorrenzeList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        //Scrivere un metodo per ottenere, a partire da una lista di stringhe,
        // restituisca una mappa che ha come chiave la prima lettera (univoca)
        // e come valore la somma delle occorrenze delle stringhe che iniziano con tale lettera.
        //Esempio: ["ciao", "ciao", "come", "va"] produce la mappa {c=3, v=1}
        System.out.println(occorrenzeList.stream().collect(Collectors.groupingBy(s->s.charAt(0), Collectors.counting())));
        //Restituire la somma di una lista di interi
        System.out.println(numeri1A10.stream().reduce(Integer::sum));
    }
}
