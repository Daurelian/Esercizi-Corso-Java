package primi_esercizi;

import java.util.Scanner;

public class cifrarioCesare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        System.out.print("Enter index:");
        int index = sc.nextInt();
        System.out.println("Criptiamo");
        System.out.println(crypt(s, index));
        System.out.println("Decriptiamo");
        System.out.println(decrypt(crypt(s, index), index));
    }

    public static String crypt(String s, int index) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int char_number_result = ((int) s.charAt(i) + index - 96) % 26 + 96;
            if (char_number_result <= 96) {
                char_number_result = char_number_result + 26;
            }
            char char_result = (char) char_number_result;
            sb.append(char_result);
        }
        return sb.toString();
    }

    public static String decrypt(String s, int index) {
        return crypt(s, -index);
    }
}
