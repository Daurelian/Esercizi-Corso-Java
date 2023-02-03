package primi_esercizi;

public class Palindroma {
    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }

    private static boolean isPalindrome(String s) {
        //inserite qui il vostro codice
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt((s.length() - 1) - i)) return false;
        }
        return true;
    }
}
