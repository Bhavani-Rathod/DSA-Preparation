package sortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] arr= {5,4,1,3,2};
//        int[] arr= {1,3,2,4,5};
//        int[] arr = {};
        int[] arr = {-1,2,-3,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){
        for (int i=0; i<arr.length;i++){

            int last = arr.length-i-1; //this last index is important, as we use it for finding max element as well as for swapping the max with last index as well.
            int maxInd = maxIndex(arr,0,last);
            swap(arr, maxInd, last);

        }
    }

    static int maxIndex(int[] arr, int start, int end){ //returning index of the element here(and not the element itself) bcz we want index for swapping, andnot the element itself
        int max = start;
        for (int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int maxIndex, int last){ //swapping max index with last index
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
