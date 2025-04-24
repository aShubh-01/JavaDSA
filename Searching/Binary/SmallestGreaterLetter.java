package Searching.Binary;

public class SmallestGreaterLetter {
    public static void main(String[] args){
        char[] letters = {'i', 'i', 'i', 'i', 'i', 'y', 'y'};
        char target = 'j';

        //Find smallest letter which is greater than the given target in the array
        int ans = ceilingLetter(letters, target);
        System.out.println("letters[" + ans + "] - " + letters[ans]);
    }
    static int ceilingLetter(char[] arr, char target){
        if(target < arr[0] || target > arr[arr.length - 1]){
            return 0;
        }

        int start = 0, end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(arr[middle] == target){
                return middle + 1;
            } else if (arr[middle] > target){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}
