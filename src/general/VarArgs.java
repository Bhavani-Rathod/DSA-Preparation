package general;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varArgs(1,2,3,4,5);
    }

    static void varArgs(int ...v){
        System.out.println(Arrays.toString(v));

        differentArgs(1,2,"A","B","C");
    }

    static void differentArgs(int a, int b, String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
}
