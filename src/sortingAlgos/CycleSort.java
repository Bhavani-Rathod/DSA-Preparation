package sortingAlgos;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args){
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cycleSort(int[] arr){
        int i = 0;
        while (i<arr.length){

            //this is for 1 to n numbers, if 0 to n is asked, then int correctIndex = arr[i]
            int correctIndex = arr[i]-1; //arr[i]f-1 is the correct index,for eg; element 3 has index 2. index = value-1
            if(arr[i]!=arr[correctIndex]){ //not present at correct position, 3!=arr[2]
                swap(arr,i,correctIndex); //so swap it
            }else {
                i++; // if present at correct pos, go for next element
            }
        }
    }

    static void swap(int[] arr, int first, int correctInd){
        int temp = arr[first];
        arr[first]=arr[correctInd];
        arr[correctInd] = temp;
    }
}
