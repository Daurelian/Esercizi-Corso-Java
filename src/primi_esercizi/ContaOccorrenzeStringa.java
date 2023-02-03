package primi_esercizi;

import java.util.Scanner;

public class ContaOccorrenzeStringa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        countOccurrences(a.charAt(0), b);
    }

    static void countOccurrences(char a, String b) {
        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == a) {
                count += 1;
            }
        }
        System.out.println(("Occorrenze " + count));
    }
}
