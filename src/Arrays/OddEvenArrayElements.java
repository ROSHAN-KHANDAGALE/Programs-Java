package Arrays;
import java.util.Arrays;
// Question: Odd Even Elements: Print Odd and Even Numbers from an array.
public class OddEvenArrayElements {
    public static void main(String[] args) {
        int[] arr = {15, 11, 13, 12, 14};

        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                System.out.println("Even Array Element: " + arr[i]);
            } else {
                System.out.println("Odd Array Elements: " + arr[i]);
            }
        }
    }
}
