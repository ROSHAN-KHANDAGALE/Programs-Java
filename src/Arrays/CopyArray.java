package Arrays;
import java.util.Arrays;
// Question: Copy Array: Copy the elements of one array into another array.
public class CopyArray {
    public static void main(String[] args) {
        int[] old_arr = {12, 10, 15, 5, 22};
        int[] new_arr = new int[old_arr.length];

        for(int i = 0; i < old_arr.length; i++){
            new_arr[i] = old_arr[i];
        }
        System.out.println("Old Array : " + Arrays.toString(old_arr));
        System.out.println("New Array : " + Arrays.toString(new_arr));
    }
}
