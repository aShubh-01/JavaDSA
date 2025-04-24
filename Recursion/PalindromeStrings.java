package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

class PalindromeStrings {
    public static void main(String[] args) {
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList("Madam", "Level", "world", "radar", "hello"));
        ArrayList<String> palindromeWords = new ArrayList<>();
        for(String word : wordsList) {
            if(isPalindromeString(word, 0, word.length() - 1)) palindromeWords.add(word);
        }
        System.out.println(palindromeWords);
    }

    static boolean isPalindromeString(String word, int firstIndex, int lastIndex) {
        if(firstIndex > lastIndex) return true;
        if(Character.toLowerCase(word.charAt(firstIndex)) != Character.toLowerCase(word.charAt(lastIndex))) return false;
        return isPalindromeString(word, firstIndex + 1, lastIndex - 1);
    }
}

/*
arr = ["Madam", "level", "dog"]
we need to return an array with only palindrome strings in it
approach -  
    for(String word : palindromeString) {
        if(!findPalindromeString(word)) palindromeString.remove(word)
    }
    print(palindromeString)
*/