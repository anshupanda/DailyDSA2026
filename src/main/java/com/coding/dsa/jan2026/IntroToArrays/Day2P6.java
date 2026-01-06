package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;
/*
Rotate the array k times from left to right.
 */
public class Day2P6 {
    static void main(String[] args) {
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
        System.out.println("Enter the value to rotate the arr by left to right times");
        int k = sc.nextInt();
        int start =0;
        int end =n-1;
        if (k>=n) {
            k = k%n;
        }

        swapInIndexes(arr, start,end);
        swapInIndexes(arr,0,end-k);
        swapInIndexes(arr,end-k+1,end);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swapInIndexes(int[] arr, int start, int end) {
        if (start<0 | end<0 | start>arr.length | end>arr.length | start>end){
            return;
        }
        while (start<end) {
            arr[start] = arr[start]^arr[end];
            arr[end] = arr[start]^arr[end];
            arr[start] = arr[start]^arr[end];
            start++;
            end--;
        }
    }
}
