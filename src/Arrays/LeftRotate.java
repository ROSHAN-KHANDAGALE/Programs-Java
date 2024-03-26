package Arrays;
import java.util.Arrays;
import java.util.Scanner;
// Question: Left Rotate Elements in Array: Java Program to left rotate the elements of an array.
public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {15, 11, 13, 14, 12, 19, 17, 18, 20, 16};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of shifts: ");
        int n = sc.nextInt();
        int i, j, temp;

        for(i = 0; i < n; i++) {
            temp = arr[0];
            for(j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            } arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
