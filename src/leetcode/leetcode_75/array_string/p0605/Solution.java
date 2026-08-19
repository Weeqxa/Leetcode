package leetcode.leetcode_75.array_string.p0605;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(new int[]{0, 1, 0}, 1));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) return true;

        if (flowerbed.length == 1) return flowerbed[0] == 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            } else if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }

            if (i > 0 && i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
