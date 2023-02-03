package primi_esercizi;

public class Fattoriale {
    public static void main(String[] args) {
        System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
    }

    private static long factorial(int n) {
        //inserite il vostro codice qui
//        if (n == 0 || n == 1) return 1;
//        else {
//            return n * factorial(n - 1);
//        }
        return (n == 0) ? 1 : n * factorial(n - 1);


    }
}
