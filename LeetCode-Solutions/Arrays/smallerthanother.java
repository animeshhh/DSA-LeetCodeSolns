package com.animesh;

public class smallerthanother {
    public static void main(String[] args) {
        int nums[] = new int[5];
        nums[0] = 8;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 2;
        nums[4] = 3;
       int x = nums.length;

        //you have to count
        // the number of valid j's such that j != i and nums[j] < nums[i].
        int ans[] = new int[x];
        for (int i = 0; i < x ; i++) {
            int count = 0;
            for (int j = 0; j < x; j++) {
                if (j != i && nums[j] < nums[i]){
                    count+=1;
                }
            }
            ans[i]= count;
            System.out.println(ans);
        }
    }
}
