package Bitwise;

public class ResetTheithBit {
    public static void main(String args[]) {
        int number = 17; // 10001
        int i = 1;
        int mask = ~(1 << i-1); // Create mask with target bit set to 0, rest 1
        System.out.println(Integer.toBinaryString(number & mask));
    }
}

/*
 * To reset the ith bit to 0
 * We know that if AND any bit with 0, we get 0.
 * If we AND any bit with 1, we get the same bit.
 * So we can create a mask that has all the bits set to 1 except the target bit set to 0
 * Then AND the variable with the mask.
*/