class AddAlternateStringCharacters {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "xyz"));    
    }

    static String mergeAlternately(String word1, String word2) {
        // String mergedString = "";
        // int word1Index = 0, word2Index = 0;
        // int flag = 0;
        // while(word1Index < word1.length() && word2Index < word2.length()) {
        //     switch(flag) {
        //         case 0 : {
        //             mergedString += word1.charAt(word1Index++);
        //             flag = 1;
        //         } break;
        //         case 1 : {
        //             mergedString += word2.charAt(word2Index++);
        //             flag = 0;
        //         } break;
        //         default: {};
        //     }
        // }

        // while(word1Index < word1.length()) mergedString += word1.charAt(word1Index++);
        // while(word2Index < word2.length()) mergedString += word2.charAt(word2Index++);

        //Optimal Solution
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;
        while(i < n1 || j < n2) {
            if(i < n1) mergedString.append(word1.charAt(i++));
            if(j < n2) mergedString.append(word2.charAt(j++));
        }

        return mergedString.toString();
    }
}