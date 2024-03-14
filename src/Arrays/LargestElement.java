package Arrays;
import java.util.Arrays;
// Question: Largest Element in Array: Find the largest element in an array.
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {15, 22, 10, 12, 19};

            Arrays.sort(arr);
            System.out.println("Largest Element : " + arr[arr.length - 1]);
    }
}
