package primi_esercizi;

import java.util.Arrays;

public class palindromaRicorsiva {
    public static void main(String[] args) {
        System.out.println(isPalindromer("c"));
        System.out.println(isPalindromer("ciic"));
        System.out.println(isPalindromer("aaaa"));
        System.out.println(!isPalindromer("absca"));
        System.out.println(!isPalindromer("abbaa"));
        System.out.println(isPalindromer("zzzzz"));
        System.out.println(isPalindromer("zzczz"));
        System.out.println(isPalindromer("aabbaa"));
    }

    public static boolean isPalindromer(String s) {
        char[] s_array = s.toCharArray();
        if (s_array.length == 0) return false;
        if (s_array.length == 1) return true;
        else {
            return isPalindromer(s_array, 0, s_array.length - 1);
        }
    }

    public static boolean isPalindromer(char[] s_array, int start, int end) {
        if (start == (s_array.length - 1) / 2) return true;
        if (s_array[start] != s_array[end]) return false;
        else {
            return isPalindromer(s_array, start + 1, end - 1);
        }

    }
}
