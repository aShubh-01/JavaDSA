package Bitwise;

public class FindTheithBit {
    public static void main(String[] args) {
        int num = 10; // 1010
        int i = 3;
        System.out.println((num >> (i - 1)) & 1);
    }
}


/*
 * Find the ith bit of an number
 * using right shift operator i times will bring the ith bit to the first bit position
 * So then using & 1 with any number returns the first bit of the number
*/