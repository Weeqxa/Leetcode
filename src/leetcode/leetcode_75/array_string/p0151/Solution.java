package leetcode.leetcode_75.array_string.p0151;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {

        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
