package com.cyclokitty;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {100, 1, 42};
        System.out.println(Arrays.toString(nums));

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.println((i + 1) + ". " + nums[i]);
        }

        System.out.println();

        System.out.println(sum(new int[] {5, 1, 3, 4, 2}));
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
