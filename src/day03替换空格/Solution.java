package day03替换空格;

public class Solution {
    public String replaceSpace(String s) {
        // 直接使用库函数
        return s.replace(" ","%20");
        // 或者使用charAt(int index) 循环挨个判断 拼进StringBuilder

    }
}
