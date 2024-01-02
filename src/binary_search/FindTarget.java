package binary_search;

public class FindTarget {
    public static void main(String[] args) {

        int[] arr = {1,3,6,7,8,10,22,34,67,90};
        int target = 6;
        System.out.println(binarySearch(arr,target));

        int[] arr2 = {10,7,6,5,4,3,2,1};
        int target2 = 2;
        System.out.println(binarySearch2(arr2,target2));

    }

    //For ascending ordered array
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            //int mid = (start+end)/2; For larger start and end numbers, sometimes it exceeds int range
            int mid = start+(end-start)/2; // That's why it's more safe to use this

            if (target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    //Descending Array
    static int binarySearch2(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (target<arr[mid]){
                start=mid+1;
            }else if (target>arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
