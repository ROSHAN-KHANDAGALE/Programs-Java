package Arrays;
import java.util.Arrays;
// Question: Sum of Array Elements: Write a program to calculate the sum of all elements.
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {15, 12, 11, 20, 16};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of Array : " + sum);
    }
}
