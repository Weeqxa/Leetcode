package leetcode.leetcode_75.array_string.p1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int countFalse = 0;

        for (int candy : candies) {

            int maxCandies = candy + extraCandies;

            for (int i : candies) {

                if (i > maxCandies) {
                    countFalse++;
                }
            }

            if (countFalse > 0) {
                result.add(false);
                countFalse = 0;
            } else {
                result.add(true);
            }
        }

        return result;
    }
}
