class MergeSort
{
    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int h)
    {
        if (l < h) {
            // Find the middle point
            int m = l + (h-l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, h);

            // Merge the sorted halves
            merge(arr, l, m, h);
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int h)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = h - m;

        /* Create temp arrays */
        int left[] = new int[n1];
        int right[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; i++){
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++){
            right[j] = arr[m + 1 + j];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            System.out.println("i = " + i);  // These three lines printing i, j and k are only there just to remember the order of operations
            System.out.println("j = " + j);
            System.out.println("k = " + k);
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
            System.out.println("");
        }

        /* Copy remaining elements of left[] if any */
        while (i < n1) {
            System.out.println("i = " + i);  // Just for remembering order of operations
            arr[k] = left[i];
            i++;
            k++;
            System.out.println("");
        }

        /* Copy remaining elements of right[] if any */
        while (j < n2) {
            System.out.println("j = " + j);
            arr[k] = right[j];
            j++;
            k++;
            System.out.println("");
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(i == 0){
                System.out.print("[" + arr[i] + ", ");
            }
            else if(i == n - 1){
                System.out.print(arr[i] + "]");
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}