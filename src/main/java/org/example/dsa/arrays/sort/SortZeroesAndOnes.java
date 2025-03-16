package org.example.dsa.arrays.sort;

import java.util.Arrays;

public class SortZeroesAndOnes {

    public static void sortBinaryArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Move left pointer forward if it's already 0
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Move right pointer backward if it's already 1
            while (left < right && arr[right] == 1) {
                right--;
            }
            // Swap 1 (left) with 0 (right)
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 0, 1};
        sortBinaryArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
