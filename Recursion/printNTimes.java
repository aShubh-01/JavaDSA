package Recursion;

import java.sql.SQLOutput;
import java.util.Arrays;

public class printNTimes {
    public static void main(String[] args) {
        System.out.println(checkPalindromeString("abcdcasdasdba"));
    }

    static void printName(String name, int n){
        if(n == 0) return;      //base condition

        System.out.println(name);
        printName(name, n - 1);
    }

    static void print1ToN(int num, int n){
        if(num > n) return;

        System.out.println(num);
        print1ToN(num + 1, n);
    }

    static void printNTo1(int num, int n){
        if(num < n) return;

        System.out.println(num);
        printNTo1(num - 1, n);
    }

    static int sumOfFirsNnums(int num){
        if(num == 1) return num;

        return (num + (sumOfFirsNnums(num - 1)));
    }

    static int factorialOfN(int num){
        if(num == 1) return 1;

        return (num * factorialOfN(num - 1));
    }

    static int[] reverseAnArray(int[] arr, int index){
        if(index > (arr.length - 1) / 2) return arr;

        int temp = arr[index];
        arr[index] = arr[arr.length - 1 - index];
        arr[arr.length - 1 - index] = temp;

        return reverseAnArray(arr, index + 1);
    }

    static boolean checkPalindromeString(String strng){
        int stringLength = strng.length();
        if(stringLength <= 1) return true;

        if(strng.charAt(0) != strng.charAt(strng.length() - 1)){
            return false;

        } else if (stringLength > 1){
            String subStrng = strng.substring(1, stringLength - 1);
            return checkPalindromeString(subStrng);
        }

        return checkPalindromeString(strng);
    }

    static int checkNthFibonacci(int num){
        if (num == 2) return 1;
        else if (num == 1) return 0;

        return checkNthFibonacci(num - 2) + checkNthFibonacci(num - 1);
    }
}
