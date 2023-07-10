//https://leetcode.com/problems/move-zeroes/
package com.animesh;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums  = {0,1,0,3,12};
        int x = nums.length;
        int left = 0;
        int right = 0;
        int temp;
        for (int i = 0; i < x; i++) {
            if (nums[right]==0){
                right++;
            }else {
            temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right++;
            }
        }
    }
}