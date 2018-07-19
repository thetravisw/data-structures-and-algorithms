package Whiteboard06_Append_LinkedLists;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {
    ListNode TestList = new ListNode(5);

    @BeforeEach
    void setup(){
        TestList.Append(7);
        TestList.Append(4);
        TestList.Append(156);
        TestList.Append(42);
    }


    @Test
    void RedTest (){
        assertTrue(false);
    }

    @Test
    void GreenTest(){
        assertTrue(true);
    }

    @Test
    void nthFromEndTest1() {
        assertEquals(4, TestList.NthFromEnd(2).data);
    }


    @Test
    void nthFromEndGrabEnd(){
        assertEquals(42, TestList.NthFromEnd(0).data);
    }

}