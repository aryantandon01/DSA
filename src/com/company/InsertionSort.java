package com.company;

class InsertionSort {
    static int[] sortArray(int[] nums) {
        int n  = nums.length;
        int current;
        for(int i = 1; i < n; i++){
            current = nums[i];
            int j = i - 1;
            while(j >= 0 && current < nums[j]){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
        return nums;
    }
    public static void main(String[] args){
        int arr[] = {11, 12, 13, 5, 6, 7};
        sortArray(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
