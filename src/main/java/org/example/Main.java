package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    /**
     * Returns the number in the array nums that is closest to 0
     * If there are multiple numbers with the same distance from 0,
     * the function returns the largest of those numbers. If the array
     * is empty or null, the function returns null.
     *
     * @param nums Array of integers.
     * @return Integer containing the number closest to 0 or null if the array is empty or null.
     */
    public static Integer closestToZero(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int smallest = Integer.MAX_VALUE;
        int result = 0;
        for (int x : nums) {
            if (Math.abs(x) < Math.abs(smallest) || (Math.abs(x) == Math.abs(smallest) && x > smallest)) {
                smallest = x;
                result = x;
            }
        }

        return result;
    }
}
