package primi_esercizi;

import java.util.Scanner;

public class InvertiStringa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        reverseString(a);
    }

    private static void reverseString(String s) {
        String[] split = s.split(" ");
        String[] reverse_split = new String[2];
        reverse_split[1] = split[0];
        reverse_split[0] = split[1];
        System.out.println(String.join(" ", reverse_split));
        // System.out.println(split[1] + " " + split[0]);
    }

}
