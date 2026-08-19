package leetcode.leetcode_75.array_string.p0345;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("IceCreAm"));
    }

    public String reverseVowels(String s) {

        String[] parts = s.split("");
        System.out.println(Arrays.toString(parts));

        List<String> vowels = new ArrayList<>();

        for (String part : parts) {
            if (part.equals("a") || part.equals("e") || part.equals("i") || part.equals("o") || part.equals("u") || part.equals("A") || part.equals("E") || part.equals("I") || part.equals("O") || part.equals("U")) {
                vowels.add(part);
            }
        }

        vowels = vowels.reversed();
        System.out.println(vowels);

        StringBuilder sb = new StringBuilder();

        for (String word : parts) {

            if (word.equals("a") || word.equals("e") || word.equals("i") || word.equals("o") || word.equals("u") || word.equals("A") || word.equals("E") || word.equals("I") || word.equals("O") || word.equals("U")) {

                sb.append(vowels.getFirst());
                vowels.removeFirst();
            } else {
                sb.append(word);
            }

        }

        return sb.toString();
    }

}
