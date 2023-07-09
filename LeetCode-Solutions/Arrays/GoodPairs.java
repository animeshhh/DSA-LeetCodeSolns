package com.animesh;

public class GoodPairs {
    public static void main(String[] args) {
        int nums[] = new int[6];
        nums[0] = 1;
        nums[1] =2;
        nums[2] = 3;
        nums[3] =1;
        nums[4] =1;
        nums[5] =3;
        int x = nums.length;

        int num[] = new int[6];
        num[0] = 1;
        num[1] =2;
        num[2] = 3;
        num[3] =1;
        num[4] =1;
        num[5] =3;
        int count =0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (nums[i]==num[j] && i < j) {
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
