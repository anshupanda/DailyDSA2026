package com.coding.dsa.jan2026.PrefixSum;

import java.util.Scanner;

/*
Range Sum Query
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
0 <= L <= R < N

Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.

Output Format
Return an integer array of length M where ith element is the answer for ith query in B.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]]

Example Output
Output 1:
[10, 5]
Output 2:
[2, 4]
 */
public class Day4P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int p = sc.nextInt();
        int q= sc.nextInt();
        int[][] B = new int[p][q];
        for(int i=0;i<p;i++){
            for (int j=0;j<q;j++){
                B[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        long[] ans = rangeSum(arr,B);
        for(long z : ans){
            System.out.println(z);
        }
    }

    public static long[] rangeSum(long[] A, int[][] B) {
        int n = A.length;
        long[] ans  = new long[B.length];

        for(int i=1;i<n;i++){
                A[i] = A[i-1] + A[i];
            }

        int length = B.length;
        for(int i=0;i<length;i++){
            int[] arr = B[i];
            int R = arr[1];
            int L = arr[0];
            if(L==0){
                ans[i] = A[R];
            }else{
                ans[i] = A[R] - A[L-1];
            }
        }
        return ans;
    }
}
