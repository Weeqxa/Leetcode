package leetcode.leetcode_75.array_string.p0334;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        System.out.println(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second =Integer.MAX_VALUE;

        for (int num : nums) {

            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
