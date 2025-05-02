package Recursion;

import java.util.ArrayList;

public class CheckAllInstancesOfTargetElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 4, 5};
        int target = 3;
        ArrayList<Integer> answers = checkInstances(arr, target, 0, new ArrayList<>());
        System.out.println(answers);
    }

    static ArrayList<Integer> checkInstances(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) return list;
        if(target == arr[index]) list.add(index);
        return checkInstances(arr, target, index + 1, list);
    }
}
