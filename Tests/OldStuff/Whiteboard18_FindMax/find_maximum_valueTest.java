package OldStuff.Whiteboard18_FindMax;

import OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.BinaryTree;
import OldStuff.Whiteboard16_Fizzbuzz_Tree.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class find_maximum_valueTest {

    @Test
    void testmax () {
        BinaryTree test1 = new BinaryTree();
        BinaryTree test2 = new BinaryTree();
        BinaryTree test3 = new BinaryTree();

        test1.add(5);
        test1.add(11);
        test1.add(42);

        test2.add(20);

        test3.add(-55);
        test3.add(-9);

        assertEquals(42, find_maximum_value.find_maximum_value(test1));
        assertEquals(20, find_maximum_value.find_maximum_value(test2));
        assertEquals(-9, find_maximum_value.find_maximum_value(test3));
    }
}