package Loops;

// Question: Print Numbers: Write a program to print numbers from 1 to 100 using for loop
public class LoopsQueOne {
    public static void main(String[] args) {
        System.out.println("Program to Print Numbers from 1 to 100 using For Loop");
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        int w = 1;
        System.out.println("Program to Print numbers from 1 to 100 using while loop");
        while(w <= 100){
            System.out.println(w);
            w++;
        }
    }
}