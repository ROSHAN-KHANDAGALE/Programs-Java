package Arrays;
import java.util.Arrays;
// Question: Sort Duplicate Elements: Remove Duplicate Element in an array.
public class SortDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 15, 11, 15, 18, 12, 10, 18, 13};
        //rearranged using sort method
//        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("To Arranage the Array Elements : " + Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++) {
            boolean duplicate = false;
            for(int j = i + 1; j < arr.length; j++) {
                if( arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                System.out.print(arr[i] + " ");
            }
        } System.out.println(arr[arr.length - 1]);
    }
}
