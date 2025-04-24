package Searching.Binary;

public class PeakIndexInMountainArray {
    public static void main(String[] args){
        int[] mountain = {2, 4, 5, 72, 36, 28, 17, 8, 3, -6};

        //Find the index of peak element
        int ans = peakIndex(mountain);
        System.out.println("mountain[" + ans + "] : " + mountain[ans]);
    }
    static int peakIndex(int[] arr){
        int start = 0, end = arr.length;
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(arr[middle - 1] >= arr[middle]){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return end;
    }
}
