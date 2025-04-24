package Bitwise;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2};

        int ans = arr[0];
        for(int index = 1; index < arr.length;index++){
            ans = ans ^ arr[index];
        }

        System.out.println(ans);
    }
}
