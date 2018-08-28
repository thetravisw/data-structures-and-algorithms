package OldStuff.Whiteboard16_Fizzbuzz_Tree;


import OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.BinaryTree;
import OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.TreeNode;

public class FizzbuzzTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(18);
        tree.add(15);
        tree.add(22);
        tree.add(42);
        tree.add(90);
        tree.add(124);
        tree.add(130);
        tree.add(7);

        BinaryTree noll = new BinaryTree();

        fizzBuzzTree(tree);
        fizzBuzzTree(noll);
    }

    public static void fizzBuzzTree(BinaryTree tree){
        fizzBuzzTree(tree.getRoot());
    }

    private static void fizzBuzzTree(TreeNode current){
        if (current == null){
            return;
        }
        fizzBuzzTree(current.left);
        processval(current.data);
        fizzBuzzTree(current.right);
    }

    public static void processval(int val){
        if (val %15 == 0){
            System.out.println("fizzbuzz (" + val +")");
        } else if (val % 5 ==0) {
            System.out.println("fizz (" + val +")");
        } else if (val % 3 ==0) {
            System.out.println("buzz (" + val +")");
        } else{
            System.out.println(val);
        }
    }
}


