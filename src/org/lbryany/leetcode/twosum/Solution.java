package org.lbryany.leetcode.twosum;

import java.util.Arrays;

public class Solution {


    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target)
                    return new int[] {i,j};
            }
        }
        return new int[]{};
    }

    public static void main(String args[]){
        int[] nums = {3,2,4};
        int target = 6;
        Solution test = new Solution();
        nums = test.twoSum(nums, target);
        System.out.println(Arrays.toString(nums));

    }
}
