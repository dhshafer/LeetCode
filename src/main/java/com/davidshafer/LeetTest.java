package com.davidshafer;

public class LeetTest {
    /*
    Given an array of integers (nums) and an integer (target), return two indices that add up to target.
    You may assume that each input would have exactly one solution.
    You may not use the same element twice.
    The indices should be in ascending order.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    answer[0]= i;
                    answer[1]= j;
                    return answer;
                }
            }
        }
        return null;
    }
}
