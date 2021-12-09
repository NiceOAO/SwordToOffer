package day04数组中重复的数字;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int a : nums){
            if(hashSet.add(a)){
                continue;
            }
            return a;
        }
        return -1;
    }
}
