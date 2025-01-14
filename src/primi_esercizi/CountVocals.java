package primi_esercizi;

import java.util.ArrayList;
import java.util.Scanner;

//Questo esercizio conterà le vocali data una parola o frase
public class CountVocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        countVocals(s);
    }

    public static void countVocals(String s) {
        ArrayList<Character> vocals = new ArrayList();
        vocals.add('a');
        vocals.add('e');
        vocals.add('i');
        vocals.add('o');
        vocals.add('u');
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vocals.contains(s.charAt(i))) result += 1;
        }
        System.out.format("Numero vocali: %d", result);
        System.out.println();
        System.out.format("Numero consonanti e/o spazi: %d", s.length() - result);

    }

}
