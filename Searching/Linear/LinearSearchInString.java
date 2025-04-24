package Searching.Linear;

public class LinearSearchInString {
    public static void main(String[] args){
        String sentence = "my name is shubham,nice to meet you!";
        char target = 's';
        for(int index = 0; index < sentence.length(); index++){
            if(sentence.charAt(index) == target){
                System.out.println(index);
                break;
            }
        }
    }
}
