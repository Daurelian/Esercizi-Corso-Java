package primi_esercizi;

import java.util.Scanner;

public class SecondiOreMinuti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index:");
        int index = sc.nextInt();
        System.out.println(secondioreminuti(index));
    }

    public static String secondioreminuti(int n) {
        int secondi = 0;
        int minuti = n / 60;
        int ore = minuti / 60;
        int giorni = ore / 24;

        if (minuti != 0) {
            secondi = n % 60;
        }
        if (ore != 0) {
            minuti = minuti % 60;
        }
        if (giorni != 0) {
            ore = ore % 24;
        }

        String result = "Sono giorni " + giorni + " e ore: " + ore + " e minuti: " + minuti + " e secondi: " + secondi;
        return result;


    }
}
