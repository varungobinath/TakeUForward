package SlidingWindowTwoPointer;

public class SubString3Character {
    public static void main(String[] args) {
        String s = "abcabc";
        char[] str = s.toCharArray();
        int a = -1,b = -1,c = -1;
        int count = 0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='a') a=i;
            else if(str[i]=='b') b=i;
            else c=i;
            count += 1 + Math.min(a,Math.min(b,c));
        }
        System.out.println(count);
    }
}
