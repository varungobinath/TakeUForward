package Recursion.Hard;

public class WordSearch {
    private static boolean search(char[][] letters,String word,int r,int c,int row,int col,int idx){
        if(idx==word.length()){
            return true;
        }
        if(r>=row || c>=col || r<0 || c<0 || letters[r][c]=='*' || letters[r][c]!=word.charAt(idx)) return false;
        letters[r][c] = '*';
        if(search(letters,word,r,c+1,row,col,idx+1) ||
        search(letters,word,r,c-1,row,col,idx+1) ||
        search(letters,word,r+1,c,row,col,idx+1) ||
        search(letters,word,r-1,c,row,col,idx+1)) return true;
        letters[r][c] = word.charAt(idx);
        return false;
    }
    public static void main(String[] args) {
        char[][] letters = {
                {'g','i','z'},
                {'e','e','k'},
                {'q','s','e'}
        };
        String word = "geek";
        int row = letters.length;
        int col = letters[0].length;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(word.charAt(0)==letters[r][c]){
                    if(search(letters,word,r,c,row,col,0)){
                        System.out.println(true);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
}
