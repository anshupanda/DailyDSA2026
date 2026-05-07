package com.coding.dsa.may2026.carryforward;

import java.util.Scanner;
/*
Q2. Closest MinMax
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints

1 <= |A| <= 2000



Input Format

First and only argument is vector A



Output Format

Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input

Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output

Output 1:

 2
Output 2:

 3


Example Explanation

Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.

 */
public class Day2P1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }

    public static int solve(int[] A) {
        int n = A.length;
        int max = A[0];
        int min = A[0];
        for(int i=1;i<n ; i++) {
            max = Math.max (max, A[i]);
            min = Math.min (min, A[i]);
        }
        int smallestLength = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        for (int i=n-1;i>=0;i--) {
            if(A[i]==max) {
                maxIndex = i;
                if (minIndex!=-1)
                smallestLength =Math.min(smallestLength , (minIndex - maxIndex)+1);
            }
            if (A[i]==min){
                minIndex =i;
                if (maxIndex!=-1)
                smallestLength =Math.min(smallestLength , (maxIndex - minIndex)+1);
            }
        }
        return smallestLength;
    }
}
//[377,448,173,307,108]