package arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {2,3,42,14,20};
        System.out.println(maxValue(arr));
        System.out.println(maxValInRange(arr,1,4));
    }

    static int maxValue(int[] arr){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int maxValInRange(int[] arr, int start, int end){
        int max = arr[start];
        for (int i=start;i<=end;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
