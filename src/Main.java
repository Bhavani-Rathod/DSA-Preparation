import java.util.Scanner;

public class Main {

    //Scoping

    static int n =6; //Shadowing-This will be shadowed at line 8
    public static void main(String[] args){

        System.out.println("aa, \n sk");

        int n = 10;
        System.out.println(n);
        int a = 3;

        {
             n = 2;
             int b =2;
        }
        System.out.println(n);

        print();

    }

    static void print(){
        System.out.println(n);
    }
}