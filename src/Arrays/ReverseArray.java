package Arrays;
import java.util.Arrays;
// Question: Reverse Array: Reverse the elements of an array.
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {70, 78, 75, 77, 72, 73, 76, 72, 71, 74, 79};
        int[] revArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Original Array : " + Arrays.toString((arr)));
        System.out.println("Reversed Array : " + Arrays.toString(revArr));
    }
}
