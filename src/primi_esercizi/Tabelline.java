import java.util.Arrays;

public class Tabelline {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tabelline(8, 2)));
        System.out.println(Arrays.toString(tabelline(2, 3)));
    }

    public static int[] tabelline(int m, int n) {
        int[] result = new int[m + 1];
        result[0] = 0;
        for (int i = 1; i < result.length; i++) {
            result[i] = i * n;
        }
        return result;
    }
}
