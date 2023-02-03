package primi_esercizi;

import java.util.Arrays;

public class TriangoloTartaglia {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tartaglia(7)));
    }

    public static int[] tartaglia(int depth) {
        int[][] triangolo_base = new int[1][1];
        return tartaglia(triangolo_base, 0, depth);
    }

    public static int[] tartaglia(int[][] triangolo_base, int index, int depth) {
        if (depth == 0) {
            triangolo_base[0][0] = 1;
            return triangolo_base[0];
        } else if (depth == 1) {
            int[][] triangolo = new int[2][2];
            triangolo[1][0] = 1;
            triangolo[1][1] = 1;
        } else {
            int[][] triangolo = new int[index + 1][index + 1];
            triangolo[index][0] = 1;
            triangolo[index][index] = 1;
            for (int j = 1; j < index; j++) {
                triangolo[index][j] = triangolo_base[index - 1][j] + triangolo_base[index - 1][j - 1];
            }
            if (index == depth) {
                return triangolo[index];
            } else return tartaglia(triangolo, index + 1, depth);
        }
        // Queste ultime due righe le ho messe riempitive perché o se no mi dava errore che non ci fosse return.
        int[][] triangolo = new int[index + 1][index + 1];
        return tartaglia(triangolo, index + 1, depth);
    }
}
