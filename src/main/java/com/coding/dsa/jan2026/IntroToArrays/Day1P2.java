package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;

/*
Given N array elements, check if there exists a pair i,j such that ar[i]+ar[j]=k and i!=j;
Note i,j are index values, k is the given sum;
 */
public class Day1P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum to check if any pair exists or not");
        int k = sc.nextInt();

        boolean isExists = findPairExists(arr, k);
        if (isExists) {
            System.out.println("the pair exists");
        } else {
            System.out.println("the pair does not exists");
        }
    }

    private static boolean findPairExists(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
