package SlidingWindowTwoPointer;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
//        if(s.length()==0 || t.length()==0 || s.length()<t.length()) return "";
        Map<Character,Integer> tmap = new HashMap<>();
        for(char ch : t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        Map<Character,Integer> smap = new HashMap<>();
        int minlen = Integer.MAX_VALUE;
        int minleft = -1;
        int minright = -1;
        int l = 0;
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            if(tmap.containsKey(ch)){
                smap.put(ch, smap.getOrDefault(ch, 0) + 1);
            }
            while(l<=r && isSmapFreqGtTmap(smap,tmap)){
                int len = r-l+1;
                if(minlen>len){
                    minlen = len;
                    minleft = l;
                    minright = r;
                }
                char chl = s.charAt(l);
                if(tmap.containsKey(chl)){
                    smap.put(chl,smap.getOrDefault(chl,0)-1);
                }
                l++;
            }
        }
        System.out.println((minlen==Integer.MAX_VALUE)?"":s.substring(minleft,minright+1));
    }
    public static boolean isSmapFreqGtTmap(Map<Character,Integer> smap, Map<Character,Integer> tmap){
        for(Character ch : tmap.keySet()){
            if(smap.getOrDefault(ch,0)<tmap.get(ch)){
                return false;
            }
        }
        return true;
    }
}
