package com.animesh;

public class sumandarray {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66,77,88,99};
        int count = 0;
        int max = arr[0];
        for (int i =1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("LARGEST = "+max);
    }
}
