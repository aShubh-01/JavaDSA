package Bitwise;

public class SetTheithBit {
    public static void main(String[] args) {
        int i = 2;
        int number = 17; //10001
        int mask = 1 << i-1; // Creates a mask for ith bit.
        System.out.println(Integer.toBinaryString(number | mask));
    }
}

/*
 * To convert the ith bit to 1.
 * We know that if we OR any bit with 1, it results in 1.
 * Thus, we can create a mask that has the ith  bit set to 1, remaining bits to 0.
 * Then perform the OR operator of the target variable and the mask variable.
 */
