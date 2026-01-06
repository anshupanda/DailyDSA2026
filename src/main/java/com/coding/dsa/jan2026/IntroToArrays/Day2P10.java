package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;

/*
Little Ponny and Maximum Element

Problem Description
Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the
array equal to -1.
He wants your help in finding out the minimum number of operations required such that the maximum element
 of the resulting array is B. If it is not possible, then return -1.

Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109

Input Format
The first argument of input contains an integer array, A.
The second argument of input contains an integer, B.

Output Format
Return an integer representing the answer.

Example Input
Input 1:
 A = [2, 4, 3, 1, 5]
 B = 3
Input 2:
 A = [1, 4, 2]
 B = 3

Example Output
Output 1:
 2
Output 2:
 -1

Example Explanation
Explanation 1:
 We need to remove 4 and 5 to make 3 the biggest element.
Explanation 2:
 As 3 doesn't exist in the array, the answer is -1.

 */
public class Day2P10 {
    public static int solve(int[] A, int B) {
        int count = 0;
        int exists =0;
        for (int i=0;i<A.length;i++){
            if(A[i]>B){
                count++;
            }
            if (A[i]==B){
                exists=1;
            }
        }
        if (count ==0 || exists==0){
            return -1;
        } else {
            return count;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(solve(arr,B));
    }
}
