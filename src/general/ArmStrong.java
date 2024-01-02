package general;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {

        //For printing all 3 digits Armstrong numbers
        for (int i=100;i<1000;i++){
            armStrongNum(i);
        }
    }

    static void armStrongNum(int n){

        int temp=n;
        int sum=0;
        while (n>0){
            int rem = n%10;
            sum+=rem*rem*rem;
            n/=10;
        }

        if (sum==temp){
            System.out.println(temp);
        }
    }
}
