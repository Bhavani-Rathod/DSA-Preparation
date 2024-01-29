package binary_search;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a','c','j','k'};
        char target = 'c';

        System.out.println(smallestLetter(arr,target));

    }

    static char smallestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (target<arr[mid]){ //In this problem don't do (target>arr[mid]), doesn't work
                end=mid-1;
            }else {
                start=mid+1; //for target>arr[mid] as well as target==arr[mid]
            }
        }
        return arr[start % arr.length];
    }
}
