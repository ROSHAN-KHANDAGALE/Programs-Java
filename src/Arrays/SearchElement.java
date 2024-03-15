package Arrays;
import java.util.Scanner;
// Question: Search Element in Array: Search for a specific element in an array and print its index if found.

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {15, 22, 20, 14, 19, 25};
        Scanner sc = new Scanner(System.in);
        int toSearch = sc.nextInt();
        int found = 0;

        for(int i = 0; i < arr.length; i++) {
            if(toSearch == arr[i]){
                System.out.println("Search Element : " );
            }
        }
    }
}
