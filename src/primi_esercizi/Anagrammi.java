import java.util.Arrays;
import java.util.Scanner;

public class Anagrammi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        anagrams(a, b);
    }

    static void anagrams(String a, String b) {
        String lower_a = a.toLowerCase();
        String lower_b = b.toLowerCase();

        char[] array_a = lower_a.toCharArray();
        char[] array_b = lower_b.toCharArray();
        Arrays.sort(array_a);
        Arrays.sort(array_b);
//        System.out.println(array_a);
//        System.out.println(array_b);
        boolean flag = true;
        for (int i = 0; i < array_a.length; i++) {
            if (array_a[i] != array_b[i]) {
                flag = false;
            }
        }
        System.out.println(flag ? "Sono Uguali" : "Sono Diversi");
    }

}
