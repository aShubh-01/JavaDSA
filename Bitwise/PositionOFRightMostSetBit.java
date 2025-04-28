package Bitwise;

public class PositionOFRightMostSetBit {
    public static void main(String[] args) {
        int number = -10; // 11110110
        int count = 0;
        while(number != 0) {
            count++;
            if((number & 1) == 1) break;
            number = number >> 1;
        }
        System.out.println(count);
    }
}


/*
 * Given any number, we have to find the right most set bit(1)
 * We can iterate over the bits of the number and keep checking for the set bit 
 * by performing AND operation with 1, since it returns the original number itself.
 * In each iteration, we increase the count to track the position of the bit.
 * If the AND operation returns 1, break the loop and your count will have the position of the right most set bit
*/