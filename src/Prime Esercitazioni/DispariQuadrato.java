import java.util.Scanner;

public class DispariQuadrato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index:");
        int index = sc.nextInt();
        System.out.println(dispariquadrato(index));
    }

    public static int dispariquadrato(int n) {
        int result = 0;
        for (int i = 1; i <= n * 2; i += 2) {
            result += i;
        }
        return result;
    }
}
