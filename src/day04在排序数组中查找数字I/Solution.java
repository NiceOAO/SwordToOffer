package day04在排序数组中查找数字I;

/**
 * 二分法查找 target右边界位置 target-1的右边界位置
 * 相减得到目标数字的数量
 */
public class Solution {
    public int search(int[] nums, int target) {
        return findRightEdge(nums, target) - findRightEdge(nums, target - 1);
    }
    private int findRightEdge(int[] nums, int target){
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            // 因为是已经经过排序的数组，可以通过中间来确定目标位置
            int m = (i + j) / 2;
            if (nums[m] <= target) {
                i = m + 1;
                continue;
            }
            j = m - 1;
        }
        return i;
    }
}
