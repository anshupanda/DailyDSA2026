package com.coding.dsa.may2026.carryforward;

/*
You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 */
import java.util.Scanner;

public class Day1P1 {
     static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        System.out.println(solve(input));
    }

    public static int solve(String A) {
        int ans =1;
        int pairCount=0;
        int countG=0;
        char[] inputChar = A.toCharArray();
        int n = inputChar.length;
        for(int i= n-1;i>=0;i--) {
            if(inputChar[i]=='G') {
                countG++;
            }
            if(inputChar[i]=='A'){
                ans = ans * countG;
                pairCount+=ans;
                ans =1;
            }
        }
        return pairCount;
    }
}
