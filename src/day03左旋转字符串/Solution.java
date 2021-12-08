package day03左旋转字符串;

/**
 * 左边截取n个字符移到右边
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {
        String leftString = s.substring(0, n);
        String rightString = s.substring(n, s.length());
        StringBuilder result = new StringBuilder();
        return result.append(rightString).append(leftString).toString();

//        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
