package Arrays;
import java.util.Scanner;
// Question: Search Element in Array: Search for a specific element in an array and print its index if found.

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {15, 22, 20, 14, 19, 25};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Search : ");
        int toSearch = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(toSearch == arr[i]){
                System.out.println("Search Element Found : " + arr[i] + " at Index of " + i);
                break;
            } else {
                System.out.println("Element Not Found!!");
            }
        }
    }
}
