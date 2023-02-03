package primi_esercizi;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        //il metodo più semplice è fare un ciclo for all'indietro. Per turzionismo lo faccio con lo StringBuilder
        StringBuilder sb = new StringBuilder();
//        for (int i = s.length(); i > 0; i--) {
//            sb.append(s.charAt(i - 1));
//        }
        sb.append(s);
        sb = sb.reverse();
        System.out.println(sb);
    }
}
