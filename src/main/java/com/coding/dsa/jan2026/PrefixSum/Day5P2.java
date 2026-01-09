package com.coding.dsa.jan2026.PrefixSum;

import java.util.Scanner;

public class Day5P2 {
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
