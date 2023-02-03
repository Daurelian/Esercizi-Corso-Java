package primi_esercizi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumeriPrimifinoaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(calcolaNumeriPrimi(n)));
    }

    public static int[] calcolaNumeriPrimi(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (result.contains(i)) {
                    continue;
                } else
                    result.add(i);
            }
        }
        int[] results = result.stream().mapToInt(i -> i).toArray();
        return results;
    }
}
