package com.company;

class SelectionSort {
    static int[] sortArray(int[] nums) {
        int n  = nums.length;
        int smallest, temp;
        for(int i = 0; i < n - 1; i++){
            smallest = i;
            for(int j = i + 1; j < n; j++){
                if(nums[smallest] > nums[j]){
                    smallest = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
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
