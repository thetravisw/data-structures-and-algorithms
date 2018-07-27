package Whiteboard_14_MaxStack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class maxTest {

    @Test
    void test1() {
        Stack<Integer> ss = new Stack<Integer>();
        ss.push(5);
        assertEquals(5, ss.max());
        //  I have no idea why I can't access .max() here.  Pretty sure
        // the code itself works fine though.  It's just my testing that sucks.

    }
}