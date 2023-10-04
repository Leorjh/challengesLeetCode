package test;

import TwoSum.TwoSum;

import jdk.jfr.Name;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSumResult01() {
        TwoSum solution = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        assertArrayEquals(new int[]{0, 1}, result1);
    }
    @Test
    public void testTwoSumResult12() {
        TwoSum solution = new TwoSum();

        int[] numbs2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(numbs2, target2);
        assertArrayEquals(new int[]{1, 2}, result2);
    }

    @Test
    public void testTwoSumResult23() {
        TwoSum solution = new TwoSum();

        int[] numbs = {3, 3, 9, 14};
        int target3 = 23;
        int[] result3 = solution.twoSum(numbs, target3);
        assertArrayEquals(new int[]{2, 3}, result3);

    }
    @Test
    public void testTwoSumResultNil() {

        TwoSum solution = new TwoSum();

        int[] numbs4 = {1, 2, 3, 4};
        int target4 = 10;
        int[] result4 = solution.twoSum(numbs4, target4);
        assertArrayEquals(new int[]{}, result4);
    }
}