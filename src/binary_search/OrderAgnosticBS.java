package binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,4,3,2};
        int target = 4;
        System.out.println(orderAgnosticBs(arr,target));

    }

    static int orderAgnosticBs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean asc = arr[start]<arr[end]; //In case we don't know if array is asc or dsc, we can check like this

        while (start<=end){

            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (asc){
                if (target<arr[mid]){
                    end = mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if (target<arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}
