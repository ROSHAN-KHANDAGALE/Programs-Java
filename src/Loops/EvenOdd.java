package Loops;
// Question 3: Even & Odd Numbers from 1 to 100 using for Loop
public class EvenOdd {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if (i%2 == 0) {
                System.out.println("Even : " + i);
            } else {
                System.out.println("Odd : " + i);
            }
        }
    }
}
