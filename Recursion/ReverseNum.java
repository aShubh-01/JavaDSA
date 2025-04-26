package Recursion;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println("Reverse is " + reverseNum(number));

    }

    static int reverseNum(int number) {
        return 0;
    }
}

/*
 * number = 102
 * logic :- define sum = 0 initially, take the unit place digit, add it into the sum, multiply it by 10, remove the unit place number from original number, 
 * then to the same for next unit place digit. 
 * repeat the process until your original number is <= 0
 * function reverseNum(number) {
 *      if(number <= 0) return;
 *      return (number % 10) + reverseNum(number / 10) * 10;
 * }
*/
