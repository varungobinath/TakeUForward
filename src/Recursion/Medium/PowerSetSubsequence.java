package Recursion.Medium;

public class PowerSetSubsequence {
    private static void generateSequence(String str,int ind,int n,String s){
        if(ind==n){
            System.out.println(s);
            return;
        }
        generateSequence(str,ind+1,n,s+str.charAt(ind));
        generateSequence(str,ind+1,n,s);
    }
    public static void main(String[] args) {
        String str = "abc";
        generateSequence(str,0,str.length(),"");
    }
}
