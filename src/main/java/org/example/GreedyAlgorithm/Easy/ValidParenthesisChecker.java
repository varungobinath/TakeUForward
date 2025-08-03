package GreedyAlgorithm.Easy;

public class ValidParenthesisChecker {
    private static boolean check(String p,int ind,int count){
        if(count<0) return false;
        if(ind==p.length()) return count==0;

        if(p.charAt(ind)=='(') return check(p,ind+1,count+1);
        else if(p.charAt(ind)==')') return check(p,ind+1,count-1);
        else return check(p,ind+1,count+1) || check(p,ind+1,count-1) || check(p,ind+1,count);
    }
    private static boolean check(String p,int ind,int count,Boolean[][] memo){
        if(count<0) return false;
        if(ind==p.length()) return count==0;

        if(memo[ind][count]!=null) return memo[ind][count];

        if(p.charAt(ind)=='(') return memo[ind][count]=check(p,ind+1,count+1);
        else if(p.charAt(ind)==')') return memo[ind][count]=check(p,ind+1,count-1);
        else return memo[ind][count]=check(p,ind+1,count+1) || check(p,ind+1,count-1) || check(p,ind+1,count);
    }
    public static void main(String[] args) {
        String p = "(*)*))";
        System.out.println(check(p,0,0));
        Boolean[][] memo = new Boolean[p.length()][p.length()];
        System.out.println(check(p,0,0,memo));
        int min = 0;
        int max = 0;
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            if(ch=='('){
                min++;
                max++;
            }else if(ch==')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            if(min<0) min = 0;
            if(max<0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
