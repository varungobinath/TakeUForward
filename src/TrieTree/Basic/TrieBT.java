package TrieTree.Basic;

public class TrieBT {
    static class Node{
        Node[] children;
        boolean isEndOfWord;
        public Node(){
            children = new Node[26];
            isEndOfWord = false;
        }
    }
    private static void insert(String word,Node root){
        Node node = root;
        for(char ch : word.toCharArray()){
            int ind = ch-'a';
            if(node.children[ind]==null){
                node.children[ind] = new Node();
            }
            node = node.children[ind];
        }
        node.isEndOfWord = true;
    }
    private static boolean contains(String word,Node root){
        for(char ch : word.toCharArray()){
            int ind = ch-'a';
            if(root.children[ind]==null){
                return false;
            }
            root = root.children[ind];
        }
        return root.isEndOfWord;
    }
    private static boolean isPrefixExist(String word,Node root){
        for(char ch : word.toCharArray()){
            int ind = ch-'a';
            if(root.children[ind]==null){
                return false;
            }
            root = root.children[ind];
        }
        return true;
    }
    private static boolean isEmpty(Node node) {
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                return false;
            }
        }
        return true;
    }
    static boolean remove(Node root, String word, int depth) {
        if (root == null) {
            return false;
        }
        // If at the end of the word
        if (depth == word.length()) {
            if (!root.isEndOfWord) {
                return false; // Word not present
            }
            // Unmark end of word
            root.isEndOfWord = false;
            // If no children, signal to delete this node
            return isEmpty(root);
        }
        int index = word.charAt(depth) - 'a';
        if (root.children[index] == null) {
            return false; // Word not present
        }
        // Recurse to next character
        boolean shouldDeleteChild = remove(root.children[index], word, depth + 1);
        // If child should be deleted
        if (shouldDeleteChild) {
            root.children[index] = null;
            // Check if current node should also be deleted
            return !root.isEndOfWord && isEmpty(root);
        }
        return false;
    }
    private static void remove(String word,Node root){
//        remove(root,word,0);
        for(char ch : word.toCharArray()){
            int idx = ch-'a';
            if(root.children[idx]!=null){
                root = root.children[idx];
            }else{
                return;
            }
        }
        root.isEndOfWord = false;
    }

    static void display(Node root,String str){
        if(root.isEndOfWord) System.out.println(str);

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
        insert("can",t);
        insert("came",t);
        insert("camel",t);
        insert("apple",t);
        System.out.println(contains("apple",t));
        System.out.println(contains("app",t));
        display(t);
        remove("camel",t);
        System.out.println("================");
        display(t);
    }
}
