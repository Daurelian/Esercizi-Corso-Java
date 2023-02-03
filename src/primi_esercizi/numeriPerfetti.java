import java.util.ArrayList;
import java.util.Arrays;

public class numeriPerfetti {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numeriPerfetti(1000)));
    }
    public static int[] numeriPerfetti(int n){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=n; i++){
            int result=0;
            for(int j=1; j<=i/2; j++){
                if(i%j==0){
                   result+=j;
                }
            }
            if (result==i){
                numbers.add(i);
            }
        }
        int [] numbers_result= numbers.stream().mapToInt(i -> i).toArray();
        return numbers_result;
    }

}
