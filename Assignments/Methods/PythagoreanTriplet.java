package Assignments.Methods;
import java.util.Scanner;
public class PythagoreanTriplet {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any three lengths : ");
        int side1 = read.nextInt(), side2 = read.nextInt(), side3 = read.nextInt();

        if(squareOf(max(side1, side2, side3)) == (squareOf(mid(side1, side2, side3)) + squareOf(min(side1, side2, side3)))) {
            System.out.println("It is a pythagorean triplet");
        } else {
            System.out.println("It is not pythagorean triplet");
        }
    }
    static int squareOf(int number){
        return number * number;
    }

    static int max(int a, int b, int c){
        if(a > b){
            if(a > c){
                return a;
            } else {
                return c;
            }
        } else if(b > c) {
            return b;
        }
        return c;
    }

    static int min(int a, int b, int c){
        if(a < b){
            if(a < c){
                return a;
            } else {
                return c;
            }
        } else if(b < c) {
            return b;
        }
        return c;
    }

    static int mid(int a, int b, int c){
        if(a > b && a < c){
            return a;
        } else if(b > a && b < c){
            return b;
        }
        return c;
    }
}
