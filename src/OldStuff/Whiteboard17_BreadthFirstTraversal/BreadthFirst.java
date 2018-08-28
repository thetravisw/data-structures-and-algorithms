package OldStuff.Whiteboard17_BreadthFirstTraversal;

import OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.BinaryTree;
import OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(18);
        tree.add(15);
        tree.add(22);
        tree.add(42);
        tree.add(90);
        tree.add(124);
        tree.add(30);
        tree.add(130);
        tree.add(7);

        BinaryTree noll = new BinaryTree();

        BreadthFirst(tree);
        System.out.println("/////////////////////////////////////////");
        BreadthFirstRecursive(tree);
    }

    public static void BreadthFirst (BinaryTree tree) {
        BreadthFirst(tree.getRoot());
    }

    private static void BreadthFirst (TreeNode node){
        Queue<TreeNode> qq = new LinkedList<>();
        ((LinkedList<TreeNode>) qq).add(node);

        while(!qq.isEmpty()){
            node = ((LinkedList<TreeNode>) qq).remove();
            if (node.left != null){
                ((LinkedList<TreeNode>) qq).add(node.left);
            }
            if (node.right != null){
                ((LinkedList<TreeNode>) qq).add(node.right);
            }

            System.out.println(node.data);
        }
    }

    public static void BreadthFirstRecursive (BinaryTree tree) {
        Queue<TreeNode> qq = new LinkedList();
        qq.add(tree.getRoot());
        BreadthFirstRecursive(qq);
    }

    private static void BreadthFirstRecursive(Queue<TreeNode> qq){
        if (qq.isEmpty()) return;

        TreeNode node = qq.remove();
        System.out.println(node.data);
        if (node.left != null) qq.add(node.left);
        if (node.right != null) qq.add(node.right);
        BreadthFirstRecursive(qq);
    }
    }




