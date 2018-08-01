package Whiteboard17_BreadthFirstTraversal.tree;

import java.util.ArrayList;

public class BinaryTree {
    private TreeNode root;

    public TreeNode getRoot(){
        return root;
    }

    public void add(int val) {
        if (this.root == null) {
            this.root = new TreeNode(val);
            return;
        }
        this.add(val, this.root);
    }

    private void add(int val, TreeNode current){
        if (current.left == null && current.data >= val){
            current.left = new TreeNode(val);
        } else if (current.right == null && current.data < val){
            current.right = new TreeNode(val);
        } else {
            if (val <= current.data) {
                add(val, current.left);
            } else if (val > current.data) {
                add(val, current.right);
            }
        }
    }


    private static ArrayList<Integer> treevals = new ArrayList<Integer>();
    public ArrayList<Integer> inorder(){
        treevals.clear();
        return inorder(this.root);
    }

    private ArrayList<Integer> inorder(TreeNode node){
        if (node == null){
            return null;
        }else{
            inorder(node.left);
            treevals.add(node.data);
            inorder(node.right);
        }
        return treevals;
    }

    public ArrayList<Integer> preOrder(){
        treevals.clear();
        return preOrder(this.root);
    }

    private ArrayList<Integer> preOrder (TreeNode node){
        if(node !=  null) {
            treevals.add(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
        return treevals;
    }

    public ArrayList<Integer> postOrder(){
        treevals.clear();
        return postOrder(this.root);
    }

    private ArrayList<Integer> postOrder (TreeNode node){
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            treevals.add(node.data);
        }
        return treevals;
    }

    @Override
    public String toString() {
        return this.inorder().toString();
    }

    public int min (){
        return this.inorder().get(0);
    }

//    public int size (){
//        return this.inorder().size();
//    }
    //  Steve told me to do this by actually going through the tree recursively.   Sad.

    int length;
    public int size() {
        length = 0;
        return size(this.root);
    }

    private int size(TreeNode node){
    if (node != null){
        size(node.left);
        size(node.right);
        length++;
    }
    return length;
    }

    public boolean contains (int num) {
        return this.inorder().contains(num);
    }
}