package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;
/*
Second Largest
Problem Description

You are given an integer array A. You have to find the second largest element/value
 in the array or report that no such element exists.

Problem Constraints
1 <= |A| <= 105
0 <= A[i] <= 109

Input Format
The first argument is an integer array A.

Output Format
Return the second largest element. If no such element exist then return -1.

Example Input
Input 1:
 A = [2, 1, 2]
Input 2:
 A = [2]

Example Output
Output 1:
 1
Output 2:
 -1
 */
public class Day2P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
