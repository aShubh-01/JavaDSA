package Arrays.Easy;

public class MaximumConsecuitveOnes {
    public static void main(String[] args) {
        int currentCount = 0, highestCount = 0;
        int[] arr = {1,1,0,1,1,1};

        for(int index = 0; index < arr.length; index++){
            if(arr[index] == 1) {
                currentCount += 1;
            } else {
                if(highestCount < currentCount){
                    highestCount = currentCount;
                    currentCount = 0;
                }
            }
        }

        if(arr[arr.length - 1] == 1){
            if(highestCount < currentCount){
                highestCount = currentCount;
            }
        }

        System.out.println(highestCount);

    }
}
