package dictionary;

import java.util.HashSet;
import java.util.TreeMap;

public class Dictionary {
    private TreeMap<Character, TreeMap<String, HashSet<String>>> calepinus= new TreeMap<>();

    public Dictionary() {
    }

    public TreeMap<Character, TreeMap<String, HashSet<String>>> getCalepinus() {
        return calepinus;
    }

    public void addWordMeaning(String word, String meaning){
        HashSet<String> hashset_definition = new HashSet<>(1);


        if(calepinus.containsKey(word.charAt(0))){
            // deve inserire la parola nei values
            //devo accedere alla mappa di quella determinata chiave e inserire la nuova
            //coppia chiave-valore(set)
            //check su parola già contenuta
            if(calepinus.get(word.charAt(0)).containsKey(word)){ //se la mia chiave lettera contiene parola
                calepinus.get(word.charAt(0)).get(word).add(meaning);
            }
            else{
                hashset_definition.add(meaning);
                calepinus.get(word.charAt(0)).put(word, hashset_definition);
            }

        }else{ // c'è una lettera nuova
            TreeMap<String, HashSet<String>> map_word= new TreeMap<>();
            hashset_definition.add(meaning);
            map_word.put(word,hashset_definition );
            calepinus.put(word.charAt(0), map_word);
        }

    }

    public void addMeanings(String meaning){

    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "calepinus=" + calepinus +
                '}';
    }
}
