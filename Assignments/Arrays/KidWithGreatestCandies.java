package Assignments.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class KidWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;

        ArrayList<Boolean> result = new ArrayList<>();

        int maxCandy = candies[0];                  //Get the highest candy count in candies array
        for (int candy : candies) {
            if (candy > maxCandy) {
                maxCandy = candy;
            }
        }

        for (int kid = 0; kid < candies.length; kid++) { // now compare every (candy + extra candies) with the maxCandy
            if((candies[kid] + extraCandies) >= maxCandy){
                result.add(true);
            } else result.add(false);
        }

        System.out.println(result);
    }
}
