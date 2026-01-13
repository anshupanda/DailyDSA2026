package com.coding.dsa.jan2026.PrefixSum;

import java.util.Scanner;
/*
Problem Description
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal
 to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding
 sum of elements is considered as 0.

Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105

Input Format
First arugment is an array A .

Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.

Example Input
Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]
Input 2:
A = [1, 2, 3]

Example Output
Output 1:
3
Output 2:
-1
 */
public class Day5P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(getEqIndex(arr));
    }

    private static long getEqIndex(long[] arr) {
        int n = arr.length;
        // prefix sum
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        //equilibrium index
        int c=0;
        long left=0;
        long right=0;
        for(int i=0;i<n;i++){
            if(i==0){
                left=0;
            } else {
                left = arr[i-1];
            }
            right = arr[n-1]-arr[i];
            if (left == right){
               return i;
            }
        }
        return -1;
    }
}
