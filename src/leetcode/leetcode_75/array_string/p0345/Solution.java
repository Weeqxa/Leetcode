package leetcode.leetcode_75.array_string.p0345;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("IceCreAm"));
    }

    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        System.out.printf("chars: %s\n", Arrays.toString(chars));

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
