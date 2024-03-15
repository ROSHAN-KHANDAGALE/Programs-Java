package Arrays;
import java.util.Arrays;
// Question: Largest Element in Array: Find the largest element in an array.
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {15, 22, 10, 12, 19};
        int largest = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > largest) {
                    largest = arr[i];
                }
            }
            System.out.println("Largest Element : " + largest);
    }
}
