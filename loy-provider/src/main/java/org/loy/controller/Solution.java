package org.loy.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int tarIndex[] = new int[2];
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
               tarIndex[0] = map.get(nums[i]);
               tarIndex[1] = i;
               return tarIndex;
           }else{
               map.put(target-nums[i],i); // 键为补值 值为下标
           }
        }

        return tarIndex;
    }
    public static void main(String[] args) {
        int nums[] = new int[]{2, 7, 11, 15};
        int target = 18;
        Solution solution = new Solution();
        int targetIndex[] = solution.twoSum(nums,target);
        System.out.println(Arrays.toString(targetIndex));
    }
}
