package Searching.Linear;

public class FrequencyOfElements {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 5, 2, 2, 2, 5, 4, 3, 2, 1};
        int[] frequencyArr = new int[max(arr) + 1];

        for(int index = 0; index < arr.length; index++){
            frequencyArr[arr[index]] += 1;
        }

        for(int index = 0; index < frequencyArr.length; index++){
            System.out.println(index + " : " + frequencyArr[index]);
        }
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int index = 0; index < arr.length; index++){
            if(arr[index] > max){
                max = arr[index];
            }
        }
        return max;
    }
}
