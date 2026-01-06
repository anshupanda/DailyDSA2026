package com.coding.dsa.jan2026.IntroToArrays;

import java.util.Scanner;
// Max and Min of an Array
public class Day2P7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size & array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i=0;
        while(i< arr.length) {
            if (max<arr[i]) {
                max = arr[i];
            }
            if (min>arr[i]) {
                min = arr[i];
            }
            i++;
        }
        System.out.println(min+" "+max);
    }
}
