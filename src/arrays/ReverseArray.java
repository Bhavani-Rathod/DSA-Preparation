package arrays;

import java.util.Arrays;

//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,0};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void reverse(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//
//        while (start<end){
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//    }
//
//    static void swap(int[] arr, int index1, int index2){
//        int temp = arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//    }
//}

public class ReverseArray {
    public static void main(String[] args) {
//        char[] arr = {'a','b','c','d','e'};
        String str = "abcd";
        reverse(str.toCharArray());

    }

    static void reverse(char[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(char[] arr, int index1, int index2){
        char temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}

