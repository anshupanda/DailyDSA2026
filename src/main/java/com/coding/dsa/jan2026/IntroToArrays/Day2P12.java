package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;
/*
MINIMUM PICKS
Problem Description
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.

Problem Constraints
2 <= N <= 1e5
-1e9 <= A[i] <= 1e9
There is atleast 1 odd and 1 even number in A

Input Format
The first argument given is the integer array, A.
Output Format
Return maximum among all even numbers of A - minimum among all odd numbers in A.

Example Input
Input 1:
 A = [0, 2, 9]
Input 2:
 A = [5, 17, 100, 1]

Example Output
Output 1:
-7
Output 2:
99
 */
public class Day2P12 {
    public static int solve(int[] A) {
        int maxEven=Integer.MIN_VALUE;
        int minOdd=Integer.MAX_VALUE;
for(int i=0;i<A.length;i++){
    if(A[i]%2==0 && maxEven<A[i]){
            maxEven = A[i];
    } else if(A[i]%2==1 && minOdd>A[i]) {
            minOdd=A[i];
    }
}
return maxEven-minOdd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }
}
