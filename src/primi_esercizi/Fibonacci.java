import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index:");
        int index = sc.nextInt();
        System.out.println(fibonacci(index));
    }

    static int fibonacci(int index) {
        //inserite il vostro codice qui
        int[] fibArray = new int[index + 1];
        int fibValue = 0;
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (fibArray[index] != 0) {
            return fibArray[index];
        } else {
            fibValue = fibonacci(index - 1) + fibonacci(index - 2);
            fibArray[index] = fibValue;
            return fibValue;

        }
    }
}
