package binary_search;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,0,2};
        System.out.println(rotationCount(arr));

    }

    static int rotationCount(int[] arr){
        int pivot = findPivot(arr);

        return pivot+1;
    }

    //finding pivot in case of non-duplicate elements, for duplicates use another logic
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]>arr[mid+1]){
                return mid;
            }

            if (arr[mid-1]>arr[mid]){
                return mid-1;
            }

            if (arr[start]<arr[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
        return -1;
    }
}
