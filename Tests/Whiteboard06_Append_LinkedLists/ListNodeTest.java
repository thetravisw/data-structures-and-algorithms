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

    @Test
    void ContainsLoops1(){

        //  Setting up a circular list
        ListNode newnode = new ListNode(5, TestList.root);
        ListNode current= TestList.root;
        while (current.link != null){
            current = current.link;
        }
        current.link= newnode;
        assertTrue(TestList.hasLoop());
    }

    @Test
    void ContainsLoops2(){
        assertFalse(TestList.hasLoop());
    }

    @Test
    void ContainsLoops3(){
        ListNode newlist = new ListNode(5);
        newlist.link=newlist;
        assertTrue(newlist.hasLoop());
    }

    @Test
    void ContainsLoops4(){
        ListNode newlist = new ListNode(5);
        assertFalse(newlist.hasLoop());
    }

}