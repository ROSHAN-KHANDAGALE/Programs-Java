package Loops;
//Factorial: Calculate the factorial of a number using a while loop.
public class FactorialQue {
    public static void main(String[] args) {
        int n = 10;
        int i, fact = 1;
        for( i = 1 ; i <= n ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
