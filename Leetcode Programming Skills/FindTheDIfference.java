class FindTheDifference {
    
    public static void main(String[] args) {
        System.out.println(findTheDifference("abc", "abdc"));
    }

    static char findTheDifference(String s, String t) {
        if(t.length() == 1) return t.charAt(0);

        char addedChar = 0;

        for(char c : s.toCharArray()) addedChar ^= c;
        for(char c: t.toCharArray()) addedChar ^= c;

        return addedChar;
    }
}