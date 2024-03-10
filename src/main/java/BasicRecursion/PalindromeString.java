package BasicRecursion;

public class PalindromeString {
    private static boolean isPalindrome(String s){
        int n = s.length();
        int low = 0,high = n-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    private static boolean isPalindromer(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalindromer(s,i+1,j-1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdcba"));
        System.out.println(isPalindromer("abcdcba",0,7-1));
    }
}
