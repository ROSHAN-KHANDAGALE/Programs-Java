package Arrays;
import java.util.Arrays;
// Question: Total Elements and Present Elements in Array: Print the number of elements present in an array and its Size as well.
public class TotalLengthAndPresentElements {
    public static void main(String[] args) {
        int[] arr = {15, 12, 11, 14, 13};

        System.out.println("Total Elements in Array: " + arr.length);
        System.out.println("Present Elements: " + Arrays.toString(arr));
    }
}
