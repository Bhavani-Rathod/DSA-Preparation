package recursion;

public class BinarySearchRecursion {
    public static void main(String[] args){
        int[] arr = {2,5,9,13,28,38,45,68};
        int target = 9;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        //base condition
        if (start>end){
            return -1;
        }

        int mid = start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }

        if (arr[mid]>target){
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
