package SlidingWindowTwoPointer;
/*
* length of longest substring without repeating character
* */
public class longSubstrWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";//3
        int n = s.length(),m = 0;
        char[] str = s.toCharArray();
        int[] hash = new int[26];
        int l = 0;
        for(int r=0;r<n;r++){
            char ch = str[r];
            hash[ch-'a']++;
            while(l<r && hash[ch-'a']>1){
                hash[l]--;
                l++;
            }
            m = Math.max(m,r-l+1);
        }
        System.out.println(m);
    }
}