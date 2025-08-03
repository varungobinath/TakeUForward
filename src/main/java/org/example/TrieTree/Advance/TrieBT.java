package TrieTree.Advance;

public class TrieBT {
    static class Node{
        Node[] children;
        int prefixCount;
        int wordCount;
        Node(){
            children = new Node[26];
            prefixCount = wordCount = 0;
        }
    }

    private static void insert(String word,Node root){
        Node node = root;
        for(char ch : word.toCharArray()){
            int idx = ch-'a';
            if(node.children[idx]==null){
                node.children[idx] = new Node();
            }
            node = node.children[idx];
            node.prefixCount ++;
        }
        node.wordCount++;
    }
    private static int countOfWordsEqualTo(String word,Node root){
        for(char ch : word.toCharArray()){
            int idx = ch-'a';
            if(root.children[idx]==null){
                return 0;
            }
            root = root.children[idx];
        }
        return root.wordCount;
    }
    private static int countOfWordsStartsWith(String word,Node root){
        for(char ch : word.toCharArray()){
            int idx = ch-'a';
            if(root.children[idx]==null){
                return 0;
            }
            root = root.children[idx];
        }
        return root.prefixCount;
    }
    private static void remove(String word,Node root){
        if(countOfWordsEqualTo(word,root)>0){
            for(char ch : word.toCharArray()){
                root = root.children[ch-'a'];
                root.prefixCount--;
            }
            root.wordCount--;
        }
    }
    private static void removeAll(String word,Node root){
        int count = countOfWordsEqualTo(word,root);
        if(count>0){
            for (char ch : word.toCharArray()){
                root = root.children[ch-'a'];
                root.prefixCount-=count;
            }
            root.wordCount-=count;
        }
    }
    static void display(Node root,String str){
        if(root.wordCount>0){
            System.out.println(str+" = "+root.wordCount);
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                display(root.children[i],str+(char)(i+'a'));
            }
        }
    }
    private static void display(Node root){
        display(root,"");
    }
    public static void main(String[] args) {
        Node t = new Node();
        insert("apple",t);
        insert("apple",t);
        insert("app",t);
        insert("apple",t);
        insert("ape",t);
        display(t);
        System.out.println("====================");
        remove("apple",t);
        display(t);
        System.out.println("====================");
        removeAll("apple",t);
        display(t);
    }
}
