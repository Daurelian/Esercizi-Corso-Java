package primi_esercizi;

public class stackOverflow {
    public static void main(String[] args) {
        System.out.println(factorial(400));
    }

    private static long factorial(int n) {
        // Togliendo caso base va in stack overflow
        if (n == 0 || n == 1) return 1;
        else
            return n * factorial(n - 1);

    }
}
