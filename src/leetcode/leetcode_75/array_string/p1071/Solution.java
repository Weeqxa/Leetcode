package leetcode.leetcode_75.array_string.p1071;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.gcdOfStrings("ABCABC","ABC"));
        System.out.println(s.gcdOfStrings("ABABAB","ABAB"));
        System.out.println(s.gcdOfStrings("LEET","CODE"));
        System.out.println(s.gcdOfStrings("LEETCODE","CODE"));
    }

    public String gcdOfStrings(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();

        while (len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }

        int gcd = len1;

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < gcd; i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return "";
            } else {
                str.append(str1.charAt(i));
            }
        }

        int str1parts = str1.length() / gcd;
        int str2parts = str2.length() / gcd;

        String gcdStr = str.toString();

        if (gcdStr.repeat(str1parts).equals(str1) && gcdStr.repeat(str2parts).equals(str2)){
            return gcdStr;
        }

        return "";
    }
}
