public class ricercaBinaria {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5,6,7,8,9,10,12,13,15,18,19,22};
        int element= 1;
        System.out.println(ricercaBinaria(numbers, element));
    }
    public static int ricercaBinaria(int[] numbers, int element){
        int index=0;
        int start = 0;
        int lunghezza = numbers.length - 1;
        if(element < numbers[start] || element > numbers[lunghezza] ){
            return -1;
        }
        while(start<= lunghezza) {
            index = (start+ lunghezza) / 2;
            if(numbers[index] == element){
                return index;
            }
            if(numbers[index] < element) {
                start = index + 1;
            }
            else {
                lunghezza = element - 1;
            }
        }
        return -1;
    }
}
