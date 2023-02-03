public class SommaDiagonale {
    public static void main(String[] args) {
        int[][] values = {{1, 2, 3}, {2, 5, 4}, {8, 3, 6}};
        System.out.println(sommadiagonale(values));
        boolean bool = false;
        System.out.println(sommadiagonale(values, bool));
    }

    public static int sommadiagonale(int[][] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i][i];
        }
        return sum;
    }

    public static int sommadiagonale(int[][] values, boolean bool) {
        int sum = 0;
        if (bool) {
            return sommadiagonale(values);
        } else {
            for (int i = 0; i < values.length; i++) {
                sum += values[i][(values.length - 1) - i];
            }
            return sum;
        }
    }
}
