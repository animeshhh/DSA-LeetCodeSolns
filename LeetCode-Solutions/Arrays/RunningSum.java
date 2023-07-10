package com.animesh;
import java.util.*;
public class RunningSum{
    public int[] main(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
