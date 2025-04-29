package Bitwise;

public class CheckIfNumIsPowerOf2 {
    public static void main(String[] args) {
        int number = 1024;
        if((number & (number - 1)) == 0) System.out.println("It is a power of 2");
        else System.out.println("It is not power of 2");
    }
}

/*
 * To check if a number is power of 2.
 * We know that all binary of the number that are power of 2 have their most significant bit as set bit and rest 0's.
 * Then to check if its a power of two, we can & all the bits by 1, except the most significant bit.
 * We can get this mask by simply subtracting 1 from the original number. Then perform & operation on both nums, if we get 0, then its a power of 2
*/
