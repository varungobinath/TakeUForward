package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeMain {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    private static Node insert(int data,Node root){
        if(root==null){
            return new Node(data);
        }
        if (data < root.data)
            root.left = insert(data,root.left);
        else if (data > root.data)
            root.right = insert(data,root.right);

        return root;
    }
    private static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    private static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    private static int countOfNodes(Node root){
        if(root==null) return 0;
        int left = countOfNodes(root.left);
        int right = countOfNodes(root.right);
        return left+right+1;
    }
    private static int sumOfNodes(Node root){
        if(root==null) return 0;
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        return left+right+root.data;
    }
    private static int maxHeight(Node root){
        if(root==null) return 0;
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        return Math.max(left,right)+1;
    }
    private static boolean hasSumPath(int target,Node root){
        if(root==null) return false;
        if(root.left==null && root.right==null) return root.data==target;

        return hasSumPath(target-root.data,root.left) || hasSumPath(target-root.data,root.right);
    }
    private static Node convertMirror(Node root){
        if(root==null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        convertMirror(root.left);
        convertMirror(root.right);
        return root;
    }
    private static boolean isFullBinaryTree(Node root){//each node has either 2 or 0 children
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.left!=null && root.right!=null)
            return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);
        return false;
    }
    private static int level(Node root){
        int levels = 0;
        while(root!=null){
            levels++;
            root = root.left;
        }
        return levels;
    }
    private static boolean isPerfectBinaryTree(Node root,int levels){
        if(root==null) return true;
        if(root.left==null && root.right==null) return levels==1;
        if(root.left==null || root.right==null) return false;
        return isPerfectBinaryTree(root.left,levels-1) && isPerfectBinaryTree(root.right,levels-1);
    }
    private static List<Integer> preorderIteration(Node root){
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            list.add(root.data);
            if(root.right!=null){
                stack.push(root.right);
            }
            if(root.left!=null){
                stack.push(root.left);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,6,7,2,4,1};
        Node root = null;
        for(int i : arr){
            root = insert(i,root);
        }
        root = convertMirror(root);
        System.out.println(preorderIteration(root));
        preorder(root);
    }
}
