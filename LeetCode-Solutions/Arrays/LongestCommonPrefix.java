package com.animesh;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"animesh","aniket","ankit"};
        int x = strs.length,len=0,c=0;
        String longest = "",shortest ="";
        for(int i=0;i<x-1;i++) {
            int a = strs[i].length(), b = strs[i + 1].length();
            if (a > b) {
                len = b;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < x-1; j++) {
                String st = strs[j].substring(0,i);
                if (st == strs[j+1].substring(0,i)){
                    c++;
                }
            }
            c=0;

        }
    }
}
