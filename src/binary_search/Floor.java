package binary_search;

public class Floor {
    public static void main(String[] args) {

        int[] arr = {2,3,6,8,11,27,45};
        int target = 12;

        System.out.println(floorNum(arr,target));

    }

    static int floorNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean asc = arr[start]<arr[end];

        while (start<=end){
            int mid = start+(end-start)/2;

            if (asc){
                if (target>arr[mid]){
                    start=mid+1;
                }else if (target<arr[mid]){
                    end=mid-1;
                }else {
                    return mid;
                }

            }
        }
        return end;

    }
}