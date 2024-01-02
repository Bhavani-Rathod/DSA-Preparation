package general;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(primeNum(n));


    }

    static boolean primeNum(int n){
        if (n<=1){
            System.out.println("Neither Composite nor Prime");
        }

        int c = 2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
