package OldStuff.Whiteboard18_FindMax;

import OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.BinaryTree;
import OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class find_maximum_value {

    public static void main(String[] args) { }

    public static int find_maximum_value(BinaryTree tree){
        return find_maximum_value(tree.getRoot());
    }

    private static int find_maximum_value(TreeNode node){
        Queue<OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.TreeNode> qq = new LinkedList<>();
        qq.add(node);
        int max = qq.peek().data;

        while(!qq.isEmpty()){
            node = qq.remove();
            if (node.left != null){
                qq.add(node.left);
            }
            if (node.right != null){
                qq.add(node.right);
            }
            max = (max > node.data) ? max : node.data;
        }
    return max;
    }
}

