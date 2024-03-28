package Arrays;
import java.util.Arrays;
import java.util.Scanner;
// Question: Program to create a user defined array.
public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Enter the Size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println("Elements Added: " + arr[i]);
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
