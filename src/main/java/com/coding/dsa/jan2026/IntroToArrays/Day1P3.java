package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;
/*
rotate an array start to end but do not use any extra array SC: O(1)
 */
public class Day1P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        swapArray(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swapArray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while (l<r) {
            arr[l] = arr[l]^arr[r];
            arr[r]=arr[l]^arr[r];
            arr[l]=arr[l]^arr[r];
            l++;
            r--;
        }
    }
}
