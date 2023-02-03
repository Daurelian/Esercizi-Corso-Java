import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index:");
        int index = sc.nextInt();
        fibonacci(index);
    }

    static void fibonacci(int m) {
        //inserite il vostro codice qui
        int[] fibonacci_result = new int[m];
        fibonacci_result[0] = 0;
        fibonacci_result[1] = 1;

        for (int i = 2; i < m; i++) {
            fibonacci_result[i] = fibonacci_result[i - 1] + fibonacci_result[i - 2];
        }
        System.out.println(fibonacci_result[fibonacci_result.length - 1]);
    }
}
