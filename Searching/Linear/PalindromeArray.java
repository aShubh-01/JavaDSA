package Searching.Linear;

public class PalindromeArray {
    public static void main(String[] args){
        String[] arr = {"m","a","d","m"};
        for(int index = 0; index < arr.length / 2; index++){
            if(arr[index].equals(arr[arr.length - index - 1])){
                continue;
            } else {
                System.out.println("It is not palindrome array");
                return;
            }
        }

        System.out.println("It is palindrome array");
    }
}
