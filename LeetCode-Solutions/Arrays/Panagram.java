package com.animesh;

public class Panagram {
    public static void main(String[] args) {
        String str = "Animesh";
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        int count = 0;
        int x = ch.length;
        for(char c : ch){
            for (int i = 0; i < x; i++) {
                if (ch[i]==ch[i+1]){
                    System.out.println("this is not a pangram");
                }else{
                    System.out.println("is a pangram");
                }
            }
        }
    }
}
