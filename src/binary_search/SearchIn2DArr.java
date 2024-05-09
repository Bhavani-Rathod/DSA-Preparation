package binary_search;

import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(arr,38)));
    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;

        while (r<arr.length && c>=0){ //as we are incrementing rows, r should not exceed length and as we are decrementing cols it shd not become -ve, it shd be >=0
            if (arr[r][c]==target){
                return new int[]{r,c};
            }else if (arr[r][c]>target){
                c--;
            }else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
