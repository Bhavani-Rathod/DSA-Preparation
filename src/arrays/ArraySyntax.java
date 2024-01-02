package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySyntax {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        int[] arr = new int[4];
//        arr[0]=1;
//        arr[1]=2;
//
//        System.out.println(arr[2]);

        /*  int[] arr2 = {1,2,3,4,5};
        arr2[2]=23;
        System.out.println(Arrays.toString(arr2)); */

//        int[] arr3 = new int[3];
//
//        for (int i=0;i<arr3.length;i++){
//            arr3[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr3));

       /* String[] arr4 = new String[3];
        System.out.println(arr4[1]); */

//        String[] str; //declaration
//        str = new String[2]; //memory allocation
//        str[0]="Abc"; // Initialization

       /* String[] arr = {"aa","bb","c"};
        System.out.println(Arrays.toString(arr)); */

//        int[] arrr = {1,2,3,4,5};
//
//        for (int i:arrr){ //Enhanced for loop or ForEach loop
//            System.out.print(i+" ");
//        }

        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        arrayPass(num);
        System.out.println(Arrays.toString(num));

    }

    static void arrayPass(int[] arr){

        arr[2]=5;
    }

}
