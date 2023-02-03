package primi_esercizi;

import java.util.Scanner;

public class PrimoEsercizio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        computeValues(a, b);
    }

    private static void computeValues(int a, int b) {
        System.out.println("Addizione " + (a + b));
        System.out.println("Moltiplicazioe " + (a * b));
        System.out.println("Divisione " + (a / b)
        );
        System.out.println("Sottrazione " + (a - b)
        );
    }
}
