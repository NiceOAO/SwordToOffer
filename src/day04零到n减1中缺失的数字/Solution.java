package day04零到n减1中缺失的数字;

/**
 * 二分法查找判断中位大小是否与索引相等
 * 不相等 缺失的数字在左数组  相等则缺失的数字在右数组
 */
public class Solution {
    public int missingNumber(int[] nums) {
            int i = 0;
            int j = nums.length - 1;
            while (i <= j){
                int m = (i + j) / 2;
                // 相等则将左边界移至中心
                if(nums[m] == m){
                    i = m+1;
                    continue;
                }
                // 不相等则将右边界移至中心
                j = m - 1;
            }
            return i;
    }
}
