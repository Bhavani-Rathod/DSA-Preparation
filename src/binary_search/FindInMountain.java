package binary_search;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,5,3,0};
        int target = 6;
        System.out.println(findTarget(arr,target));
    }

    static int findTarget(int[] arr, int target){

        int peak = peakElement(arr);
        int firstTry = orderAgnosticBs(arr,target,0,peak);

        if (firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBs(arr,target,peak+1, arr.length-1);
    }

    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }

    static int orderAgnosticBs(int[] arr, int target, int start, int end){
        boolean asc = arr[start]<arr[end];

        while (start<=end){

            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if (asc){
                if (target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if (target<arr[mid]){
                    start=mid+1;
                } else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
