package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;
/*
Given an array rotate it using the start and end index.
 */
public class Day1P4 {
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
        System.out.println("Enter the start and end index for swapping a particular range");
        System.out.println("Enter start index: ");
        int start = sc.nextInt();
        System.out.println("Enter end index: ");
        int end = sc.nextInt();

        swapInIndexex(arr, start,end);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swapInIndexex(int[] arr, int start, int end) {
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
