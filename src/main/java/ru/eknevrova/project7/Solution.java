package ru.eknevrova.project7;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);

        System.out.println(Arrays.equals(result, expectedNums));

        //Task 2
        Task2 task2 = new Task2();
        System.out.println("Task2");
        task2.testIsValid();

        //Task3
        Task3 task3 = new Task3();
        System.out.println("Task3");
        task3.calcSymbols();

        //Task4
        Task4 task4 = new Task4();
        System.out.println("Task4");
        task4.removeEvenNums();

    }
    public static int[] removeDuplicates(int[] nums) {
        int index = 0;
        for (int nextIndex = 1; nextIndex < nums.length; nextIndex++) {
            if (nums[nextIndex] != nums[index]) {
                index++;
                nums[index] = nums[nextIndex];
            }
        }
        Arrays.fill(nums, index + 1, nums.length, 0);
        return nums;
    }
}


