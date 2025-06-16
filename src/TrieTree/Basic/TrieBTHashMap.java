package TrieTree.Basic;

import java.util.HashMap;

public class TrieBTHashMap {
    static class Node{
        HashMap<Character,Node> children;
        boolean isEndOfWord;
        public Node(){
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }

    private static Node insert(String word,Node root){
        Node node = root;
        for(char ch : word.toCharArray()){
            if(!node.children.containsKey(ch)){
                node.children.put(ch,new Node());
            }
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
        return root;
    }
    private static boolean contains(String word,Node root){
        for(char ch : word.toCharArray()){
            if(root.children.containsKey(ch)){
                root = root.children.get(ch);
            }else{
                return false;
            }
        }
        return root.isEndOfWord;
    }
    private static boolean isPrefixExist(String word,Node root){
        for(char ch : word.toCharArray()){
            if(root.children.containsKey(ch)){
                root = root.children.get(ch);
            }else{
                return false;
            }
        }
        return true;
    }
    static boolean remove(Node root, String word, int depth) {
        if (root == null) {
            return false;
        }
        // If end of word is reached
        if (depth == word.length()) {
            if (!root.isEndOfWord) {
                return false; // Word not present
            }
            // Unmark end of word
            root.isEndOfWord = false;
            // If no children, signal this node can be deleted
            return root.children.isEmpty();
        }
        char ch = word.charAt(depth);
        Node child = root.children.get(ch);
        if (child == null) {
            return false; // Word not present
        }
        // Recurse to next character
        boolean shouldDeleteChild = remove(child, word, depth + 1);
        // If child should be deleted
        if (shouldDeleteChild) {
            root.children.remove(ch);
            // Return true if current node has no other children and is not end of word
            return root.children.isEmpty() && !root.isEndOfWord;
        }
        return false;
    }
    private static void remove(String word,Node root){
        remove(root,word,0);
    }
    static void display(Node root, String str){
        if(root.isEndOfWord) System.out.println(str);
        for(char ch : root.children.keySet()){
            String s = String.valueOf((char)(ch));
            display(root.children.get(ch), str+s);
        }
    }
    private static void display(Node root){
        display(root,"");
    }

    public static void main(String[] args) {
        Node t = new Node();
        t = insert("can",t);
        t = insert("came",t);
        t = insert("camel",t);
        t = insert("apple",t);
        System.out.println(contains("came",t));
        System.out.println(contains("cane",t));
        display(t);
        System.out.println("=============");
        remove("came",t);
        display(t);

    }
}
