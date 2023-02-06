package secondi_esercizi;

import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
    private int[] values;
    private static ArrayList <Libro> libri= new ArrayList<>();
    public Biblioteca(int[] values){
        this.values=values;
    }

    public Biblioteca(){

    }

    public void aggiungiLibro(Libro libro){
        libri.add(libro);
    }
    public boolean esisteLibro(int n){
        for(int number: values){
            if(number==n){
                return true;
            }
        }
        return false;
    }

    public int[] getIndiciLibriOrdinati(){
        Arrays.sort(values);
        return values;
    }

    public static Libro[] getLibri() {
       Libro[] array_libro= libri.toArray(new Libro[libri.size()]);
       return array_libro;
    }

    public void getLibriOrdinati() {
        Libro temp;
        for (int i=0; i<libri.size()-1; i++) {
            for (int j=i+1; j<libri.size(); j++) {
                if (libri.get(i).getIndice() > libri.get(j).getIndice()) {
                    temp = libri.get(i);
                    libri.set(i,libri.get(j));
                    libri.set(j,temp);
                }
            }
        }
    }
}

