package Bitwise;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        int answer = arr[0];
        for(int index = 1; index < arr.length; index++) {
            answer = answer ^ arr[index];
        }

        System.out.println(answer);
    }
}


/*
    Every number appears twice except for one, find that one number
    approach - we know that using XOR(^) operator gives us the exclusive bit
    So by performing XOR on every exclusive bit numbe we get, we can derive the single number in the array.
*/