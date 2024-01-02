package general;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if (b>max){
//            max=b;
//        }else if (c>max){
//            max = c;
//        }
//        System.out.println("max:" + max);

        int max = Math.max(a,b);
        System.out.println(Math.max(c,Math.max(a,b)));

    }
}
