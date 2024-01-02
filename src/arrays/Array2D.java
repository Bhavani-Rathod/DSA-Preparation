package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
//        int[][] arr2 = {
//                {1,2,3},
//                {4,5,6,7},
//                {8,9,10}
//        };
//        System.out.println(arr2[1][0]);

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];

        for (int row=0;row<arr.length;row++){
            for (int col=0; col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

//        for (int row=0;row<arr.length;row++){
//            for (int col=0; col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        /* for (int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        } */

        for (int[] row:arr){
            System.out.println(Arrays.toString(row));
        }

    }
}
