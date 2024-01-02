package linear_search;

import java.util.Arrays;

public class FindTarget2DArr {
    public static void main(String[] args) {

        int[][] arr ={
                {23,4,65},
                {21,7,0},
                {1,6,27,32}
        };

        int target = 7;

        System.out.println(search(arr,target));

        System.out.println(Arrays.toString(searchIndex(arr,target)));

        System.out.println(maxValue(arr));
        System.out.println(maxValue2(arr));

    }

    static boolean search(int[][] arr, int target){

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }

    static int[] searchIndex(int[][] arr, int target){ //returns array of target indices

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int maxValue(int[][] arr){ //returns max value

        int max = arr[0][0];

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){

                if (arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }

    static int maxValue2(int[][] arr){ //returns max value using enhanced for loop

        int max = Integer.MIN_VALUE; // or can store int max = Integer.MIN_VALUE f;

        for (int[] row:arr){ //because each row in 2D array is an index
            for (int col:row){ //because each col in row is an element of that row

                if (col>max){
                    max=col;
                }
            }
        }
        return max;
    }
}
