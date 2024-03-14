package Loops;

// Question => Sum of Numbers: Calculate the sum of numbers from 1 to 100 using a for loop and while loop
public class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        // Using For Loop
        for(int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Using While loop
    int i = 1;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}
