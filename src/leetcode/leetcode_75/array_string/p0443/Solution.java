package leetcode.leetcode_75.array_string.p0443;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(solution.compress(new char[]{'a'}));
        System.out.println(solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));


    }

    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char current = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                count++;
                read++;
            }

            chars[write] = current;
            write++;

            if (count > 1) {
                String str = String.valueOf(count);
                for (int i = 0; i < str.length(); i++) {
                    chars[write] = str.charAt(i);
                    write++;
                }
            }
        }
        return write;
    }
}
