package Arrays;
// Question: Duplicate Elements in Array: Print the Duplicate elements of an array.
public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 15, 11, 15, 18, 12, 10, 18, 13};
        int duplicate = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate Elements : " + arr[i]);
                    break;
                }
            }
        }
    }
}
