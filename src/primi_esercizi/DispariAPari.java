package primi_esercizi;

import java.util.Arrays;

public class DispariAPari {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(dispariapari(numbers)));
    }

    public static int[] dispariapari(int[] numbers) {
        int[] copy = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                copy[i] = numbers[i] * 2;
            } else copy[i] = numbers[i];
        }
        return copy;
    }
}
