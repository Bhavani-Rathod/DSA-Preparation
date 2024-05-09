package recursion;

public class RecursionExample {
    public static void main(String[] args){
        print(1);
    }

    //printing nums from 1 to 5
    static void print(int n){
        if (n==5){ //base condition to end recursive function
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1); //fun calling itself, i.e. recursive call
    }
}
