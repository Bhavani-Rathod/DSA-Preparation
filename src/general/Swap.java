package general;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

//        int temp = a;
//        a=b;
//        b=temp;


        swap(a,b);

    }

    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+ b);
    }


}
