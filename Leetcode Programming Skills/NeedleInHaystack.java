class NeedleInHaystack {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutbad", "but"));
    }
    static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        
        if(nLen == 0) return 0;

        for(int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            while(j < nLen && haystack.charAt(i+j) == needle.charAt(j)) j++;
            if(j == nLen) return i;
        }

        return -1;
    }
}
