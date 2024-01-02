package binary_search;

public class MountainArray {
    public static void main(String[] args) {

        int[] arr = {1,3,4,6,8,5,2};

        System.out.println(mountainArray(arr));

    }

    static int mountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){

            int mid = start+(end-start)/2;

            if (arr[mid]>arr[mid+1]){
                //then we're in descending part of the array
                end = mid;
            }else {
                //then we're in ascending part of the array
                start=mid+1;
            }
        }
        return start; //or can return end as well, both are same. Because at the end, both start & end point to the target.
    }
}
