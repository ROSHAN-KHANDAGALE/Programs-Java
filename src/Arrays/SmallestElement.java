package Arrays;
import java.util.Arrays;
// Question: Smallest Element in Array: Find the smallest element in an array.
public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {15, 10, 13, 11, 14, 12};
        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element : " + smallest);
    }
}
