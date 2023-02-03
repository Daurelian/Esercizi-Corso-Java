import java.util.Arrays;

public class Tombola {
    public static void main(String[] args) {
        int[][] cartella1 = {{1, 3, 9, 21, 24}, {5, 37, 41, 60, 67}, {42, 71, 86, 87, 90}};         //Ambo e terno nelle righe 2 e 3
        int[][] cartella2 = {{42, 48, 55, 56, 4}, {72, 84, 86, 88, 90}, {60, 63, 20, 50, 89}};      //Quaterna e cinquina nelle righe 1 e 2
        int[][] cartella3 = {{1, 5, 11, 23, 24}, {30, 39, 42, 48, 55}, {56, 61, 62, 69, 70}};       //Tombola
        int[] estrazioni = {1, 5, 11, 23, 24, 30, 39, 42, 48, 55, 56, 61, 62, 69, 70, 72, 84, 86, 88, 90};
        System.out.println(tombola(cartella1, estrazioni));
        System.out.println(tombola(cartella2, estrazioni));
        System.out.println(tombola(cartella3, estrazioni));
    }

    public static String tombola(int[][] cartella, int[] estrazioni) {

        int[] contatori = {0, 0, 0};
        int[] results = new int[4];
        for (int i = 0; i < cartella.length; i++) {
            for (int j = 0; j < cartella[i].length; j++) {
                for (int k = 0; k < estrazioni.length; k++) {
                    if (estrazioni[k] == cartella[i][j]) {
                        contatori[i] += 1;
                    }
                }
            }
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
