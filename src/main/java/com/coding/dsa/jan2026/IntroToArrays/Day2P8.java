package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;

/*
Search Element
Problem Description
You are given an integer T (number of test cases). You are given array A and an integer B for each test case.
 You have to tell whether B is present in array A or not.

Problem Constraints
1 <= T <= 10
1 <= A <= 105
1 <= A[i], B <= 109

Input Format
First line of the input contains number of test cases as single integer T .
Next, each of the test case consists of 3 lines:
First line contains a single integer A denoting the length of array
Second line contains A integers denoting the array elements
Third line contains a single integer B
Output Format
For each test case, print on a separate line 1 if the element exists, else print 0.

Example Input
Input 1:
 1
 5
 4 1 5 9 1
 5
Input 2:
 1
 3
 7 7 2
 1

Example Output
Output 1:
 1
Output 2:
 0
 */
public class Day2P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int search = sc.nextInt();
            System.out.println(findIfExist(arr,search));
            --t;
        }
    }

    private static int findIfExist(int[] arr, int searchEle){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==searchEle){
                return 1;
            }
        }
        return 0;
    }
}
