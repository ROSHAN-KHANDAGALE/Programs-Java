package Arrays;
import java.util.Arrays;
// Question: Sorting in Ascending Order: Sort the elements of an array in Ascending order.
public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {15, 11, 13, 12, 14};

        for (int i = 0; i < arr.length; i++) {
             for(int j = i+1; j < arr.length; j++){
                 if(arr[i] > arr[j]) {
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
        }System.out.println(Arrays.toString(arr));
    }
}
