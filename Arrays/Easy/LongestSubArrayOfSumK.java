package Arrays.Easy;

public class LongestSubArrayOfSumK {
    public static void main(String[] args){
        int[] arr = {5, 3, 2, 2, 4, 2, 8, 1, 1, 9};
        int k = 10, longestLength = 0, currentLength = 0;

        int index = 0, i = 0, sum = 0;
        while(index < arr.length) {
            if (i >= arr.length) break;

            sum += arr[i];
            currentLength += 1;
            i += 1;

            if (sum >= k) {
                if (sum == k) if (longestLength < currentLength) longestLength = currentLength;
                sum = 0;
                currentLength = 0;
                index += 1;
                i = index;
            }
        }

        System.out.println(longestLength);
    }
}
