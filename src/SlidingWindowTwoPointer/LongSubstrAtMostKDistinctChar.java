package SlidingWindowTwoPointer;
/*Longest Substring With At Most K Distinct Characters*/

public class LongSubstrAtMostKDistinctChar {
    public static void main(String[] args) {
        String  s = "aababbcaacc";//6
        int k = 2;
        char[] str = s.toCharArray();
        int[] hash = new int[26];
        int disCharCount = 0;
        int m = 0,l = 0;
        for(int r=0;r<str.length;r++){
            char ch = str[r];
            hash[ch-'a']++;
            if(hash[ch-'a']==1){
                disCharCount++;
            }
            while(disCharCount>k){
                hash[str[l]-'a']--;
                if(hash[str[l]-'a']==0) disCharCount--;
                l++;
            }
            m = Math.max(m,r-l+1);
        }
        System.out.println(m);
    }
}
