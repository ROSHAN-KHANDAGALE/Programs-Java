package Arrays;
// Question: Average of Array Elements: Calculate the average of elements in an array.
public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {15, 10, 11, 12, 14, 13};
        int sum = 0;
        int avg = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
            avg = sum / arr.length;
        System.out.println("Sum of Array : " + sum);
        System.out.println("Average of Array : " + avg);
    }
}
