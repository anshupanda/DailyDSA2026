package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;
/*
Problem Description
Given an array of integers A and multiple values in B, which represents the number of times array
A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where
ith row represents the rotated array for the ith value in B.

Problem Constraints
1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000

Input Format
The first argument given is the integer array A.
The second argument given is the integer array B.

Output Format
Return the resultant matrix.
Example Input
Input 1:
    A = [1, 2, 3, 4, 5]
    B = [2, 3]
Input 2:
    A = [5, 17, 100, 11]
    B = [1]

Example Output
Output 1:
    [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]
Output 2:
    [ [17, 100, 11, 5] ]
 */
public class Day3P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int[][] sol = solve(arr,arr1);
        for (int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[] A, int[] B) {
       int n = A.length;
       int m = B.length;
       int[][] sol = new int[m][n];

      for (int i=0;i<m;i++) {
          int[] temp = new int[n];
          for (int j=0;j<n;j++) {
              temp[j] = A[j];
          }

          int len = A.length-1;
          int k = B[i]%len;
          rotateLeft(A,0,len);
          rotateLeft(A,0,len-k);
          rotateLeft(A,len-k+1,len);
          sol[i] = A;
          A=temp;
      }
        return sol;
    }

    private static void rotateLeft(int[] a, int start, int end) {

            while(start<end) {
                a[start] = a[start]^a[end];
                a[end] = a[start]^a[end];
                a[start] = a[start]^a[end];
                start++;
                end--;
            }
    }
}
