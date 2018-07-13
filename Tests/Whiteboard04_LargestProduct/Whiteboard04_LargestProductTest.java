package Whiteboard04_LargestProduct;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Whiteboard04_LargestProductTest {

    @Test
    void largestProduct() {
        int[][] data = {
                {1, 2, 1},
                {2, 4, 2},
                {3, 6, 8},
                {7, 8, 1}
        };
        int result = Collections.max(set);
        assertEquals(64, result);
    }
}