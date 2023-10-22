package org.example;
import org.junit.Test;
import static org.junit.Assert.*;


public class ClosestToZeroTest {

    @Test
    public void testPositiveNumbers() {
        int[] nums = {1, 2, 3};
        assertEquals((Integer) 1, Main.closestToZero(nums));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -2, -3};
        assertEquals((Integer) (-1), Main.closestToZero(nums));
    }

    @Test
    public void testMixedNumbers() {
        int[] nums = {1, -1, 2, -2};
        assertEquals((Integer) 1, Main.closestToZero(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertNull(Main.closestToZero(nums));
    }
}
