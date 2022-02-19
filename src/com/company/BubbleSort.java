package com.company;

class BubbleSort {
    static int[] sortArray(int[] nums) {
        int n  = nums.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
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
