package com.coding.dsa.jan2026.IntroToArrays;

/*
    Given an array elements, count no of elementshaving atleast 1 element greater than itself.
     */

import java.util.Scanner;

public class Day1P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }

        int max = findMaxEleAndCount(arr);
        System.out.println("Answer is: "+max);
    }

    private static int findMaxEleAndCount(int[] arr) {
        if (arr.length<=0){
            return -1;
        }
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++) {
            if (arr[i]>max){
                max= arr[i];
                count=0;
            }
            if (max == arr[i]){
                count++;
            }
        }
        return arr.length - count;
    }
}
