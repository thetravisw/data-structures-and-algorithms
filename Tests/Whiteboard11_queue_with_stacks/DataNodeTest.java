package Whiteboard11_queue_with_stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataNodeTest {
    DataNode EmptyTest = new DataNode(0);
    DataNode Test1 = new DataNode(42);
    DataNode TestSeveral = new DataNode(8);

    @BeforeEach
    private void setup(){
        EmptyTest.remove();
        TestSeveral.add(67);
        TestSeveral.add(5);
        TestSeveral.add(30);
    }



    @Test
    void addEmpty () {
        EmptyTest.add(4);
        assertEquals(4, EmptyTest.head.data);
        assertEquals(4, EmptyTest.tail.data);
    }

    @Test
    void addTest1 () {
        Test1.add(7);
        assertEquals(7, Test1.tail.data);
        assertEquals(7, Test1.head.link.data);
        assertEquals(42, Test1.head.data);
    }

    @Test
    void addTestSeveral () {
        TestSeveral.add(9);
        assertEquals(9, TestSeveral.tail.data);
        }

    @Test
    void remove1() {
        assertEquals(42, Test1.remove());
    }

    void RemoveSeveral(){
        assertEquals(8, TestSeveral.remove());
        assertEquals(67, TestSeveral.remove());
    }
}