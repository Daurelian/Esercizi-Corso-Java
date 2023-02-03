import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TombolaRandom {
    public static void main(String[] args) {
    int[][]cartella1= creaCartella();
    int[][]cartella2= creaCartella();
    int[][]cartella3= creaCartella();
    System.out.println("Ecco le nostre cartelle...");
    System.out.println(Arrays.deepToString(cartella1));
    System.out.println(Arrays.deepToString(cartella2));
    System.out.println(Arrays.deepToString(cartella3));
    System.out.println();
    System.out.println("Procediamo all'Estrazione...");
    System.out.println(estrazione(cartella1));
    System.out.println(estrazione(cartella2));
    System.out.println(estrazione(cartella3));
    }
    public static int[][] creaCartella(){
        int[][]cartella=new int[3][5];
        int contatore=0;
        while(contatore<3){
            int[] numbers= new int[9];
            Random rand= new Random();
            for(int i=0; i<numbers.length; i++){
                numbers[i]=(i*10+1)+rand.nextInt(10*(i+1)-(i*10));
            }
            int[]singolariga= creaRiga(numbers);
            cartella[contatore]=singolariga;
            contatore++;
        }
        return cartella;
        }

    public static int[] creaRiga(int[]numbers){
        int temp= 0;
        ArrayList<Integer> values_numbers = new ArrayList<>();
        ArrayList<Integer> result_numbers = new ArrayList<>();
        Random rand2= new Random();
        for(int e:numbers){
            values_numbers.add(e);
        }
        for(int i=0; i< 5; i++){
            temp=values_numbers.get(rand2.nextInt(values_numbers.size()));
            result_numbers.add(temp);
            values_numbers.remove(Integer.valueOf(temp));
        }
        Collections.sort(result_numbers);
        int[] result=result_numbers.stream().mapToInt(i -> i).toArray();
        return result;
    }

    public static String estrazione(int[][]cartella){
        Random rand3= new Random();
        int[] contatori = {0, 0, 0};
        int[] results = new int[4];
        int numero_estrazioni=20;
        ArrayList<Integer> estractions= new ArrayList<>();

        for(int k =0; k<numero_estrazioni; k++){
            int values_estraction= rand3.nextInt(90)+1;
            if(estractions.contains(values_estraction)){
                k=k-1;
                continue;
            }
            for (int i = 0; i < cartella.length; i++) {
                for (int j = 0; j < cartella[i].length; j++) {
                    if(cartella[i][j]==values_estraction){
                        contatori[i] +=1;
                    }
                }
            }
           estractions.add(values_estraction);
        }


        for (int i = 0; i < contatori.length; i++) {
            if (contatori[i] == 2) {
                results[0] += 1;
            } else if (contatori[i] == 3) {
                results[1] += 1;
            } else if (contatori[i] == 4) {
                results[2] += 1;
            } else if (contatori[i] == 5) {
                results[3] += 1;
            }
        }
        if (results[3] == 3) {
            return "TOMBOLA!";
        }
        String result = "Hai: " + results[0] + " Ambi " + results[1] + " Terni " + results[2] + " Quaterne " + results[3] + " Cinquina";
        return result;

    }
    }
