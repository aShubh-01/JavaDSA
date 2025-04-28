package Bitwise;

public class FIndTheMagicNumber {
    public static void main(String[] args) {
        int n = 3;
        int base = 5;
        int ans = 0;
        int power = 1;

        while(n != 0) {
            int bitExponential = (n & 1) * (int)Math.pow(base, power); 
            ans += bitExponential;
            power++;
            n = n >> 1;
        }

        System.out.println(ans);
    }
}

/*
    Given an number n, its magic number is addition of n's each bit multiplied by base raise to the power of current bits position
    To solve this, we can iterate over the each bit of the number & 
    multiply it by the base raise to position of currrent bit, then sum all the exponential values. 
    It will give us the magic number of that bit
*/